package com.bma.dubailicense;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.bma.dubailicense.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Main4Activity extends AppCompatActivity implements MovieItemClickListener {

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference reference = firebaseDatabase.getReference();
    private DatabaseReference childreference = reference.child("Video");

    private RecyclerView MoviesRV ;
    private MovieAdapter movieAdapter;

    List<Movie> lstMovies;
    private JsonArrayRequest request ;
    private RequestQueue requestQueue ;
    TextView latest;
    String message;

    ProgressBar spinnerView;
    private TextView tvdlink;
private Toolbar toolbar;
private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        AudienceNetworkAds.initialize(this);
        mInterstitialAd = new InterstitialAd(this, "807461976663649_807464703330043");
        mInterstitialAd.loadAd();

            MoviesRV = findViewById(R.id.Rv_movies);


            latest = (TextView) findViewById(R.id.url);


    }

    @Override
    protected void onStart() {
        super.onStart();
        if(!testConnection()){
            setContentView(R.layout.nointernet);

        }
        else {
            //or another contentview

            childreference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    message = dataSnapshot.getValue(String.class);
                    latest.getText();

                    lstMovies = new ArrayList<>();

                    request = new JsonArrayRequest(message, new Response.Listener<JSONArray>() {
                        @Override
                        public void onResponse(JSONArray response) {

                            JSONObject jsonObject = null;

                            for (int i = 0; i < response.length(); i++) {


                                try {
                                    jsonObject = response.getJSONObject(i);
                                    Movie anime = new Movie();
                                    anime.setName(jsonObject.getString("name"));
                                    anime.setImg(jsonObject.getString("img"));
                                    anime.setDlink(jsonObject.getString("dlink"));

                                    lstMovies.add(anime);

                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }


                            }

                            setuprecyclerview(lstMovies);

                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }
                    });


                    requestQueue = Volley.newRequestQueue(Main4Activity.this);
                    requestQueue.add(request);


                }


                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });


        }


    }


    private void setuprecyclerview(List<Movie> lstMovies) {


        movieAdapter = new MovieAdapter(this,lstMovies,this);
        MoviesRV.setAdapter(movieAdapter);
        MoviesRV.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));


    }


    @Override
    public void onMovieClick(Movie movie, ImageView movieImageView) {

        Intent intent = new Intent(Main4Activity.this, play_movie.class);
        // send movie information to deatilActivity
        intent.putExtra("dlink",movie.getDlink());
        Toast.makeText(this,"Video Selected : " + movie.getName(), Toast.LENGTH_LONG).show();
          startActivity(intent);





    }

    public boolean testConnection() {
        boolean haveConnectedWifi = false;
        boolean haveConnectedMobile = false;

        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] netInfo = cm.getAllNetworkInfo();
        for (NetworkInfo ni : netInfo) {
            if (ni.getTypeName().equalsIgnoreCase("WIFI"))
                if (ni.isConnected())
                    haveConnectedWifi = true;
            if (ni.getTypeName().equalsIgnoreCase("MOBILE"))
                if (ni.isConnected())
                    haveConnectedMobile = true;
        }
        return haveConnectedWifi || haveConnectedMobile;
    }


    @Override
    public void onBackPressed() {
        if (mInterstitialAd.isAdLoaded()){
            mInterstitialAd.show();
        }else {
            super.onBackPressed();
        }
    }
}




