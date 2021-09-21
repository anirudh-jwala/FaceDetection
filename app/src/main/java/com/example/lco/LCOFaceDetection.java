package com.example.lco;

import android.app.Application;

import com.google.firebase.FirebaseApp;

public class LCOFaceDetection extends Application {

    public static final String RESULT_TEXT = "RESULTTEXT";
    public static final String RESULT_DIALOG = "RESULTDIALOG";

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
