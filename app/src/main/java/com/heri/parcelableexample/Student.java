package com.heri.parcelableexample;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by heri on 8/25/17.
 */

public class Student implements Parcelable {
    String mSName;
    int mSAge;
    String mSAddress;
    String mSCourse;

    public Student(String mSName, int mSAge, String mSAddress, String mSCourse) {
        this.mSName = mSName;
        this.mSAge = mSAge;
        this.mSAddress = mSAddress;
        this.mSCourse = mSCourse;
    }

    protected Student(Parcel in) {
        mSName = in.readString();
        mSAge = in.readInt();
        mSAddress = in.readString();
        mSCourse = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(mSName);
        dest.writeInt(mSAge);
        dest.writeString(mSAddress);
        dest.writeString(mSCourse);
    }
}
