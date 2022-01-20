package com.example.voltify_cianetti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnInserisci;
    EditText txtTitolo;
    String[] generi = {"Rap", "Pop", "Trap"};
    GestoreBrani gb;
    Spinner spnGenere;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInserisci = (Button) findViewById(R.id.btnInserisci);
        txtTitolo = (EditText) findViewById(R.id.txtTitolo);
        spnGenere = (Spinner) findViewById(R.id.spnGeneri) ;

        ArrayAdapter<String> aaG = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, generi);

        spnGenere.setAdapter(aaG);
        gb = new GestoreBrani();

        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String genSelez = spnGenere.getSelectedItem().toString();
                gb.addBrano(txtTitolo.getText().toString(), genSelez);

            }
        });
        }
    }