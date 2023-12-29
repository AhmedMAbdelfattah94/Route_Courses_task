package com.example.route_courses_task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class CourseDetailsActivity extends AppCompatActivity {

    ImageView courseImg;
    TextView courseDetailTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);
        courseImg= findViewById(R.id.imv_course_details);
        courseDetailTv = findViewById(R.id.tv_course_detail);
        courseDetailTv.setMovementMethod(new ScrollingMovementMethod());

        Intent intent = getIntent();
        if(intent==null){
            return;
        }
        String courseName = intent.getStringExtra(Constants.COURSE);
        switch(courseName){
            case Constants.ANDROID_COURSE:{
                courseDetailTv.setText(Constants.ANDROID_DETAIL_TEXT);
                courseImg.setImageResource(R.drawable.android);
                break;
            }
            case Constants.IOS_COURSE:{
                courseDetailTv.setText(Constants.IOS_DETAIL_TEXT);
                courseImg.setImageResource(R.drawable.ios);
                break;
            }
            case Constants.FULLSTACK_COURSE:{
                courseDetailTv.setText(Constants.FULLSTACK_DETAIL_TEXT);
                courseImg.setImageResource(R.drawable.fullstack);
                break;
            }


        }


    }
}