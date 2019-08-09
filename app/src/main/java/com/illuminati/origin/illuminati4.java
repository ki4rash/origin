package com.illuminati.origin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class illuminati4 extends AppCompatActivity {

    private TextView home1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_illuminati4);

        TextView Txtfname = (TextView) findViewById(R.id.TxtName);
        TextView TxtFamily = (TextView) findViewById(R.id.TxtFamily);
        TextView TxtAge = (TextView) findViewById(R.id.TxtAge);
        TextView TxtEntphonenumber = (TextView) findViewById(R.id.TxtEntphonenumber);
        TextView TxtAddress = (TextView) findViewById(R.id.TxtAddress);

        Intent intent = getIntent();
        String name1 = intent.getStringExtra("message_id");
        Txtfname.setText(name1);

        String name2= intent.getStringExtra("message_id");
        TxtFamily.setText(name2);

        String name3 = intent.getStringExtra("message_id");
        TxtAge.setText(name3);

        String name4 = intent.getStringExtra("message_id");
        TxtEntphonenumber.setText(name4);

        String name5 = intent.getStringExtra("message_id");
        TxtAddress.setText(name5);

        Button btnEdit = (Button) findViewById(R.id.btnEdit);
        btnEdit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(illuminati4.this, illuminati3.class);
                startActivity(i);
                finish();
            }

        });

        Button btnConfirm = (Button) findViewById(R.id.btnConfirm);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });


    }
}
