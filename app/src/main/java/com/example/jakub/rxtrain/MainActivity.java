package com.example.jakub.rxtrain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    TextView firstName;
    TextView lastName;
    TextView phone;
    TextView email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    public void init() {
        image = (ImageView) findViewById(R.id.picture);
        firstName = (TextView) findViewById(R.id.firstName_TextView);
        lastName = (TextView) findViewById(R.id.lastName_TextView);
        phone = (TextView) findViewById(R.id.phone_TextView);
        email = (TextView) findViewById(R.id.email_TextView);
    }





}
