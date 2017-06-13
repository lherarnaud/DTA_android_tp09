package com.example.admin.dta_android_tp9;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Traceur {

    Point point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        point = new Point();

        Button buttonTest = (Button) findViewById(R.id.buttonTest);
        buttonTest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                point.counter++;
                showCounter();
            }
        });
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        //counter = savedInstanceState.getInt("counter", 0);
        point = savedInstanceState.getParcelable("point");
        showCounter();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //outState.putInt("counter", counter);
        outState.putParcelable("point", point);
    }

    private void showCounter() {
        TextView ctl_text_counter = (TextView) findViewById(R.id.labelValue);
        ctl_text_counter.setText("Counter : "+String.valueOf(point.counter));
    }
}
