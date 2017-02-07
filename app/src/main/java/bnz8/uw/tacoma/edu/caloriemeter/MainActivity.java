package bnz8.uw.tacoma.edu.caloriemeter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginAction(View view) {

        Intent intent = new Intent(MainActivity.this, LogInActivity.class);
        startActivity(intent);
    }

    public void signUpAction(View view) {

        Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
        startActivity(intent);
    }


}
