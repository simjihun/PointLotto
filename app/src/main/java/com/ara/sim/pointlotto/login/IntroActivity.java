package com.ara.sim.pointlotto.login;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.Bundle;
import android.view.Window;

import com.ara.sim.pointlotto.R;

public class IntroActivity extends Activity {

    //start
    @SuppressLint("HandlerLeak")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_intro);

        Handler handler = new Handler(){
            @Override
            public void handleMessage(Message msg){
                startActivity(new Intent(IntroActivity.this, LoginActivity.class));
                //overridePendingTransition(R.anim.fade, R.anim.hold);
                finish();
            }
        };
        handler.sendEmptyMessageDelayed(0,3000);
    }
}
