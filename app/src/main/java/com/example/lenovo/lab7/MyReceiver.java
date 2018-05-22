package com.example.lenovo.lab7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.util.Log;

/**
 * Created by lenovo on 22-05-2018.
 */

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent arg1)
    {
        Log.i("Boot", "Se prendio el celular");
        // Vibrate the mobile phone
        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(2000);

        Intent intent = new Intent(context,alarm.class);
        context.startService(intent);

    }
}