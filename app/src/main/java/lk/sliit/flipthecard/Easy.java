package lk.sliit.flipthecard;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.media.Image;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.logging.Handler;

public class Easy extends AppCompatActivity {

    Player player;

    TextView tv_score, tv_trys;
    ImageView iv11, iv12, iv13, iv14, iv21, iv22, iv23, iv24, iv31, iv32, iv33, iv34;

    //Array to identify the images
    Integer[] cardArray = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};

    //Actual images
    int image101, image102, image103, image104, image105, image106, image201, image202, image203, image204, image205, image206;

    private int firstCard, secondCard;
    private int clickedFirst, clickedSecond;
    private int cardNumber = 1;

    private  int easyHigh, normalHigh, hardHigh, timeTrialHigh;

    private static final int DEFAULT = -9000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);

        //Get the highscores from shared preferences
        SharedPreferences sharedPreferences = getSharedPreferences("HighScore", Context.MODE_PRIVATE);
        easyHigh = sharedPreferences.getInt("easy",DEFAULT);
        normalHigh = sharedPreferences.getInt("normal",DEFAULT);
        hardHigh = sharedPreferences.getInt("hard",DEFAULT);
        timeTrialHigh = sharedPreferences.getInt("timetrial",DEFAULT);

        //Initialize player class -- Values taken from shared preferences --
        player = new Player(0,0,easyHigh,normalHigh,hardHigh,timeTrialHigh);


        tv_score = (TextView) findViewById(R.id.tv_score);
        tv_trys = (TextView) findViewById(R.id.tv_trys);

        iv11 = (ImageView) findViewById(R.id.iv11);
        iv12 = (ImageView) findViewById(R.id.iv12);
        iv13 = (ImageView) findViewById(R.id.iv13);
        iv14 = (ImageView) findViewById(R.id.iv14);
        iv21 = (ImageView) findViewById(R.id.iv21);
        iv22 = (ImageView) findViewById(R.id.iv22);
        iv23 = (ImageView) findViewById(R.id.iv23);
        iv24 = (ImageView) findViewById(R.id.iv24);
        iv31 = (ImageView) findViewById(R.id.iv31);
        iv32 = (ImageView) findViewById(R.id.iv32);
        iv33 = (ImageView) findViewById(R.id.iv33);
        iv34 = (ImageView) findViewById(R.id.iv34);

        iv11.setTag("0");
        iv12.setTag("1");
        iv13.setTag("2");
        iv14.setTag("3");
        iv21.setTag("4");
        iv22.setTag("5");
        iv23.setTag("6");
        iv24.setTag("7");
        iv31.setTag("8");
        iv32.setTag("9");
        iv33.setTag("10");
        iv34.setTag("11");

        //This method sets the image resources to the above decalared interger varaibles
        declareImageResources();

        //Shuffle the images
        Collections.shuffle(Arrays.asList(cardArray));


        //Listeners for the image views
        iv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                imageViewClicked(iv11, theCard);
            }
        });

        iv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                imageViewClicked(iv12, theCard);
            }
        });

        iv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                imageViewClicked(iv13, theCard);
            }
        });

        iv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                imageViewClicked(iv14, theCard);
            }
        });

        iv21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                imageViewClicked(iv21, theCard);
            }
        });

        iv22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                imageViewClicked(iv22, theCard);
            }
        });

        iv23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                imageViewClicked(iv23, theCard);
            }
        });

        iv24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                imageViewClicked(iv24, theCard);
            }
        });

        iv31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                imageViewClicked(iv31, theCard);
            }
        });

        iv32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                imageViewClicked(iv32, theCard);
            }
        });

        iv33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                imageViewClicked(iv33, theCard);
            }
        });

        iv34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                imageViewClicked(iv34, theCard);
            }
        });
        //End of listeners of the image views

    }


    //This method sets the image resources to the above declared integer variables
    private void  declareImageResources()
    {
        image101 = R.drawable.im101;
        image102 = R.drawable.im102;
        image103 = R.drawable.im103;
        image104 = R.drawable.im104;
        image105 = R.drawable.im105;
        image106 = R.drawable.im106;
        image201 = R.drawable.im201;
        image202 = R.drawable.im202;
        image203 = R.drawable.im203;
        image204 = R.drawable.im204;
        image205 = R.drawable.im205;
        image206 = R.drawable.im206;

    }


    //This method runs when a image is been clicked
    private void imageViewClicked(ImageView iv, int card)
    {
        //This method sets the correct hidden image to the correct image view
        setImages(iv, card);

        //This method checks which images are clicked and saves it to a temporary varaible
        checkSelectedImage(iv,card);

    }


    //This method sets the correct image to the correct image view
    private  void setImages(ImageView iv, int card)
    {
        if(cardArray[card] == 101)
        {
            iv.setImageResource(image101);
        }
        else if (cardArray[card] == 102)
        {
            iv.setImageResource(image102);
        }
        else if (cardArray[card] == 103)
        {
            iv.setImageResource(image103);
        }
        else if (cardArray[card] == 104)
        {
            iv.setImageResource(image104);
        }
        else if (cardArray[card] == 105)
        {
            iv.setImageResource(image105);
        }
        else if (cardArray[card] == 106)
        {
            iv.setImageResource(image106);
        }
        else if (cardArray[card] == 201)
        {
            iv.setImageResource(image201);
        }
        else if (cardArray[card] == 202)
        {
            iv.setImageResource(image202);
        }
        else if (cardArray[card] == 203)
        {
            iv.setImageResource(image203);
        }
        else if (cardArray[card] == 204)
        {
            iv.setImageResource(image204);
        }else if (cardArray[card] == 205)
        {
            iv.setImageResource(image205);
        }
        else if (cardArray[card] == 206)
        {
            iv.setImageResource(image206);
        }
    }


    //This method checks which images are clicked and saves it to a temporary variable
    private void checkSelectedImage(ImageView iv, int card)
    {
        if (cardNumber == 1)
        {
            firstCard = cardArray[card];
            if (firstCard > 200)
            {
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);
        }
        else if (cardNumber == 2)
        {
            secondCard = cardArray[card];
            if (secondCard > 200)
            {
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card;

            //Make the image views unclickable -- Enabled back after the imageMatch function --
            iv11.setEnabled(false);
            iv12.setEnabled(false);
            iv13.setEnabled(false);
            iv14.setEnabled(false);
            iv21.setEnabled(false);
            iv22.setEnabled(false);
            iv23.setEnabled(false);
            iv24.setEnabled(false);
            iv31.setEnabled(false);
            iv32.setEnabled(false);
            iv33.setEnabled(false);
            iv34.setEnabled(false);


            android.os.Handler handler = new android.os.Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    imageMatch(); //This method checks if the selected images match each other and if match hides the matching pair
                }
            },1000);
        }
    }


    //This method checks if the selected images match each other and if match hides the matching pair
    private void imageMatch()
    {
        if (firstCard == secondCard)
        {
            if (clickedFirst == 0)
            {
                iv11.setVisibility(View.INVISIBLE);
            }
            else if (clickedFirst == 1)
            {
                iv12.setVisibility(View.INVISIBLE);
            }
            else if (clickedFirst == 2)
            {
                iv13.setVisibility(View.INVISIBLE);
            }
            else if (clickedFirst == 3)
            {
                iv14.setVisibility(View.INVISIBLE);
            }
            else if (clickedFirst == 4)
            {
                iv21.setVisibility(View.INVISIBLE);
            }
            else if (clickedFirst == 5)
            {
                iv22.setVisibility(View.INVISIBLE);
            }
            else if (clickedFirst == 6)
            {
                iv23.setVisibility(View.INVISIBLE);
            }
            else if (clickedFirst == 7)
            {
                iv24.setVisibility(View.INVISIBLE);
            }
            else if (clickedFirst == 8)
            {
                iv31.setVisibility(View.INVISIBLE);
            }
            else if (clickedFirst == 9)
            {
                iv32.setVisibility(View.INVISIBLE);
            }else if (clickedFirst == 10)
            {
                iv33.setVisibility(View.INVISIBLE);
            }
            else if (clickedFirst == 11)
            {
                iv34.setVisibility(View.INVISIBLE);
            }


            if (clickedSecond == 0)
            {
                iv11.setVisibility(View.INVISIBLE);
            }
            else if (clickedSecond == 1)
            {
                iv12.setVisibility(View.INVISIBLE);
            }
            else if (clickedSecond == 2)
            {
                iv13.setVisibility(View.INVISIBLE);
            }
            else if (clickedSecond == 3)
            {
                iv14.setVisibility(View.INVISIBLE);
            }
            else if (clickedSecond == 4)
            {
                iv21.setVisibility(View.INVISIBLE);
            }
            else if (clickedSecond == 5)
            {
                iv22.setVisibility(View.INVISIBLE);
            }
            else if (clickedSecond == 6)
            {
                iv23.setVisibility(View.INVISIBLE);
            }
            else if (clickedSecond == 7)
            {
                iv24.setVisibility(View.INVISIBLE);
            }
            else if (clickedSecond == 8)
            {
                iv31.setVisibility(View.INVISIBLE);
            }
            else if (clickedSecond == 9)
            {
                iv32.setVisibility(View.INVISIBLE);
            }else if (clickedSecond == 10)
            {
                iv33.setVisibility(View.INVISIBLE);
            }
            else if (clickedSecond == 11)
            {
                iv34.setVisibility(View.INVISIBLE);
            }

            //Increase the score if match
            player.increaseScore();
            tv_score.setText("Score: " + player.getScore());

            //Increase the no. of trys by 1
            player.increaseTrys();
            tv_trys.setText("Trys: " + player.getTrys());

        }
        else
        {
            //Decrease the score if doesn't match
            player.decreaseScore();
            tv_score.setText("Score: " + player.getScore());

            //Increase the no. of trys by 1
            player.increaseTrys();
            tv_trys.setText("Trys: " + player.getTrys());


            //If images does not match hide the viewed image --Sets the question mark image to all the image view--
            iv11.setImageResource(R.drawable.question_mark_512);
            iv12.setImageResource(R.drawable.question_mark_512);
            iv13.setImageResource(R.drawable.question_mark_512);
            iv14.setImageResource(R.drawable.question_mark_512);
            iv21.setImageResource(R.drawable.question_mark_512);
            iv22.setImageResource(R.drawable.question_mark_512);
            iv23.setImageResource(R.drawable.question_mark_512);
            iv24.setImageResource(R.drawable.question_mark_512);
            iv31.setImageResource(R.drawable.question_mark_512);
            iv32.setImageResource(R.drawable.question_mark_512);
            iv33.setImageResource(R.drawable.question_mark_512);
            iv34.setImageResource(R.drawable.question_mark_512);
        }

        //Make the image views clickable --Image views ae disabled when the two images were selected--
        iv11.setEnabled(true);
        iv12.setEnabled(true);
        iv13.setEnabled(true);
        iv14.setEnabled(true);
        iv21.setEnabled(true);
        iv22.setEnabled(true);
        iv23.setEnabled(true);
        iv24.setEnabled(true);
        iv31.setEnabled(true);
        iv32.setEnabled(true);
        iv33.setEnabled(true);
        iv34.setEnabled(true);

        //This method checks whether the game is over
        checkGameOver();

    }


    //This method checks whether all the images are matched which ends the game
    private void checkGameOver()
    {
        if (iv11.getVisibility() == View.INVISIBLE &&
                iv12.getVisibility() == View.INVISIBLE &&
                iv13.getVisibility() == View.INVISIBLE &&
                iv14.getVisibility() == View.INVISIBLE &&
                iv21.getVisibility() == View.INVISIBLE &&
                iv22.getVisibility() == View.INVISIBLE &&
                iv23.getVisibility() == View.INVISIBLE &&
                iv24.getVisibility() == View.INVISIBLE &&
                iv31.getVisibility() == View.INVISIBLE &&
                iv32.getVisibility() == View.INVISIBLE &&
                iv33.getVisibility() == View.INVISIBLE &&
                iv34.getVisibility() == View.INVISIBLE)
        {

            //check for highscore and if its highscore
            if (player.getScore()>player.getHighEasy())
            {
                //if new highscore, update the easyHighscore value in shared preferences
                SharedPreferences sharedPreferences = getSharedPreferences("HighScore", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("easy",player.getScore());
                editor.apply();

                //Show game over alert
                showGameOverDialog("Game Over!!!\nNew Highscore: ","\nTrys: ");
            }
            else
            {
                //Show game over alert
                showGameOverDialog("Game Over!!!\nYour Score: ", "\nTrys: ");
            }
        }
    }


    //This method shows an alert box if game is over
    private void showGameOverDialog(String m1, String m2)
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Easy.this);
        alertDialogBuilder
                .setMessage(m1 + player.getScore() + m2 + player.getTrys())
                .setCancelable(false)
                .setPositiveButton("Restart", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(),Easy.class);
                        startActivity(intent);
                        finish();
                    }
                })
                .setNegativeButton("Main Menu", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

}
