package com.example.admin.dta_android_tp9;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by admin on 13/06/2017.
 */

public abstract class Traceur extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //notify("onCreate");
        //Toast toast = Toast.makeText(this, R.string.msg_onCreate, Toast.LENGTH_SHORT);
        //toast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //notify("onPause");
        //Toast toast = Toast.makeText(this, R.string.msg_onPause, Toast.LENGTH_SHORT);
        //toast.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //notify("onResume");
        //Toast toast = Toast.makeText(this, R.string.msg_onResume, Toast.LENGTH_SHORT);
        //toast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //notify("onStop");
        //Toast toast = Toast.makeText(this, R.string.msg_onStop, Toast.LENGTH_SHORT);
        //toast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //notify("onDestroy");
        //Toast toast = Toast.makeText(this, R.string.msg_onDestroy, Toast.LENGTH_SHORT);
        //toast.show();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        //notify("onRestoreInstanceState");
        //Toast toast = Toast.makeText(this, R.string.msg_onRestoreInstanceState, Toast.LENGTH_SHORT);
        //toast.show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //notify("onSaveInstanceState");
        //Toast toast = Toast.makeText(this, R.string.msg_onSaveInstanceState, Toast.LENGTH_SHORT);
        //toast.show();
    }

    private void notify(String methodName) {
        String name = this.getClass().getName();
        String[] strings = name.split("\\.");

        Notification noti = new Notification.Builder(this)
                .setContentTitle(methodName+" "+strings[strings.length-1])
                .setAutoCancel(true)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentText(name)
                .build();

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify((int)System.currentTimeMillis(), noti);
    }
}
