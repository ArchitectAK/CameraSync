package com.freeankit.camerasync;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.freeankit.camerasync.logger.Log;
import com.freeankit.camerasync.logger.LogWrapper;

/**
 * @author by Ankit Kumar (ankitdroiddeveloper@gmail.com) on 12/30/17 (MM/DD/YYYY )
 **/

public class BaseActivity extends AppCompatActivity {
    public static final String TAG = "BaseActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        initializeLogging();
    }

    /**
     * Set up targets to receive log data
     */
    public void initializeLogging() {
        // Using Log, front-end to the logging chain, emulates android.util.log method signatures.
        // Wraps Android's native log framework
        LogWrapper logWrapper = new LogWrapper();
        Log.setLogNode(logWrapper);
        Log.i(TAG, "Ready");
    }
}
