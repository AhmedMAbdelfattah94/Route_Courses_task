package com.example.route_courses_task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread timer=new Thread(){
            public void run(){
                try {
                    try {
                        sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } finally {
                    Intent i = new Intent(Splash_Activity.this, CoursesActivity.class);
                    finish();
                    startActivity(i);
                }
            }
        };
        timer.start();

    }
}