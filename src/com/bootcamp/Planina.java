package com.bootcamp;
//Planina koju opisuju ime planine, naziv države u kojoj se nalazi i visina planine.
// Klasa mora imati konstruktore i getere i setere.

    public class Planina {
        private String imePlanine;
        private String nazivDrzave;
        private double visinaPlanine;

        public Planina(String imePlanine, String nazivDrzave, double visinaPlanine) {
            this.imePlanine = imePlanine;
            this.nazivDrzave = nazivDrzave;
            setVisinaPlanine(visinaPlanine);
        }

        public String getImePlanine() {
            return imePlanine;
        }

        public void setImePlanine(String imePlanine) {
            this.imePlanine = imePlanine;
        }

        public String getNazivDrzave() {
            return nazivDrzave;
        }

        public void setNazivDrzave(String nazivDrzave) {
            this.nazivDrzave = nazivDrzave;
        }

        public double getVisinaPlanine() {
            return visinaPlanine;
        }

        public void setVisinaPlanine(double visinaPlanine) {
            if(visinaPlanine > 0)
                this.visinaPlanine = visinaPlanine;
        }

        @Override
        public String toString() {
            return "Planina{" +
                    "imePlanine='" + imePlanine + '\'' +
                    ", nazivDrzave='" + nazivDrzave + '\'' +
                    ", visinaPlanine=" + visinaPlanine +
                    '}';
        }
    }
