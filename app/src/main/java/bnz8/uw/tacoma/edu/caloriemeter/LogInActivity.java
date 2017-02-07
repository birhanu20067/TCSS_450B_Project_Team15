package bnz8.uw.tacoma.edu.caloriemeter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        setTitle("Log In");
//        getActionBar().setIcon(R.mipmap.log_in);
    }

    public void loggedInAction(View view) {
        Intent intent = new Intent(LogInActivity.this, HomeMenuActivity.class);
        startActivity(intent);
    }
}
