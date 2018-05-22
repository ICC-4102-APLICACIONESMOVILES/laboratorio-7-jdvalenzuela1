package com.example.lenovo.lab7;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

/**
 * Created by lenovo on 22-05-2018.
 */

public class MyReceiverAlarm extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent arg1) {
        Log.i("Notificacion", "Se activa notificacion");
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context, "uno")
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("Notificacion")
                .setContentText("Alarm set in " + 3 + " seconds");

        NotificationManager mNotificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        mNotificationManager.notify(1, mBuilder.build());

    }
}