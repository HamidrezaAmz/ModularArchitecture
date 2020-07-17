package modularization.libraries.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

public class Navigator {

    private static Navigator INSTANCE = null;

    public static Navigator newInstance() {
        if (INSTANCE == null)
            INSTANCE = new Navigator();
        return INSTANCE;
    }

    private void lunchActivity(Context context, String classPath) {
        ComponentName componentName = new ComponentName(context, classPath);
        Intent intent = new Intent().setComponent(componentName);
        context.startActivity(intent);
    }

    public void navigateToSplashActivity(Context context) {
        lunchActivity(context, "modularization.features.splash.SplashActivity");
    }

    public void navigateToIntroActivity(Context context) {
        lunchActivity(context, "modularization.features.intro.IntroActivity");
    }

    public void navigateToLoginActivity(Context context) {
        lunchActivity(context, "modularization.features.login.LoginActivity");
    }

    public void navigateToDashboardActivity() {

    }

}
