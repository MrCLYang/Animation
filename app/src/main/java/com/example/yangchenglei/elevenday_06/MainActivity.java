package com.example.yangchenglei.elevenday_06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

/*
*
* 补间动画
* */
public class MainActivity extends AppCompatActivity {

    private ImageView imageshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageshow = (ImageView) findViewById(R.id.iv);

    }

    public void click1(View v) {
        //1.0完全不透明0.0
        AlphaAnimation aa=new AlphaAnimation(1.0f,0.0f);
        aa.setDuration(2000);
        aa.setRepeatCount(1);
        imageshow.startAnimation(aa);
    }

    public void click2(View v) {
        RotateAnimation ra=new RotateAnimation(0,360, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        ra.setRepeatCount(1);
        ra.setDuration(2000);
        imageshow.startAnimation(ra);
    }

    public void click3(View v) {
        ScaleAnimation sa =new ScaleAnimation(1.0f,2.0f,1.0f,2.0f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        sa.setRepeatCount(1);
        sa.setDuration(2000);
        imageshow.startAnimation(sa);
    }

    public void click4(View v) {
        TranslateAnimation ta=new TranslateAnimation(Animation.RELATIVE_TO_PARENT,0f,Animation.RELATIVE_TO_PARENT,0f,Animation.RELATIVE_TO_PARENT,0f,Animation.RELATIVE_TO_PARENT,0.2f);
        ta.setRepeatCount(1);
        ta.setDuration(2000);
        imageshow.startAnimation(ta);
    }
}
