package bnz8.uw.tacoma.edu.caloriemeter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        setTitle("Sign up");
    }

    public void signedUpAction(View view) {
        Intent intent = new Intent(SignUpActivity.this, LogInActivity.class);
        startActivity(intent);
    }
}
