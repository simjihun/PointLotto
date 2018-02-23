package com.ara.sim.pointlotto.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.ara.sim.pointlotto.R;
import com.ara.sim.pointlotto.login.com.ara.sim.pointlotto.main.MainActivity;

import static com.ara.sim.pointlotto.R.layout.activity_login;

public class LoginActivity extends Activity {

    //kakao api 연동
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(activity_login);

        Button button = findViewById(R.id.login_button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
