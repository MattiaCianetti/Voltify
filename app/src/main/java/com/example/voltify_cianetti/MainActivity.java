package com.example.voltify_cianetti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    Button btnInserisci;
    Button btnMostra;
    EditText txtTitolo;
    String[] generi = {"Rap", "Pop", "Trap"};
    GestoreBrani gb;
    Spinner spnGenere;
    final String tag = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnInserisci = (Button) findViewById(R.id.btnInserisci);
        Button btnMostra = (Button) findViewById(R.id.btnMostra);
        txtTitolo = (EditText) findViewById(R.id.txtTitolo);
        spnGenere = (Spinner) findViewById(R.id.spnGeneri) ;

        ArrayAdapter<String> aaG = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, generi);

        spnGenere.setAdapter(aaG);
        gb = new GestoreBrani();

        btnInserisci.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Log.d(tag, "Cliccato il button inserisci");
                String genSelez = spnGenere.getSelectedItem().toString();
                gb.addBrano(txtTitolo.getText().toString(), genSelez);
                Log.d(tag, "Aggiunto il brano");

            }
        });

        btnMostra.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Log.d(tag, "Cliccato il button mostra");
                StringBuilder stringa = new StringBuilder();
                stringa = gb.ListaBrani();
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                i.putExtra("stringa", stringa.toString());
                startActivity(i);
                Log.d(tag, "Startata l'activity 2");
            }
        });
    }


    protected void onStart()
    {
        Log.d(tag, "Metodo onStart");
        super.onStart();
    }
}