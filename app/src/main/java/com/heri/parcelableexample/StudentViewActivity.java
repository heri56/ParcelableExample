package com.heri.parcelableexample;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by heri on 8/25/17.
 */

public class StudentViewActivity extends Activity {

    TextView mTvSName;
    TextView mTvSAge;
    TextView mTvSAddress;
    TextView mTvSCourse;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        Student student = getIntent().getParcelableExtra("student");
        mTvSName = (TextView) findViewById(R.id.tv_sname);
        mTvSAge = (TextView) findViewById(R.id.tv_sage);
        mTvSAddress = (TextView) findViewById(R.id.tv_saddress);
        mTvSCourse = (TextView) findViewById(R.id.tv_course);
        if (student!=null){
            mTvSName.setText("Name: " +student.mSName);
            mTvSAge.setText("Age: "+Integer.toString(student.mSAge));
            mTvSAddress.setText("Address: "+student.mSAddress);
            mTvSAddress.setText("Course: "+student.mSCourse);
        }
    }
}
