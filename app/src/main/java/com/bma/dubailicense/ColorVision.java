package com.bma.dubailicense;

import android.animation.Animator;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;


import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.squareup.picasso.Picasso;
import com.bma.dubailicense.R;

import java.util.ArrayList;
import java.util.List;

public class ColorVision extends AppCompatActivity implements View.OnClickListener{

    private TextView questions,qcount,timer;
    private ImageView question;
    private Button option1,option2,option3,option4;
    private List<Question> questionList;
    private int quesno;

    private int score;

    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_vision);

        AudienceNetworkAds.initialize(this);
        mInterstitialAd = new InterstitialAd(this, "807461976663649_807464816663365");
        mInterstitialAd.loadAd();

        question = (ImageView) findViewById(R.id.textView2);
        // question = (TextView)findViewById(R.id.textView2);
        qcount = (TextView)findViewById(R.id.textView);

        timer = (TextView)findViewById(R.id.countdown);



        option1 = (Button)findViewById(R.id.button1);
        option2 = (Button)findViewById(R.id.button2);
        option3 = (Button)findViewById(R.id.button3);
        option4 = (Button)findViewById(R.id.button4);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        getQuestionsList();

        score = 0;

    }

    private void getQuestionsList() {
        questionList = new ArrayList<>();


        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Color/1.png",
                "M",
                "W",
                "U",
                "V",
                2));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Color/2.png",
                "17",
                "21",
                "37",
                "27",
                4));


        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Color/3.png",
                "U",
                "V",
                "W",
                "C",
                1));


        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Color/4.png",
                "L",
                "T",
                "I",
                "J",
                3));


        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Color/5.png",
                "0",
                "8",
                "9",
                "3",
                2));


        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Color/6.png",
                "6",
                "5",
                "7",
                "8",
                2));


        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Color/7.png",
                "82",
                "18",
                "12",
                "42",
                4));


        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Color/8.png",
                "3",
                "0",
                "1",
                "2",
                4));


        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Color/9.png",
                "12",
                "22",
                "13",
                "32",
                1));


        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Color/10.png",
                "45",
                "15",
                "55",
                "46",
                1));


        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Color/11.png",
                "51",
                "58",
                "57",
                "55",
                3));


        setQuestion();

    }

    private void setQuestion() {
        timer.setText(String.valueOf(score));

        Picasso.get().load(questionList.get(0).getQuestion()).into(question);
        // question.setText(questionList.get(0).getQuestion());
        option1.setText(questionList.get(0).getOptionA());
        option2.setText(questionList.get(0).getOptionB());
        option3.setText(questionList.get(0).getOptionC());
        option4.setText(questionList.get(0).getOptionD());

        qcount.setText(String.valueOf(1) + "/" + String.valueOf(questionList.size()));


        quesno = 0;

    }




    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onClick(View view) {

        int selectedOption = 0;

        switch (view.getId())
        {
            case R.id.button1 :
                selectedOption = 1;
                break;

            case R.id.button2 :
                selectedOption = 2;
                break;

            case R.id.button3 :
                selectedOption = 3;
                break;

            case R.id.button4 :
                selectedOption = 4;
                break;

            default:
        }
        option1.setEnabled(false);
        option2.setEnabled(false);
        option3.setEnabled(false);
        option4.setEnabled(false);
        checkAnswer(selectedOption, view);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void checkAnswer(int selectedOption, View view) {
        if (selectedOption == questionList.get(quesno).getCorrectAns())
        {
            //Right Answer
            ((Button)view).setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
            score++;


        }else
        {
            //Wrong Answer
            ((Button)view).setBackgroundTintList(ColorStateList.valueOf(Color.RED));
            switch (questionList.get(quesno).getCorrectAns())
            {
                case 1 :
                    option1.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    break;
                case 2 :
                    option2.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    break;
                case 3 :
                    option3.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    break;
                case 4 :
                    option4.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    break;
            }
        }
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                changeQuestion();
            }
        },2000);

    }

    private void changeQuestion() {
        if (quesno < questionList.size() - 1)
        {
            quesno++;

            playAnim(question,0, 0);
            playAnim(option1,0, 1);
            playAnim(option2,0, 2);
            playAnim(option3,0, 3);
            playAnim(option4,0, 4);

            qcount.setText(String.valueOf(quesno+1)+"/"+String.valueOf(questionList.size()));
            timer.setText(String.valueOf(score));

        }else
        {
            if (mInterstitialAd.isAdLoaded()) {
                mInterstitialAd.show();
            } else {
                //Go To Score Board
                Intent intent = new Intent(ColorVision.this, ScoreActivity.class);
                intent.putExtra("SCORE", String.valueOf(score) + "/" + String.valueOf(questionList.size()));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                ColorVision.this.finish();
            }

        }

    }

    private void playAnim(final View view, final int value, final int viewNum) {

        view.animate().alpha(value).scaleX(value).scaleY(value).setDuration(500)
                .setStartDelay(100).setInterpolator(new DecelerateInterpolator())
                .setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {

                    }

                    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (value == 0 )
                        {
                            switch (viewNum)
                            {
                                case 0 :
                                    Picasso.get().load(questionList.get(quesno).getQuestion()).into(question);
                                    // ((TextView)view).setText(questionList.get(quesno).getQuestion());
                                    break;

                                case 1 :
                                    ((Button)view).setText(questionList.get(quesno).getOptionA());
                                    break;

                                case 2 :
                                    ((Button)view).setText(questionList.get(quesno).getOptionB());
                                    break;

                                case 3 :
                                    ((Button)view).setText(questionList.get(quesno).getOptionC());
                                    break;

                                case 4 :
                                    ((Button)view).setText(questionList.get(quesno).getOptionD());
                                    break;
                            }

                            if (viewNum != 0)
                                ((Button)view).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#040000")));


                            playAnim(view,1,viewNum);
                            option1.setEnabled(true);
                            option2.setEnabled(true);
                            option3.setEnabled(true);
                            option4.setEnabled(true);

                        }

                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                });

    }

    @Override
    protected void onDestroy() {
        if (mInterstitialAd != null) {
            mInterstitialAd.destroy();
        }
        super.onDestroy();
    }
}