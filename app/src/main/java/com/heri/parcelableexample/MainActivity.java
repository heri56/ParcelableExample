package com.heri.parcelableexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mEtSName;
    EditText mEtSAge;
    EditText mEtSAddress;
    EditText mEtSCourse;
    Button mBtnOk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEtSName = (EditText) findViewById(R.id.et_sname);
        mEtSAge =  (EditText) findViewById(R.id.et_sage);
        mEtSAddress = (EditText) findViewById(R.id.et_saddress);
        mEtSCourse = (EditText) findViewById(R.id.et_course);
        mBtnOk = (Button) findViewById(R.id.btn_ok);

        mBtnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student student = new Student(mEtSName.getText().toString(), Integer.parseInt(mEtSAge.getText().toString()),mEtSAddress.getText().toString(),mEtSCourse.getText().toString());

                Intent i = new Intent(getBaseContext(), StudentViewActivity.class);

                i.putExtra("student", student);
                startActivity(i);
            }
        });

    }
}
