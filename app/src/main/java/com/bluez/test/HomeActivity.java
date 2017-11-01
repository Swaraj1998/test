package com.bluez.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onButtonTap(View view) {

        String buttonText = ((Button) view).getText().toString();

        if(buttonText.equals(getResources().getString(R.string.button_1))) {
            Intent intent = new Intent(this, NewActivity.class);
            startActivity(intent);
        }
        else if(buttonText.equals(getResources().getString(R.string.button_2))) {
            Intent intent = new Intent(this, NewActivity2.class);
            startActivity(intent);
        }

    }
}
