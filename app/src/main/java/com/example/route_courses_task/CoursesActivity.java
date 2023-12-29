package com.example.route_courses_task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CoursesActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.iv_android || v.getId()==R.id.android_button ){
            startCourseDetailsActivity(Constants.ANDROID_COURSE);
            return;
        }
        if(v.getId()==R.id.iv_ios || v.getId()==R.id.ios_button ){
            startCourseDetailsActivity(Constants.IOS_COURSE);
            return;

        }
        if(v.getId()==R.id.iv_fullstack || v.getId()==R.id.fullstack_button ){
            startCourseDetailsActivity(Constants.FULLSTACK_COURSE);


        }

    }

    private void startCourseDetailsActivity(String courseName) {
        Intent intent = new Intent(this,CourseDetailsActivity.class);
        intent.putExtra("course",courseName);
        startActivity(intent);
    }
}