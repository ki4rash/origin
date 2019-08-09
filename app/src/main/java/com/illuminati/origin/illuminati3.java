package com.illuminati.origin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class illuminati3 extends AppCompatActivity {

    private Button button_review;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_illuminati3);
        Button btnVerifyPhoneNumber = (Button) findViewById(R.id.BtnReview);

        btnVerifyPhoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(illuminati3.this, illuminati4.class);
                startActivity(i);
            }
        });
    }
}