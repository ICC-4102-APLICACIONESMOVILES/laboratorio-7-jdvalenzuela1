package com.example.lenovo.lab7;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by lenovo on 22-05-2018.
 */

public class alarm extends Activity
{
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        startAlert();
    }
    public void startAlert() {
        Log.i("Alarma", "Funciona alarma");
        int triggerAtMillis = 3000;
        int intervalMillis = 1000;

        Intent intent = new Intent(this, MyReceiverAlarm.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this.getApplicationContext(), 234324243, intent, 0);
        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()
                + triggerAtMillis, intervalMillis, pendingIntent);

    }

}
