package com.techacharya.dubaidriverta;

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

import java.util.ArrayList;
import java.util.List;

public class PhotoQuestionActivity4 extends AppCompatActivity implements View.OnClickListener{

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
        mInterstitialAd = new InterstitialAd(this, "807461976663649_807465659996614");
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


        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/1.png",
                "A broken line at the left of your lane means…?",
                "Pass at any time",
                "Pass only during daylight hours",
                "You may pass if the way is clear",
                "Never pass",
                3));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/2.jpg",
                "If someone is injured in a crash, you should not move them unless…?",
                "They are impeding traffic",
                "They say that they feel fine to be moved",
                "They are in danger of being further injured by staying where they are",
                "You assess that their injuries are not serious",
                3));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/3.jpg",
                "How do you avoid aquaplaning?",
                "Increasing following distance",
                "By slowing down",
                "Travelling in middle lanes if possible",
                "All answers are ",
                2));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/4.png",
                "If the signal light changes from green to amber as you approach an intersection, what should you do?",
                "Speed up to clear the intersection as quickly as possible",
                "Sound the horn to warn pedestrians and other drivers that you do not intend to stop",
                "Continue through the intersection without slowing or stopping",
                "Stop. If a stop cannot be made safely proceed with caution",
                4));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/5.jpg",
                "At what speed do you have the best emissions efficiency?",
                "60 – 80 km/h",
                "80 – 100 km/h",
                "40 – 60 km/h",
                "100 – 120 km/h",
                2));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/6.jpg",
                "You must not park within what distance of an intersection?",
                "15 m",
                "10 m",
                "5 m",
                "20 m",
                1));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/7.png",
                "A solid line at the left of your lane means…?",
                "It is unsafe to pass",
                "Pass at your discretion",
                "Pass only when no traffic is sight",
                "Overtake and pass with caution",
                1));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/8.png",
                "On a three lane highway, a slower vehicle is in the center lane. You may…?",
                "Overtake them on either side",
                "Overtake them on the right",
                "Overtake them on the left",
                "Not overtake them",
                3));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/9.png",
                "When the traffic signal light facing you is red and you intend to go straight through the intersection, what must you do first?",
                "Slow down, proceed when the way is clear",
                "Stop, proceed when the way is clear",
                "Stop, give pedestrians the right-of-way, and then proceed with caution",
                "Stop, wait until the light changes to green and the intersection is clear before moving through it",
                4));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/10.jpg",
                "Harsh acceleration and braking can use up to how much more fuel?",
                "15%",
                "10%",
                "30%",
                "20%",
                3));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/11.png",
                "What is the best way to ensure that there are no vehicles or cyclists in your blind spot?",
                "Make a shoulder check",
                "Check the rear view mirror",
                "Sound the horn",
                "Give the  signals",
                1));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/12.jpg",
                "For the best fuel economy, you should keep your engine speed below…?",
                "5000 rpm",
                "3000 rpm",
                "4000 rpm",
                "2000 rpm",
                2));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/13.png",
                "When choosing a parking space, it should be at least…?",
                "1.5 times the length of your vehicle",
                "Twice the length of your vehicle",
                "Three times the length of your vehicle",
                "The length of your vehicle",
                1));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/14.jpg",
                "If there are no marked parking bays, how much space should you leave between you and the vehicles in front of and behind you?",
                "1 m",
                "2 m",
                "1.5 m",
                "0.5 m",
                1));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/15.jpg",
                "You must signal when...?",
                "Moving from the curb or parking lane",
                "Changing lanes",
                "Doing any of these things",
                "Turning",
                3));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/16.png",
                "Yellow lines exist to…?",
                "Separate traffic travelling in the same direction",
                "Indicate construction zones",
                "Indicate that lane changing is permitted",
                "Separate traffic travelling in opposite directions",
                4));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/17.png",
                "When driving near to schools and residential area...?",
                "You should turn on high beam light",
                "You should horn and continue driving",
                "You should not stop in the hard shoulder",
                "You should adhere to the road speed limit",
                4));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/18.jpg",
                "What is the maximum length of time you can stay in a Code A paid parking location?",
                "3 hours",
                "4 hours",
                "5 hours",
                "6 hours",
                2));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/19.jpg",
                "If a traffic signal changes while a pedestrian is still on the street, which of the following has the right-of-way?",
                "Motorists coming from his left",
                "The pedestrian",
                "Motorists making a turn",
                "Motorists coming from his right",
                2));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/20.jpg",
                "To make your vehicle more efficient, how often should you check your tire pressure?",
                "At every service",
                "Every time you fill up",
                "Every month",
                "Every week",
                2));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/21.png",
                "A red signal light with a green arrow is shown at an intersection indicates…?",
                "Stop and then proceed",
                "Stop and wait for a green signal before making a turn in the direction of the arrow",
                "That pedestrians may cross",
                "Proceed with caution in the direction of the arrow",
                4));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/22.jpg",
                "If you see an Ambulance coming behind you while you driving, What you will do ?",
                "Speed up and drive.",
                "Give way to Ambulance vehicle",
                "Stop immediately in your lane",
                "Continue driving",
                2));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/23.jpg",
                "When a red 'X' is indicated over a driving lane…?",
                "Drivers in that lane must stop immediately",
                "It indicates traffic lights ahead",
                "It applies to pedestrians only",
                "A driver must not enter or remain in that lane",
                4));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/24.jpg",
                "When overtaking a large truck on an open highway, approximately how long will it take you to pass?",
                "15 seconds",
                "5 seconds",
                "10 seconds",
                "25 seconds",
                4));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/25.jpg",
                "Most of front to back accidents inside city limits happen because of...?",
                "Breaking",
                "Lack of driving signs",
                "Turning",
                "Fail to maintain distances",
                4));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/26.png",
                "How many points can you accrue on your license in a year before it is confiscated?",
                "24",
                "28",
                "32",
                "20",
                1));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/27.jpg",
                "Which of these factors must you consider when parking your vehicle?",
                "All of these",
                "Can I clearly see others",
                "Can I be clearly seen",
                "Does it block anybody else",
                1));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/28.png",
                "If your car breaks down you should...?",
                "Any of these",
                "Immediately leave the vehicle to look for help",
                "Call the police",
                "Warn other drivers by using hazards lights",
                4));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/29.jpg",
                "You should not drive in a blind spot of a truck or bus driver.",
                "In residential streets only",
                "True",
                "In freeway only",
                "False",
                2));

        questionList.add(new PhotoQuestion("https://ia601406.us.archive.org/32/items/18_20200916/30.png",
                "If you are involved in a crash, you must notify the police of it within what time?",
                "6 hours",
                "12 hours",
                "1 hour",
                "24 hours",
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
                Intent intent = new Intent(PhotoQuestionActivity4.this, ScoreActivity.class);
                intent.putExtra("SCORE", String.valueOf(score) + "/" + String.valueOf(questionList.size()));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                PhotoQuestionActivity4.this.finish();
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