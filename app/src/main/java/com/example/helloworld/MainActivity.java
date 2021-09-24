package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView tvMessage;
    public Button btnChangeMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMessage=findViewById(R.id.tvMessage);
        btnChangeMsg=findViewById(R.id.button);
        tvMessage.setText(R.string.tvMessage);
        btnChangeMsg.setBackgroundResource(R.color.primaryColor);
    }
}