package com.bootcamp;
//Kreirati klasu Alpinista koji dodatno pamti koliko poena je alpinista ostvario (celobrojna vrednost)
// i poeni se mogu menjati kroz adekvatnu metodu. Alpinista može da savlada sve uspone do 4000 metara,
// placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50,


public class Alpinista extends Planinar{
    private int poeni;
    private static final int maxUspon = 4000;
    private int clanarina = 1500;

    public Alpinista(int idPlaninara, String imePlaninara, String pezimePlaninara, int poeni, int clanarina) {
        super(idPlaninara, imePlaninara, pezimePlaninara);
        this.poeni = poeni;
        setClanarina(clanarina);
    }

    public int getPoeni() {
        return poeni;
    }

    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }

    public int getMaxUspon() {
        return maxUspon;
    }

    public int getClanarina() {
        return clanarina;
    }

    public void setClanarina(int clanarina) {
        if (clanarina > 0){
            this.clanarina = clanarina;
        }else {
            System.err.println("Nevalidan unos!");
        }
    }

    @Override
    public int clanarina() {
        int clanarinaSaPoenima = getClanarina() - getPoeni() * 50;
        if (clanarinaSaPoenima > 0){
            return clanarinaSaPoenima;
        }else{
            return 0;
        }

    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        if(planina.getVisinaPlanine() <= 4000){
            return true;
        }else {
            return false;
        }
    }
    // a informacije o alpinisti se ispisuju u formatu:
    //                             Alpinista, id: id
    //                             ime: ime i prezime
    //                             Broj poena: poeni

    @Override
    public void stampaj() {
        System.out.println("Alpinista, id: " + super.getIdPlaninara() + '\n' + "ime: " + super.getImePlaninara() + " " +
                super.getPezimePlaninara() + '\n' + "Broj poena: " + poeni);
    }
}
