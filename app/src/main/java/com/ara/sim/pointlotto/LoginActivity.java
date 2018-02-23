package com.ara.sim.pointlotto;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import static com.ara.sim.pointlotto.R.layout.activity_login;

public class LoginActivity extends Activity {

    //kakao api 연동
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(activity_login);
    }
}
