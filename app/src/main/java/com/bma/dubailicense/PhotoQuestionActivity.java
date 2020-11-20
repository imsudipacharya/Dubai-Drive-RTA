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

public class PhotoQuestionActivity extends AppCompatActivity implements View.OnClickListener{

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
        mInterstitialAd = new InterstitialAd(this, "807461976663649_807465286663318");
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


        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/1.png",
                "When approaching floodwater on the road, in an ordinary saloon car you should not enter it if its depth is…?",
        "More than 75% of your tire height",
                "More than 25% of your tire height",
                "More than 50% of your tire height",
                "More than 100% of your tire height",
                3));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/2.jpg",
                "The roads in Dubai are most slippery when…?",
                "It has been raining for an hour",
                "It has just started to rain",
                "It has just stopping raining",
                "It is just about to rain",
                2));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/3.png",
                "The best way of avoiding a crash is to…?",
                "Use your horn regularly",
                "Increase your speed",
                "Reduce your speed",
                "Constantly change lanes",
                3));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/4.png",
                "Children who have outgrown child safety seats should use booster seats until they are what height?",
                "125 cm",
                "145 cm",
                "155 cm",
                "135 cm",
                2));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/5.jpg",
                        "When it is raining in Dubai, there is usually an accident on the roads every…?",
                "20 minutes",
                "10 minutes",
                "Hour",
                "2 minutes",
                4));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/6.jpg",
                "You can reduce the risk of aquaplaning by…?",
                "Staying below 110 km an hour",
                "Staying below 90 km an hour",
                "Staying below 80 km an hour",
                "Staying below 100 km an hour",
                3));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/7.png",
                "When it is raining and there is a risk of aquaplaning, how much space should you leave to the vehicle in front?",
                "Two seconds",
                "Three seconds",
                "One second",
                "Four seconds",
                4));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/8.jpg",
                "The best place and alignment for a baby safety seat is…?",
                "Front seat, rear facing",
                "Front seat, front facing",
                "Rear seat, front facing",
                "Rear seat, rear facing",
                4));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/9.jpg",
                "You and your passenger must wear a seatbelt…?",
                "When driving on highways",
                "When weather conditions are poor",
                "At all times when driving",
                "When driving in urban areas",
                3));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/10.jpg",
                "What percentage of injury crashes in Dubai have excessive speed as a contributory factor?",
                "60%",
                "70%",
                "50%",
                "80%",
                4));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/11.png",
                "Using a hands-free kit makes you how much safer using a mobile phone when driving?",
                "Four times as safe",
                "Not at all",
                "Twice as safe",
                "Three times as safe",
                2));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/12.jpg",
                        "If you make a mistake that angers another driver, you should…?",
                "Stop to argue",
                "Apologise immediately",
                "Sound your horn",
                "Drive away as quickly as possible",
                2));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/13.jpg",
                "The best way to monitor your speed when driving is…?",
                "Check the speedometer",
                "Look at the roadside furniture",
                "Listen to your engine note",
                "Look at other drivers' speeds",
                1));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/14.png",
                        "If you are tired, you should…?",
                "Only drive in town",
                "Only drive if it's important",
                "Never drive your car",
                "Never drive above 50 km an hour",
                3));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/15.jpg",
                        "When it's raining, water tends to gather first…?",
                "In the outside lanes",
                "In the inside lanes",
                "In the middle lanes",
                "In all lanes equally",
                1));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/16.jpg",
                "Which of these must be working for your car to be roadworthy?",
                "Indicator lights",
                "Headlights",
                "All of them",
                "Hazard lights",
                3));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/17.png",
                "What should you do once you have cleared floodwater on the road?",
                "Drive with the brakes permanently applied",
                "Pump your brakes repeatedly",
                "Speed up to dry your brakes out",
                "Stop until your brakes are dry",
                2));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/18.png",
                        "If visibility in fog gets really poor, you should…?",
                "Sound your horn continuously",
                "Speed up to get away from it",
                "Stop in the inside lane",
                "Pull off the road",
                4));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/19.jpg",
                "If a driver is travelling at 70 km an hour in a 60 km an hour zone, how much more likely is he to crash?",
                "Four times",
                "Twice",
                "Not at all",
                "Three times",
                1));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/20.jpg",
                "A driver using a mobile phone is how much more likely to be in a collision?",
                "Three times",
                "Five times",
                "Four times",
                "Two times",
                3));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/21.png",
                        "In the fog, you should use…?",
                "Foglights only",
                "Low beam headlights",
                "High beam headlights",
                "No lights",
                2));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/22.jpg",
                "What is the maximum speed on a highway in Dubai?",
                "160 km an hour",
                "120 km an hour",
                "140 km an hour",
                "100 km an hour",
                2));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/23.jpg",
                "What is the minimum depth of tread on your tyres to be safe?",
                "1 mm",
                "1.5 mm",
                "2 mm",
                "0.5 mm",
                2));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/24.png",
                        "When driving in heavy rain, you should use…?",
                "Your satnav",
                "Your horn",
                "Your air conditioning",
                "Your headlights",
                4));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/25.jpg",
                "You should only use a mobile phone in your car when…?",
                "You are travelling below 30 km an hour",
                "You are parked",
                "Traffic is light",
                "It is urgent",
                2));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/26.png",
                "What is the maximum legal speed on urban roads in Dubai?",
                "100 km an hour",
                "70 km an hour",
                "90 km an hour",
                "80 km an hour",
                4));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/27.png",
                "What percentage of crashes in Dubai are caused by drivers under the influence of alcohol?",
                "4%",
                "14%",
                "8%",
                "20%",
                2));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/28.jpg",
                        "When it's foggy you should avoid…?",
                "Crossing traffic",
                "Overtaking",
                "Changing lanes",
                "All of these",
                4));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/29.png",
                "An average car travelling at 60 km an hour will take how long to stop in normal road conditions?",
                "36 m",
                "27 m",
                "33 m",
                "24 m",
                3));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 3/30.png",
                        "If your car is equipped with airbags you…?",
                "Can drive faster than you would without them",
                "Must still wear your seatbelt at all times",
                "Need not bother with a seatbelt",
                "Need only wear a seatbelt at high speed",
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

        }else {

            if (mInterstitialAd.isAdLoaded()) {
                mInterstitialAd.show();
            } else {
                //Go To Score Board
                Intent intent = new Intent(PhotoQuestionActivity.this, ScoreActivity.class);
                intent.putExtra("SCORE", String.valueOf(score) + "/" + String.valueOf(questionList.size()));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                PhotoQuestionActivity.this.finish();
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