package com.techacharya.dubaidriverta;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import static java.lang.Thread.sleep;

public class QuizTime2 extends AppCompatActivity {

    private TextView appname;
    private ImageView imageView;
    private RelativeLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mainLayout = (RelativeLayout)findViewById(R.id.mainlayout);
        mainLayout.setBackgroundColor(Color.BLACK);

        appname = (TextView)findViewById(R.id.appname);
        appname.setText("Sign Quiz");

        imageView = (ImageView)findViewById(R.id.imageSplash);
        imageView.setImageResource(R.drawable.ic_quiz);



        Typeface typeface = ResourcesCompat.getFont(this,R.font.blacklist);
        appname.setTypeface(typeface);
        appname.setTextColor(Color.WHITE);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.myanim);
        appname.setAnimation(animation);
        imageView.setAnimation(animation);


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(3000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent(QuizTime2.this, ListQuiz2.class);
                startActivity(intent);
                finish();
            }
        }).start();
    }
}