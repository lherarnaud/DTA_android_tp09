package com.example.admin.dta_android_tp9;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by admin on 13/06/2017.
 */

public class Point implements Parcelable {

    public int counter;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {

        out.writeInt(counter);
    }

    public static final Parcelable.Creator<Point> CREATOR = new Parcelable.Creator<Point>() {

        @Override
        public Point createFromParcel(Parcel in) {
            return new Point(in);
        }

        @Override
        public Point[] newArray(int size) {
            return new Point[size];
        }
    };

    public Point() {
        this.counter = 0;
    }

    private Point(Parcel in) {
        this.counter = in.readInt();
    }
}


