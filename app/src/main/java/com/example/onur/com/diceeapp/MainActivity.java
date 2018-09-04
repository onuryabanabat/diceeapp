package com.example.onur.com.diceeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    int number;
    int number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton= findViewById(R.id.rollButton);

        final ImageView leftDice = findViewById(R.id.image_leftDice);

        final ImageView rightDice = findViewById(R.id.image_rightDice);

        final int[] diceArray ={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final int[] newArray={
                2,1,5,3,6,5
                };

                Log.d("Dicee","Ze Button has been pressed");
                for(int i = 0; i < 2000; i++) {
                    Random random = new Random();
                    number = random.nextInt((5 - 0) + 1) + 0;


                    Random random2 = new Random();
                    number2 = random2.nextInt((5 - 0) + 1) + 0;

                    leftDice.setImageResource(diceArray[number]); // for loop içerisinde random sayı üretip her loop döndüğünde resources tan ilgili zar resmini çekiyoruz
                    // ama burdaki değer final değeri (yani zarın alacağı son resim değil animasyon görüntüsü vermek için burda böyle yapıyoruz)
                    // ardından zarın son değerini alması için 200ms sonra thread çalıstırıp zarlara son değerini veriyoruz
                    rightDice.setImageResource(diceArray[number2]);

                    new android.os.Handler().postDelayed(
                            new Runnable() {
                                public void run() {
                                    Random random3 = new Random();
                                   int number3 = random3.nextInt((5 - 0) + 1) + 0;


                                    Random random4 = new Random();
                                   int number4 = random4.nextInt((5 - 0) + 1) + 0;
                                   // burda vermis olduğumuz değerler kalıcı değerler ve buton tıklanmadıkça değismeyecek olan değerler
                                    leftDice.setImageResource(diceArray[number3]);
                                    rightDice.setImageResource(diceArray[number4]);
                                }
                            }, 200);
                }
                 /*for (int i = 0; i<newArray.length;i++)
                {
                    leftDice.setImageResource(diceArray[i]);
                    rightDice.setImageResource(diceArray[i]);
                    Log.d("forLoop","For döngüsü çalıştı.");

                    Random randomNumberGenerator = new Random();

                    int number = randomNumberGenerator.nextInt(6);

                    Log.d("Dicee","The random number is: " + number);


                    leftDice.setImageResource(diceArray[number]);

                    number = randomNumberGenerator.nextInt(6);

                    rightDice.setImageResource(diceArray[number]);
                }*/


            }
        });




    }
}
