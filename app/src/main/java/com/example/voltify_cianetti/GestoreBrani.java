package com.example.voltify_cianetti;

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

    public StringBuilder ListaBrani()
    {
        StringBuilder sbBrani= new StringBuilder();
        for (Brano brC : listaBrani)
        {
            sbBrani.append(brC.getTitolo() + "-");
            sbBrani.append(brC.getAutore() + "\n");
        }
        return sbBrani;
    }

}
