package lk.sliit.flipthecard;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Easy extends AppCompatActivity {

    TextView tv_score, tv_trys;
    ImageView iv11, iv12, iv13, iv14, iv21, iv22, iv23, iv24, iv31, iv32, iv33, iv34;

    Integer[] cardArray = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};

    int image101, image102, image103, image104, image105, image106, image201, image202, image203, image204, image205, image206;

    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;

    int score = 0;
    int trys = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);

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

        //declare the images to their variables
        setHiddenImages();

        //Shuffle the images
        Collections.shuffle(Arrays.asList(cardArray));


        //Listeners for the image views
        iv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv11, theCard);
            }
        });

        iv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv12, theCard);
            }
        });

        iv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv13, theCard);
            }
        });

        iv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv14, theCard);
            }
        });

        iv21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv21, theCard);
            }
        });

        iv22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv22, theCard);
            }
        });

        iv23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv23, theCard);
            }
        });

        iv24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv24, theCard);
            }
        });

        iv31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv31, theCard);
            }
        });

        iv32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv32, theCard);
            }
        });

        iv33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv33, theCard);
            }
        });

        iv34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv34, theCard);
            }
        });

    }


    private void doStuff(ImageView iv, int card)
    {
        //set the correct image to the correct image view
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


    private void  setHiddenImages()
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
}
