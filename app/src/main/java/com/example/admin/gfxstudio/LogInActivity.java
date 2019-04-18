package com.example.admin.gfxstudio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LogInActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        button = findViewById(R.id.sign_in_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityHome();
            }
        });
        textView = findViewById(R.id.new_user);
       textView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openActivitySignUp();
           }
       });

        textView1 = findViewById(R.id.home1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityHome();
            }
        });

    }

    private void openActivitySignUp() {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }

    private void openActivityHome() {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }


}