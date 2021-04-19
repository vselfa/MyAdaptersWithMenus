package com.example.myadapterswithmenus.Menjars;

public class Menjar {
    private String nom;
    private String descripcio;
    private int  preu;
    private int foto;

    public Menjar(String nom, String descripcio, int preu, int foto) {
        this.nom  = nom;
        this.descripcio = descripcio;
        this.preu = preu;
        this.foto = foto;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nomk) {
        this.nom = nom;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return  "Menjar {" + ", Nom = " + nom + ", Descripció = " + descripcio + ", Preu =" + preu;
    }
}

