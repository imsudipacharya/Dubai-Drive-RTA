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

public class QuestionsActivity extends AppCompatActivity implements View.OnClickListener{

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
        mInterstitialAd = new InterstitialAd(this, "807461976663649_807464929996687");
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



        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/1.png",
                "Diversion to opposite carriageway ahead",
                "Overtaking is not permitted",
                "Lorries prohibited",
                "No Hazardous materials",
                4));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/2.png",
                "Don't go straight on",
                "No U-turn",
                "You must not turn right",
                "You must not turn left",
                4));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/3.png",
                "The road narrowing on the left ahead",
                "The road narrowing on the right ahead",
                "The road narrows on both sides ahead",
                "Two lanes merging into one ahead",
                3));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/4.png",
                "No stopping",
                "You must not enter this road",
                "No parking",
                "Motorcycle only",
                2));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/5.png",
                "You only have to stop if you can see other traffic",
                "You must start to slow and be ready to stop if there is other traffic",
                "There is a bus stop around the corner",
                "You must come to a complete stop and check for other traffic",
                4));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/6.png",
                "Approaching traffic has priority over you",
                "There is two-way traffic on your road",
                "You can use all lanes on your road",
                "You have priority over oncoming traffic",
                2));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/7.png",
                "Possibility of aggressive stags in the area",
                "Hunters operating in the area",
                "Animals have priority over vehicles",
                "Slow down and watch out for animals on the road",
                4));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/8.png",
                "Watch out for pedestrians",
                "No jogging",
                "No pedestrians",
                "Pedestrians only",
                3));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/9.png",
                "May not make a U-turn",
                "May not keep straight on",
                "May not turn to the right",
                "May not reverse",
                1));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/10.png",
                "Children are not allowed to cross here",
                "Children may only cross hand-in-hand with an adult",
                "Children going to or from school",
                "Playground",
                3));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/11.png",
                "You must give way to all traffic on the road you are joining/crossing",
                "You must give way to traffic moving faster than you",
                "You must give way to traffic coming from your right",
                "All traffic on the road you are joining/crossing must give way to you",
                1));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/12.png",
                "There are traffic signals ahead",
                "The traffic signals ahead do not apply to you",
                "The traffic signals ahead are broken",
                "The traffic signals ahead are only part time",
                1));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/13.png",
                "This road has two-way traffic",
                "Overtaking is not permitted",
                "Overtaking is compulsory",
                "Oncoming traffic has priority",
                2));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/14.png",
                "No horn after midnight",
                "No horn in hospital zone",
                "You must not use your horn",
                "You must use your horn to warn other road users",
                3));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/15.png",
                "The road ahead is uneven",
                "River bank ahead",
                "Loose chippings",
                "Speed hump",
                4));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/16.png",
                "You can use all lanes on your road",
                "An unmarked crossing",
                "Priority to oncoming traffic",
                "You have priority over oncoming traffic",
                3));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/17.png",
                "A tunnel ahead",
                "Roundabout ahead",
                "Slippery conditions",
                "A three-way intersection",
                2));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/18.png",
                "Zigzag bends",
                "Oncoming traffic on your side of the road",
                "A fast chicane",
                "Slippery road",
                4));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/19.png",
                "There is a stop sign ahead",
                "There are traffic signals ahead",
                "Intersection ahead",
                "Tunnel ahead",
                1));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/20.png",
                "Traffic from the other side of the river has priority",
                "There is no way across the river",
                "The approaching bridge is very steep",
                "An opening bridge ahead",
                4));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/21.png",
                "The edge of a cliff ahead",
                "A quayside or riverbank ahead",
                "A steep drop onto another road ahead",
                "A swing bridge which will be open ahead",
                2));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/22.png",
                "A bridge over the road",
                "A dead end",
                "A tunnel",
                "A railway crossing",
                3));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/23.png",
                "The road narrowing on both sides",
                "The road widening for oncoming traffic",
                "The road narrowing on the right",
                "The road narrowing on the left",
                4));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/24.png",
                "Unmarked crossing ahead",
                "Pedestrian crossing ahead",
                "Pelican crossing ahead",
                "Toucan crossing ahead",
                2));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/25.png",
                "Intersection ahead. Slow down and prepare to stop",
                "A crossroads is coming up where cross traffic has priority",
                "You must continue straight on",
                "You must take the right or left exits from your road",
                1));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/26.png",
                "Two-way traffic crosses one-way road",
                "No left or right turn allowed",
                "The far lane has priority over the near lane",
                "You must turn right or left",
                1));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/27.png",
                "Oil on the road",
                "Risk of falling rocks",
                "Heavy snowfall",
                "Multiple potholes",
                2));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/28.png",
                "No parking available",
                "Loading only available",
                "Parking area for Handicapped drivers only",
                "Restricted parking available",
                3));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/29.png",
                "Curve in the road to the left ahead",
                "The road camber is increasing",
                "You must take the next left turn",
                "The road bends round to the right",
                1));

        questionList.add(new Question("https://vgqptrahd8eeow1ntte5ea-on.drv.tw/License/Set 1/30.png",
                "There are multiple bridges ahead",
                "There are hills approaching",
                "The road ahead is uneven",
                "The road runs through a valley",
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
                Intent intent = new Intent(QuestionsActivity.this, ScoreActivity.class);
                intent.putExtra("SCORE", String.valueOf(score) + "/" + String.valueOf(questionList.size()));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                QuestionsActivity.this.finish();
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