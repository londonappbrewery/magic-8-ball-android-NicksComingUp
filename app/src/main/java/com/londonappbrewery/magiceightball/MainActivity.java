package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button askButton;
    ImageView ballImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        askButton= (Button) findViewById(R.id.askButton);
       ballImage=  (ImageView) findViewById(R.id.image_ball);

        final int [] ballArray=  new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        final Random randomNumber = new Random();
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               ballImage.setImageResource(  ballArray[randomNumber.nextInt(5)] ) ;
                Log.d("click", "Click on me");
            }
        });
    }
}
