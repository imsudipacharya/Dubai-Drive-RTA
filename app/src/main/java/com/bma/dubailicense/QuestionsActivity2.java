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

public class QuestionsActivity2 extends AppCompatActivity implements View.OnClickListener{

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
        setContentView(R.layout.activity_questions);

        AudienceNetworkAds.initialize(this);
        mInterstitialAd = new InterstitialAd(this, "807461976663649_807465056663341");
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
        


        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/1.png",
                "Loose chippings",
                "No through road",
                "High Voltage overhead cable",
                "Curves or bends in the road",
                2));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/2.png",
                "Motorway roundabout ahead",
                "A contraflow system ahead",
                "Roundabout ahead",
                "A one-way system ahead",
                3));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/3.png",
                "Turn back",
                "Turn left",
                "Pull over on the left",
                "Keep left",
                4));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/4.png",
                "Parking available",
                "No Parking (Tow away zone)",
                "Double parking only",
                "Parallel parking only",
                2));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/5.png",
                "Road works ahead",
                "Any of the above",
                "Roadworks have finished",
                "Roadworks are pending",
                1));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/6.png",
                "Pass either side of the sign",
                "Choose a left or right turn lane",
                "Park either side of the sign",
                "Overtake traffic ahead",
                1));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/7.png",
                "Clear way ahead",
                "You may accelerate",
                "You must go this way",
                "Priority over oncoming traffic",
                3));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/8.png",
                "Pedal cycles only permitted",
                "Pedal cycles must slow down",
                "No Cyclist",
                "Pushing pedal cycles prohibited",
                3));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/9.png",
                "60kmh maximum speed limit - freeway",
                "Get closer than 60 feet to the car in front",
                "60kmh minimum speed limit - freeway",
                "Be further away than 120 feet from the car in front",
                3));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/10.png",
                "Maximum speed limit",
                "Travel at exactly 80 km an hour",
                "Any of these depending on conditions",
                "Not travel slower than 80 km/h",
                1));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/11.png",
                "Airport taxi stop",
                "Low flying aircraft ahead (do not be distracted)",
                "Airport ahead",
                "Airport parking ahead",
                2));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/12.png",
                "Highway nearby",
                "Hotel nearby",
                "Hot Spot nearby",
                "Hospital nearby",
                4));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/13.png",
                "Parking",
                "No parking available",
                "Restricted parking available",
                "Loading only available",
                1));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/14.png",
                "The start of a freeway",
                "The middle of a freeway",
                "A bridge over a freeway",
                "The end of a freeway",
                1));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/15.png",
                "There is no entry to the street",
                "There is no parking on the street",
                "No through road",
                "It is a one way street",
                3));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/16.png",
                "High Voltage overhead cable",
                "Risk of Falling rocks",
                "Slipperry Road",
                "Curves or bends in the road",
                1));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/17.png",
                "A level crossing with no gate or barrier",
                "Tram or railway crossing to the right",
                "A tram track",
                "Fenced off parkland",
                2));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/18.png",
                "You must turn right",
                "Single Chevron Right",
                "One-way road",
                "No right turn",
                3));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/19.png",
                "Pedestrian crossing ahead",
                "Two-way traffic",
                "Tram or railway crossing to the left",
                "Single tram or railway line crossing over the road",
                4));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/20.png",
                "The arrow is pointing to the quickest route",
                "There is a one-way street coming up on your left",
                "You must go in the direction of the arrow",
                "Traffic coming from your right has priority",
                3));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/21.png",
                "No parking for lorries",
                "Lorries prohibited",
                "Lorries parking area",
                "Lorries route",
                2));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/22.png",
                "Maximum width limit",
                "Height restriction of 2.5m",
                "Only vehicles between 2 feet and 5 feet high may pass",
                "Not suitable for vehicles over 2.5 tonnes",
                1));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/23.png",
                "Only one tram per hour uses the route",
                "Trams have priority on the route",
                "Trams may not use the route",
                "The route is for trams only",
                4));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/24.png",
                "Stay left",
                "Accelerate and turn left",
                "Turn left ahead",
                "Give way to the left",
                3));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/25.png",
                "The start of a freeway",
                "The middle of a freeway",
                "The end of a freeway",
                "A bridge over a freeway",
                3));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/26.png",
                "Reduce speed now",
                "Lane ahead open",
                "Lane ahead closed",
                "Priority road",
                3));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/27.png",
                "Lane ahead closed",
                "Lane ahead open",
                "Reduce speed now",
                "Priority road",
                2));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/28.png",
                "Maximum Height limit",
                "Not suitable for vehicles over 4.2 tonnes",
                "The roadway is 4.2” wide",
                "Only vehicles between 4 feet and 2 feet high may pass",
                1));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/29.png",
                "You must not stop except to drop passengers",
                "You must not stop or park",
                "Stop without a parking permit",
                "You must not stop except for loading",
                2));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 2/30.png",
                "Trams run alongside your road",
                "Tram or railway crossing ahead",
                "No entry to all vehicles except trams",
                "Your road is shared with trams",
                2));



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
                Intent intent = new Intent(QuestionsActivity2.this, ScoreActivity.class);
                intent.putExtra("SCORE", String.valueOf(score) + "/" + String.valueOf(questionList.size()));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                QuestionsActivity2.this.finish();
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