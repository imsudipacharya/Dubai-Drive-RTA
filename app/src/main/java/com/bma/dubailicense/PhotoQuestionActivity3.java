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

public class PhotoQuestionActivity3 extends AppCompatActivity implements View.OnClickListener{

    private TextView question2,qcount,timer;
    private ImageView question;
    private Button option1,option2,option3,option4;
    private List<PhotoQuestion> questionList;
    private int quesno;

    private int score;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_question);

        AudienceNetworkAds.initialize(this);
        mInterstitialAd = new InterstitialAd(this, "759398214918901_759401458251910");
        mInterstitialAd.loadAd();


        question = (ImageView) findViewById(R.id.textView2);
         question2 = (TextView)findViewById(R.id.textViewtwo);
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


        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/1.jpg",
                "What is the minimum speed on a freeway?",
                "60 km an hour",
                "50 km an hour",
                "70 km an hour",
                "80 km an hour",
                1));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/2.jpg",
                        "When approaching a pedestrian crossing with flashing yellow lights, you should…?",
                "Maintain your speed unless pedestrians are on the crossing",
                "Slow down in all circumstances",
                "Maintain your speed unless a policeman indicates otherwise",
                "Slow down if you can see pedestrians waiting",
                2));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/3.jpg",
                        "When a junction has a yellow box with diagonal markings painted across it, you must…?",
                "Not enter unless you can see a clear exit",
                "Queue across the junction",
                "Drive across as quickly as you can",
                "Assume priority over other vehicles",
                1));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/4.jpg",
                "You are approaching a left turn that has three left turning lanes; you want to turn right immediately after turning left. Which lane should you choose?",
                "The left-hand lane",
                "The center lane",
                "The right-hand lane",
                "The least busy lane",
                3));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/5.jpg",
                        "When the road is divided by broken yellow lines, you should position your vehicle…?",
                "Over to the right hand side",
                "Any of these",
                "In the middle of your lane",
                "As close to the lines as possible",
                1));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/6.jpg",
                "What is the maximum speed for a rural road?",
                "60 km an hour",
                "80 km an hour",
                "120 km an hour",
                "100 km an hour",
                4));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/7.png",
                "What is the maximum speed for a parking area or service road?",
                "20 km an hour",
                "25 km an hour",
                "30 km an hour",
                "35 km an hour",
                2));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/8.jpg",
                "In which of these situations should you not overtake?",
                "In any of them",
                "At a junction",
                "On a bend",
                "On the crest of a hill",
                1));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/9.jpg",
                "Approaching a T-junction, who has priority?",
                "Vehicles on the cross road",
                "Vehicles on the joining road",
                "Whoever reaches the junction first",
                "Vehicles turning right from the joining road",
                1));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/10.png",
                "Pedestrians have priority over vehicles if…?",
                "Any of these apply",
                "They are walking on the sidewalk you need to cross",
                "They are waiting at a pedestrian crossing",
                "They are crossing an intersection you're turning into",
                1));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/11.jpg",
                "What color are regulatory signs?",
                "Blue and white",
                "Red and white",
                "Red and white or blue and white",
                "Yellow and black",
                3));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/12.jpg",
                        "On a three-lane roundabout, the inside lane should be used by…?",
                "Vehicles going straight on",
                "Vehicles turning left",
                "Any of these",
                "Vehicles turning right",
                2));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/13.png",
                "What does a solid line down the middle of the road mean?",
                "Speed limit applies",
                "Use either lane",
                "No overtaking",
                "Give way to oncoming vehicles",
                3));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/14.png",
                "A yellow traffic light means what?",
                "Stop if safe to do so",
                "Accelerate if safe to do so",
                "Maintain your current speed",
                "Stop under any circumstances",
                1));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/15.jpg",
                "In the absence of a policeman controlling traffic or a traffic sign, at junctions and crossroads, who has priority?",
                "The vehicles travelling fastest",
                "Vehicles on the main road",
                "Vehicles on side roads",
                "The vehicles travelling slowest",
                2));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/16.jpg",
                "Your horn should not be used near which of these buildings?",
                "Places of worship",
                "All of them",
                "Schools",
                "Hospitals",
                2));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/17.png",
                "How close should you be to the vehicle in front when you commence an overtake?",
                "1 second",
                "0.5 seconds",
                "2 seconds",
                "3 seconds",
                3));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/18.jpg",
                        "Approaching a green traffic light, you should…?",
                "Maintain speed",
                "Reduce speed",
                "Any of these",
                "Increase speed",
                2));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/19.jpg",
                "When turning into a one-way road with three lanes, which lane should you choose?",
                "Whichever lane is least busy",
                "The far hand lane",
                "The near hand lane",
                "The center lane",
                3));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/20.png",
                "Regulatory signs must be obeyed at all times unless…?",
                "A policeman directs you to ignore them",
                "Obeying would send you out of your way",
                "There is no other traffic present",
                "You feel the sign is redundant",
                1));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/21.png",
                "Which of these is most important for a safe overtake?",
                "Planning ahead",
                "Flashing your lights",
                "Hard acceleration",
                "Warning with your horn",1));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/22.jpg",
                "On a roundabout, if there is no reason controlling traffic and no traffic sign, who has priority?",
                "Vehicles coming from behind",
                "Vehicles coming from the left",
                "Vehicles coming from the right",
                "Vehicles coming from ahead",
                2));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/23.png",
                        "At a stop line with a stop sign, you must come to a complete stop…?",
                "If there is an obstruction ahead",
                "At all times",
                "Unless your path is clear",
                "If visibility is poor",
                2));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/24.png",
                "If you are being overtaken, what should you do?",
        "Stay in the center of your lane",
                "Maintain your speed",
                "Slow down and keep left",
                "Slow down and keep right",
                4));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/25.jpg",
                        "In urban areas, you should not use your horn between the hours of…?",
                "6 PM – 7 AM",
                "12 AM – 6 AM",
                "1 AM – 5 AM",
                "2 AM – 4 AM",
                2));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/26.jpg",
                "Your vehicle's horn should only be used to do what?",
                "Greet people",
                "Express anger",
                "Warn others",
                "Threaten others",
                3));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/27.jpg",
                "At a give way line, you must slow down and stop if necessary for…?",
        "Pedestrians only",
                "Faster vehicles",
                "Larger vehicles",
                "All vehicles and pedestrians",
                4));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/28.png",
                        "When changing lanes, you should check your blindspot by…?",
                "Listening for other vehicles",
                "Looking in your rearview mirror",
                "Looking in your right hand mirror",
                "Looking over your shoulder",
                4));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/29.jpg",
                "What is the maximum speed for an urban single carriageway?",
                "40 km an hour",
                "30 km an hour",
                "60 km an hour",
                "50 km an hour",
                1));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 5/30.jpg",
                        "When making a right turn from a single lane road, you should position yourself…?",
                "In the center of the lane",
                "Close to the right-hand side",
                "Any of these",
                "Close to the left-hand side",
                2));


        setQuestion();

    }

    private void setQuestion() {
        timer.setText(String.valueOf(score));

        Picasso.get().load(questionList.get(0).getQuestion()).into(question);
        question2.setText(questionList.get(0).getQuestion2());
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
            playAnim(question2,0,1);
            playAnim(option1,0, 2);
            playAnim(option2,0, 3);
            playAnim(option3,0, 4);
            playAnim(option4,0, 5);

            qcount.setText(String.valueOf(quesno+1)+"/"+String.valueOf(questionList.size()));
            timer.setText(String.valueOf(score));

        }else
        {
            if (mInterstitialAd.isAdLoaded()) {
                mInterstitialAd.show();
            } else {
                //Go To Score Board
                Intent intent = new Intent(PhotoQuestionActivity3.this, ScoreActivity.class);
                intent.putExtra("SCORE", String.valueOf(score) + "/" + String.valueOf(questionList.size()));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                PhotoQuestionActivity3.this.finish();
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
                                      break;

                                case 1 :
                                     ((TextView)view).setText(questionList.get(quesno).getQuestion2());
                                    break;

                                case 2 :
                                    ((Button)view).setText(questionList.get(quesno).getOptionA());
                                    break;

                                case 3 :
                                    ((Button)view).setText(questionList.get(quesno).getOptionB());
                                    break;

                                case 4 :
                                    ((Button)view).setText(questionList.get(quesno).getOptionC());
                                    break;

                                case 5 :
                                    ((Button)view).setText(questionList.get(quesno).getOptionD());
                                    break;
                            }

                            if (viewNum != 0 && viewNum != 1)
                                ((Button)view).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#020000")));


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