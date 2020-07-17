package modularization.features.intro;

import android.os.Bundle;

import modularization.libraries.baseclasses.BaseActivity;

public class IntroActivity extends BaseActivity {

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_intro;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}