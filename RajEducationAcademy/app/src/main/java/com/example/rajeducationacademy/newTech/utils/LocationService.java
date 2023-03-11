package com.emergence.trackingapp.newTech.utils;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.widget.Toast;

public class LocationService extends Service {


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                onTaskRemoved(intent);
                Toast.makeText(LocationService.this, "Service running in background !", Toast.LENGTH_SHORT).show();
            }
        },3000);



        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public IBinder onBind(Intent arg0) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public void onTaskRemoved(Intent rootIntent) {
        Intent restartServiceIntent = new Intent(getApplicationContext(),this.getClass());
        restartServiceIntent.setPackage(getPackageName());
        startService(restartServiceIntent);
        super.onTaskRemoved(rootIntent);
    }

}
