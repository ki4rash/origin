package com.illuminati.origin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class illuminati3 extends AppCompatActivity {

    private Button button_review;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_illuminati3);
        Button btnVerifyPhoneNumber = (Button) findViewById(R.id.BtnReview);


        final EditText EdtFname = (EditText)  findViewById(R.id.EdtTagName);
        final EditText EdtFamily = (EditText)  findViewById(R.id.EdtTagFamily);
        final EditText EdtAge = (EditText)  findViewById(R.id.EtdTagage);
        final EditText Edtphnumber = (EditText)  findViewById(R.id.EdtTagPhonenumber);
        final EditText EdtAddress = (EditText)  findViewById(R.id.EdtTagAddress);

        btnVerifyPhoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name1 = EdtFname.getText().toString();
                String name2 = EdtFamily.getText().toString();
                String name3 = EdtAge.getText().toString();
                String name4 = Edtphnumber.getText().toString();
                String name5 = EdtAddress.getText().toString();
                Intent intent = new Intent(illuminati3.this, illuminati4.class);
                startActivityForResult(intent, 180);
            }
        });
    }
}