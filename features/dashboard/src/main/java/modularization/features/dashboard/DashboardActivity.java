package modularization.features.dashboard;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import modularization.libraries.uicomponents.MagicalButton;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        MagicalButton magicalButton = new MagicalButton(this);
        

    }
}