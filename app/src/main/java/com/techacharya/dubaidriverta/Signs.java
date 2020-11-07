package com.techacharya.dubaidriverta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.squareup.picasso.Picasso;

public class Signs extends AppCompatActivity {
private Toolbar toolbar;
private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signs);

        AudienceNetworkAds.initialize(this);
        mInterstitialAd = new InterstitialAd(this, "807461976663649_807468556662991");
        mInterstitialAd.loadAd();


        ImageView image1 = findViewById(R.id.image1);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image1);

        ImageView image2 = findViewById(R.id.image2);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/2.png").into(image2);

        ImageView image3 = findViewById(R.id.image3);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/3.png").into(image3);

        ImageView image4 = findViewById(R.id.image4);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/4.png").into(image4);

        ImageView image5 = findViewById(R.id.image5);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/5.png").into(image5);

        ImageView image6 = findViewById(R.id.image6);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/6.png").into(image6);

        ImageView image7 = findViewById(R.id.image7);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image7);

        ImageView image8 = findViewById(R.id.image8);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image8);

        ImageView image9 = findViewById(R.id.image9);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image9);

        ImageView image10 = findViewById(R.id.image10);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image10);

        ImageView image11 = findViewById(R.id.image11);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image11);

        ImageView image12 = findViewById(R.id.image12);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image12);

        ImageView image13 = findViewById(R.id.image13);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image13);

        ImageView image14 = findViewById(R.id.image14);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image14);

        ImageView image15 = findViewById(R.id.image15);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image15);

        ImageView image16 = findViewById(R.id.image16);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image16);

        ImageView image17 = findViewById(R.id.image17);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image17);

        ImageView image18 = findViewById(R.id.image18);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image18);

        ImageView image19 = findViewById(R.id.image19);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image19);

        ImageView image20 = findViewById(R.id.image20);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image20);

        ImageView image21 = findViewById(R.id.image21);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image21);

        ImageView image22 = findViewById(R.id.image22);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image22);

        ImageView image23 = findViewById(R.id.image23);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image23);

        ImageView image24 = findViewById(R.id.image24);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image24);

        ImageView image25 = findViewById(R.id.image25);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image25);

        ImageView image26 = findViewById(R.id.image26);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image26);

        ImageView image27 = findViewById(R.id.image27);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image27);

        ImageView image28 = findViewById(R.id.image28);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image28);

        ImageView image29 = findViewById(R.id.image29);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image29);

        ImageView image30 = findViewById(R.id.image30);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image30);

        ImageView image31 = findViewById(R.id.image31);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image31);

        ImageView image32 = findViewById(R.id.image32);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image32);

        ImageView image33 = findViewById(R.id.image33);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image33);

        ImageView image34 = findViewById(R.id.image34);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image34);

        ImageView image35 = findViewById(R.id.image35);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image35);

        ImageView image36 = findViewById(R.id.image36);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image36);

        ImageView image37 = findViewById(R.id.image37);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image37);

        ImageView image38 = findViewById(R.id.image38);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image38);

        ImageView image39 = findViewById(R.id.image39);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image39);

        ImageView image40 = findViewById(R.id.image40);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image40);

        ImageView image41 = findViewById(R.id.image41);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image41);

        ImageView image42 = findViewById(R.id.image42);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image42);

        ImageView image43 = findViewById(R.id.image43);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image43);

        ImageView image44 = findViewById(R.id.image44);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image44);

        ImageView image45 = findViewById(R.id.image45);
        Picasso.get().load("https://ia601405.us.archive.org/29/items/17_20200916/1.png").into(image45);


    }

    @Override
    public void onBackPressed() {
        if (mInterstitialAd.isAdLoaded()) {

            mInterstitialAd.show();
        } else {
            super.onBackPressed();
        }
    }
}