package src;

public class Pajakmobil extends Kendaraan {

    private double pokokpkb,pokokswk,bulan;

    public Pajakmobil(double pokokpkb, double pokokswk, double bulan) {
        this.pokokpkb = pokokpkb;
        this.pokokswk = pokokswk;
        this.bulan = bulan;
    }

    public double getBulan(){
        return bulan;

    }


    public double hitungkendaraandenda(double bulan) {

        double hitungmobil;
        bulan = getBulan();

        if(bulan == 0 ){

            hitungmobil = (pokokpkb + pokokswk);
        }
        else{
                hitungmobil = ((pokokpkb * (0.25) * (bulan/12)) + 100000) + pokokpkb + pokokswk;
            }
        return hitungmobil;

    }
    
}