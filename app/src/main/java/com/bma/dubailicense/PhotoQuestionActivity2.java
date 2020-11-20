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

public class PhotoQuestionActivity2 extends AppCompatActivity implements View.OnClickListener{

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
        mInterstitialAd = new InterstitialAd(this, "807461976663649_807465396663307");
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


        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/1.png",
                "The outside lane on a highway should be used…?",
                "For overtaking only",
                "In emergencies only",
                "For high-speed driving",
                "For all sorts of driving",
                1));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/2.png",
                "When is it compulsory to have your car headlights on?",
                "An hour after sunset and an hour before sunrise",
                "Half an hour after sunset and half an hour before sunrise",
                "At all times day and night",
                "Between sunset and sunrise",
                4));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/3.jpg",
                "Towing a trailer will affect…?",
                "Braking",
                "All of these",
                "Cornering",
                "Acceleration",
                2));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/4.jpg",
                "Driving aggressively…?",
                "Does all these things",
                "Increases fuel consumption",
                "Causes congestion",
                "Makes crashing more likely",
                1));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/5.png",
                "When road and weather conditions are good, how far should you stay behind the vehicle in front?",
                "Three seconds",
                "One second",
                "Two seconds",
                "Half a second",
                3));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/6.png",
                "Which of these circumstances should make you increase your following distance?",
                "All of them",
                "When you are carrying a heavy load",
                "When it is dark",
                "When it is raining",
                1));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/7.png",
                "If you break down on a highway, what should you do?",
        "Stand to the side of the car to warn other drivers",
                "Stay in the car with your hazards on",
                "Stand in front of the car to warn other drivers",
                "Exit the car and leave your hazards on",
                4));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/8.png",
                "The safest way to brake is…?",
                "Gradually and early",
                "Early and hard",
                "Any of these",
                "Gradually and late",
                1));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/9.jpg",
                "If you have broken down and have a reflective triangle, where should you position it?",
                "50 m from your vehicle facing oncoming traffic",
                "100 m from your vehicle facing oncoming traffic",
                "100 m from your vehicle facing approaching traffic",
                "50 m from your vehicle facing approaching traffic",
                4));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/10.jpg",
                "Truck and bus drivers have blind spots…?",
                "Directly behind them",
                "Directly in front of them",
                "Next to the left-hand door",
                "In all of these places",
                4));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/11.jpg",
                "When passing a cyclist or motorcyclist in a car or other vehicle, you must leave at least how much space?",
                "25 cm",
                "2 m",
                "50 cm",
                "1 m",
                4));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/12.jpg",
                "What percentage of crashes in Dubai occur at night?",
                "62%",
                "42%",
                "32%",
                "52%",
                4));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/13.png",
                "High beam headlights should be used…?",
                "At all times",
                "At high speeds",
                "In urban areas",
                "In unlit areas",
                4));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/14.jpg",
                "Your journey will be safer and more pleasant if you…?",
                "Use a satnav",
                "Plan in advance",
                "Use a map",
                "Rely on road signs",
                2));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/15.png",
                        "When approaching another driver with your high beam headlights on, you should…?",
                "Sound your horn",
                "Turn your headlights off",
                "Briefly flash your headlights",
                "Dip your headlights",
                4));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/16.png",
                "You must give way to emergency vehicles with siren sounding or flashing lights…?",
                "If it will not impede your journey",
                "At all times",
                "When convenient to do so",
                "When the traffic signs are in their favour",
                2));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/17.jpg",
                "The maximum weight designated for your pickup refers to…?",
                "The weight of cargo alone",
                "The weight of cargo and extra equipment",
                "The weight of cargo, occupants and extra equipment",
                "The weight of extra equipment and occupants",
                3));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/18.jpg",
                "School buses in Dubai are limited to…?",
                "80 km an hour",
                "60 km an hour",
                "40 km an hour",
                "100 km an hour",
                1));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/19.png",
                "When do pedestrians have right of way?",
                "At night",
                "At all times",
                "In urban areas",
                "In poor weather conditions",
                2));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/20.jpg",
                        "If a trailer starts to sway, you should…?",
                "Accelerate hard",
                "Swerve to  it",
                "Maintain a steady speed",
                "Brake hard",
                3));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/21.png",
                "You should never overtake a bus or truck when…?",
                "It's accelerating",
                "It's cruising",
                "It's slowing down",
                "It's on the highway",
                3));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/22.jpg",
                        "When carrying a heavy load on a pickup, you should distribute the load…?",
                "In the center of the cargo area",
                "Towards the rear of the cargo area",
                "Evenly over the cargo area",
                "Towards the front of the cargo area",
                3));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/23.jpg",
                        "Whenever possible, you should drive in…?",
                "Any of these",
                "The middle lane",
                "The fast lane",
                "The slow lane",
                4));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/24.png",
                        "When changing lanes or making a turn, you should use your indicators…?",
                "If pedestrians are present",
                "If there is traffic behind you",
                "At all times",
                "If there is oncoming traffic",
                3));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/25.jpg",
                "If another driver comes towards you with high beam headlights on, what should you do?",
        "Sound your horn",
                "Close your eyes tight",
                "Look down and to the right",
                "Turn your high beams on",
                3));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/26.jpg",
                        "If you use a priority bus and taxi lane, you can be fined…?",
                "400 AED",
                "200 AED",
                "600 AED",
                "100 AED",
                3));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/27.png",
                        "When a school bus has its flashers on, that means…?",
                "You may pass it safely",
                "It is out of commission",
                "It is picking up or dropping off students",
                "No driver is present",
                3));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/28.jpg",
                        "When going downhill towing a trailer, you should…?",
                "Stay in your normal gear",
                "Any of these",
                "Select a higher gear",
                "Select a lower gear",
                4));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/29.png",
                "The special priority lanes for buses and taxis may also be used by…?",
                "All of these",
                "Motorcycles",
                "Heavy goods vehicles",
                "Emergency vehicles",
                4));

        questionList.add(new PhotoQuestion("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 4/30.png",
                "Cyclists and motorcyclists are entitled to use…?",
                "The full width of a lane",
                "The meter of the lane nearest the kerb",
                "The right-hand half of a lane",
                "The left-hand half of a lane",
                1));



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
                Intent intent = new Intent(PhotoQuestionActivity2.this, ScoreActivity.class);
                intent.putExtra("SCORE", String.valueOf(score) + "/" + String.valueOf(questionList.size()));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                PhotoQuestionActivity2.this.finish();
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