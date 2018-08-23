package com.ezeagu.android.redplayer;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TextView redText = (TextView) findViewById(R.id.text_red);
        TextView playerText = (TextView) findViewById(R.id.text_player);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.down_to_top1);
        redText.setAnimation(animation);

        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.down_to_top2);
        playerText.setAnimation(animation2);

        Timer();
    }

    private void Timer() {

        new CountDownTimer(4000, 1000) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                finish();
                startActivity(intent);

            }
        }.start();
    }
}
