package com.heri.parcelableexample;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mEtSName;
    EditText mEtSAge;
    EditText mEtSAddress;
    EditText mEtSCourse;
    Button mBtnOk;
    String tag = "Error";
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
                if ((mEtSName.getText().toString().equals(" ")) || mEtSAge.getText().toString().isEmpty()
                        ||mEtSAddress.getText().toString().equals(" ")||mEtSCourse.getText().toString().equals(" ") ){
                    Toast.makeText(getApplication(), "Data Kosong", Toast.LENGTH_SHORT).show();
                }else {
                    Student student = new Student(mEtSName.getText().toString(), Integer.parseInt(mEtSAge.getText().toString()),
                            mEtSAddress.getText().toString(), mEtSCourse.getText().toString());
                    Intent i = new Intent(getBaseContext(), StudentViewActivity.class);
                    i.putExtra("student", student);
                    startActivity(i);
                }

//                try {
//                    if ("".equals(mEtSName)) {df
//
//                        Toast.makeText(getApplication(), "Kosong", Toast.LENGTH_SHORT).show();
//                    }
//                }catch (Resources.NotFoundException e){
//                    Log.i(tag, "Info");
//                }

//                String mesaname = mEtSName.getText().toString();
//                if (student.equals(mEtSName.getText().toString().isEmpty())){
//                    Toast.makeText(getApplication(), "Kosong", Toast.LENGTH_SHORT).show();
//
////

            }
        });

    }
}
