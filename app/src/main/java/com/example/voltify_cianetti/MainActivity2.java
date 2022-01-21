package com.example.voltify_cianetti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        String stringa_finale = i.getStringExtra("stringa finale");
        TextView txtListaBrani = (TextView) findViewById(R.id.txtTitolo);
        txtListaBrani.setText(stringa_finale);
    }
}