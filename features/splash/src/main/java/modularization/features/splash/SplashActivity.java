package modularization.features.splash;

import android.os.Bundle;
import android.os.Handler;

import modularization.libraries.baseclasses.BaseActivity;
import modularization.libraries.utils.Navigator;

public class SplashActivity extends BaseActivity {

    /**
     * Duration of wait
     **/
    private final int SPLASH_DISPLAY_LENGTH = 1000;

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        runSplashTimer();
    }

    private void runSplashTimer() {
        /* New Handler to start the next Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the next Activity. */
                Navigator.newInstance().navigateToIntroActivity(SplashActivity.this);
                SplashActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }

}