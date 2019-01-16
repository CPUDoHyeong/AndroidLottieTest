package com.andrstudy.androidlottietest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;

public class MainActivity extends AppCompatActivity {
    // lottie 생성
    private LottieAnimationView lottie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lottie = (LottieAnimationView) findViewById(R.id.lottie);

        // 폴더셋팅
        lottie.setImageAssetsFolder("images/");
        // 파일 셋팅
        lottie.setAnimation("b_finish2.json");
        // 무한 반복
        lottie.setRepeatCount(LottieDrawable.INFINITE);
        // 실행
        lottie.playAnimation();
    }
}
