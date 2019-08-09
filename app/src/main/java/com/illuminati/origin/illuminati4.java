package com.illuminati.origin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class illuminati4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_illuminati4);
        Button btnConfirm = (Button) findViewById(R.id.btnEdit);

        btnConfirm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(illuminati4.this, illuminati3.class);
                startActivity(i);
                finish();
            }

        });


    }
}
