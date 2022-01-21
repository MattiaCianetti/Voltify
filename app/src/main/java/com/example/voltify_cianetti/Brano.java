package com.example.voltify_cianetti;

import java.util.Date;

public class Brano
{
    private String titolo;
    private int durata;
    private String autore;
    private String genere;
    private Date dataCreazione;

    public Brano(String titolo, String genere)
    {
        this.titolo = titolo;
        this.genere = genere;
    }

    public String getTitolo(){
        return this.titolo;
    }
    public String getAutore(){
        return this.autore;
    }
    public int getDurata(){
        return this.durata;
    }
    public String getGenere() {return this.genere;}
    public Date getDataCreazione(){
        return this.dataCreazione;
    }

    public void setTitolo(String titolo){
        this.titolo=titolo;
    }
    public void setAutore(String autore){
        this.autore=autore;
    }

    public void setDataCreazione(Date dataCreazione) {
        this.dataCreazione = dataCreazione;
    }
    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "Brano{" +
                "titolo='" + titolo + '\'' +
                ", durata=" + durata +
                ", autore='" + autore + '\'' +
                ", dataCreazione=" + dataCreazione +
                '}';
    }
}

