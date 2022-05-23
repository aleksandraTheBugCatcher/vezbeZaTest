package com.bootcamp;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Planina planina1 = new Planina("Stara planina", "Srbija", 2.169);
        ArrayList<Planinar> planinari = new ArrayList<>();
        RekreativniPlaninar rekreativac1 =new RekreativniPlaninar(1, "Jovan", "Jovanovic",
                0,"Juznobacki", 2000);
        RekreativniPlaninar rekreativac2 =new RekreativniPlaninar(2, "Ivan", "Ivanovic",
                15,"Zlatiborski", 3000);
        RekreativniPlaninar rekreativac3 =new RekreativniPlaninar(3, "Nevena", "Ivic", 5,
                "Moravicki", 2500);
        Alpinista alpinista1 =new Alpinista(7, "Snezana", "Maksic", 2, 1500);
        Alpinista alpinista2 =new Alpinista(5, "Ilija", "Nikolic", 0, 1500);
        Alpinista alpinista3 =new Alpinista(10, "Bojan", "Bojanic", 5, 1500);

        planinari.add(rekreativac1);
        planinari.add(rekreativac2);
        planinari.add(rekreativac3);
        planinari.add(alpinista1);
        planinari.add(alpinista2);
        planinari.add(alpinista3);

        rekreativac1.uspesanUspon(planina1);
        rekreativac2.uspesanUspon(planina1);
        rekreativac3.uspesanUspon(planina1);
        alpinista1.uspesanUspon(planina1);
        alpinista2.uspesanUspon(planina1);
        alpinista3.uspesanUspon(planina1);

        int sumaClanarina =0;

        for (Planinar planinar : planinari){
            sumaClanarina += planinar.clanarina();
        }
        System.out.println(sumaClanarina);

    }
}
