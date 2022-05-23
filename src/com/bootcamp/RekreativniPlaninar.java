package com.bootcamp;
//težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg),
//naziv okruga odakle je rekreativni planinar
//maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
//rekeativci placaju clanarinu u iznosu od 1000 rsd
//metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
//                              Rekreativac, id: id
//                              ime: ime prezime Okrug: okrug

public class RekreativniPlaninar extends Planinar{
    private int tezinaOpreme;
    private String nazivOkruga;
    private int maxUspon;
    private static final int clanarina = 1000;

    public RekreativniPlaninar(int idPlaninara, String imePlaninara, String pezimePlaninara, int tezinaOpreme,
                               String nazivOkruga, int maxUspon) {
        super(idPlaninara, imePlaninara, pezimePlaninara);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maxUspon = maxUspon;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(int tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    public String getNazivOkruga() {
        return nazivOkruga;
    }

    public void setNazivOkruga(String nazivOkruga) {
        this.nazivOkruga = nazivOkruga;
    }

    public int getClanarina() {
        return clanarina;
    }

    public double getMaxUspon() {
        return maxUspon;
    }

    public void setMaxUspon(int maxUspon) {
        this.maxUspon = maxUspon;
    }

    @Override
    public int clanarina() {
        return getClanarina();
    }
    //da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon veci od visine planine,
// s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
    @Override
    public boolean uspesanUspon(Planina planina) {
        int noviMaxUspon = maxUspon - tezinaOpreme * 50;
        if (planina.getVisinaPlanine() < noviMaxUspon){
            return true;
        }else {
            return false;
        }
    }

    public void stampaj (){
        System.out.println("Rekreativac, id: " + super.getIdPlaninara() +'\n'+ "ime: " + super.getImePlaninara() + " "+
                super.getPezimePlaninara()+ " Okrug : " + nazivOkruga);
    }
}
