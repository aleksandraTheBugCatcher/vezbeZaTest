package com.bootcamp;
//Planinar kog opisuju jedinstveni celobrojni identifikacioni broj, ime i prezime. Svi podaci smeju da se dohvate,
// ali ne i postave mimo konstruktora koji postavlja sve attribute klase. Pored toga, klasa ima:
//apstraktnu metodu štampaj
//apstraktnu metodu koja vraca clanarinu planinara
//apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno popeti na planinu.
// Metoda kao ulazni parametar prima objekat tipa Planina.
public abstract class Planinar {
    private int idPlaninara;
    private String imePlaninara;
    private String pezimePlaninara;

    public Planinar(int idPlaninara, String imePlaninara, String pezimePlaninara) {
        this.idPlaninara = idPlaninara;
        this.imePlaninara = imePlaninara;
        this.pezimePlaninara = pezimePlaninara;
    }

    public int getIdPlaninara() {
        return idPlaninara;
    }

    public String getImePlaninara() {
        return imePlaninara;
    }

    public String getPezimePlaninara() {
        return pezimePlaninara;
    }

    public abstract int clanarina();
    public abstract boolean uspesanUspon(Planina planina);

    public abstract void stampaj ();
}
