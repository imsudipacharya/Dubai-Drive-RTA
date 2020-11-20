package com.bma.dubailicense;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import com.bma.dubailicense.R;

import static java.lang.Thread.sleep;

public class SplashActivity extends AppCompatActivity {

    private TextView appname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        appname = (TextView)findViewById(R.id.appname);

        Typeface typeface = ResourcesCompat.getFont(this,R.font.blacklist);
        appname.setTypeface(typeface);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.myanim);
        appname.setAnimation(animation);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(3000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        }).start();
    }
}