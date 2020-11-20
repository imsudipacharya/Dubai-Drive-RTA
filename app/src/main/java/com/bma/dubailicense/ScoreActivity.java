package com.bma.dubailicense;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bma.dubailicense.R;

public class ScoreActivity extends AppCompatActivity {
private TextView score;
private Button done;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        score = (TextView)findViewById(R.id.score);
        done = (Button)findViewById(R.id.buttonend);

        String score_Str = getIntent().getStringExtra("SCORE");
        score.setText(score_Str);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScoreActivity.this , MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}