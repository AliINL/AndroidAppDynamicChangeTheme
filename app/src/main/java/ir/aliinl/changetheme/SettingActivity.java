package ir.aliinl.changetheme;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ir.aliinl.changetheme.utils.ThemeUtil;

public class SettingActivity extends BaseActivity {

    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        Button buttonDark = findViewById(R.id.btn_dark_theme);
        Button buttonLight = findViewById(R.id.btn_light_theme);
        Button buttonGreen = findViewById(R.id.btn_green_theme);
        preferences = getSharedPreferences(Constants.PREFS_NAME, MODE_PRIVATE);

        buttonDark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThemeUtil.changeToTheme(SettingActivity.this, ThemeUtil.DARK);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("theme",ThemeUtil.DARK);
                editor.commit();

            }
        });

        buttonLight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThemeUtil.changeToTheme(SettingActivity.this, ThemeUtil.LIGHT);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("theme",ThemeUtil.LIGHT);
                editor.commit();

            }
        });

        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThemeUtil.changeToTheme(SettingActivity.this, ThemeUtil.GREEN);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("theme",ThemeUtil.GREEN);
                editor.commit();

            }
        });
    }
}