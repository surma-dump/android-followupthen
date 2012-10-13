package de.surmair.followupthen;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class ConfigurationActivity extends Activity {

    private static String TAG = "followupthen";

    /**
     * @{inheritDoc}
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		Log.i(TAG, "ConfigurationActivity: onCreate");
        setContentView(R.layout.main);
    }

}

