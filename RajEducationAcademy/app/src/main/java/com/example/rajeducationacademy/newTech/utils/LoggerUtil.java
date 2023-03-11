package com.emergence.trackingapp.newTech.utils;

import android.util.Log;

import com.google.gson.Gson;


public class LoggerUtil {
    private static final String TAG = "Response";

    public static void logItem(Object src) {
        Gson gson = new Gson();
        Log.e(TAG, "====:> " + gson.toJson(src));
    }
}
