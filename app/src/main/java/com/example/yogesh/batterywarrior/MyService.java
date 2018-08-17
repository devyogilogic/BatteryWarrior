package com.example.yogesh.batterywarrior;

import android.app.Service;
import android.content.Intent;
import android.os.BatteryManager;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.


        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show();
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        if (intent.getAction().equals(BatteryManager.ACTION_CHARGING)) {
            Toast.makeText(getApplicationContext(), "The device is charging", Toast.LENGTH_SHORT).show();
        } else
             if(intent.getAction().equals(BatteryManager.ACTION_DISCHARGING)) {
                Toast.makeText(getApplicationContext(), "The device is not charging", Toast.LENGTH_SHORT).show();
            }

            return START_STICKY;
        }


    }