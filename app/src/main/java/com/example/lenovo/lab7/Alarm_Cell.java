package com.example.lenovo.lab7;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class Alarm_Cell extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm__cell);
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
