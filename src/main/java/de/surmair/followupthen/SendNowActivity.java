package de.surmair.followupthen;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

public class SendNowActivity extends Activity {

    private static String TAG = "followupthen";

    /**
     * @{inheritDoc}
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"1min@fut.io"});
        PackageManager packageManager = getPackageManager();
        List<ResolveInfo> activities = packageManager.queryIntentActivities(intent, 0);
        boolean isIntentSafe = activities.size() > 0;
        if(isIntentSafe) {
            startActivity(intent);
        } else {
            new AlertDialog.Builder(this)
                .setCancelable(false)
                .setMessage(getString(R.string.no_mail_app))
                .show();
        }
    }

}

