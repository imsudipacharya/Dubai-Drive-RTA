package com.techacharya.dubaidriverta;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {

    private InterstitialAd mInterstitialAd,mInterstitialAd1,mInterstitialAd2,mInterstitialAd3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AudienceNetworkAds.initialize(this);
        mInterstitialAd = new InterstitialAd(this, "807461976663649_807464216663425");
        mInterstitialAd.loadAd();


        AudienceNetworkAds.initialize(this);
        mInterstitialAd1 = new InterstitialAd(this, "807461976663649_807464326663414");
        mInterstitialAd1.loadAd();


        AudienceNetworkAds.initialize(this);
        mInterstitialAd2 = new InterstitialAd(this, "807461976663649_807464446663402");
        mInterstitialAd2.loadAd();


        AudienceNetworkAds.initialize(this);
        mInterstitialAd3 = new InterstitialAd(this, "807461976663649_807464573330056");
        mInterstitialAd3.loadAd();


        CardView cardView1 = (CardView)findViewById(R.id.card1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd1.isAdLoaded()) {

                    mInterstitialAd1.show();
                }
                Intent intent = new Intent(MainActivity.this , Moving.class);
                startActivity(intent);
            }
        });


        CardView cardView2 = (CardView)findViewById(R.id.card2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd2.isAdLoaded()) {

                    mInterstitialAd2.show();
                }
                Intent intent = new Intent(MainActivity.this , Requirements.class);
                startActivity(intent);
            }
        });


        CardView cardView3 = (CardView)findViewById(R.id.card3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd3.isAdLoaded()) {

                    mInterstitialAd3.show();
                }
                Intent intent = new Intent(MainActivity.this , Registration.class);
                startActivity(intent);
            }
        });


        CardView cardView4 = (CardView)findViewById(R.id.card4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!testConnection()) {
                    setContentView(R.layout.nointernet);

                } else {
                    Intent intent = new Intent(MainActivity.this, Signs.class);
                    startActivity(intent);
                }
            }
        });


        CardView cardView5 = (CardView)findViewById(R.id.card5);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!testConnection()) {
                    setContentView(R.layout.nointernet);

                } else {
                    Intent intent = new Intent(MainActivity.this, QuizTime.class);
                    startActivity(intent);
                }
            }
        });


        CardView cardView6 = (CardView)findViewById(R.id.card6);
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!testConnection()) {
                    setContentView(R.layout.nointernet);

                } else {
                    Intent intent = new Intent(MainActivity.this, QuizTime2.class);
                    startActivity(intent);
                }
            }
        });


        CardView cardView7 = (CardView)findViewById(R.id.card7);
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!testConnection()){
                    setContentView(R.layout.nointernet);

                }
                else {
                    Intent intent = new Intent(MainActivity.this, Main4Activity.class);
                    startActivity(intent);
                }
            }
        });


        CardView cardView8 = (CardView)findViewById(R.id.card8);
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!testConnection()) {
                    setContentView(R.layout.nointernet);

                } else {
                    Intent intent = new Intent(MainActivity.this, QuizTime3.class);
                    startActivity(intent);
                }
            }
        });


        CardView cardView9 = (CardView)findViewById(R.id.card9);
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
onBackPressed();
            }
        });

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

                AlertDialog.Builder ab = new AlertDialog.Builder(MainActivity.this);
                ab.setTitle("DO YOU WANT TO CLOSE RTA Driving License ?");
                ab.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (mInterstitialAd.isAdLoaded()) {

                            mInterstitialAd.show();
                        }
                        dialog.dismiss();
                        android.os.Process.killProcess(android.os.Process.myPid());
                        System.exit(1);
                        MainActivity.this.finish();
                    }
                });
                ab.setNegativeButton("NOT", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                ab.show();

        }

    }