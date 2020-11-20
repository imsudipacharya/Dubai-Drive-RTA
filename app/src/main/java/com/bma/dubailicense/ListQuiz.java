package com.bma.dubailicense;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bma.dubailicense.R;

public class ListQuiz extends AppCompatActivity {

private Toolbar toolbar;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_quiz);


        ImageView image1 = findViewById(R.id.image1);
        image1.setImageResource(R.drawable.logo);

        ImageView image2 = findViewById(R.id.image2);
        image2.setImageResource(R.drawable.logo);

        ImageView image3 = findViewById(R.id.image3);
        image3.setImageResource(R.drawable.logo);

        ImageView image4 = findViewById(R.id.image4);
        image4.setImageResource(R.drawable.logo);


        CardView cardView1 = (CardView)findViewById(R.id.card1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListQuiz.this , PhotoQuestionActivity.class);
                startActivity(intent);
            }
        });


        CardView cardView2 = (CardView)findViewById(R.id.card2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListQuiz.this , PhotoQuestionActivity2.class);
                startActivity(intent);
            }
        });


        CardView cardView3 = (CardView)findViewById(R.id.card3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListQuiz.this , PhotoQuestionActivity3.class);
                startActivity(intent);
            }
        });


        CardView cardView4 = (CardView)findViewById(R.id.card4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListQuiz.this , PhotoQuestionActivity4.class);
                startActivity(intent);
            }
        });

    }
}