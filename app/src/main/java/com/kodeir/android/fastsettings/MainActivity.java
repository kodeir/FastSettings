package com.kodeir.android.fastsettings;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchOnTethering(View view) {
        // as there is no prepared action in Setting for Tethering
        startActivity(new Intent().setClassName("com.android.settings", "com.android.settings.TetherSettings"));
    }

    public void switchOnDataRoaming(View view) {
        // the root is need to call 3G/4G switch directly, just showing menu doesn't require root
        startActivity(new Intent(Settings.ACTION_DATA_ROAMING_SETTINGS));
    }
}
