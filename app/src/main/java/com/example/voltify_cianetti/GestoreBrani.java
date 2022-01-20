package com.example.voltify_cianetti;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class GestoreBrani
{
    ArrayList<Brano> listaBrani;


    public GestoreBrani()
    {
        ArrayList<Brano> listaBrani;

        listaBrani = new ArrayList<Brano>();
    }

    public void addBrano(String titolo, String genere)
    {
        Brano br = new Brano(titolo, genere);
        listaBrani.add(br);
    }


}
