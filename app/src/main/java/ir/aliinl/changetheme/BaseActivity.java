package ir.aliinl.changetheme;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import ir.aliinl.changetheme.utils.ThemeUtil;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ThemeUtil.onActivityCreateSetTheme(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        recreate();
    }
}