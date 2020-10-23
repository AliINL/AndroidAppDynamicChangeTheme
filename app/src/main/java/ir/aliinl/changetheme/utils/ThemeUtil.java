package ir.aliinl.changetheme.utils;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;

import ir.aliinl.changetheme.Constants;
import ir.aliinl.changetheme.R;

public class ThemeUtil {

    private static int cTheme;
    public final static int LIGHT = 0;
    public final static int DARK = 1;
    public final static int GREEN = 2;

    public static void changeToTheme(Activity activity, int theme) {
        cTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
        activity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public static void onActivityCreateSetTheme(Activity activity) {
        SharedPreferences settings = activity.getSharedPreferences(Constants.PREFS_NAME, 0);
        cTheme = settings.getInt("theme", 0);
        switch (cTheme) {
            default:
            case LIGHT:
                activity.setTheme(R.style.AppThemeLight);
                break;
            case DARK:
                activity.setTheme(R.style.AppThemeDark);
                break;
            case GREEN:
                activity.setTheme(R.style.AppThemeGreen);
                break;
        }
    }
}