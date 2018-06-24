package com.example.ankush.implicitintents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnDial, btnCall, btnWebsite, btnEmail, btnSms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCall = (Button)findViewById(R.id.btnCall);
        btnWebsite = (Button)findViewById(R.id.btnWebsite);
        btnSms = (Button)findViewById(R.id.btnSms);
        btnEmail = (Button)findViewById(R.id.btnEmail);
        btnDial = (Button)findViewById(R.id.btnDial);

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:"+"9167435038"));
                startActivity(i);
            }

        });

        btnSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("sms:"+"9167435038"));
                i.putExtra("sms_body","Hey Meano! How are you?");
                startActivity(i);
            }
        });

        btnWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://"+"ankushransiwal.com"));
                startActivity(i);
            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_SENDTO);
                i.setData(Uri.parse("mailto:"+"persisshah.123@gmail.com"));
                i.putExtra(Intent.EXTRA_SUBJECT,"Sent from app");
                i.putExtra(Intent.EXTRA_TEXT,"Hello Meano! Kem cho?");
                startActivity(i);
            }
        });

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:"+"9167435038"));
                startActivity(i);
            }
        });




    }
}
