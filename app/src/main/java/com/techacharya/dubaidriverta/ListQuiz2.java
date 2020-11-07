package com.techacharya.dubaidriverta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ListQuiz2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_quiz);
        ImageView image1 = findViewById(R.id.image1);
        image1.setImageResource(R.drawable.ic_quiz);

        ImageView image2 = findViewById(R.id.image2);
        image2.setImageResource(R.drawable.ic_quiz);

        CardView cardView1 = (CardView)findViewById(R.id.card1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListQuiz2.this , QuestionsActivity.class);
                startActivity(intent);
            }
        });


        CardView cardView2 = (CardView)findViewById(R.id.card2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListQuiz2.this , QuestionsActivity2.class);
                startActivity(intent);
            }
        });


        CardView cardView3 = (CardView)findViewById(R.id.card3);
        cardView3.setVisibility(View.GONE);


        CardView cardView4 = (CardView)findViewById(R.id.card4);
        cardView4.setVisibility(View.GONE);
    }
}