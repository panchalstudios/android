package com.panchalstudios.multiplanefragment;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;


public class MyActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        // Hide the side pane when in portrait mode
        int screenOrientation = getResources().getConfiguration().orientation;
        if (screenOrientation == Configuration.ORIENTATION_PORTRAIT) {
            hideSidePane();

        }
    }

    // Hides the side panel
    private void hideSidePane() {
        View sidePane = findViewById(R.id.side_panel);
        if (sidePane.getVisibility() == View.VISIBLE) {
            sidePane.setVisibility(View.GONE);
        }
    }

}