package com.techacharya.dubaidriverta;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

public class play_movie extends AppCompatActivity {

    ProgressBar spinnerView;
    private TextView tvdlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playmovie);

        AdView adView = new AdView(this, "807461976663649_807463579996822", AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);
        adContainer.addView(adView);
        adView.loadAd();

      
        final VideoView videoView;

        final String dlink = getIntent().getExtras().getString("dlink");

        tvdlink = (TextView)findViewById(R.id.downlink);
        tvdlink.setText(dlink);


        videoView = (VideoView)findViewById(R.id.playmovies);
        spinnerView = (ProgressBar) findViewById(R.id.my_spinner);
        MediaController mc = new MediaController(play_movie.this);
        mc.setAnchorView(videoView);
        mc.setMediaPlayer(videoView);
        Uri video = Uri.parse(dlink);
        videoView.setMediaController(mc);
        videoView.setVideoURI(video);
        videoView.start();
        spinnerView.setVisibility(View.VISIBLE);
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                // TODO Auto-generated method stub
                mp.start();
                mp.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
                    @Override
                    public void onVideoSizeChanged(MediaPlayer mp, int arg1,
                                                   int arg2) {
                        // TODO Auto-generated method stub
                        spinnerView.setVisibility(View.GONE);
                        mp.start();
                    }
                });
            }
        });




    }
}
