package com.emergence.trackingapp.newTech.utils;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.charset.MalformedInputException;


public class NetworkError {
    public static String getNetworkError(Throwable error) {
        String message ;
        if (error instanceof MalformedInputException) {
            message = "Something went wrong. Please try again";
        } else if (error instanceof SocketTimeoutException) {
            message = "Poor connection";
        } else if (error instanceof IOException) {
            message = "Check internet connection";
        } else {
            message = "Something went wrong";
        }
        return message;
    }


}
