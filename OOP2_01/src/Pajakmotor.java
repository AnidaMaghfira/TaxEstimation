package src;

public class Pajakmotor extends Kendaraan {

    private double pokokpkb,pokokswk,bulan;

    public Pajakmotor(double pokokpkb, double pokokswk, double bulan) {
        this.pokokpkb = pokokpkb;
        this.pokokswk = pokokswk;
        this.bulan = bulan;
    }

    public double getBulan(){
        return bulan;

    }


    public double hitungkendaraandenda(double bulan) {

        double hitungmotor;
        bulan = getBulan();

        if(bulan == 0 ){

            hitungmotor = (pokokpkb + pokokswk);
        }
        else{
                hitungmotor = ((pokokpkb * (0.25) * (bulan/12)) + 34000) + pokokpkb + pokokswk;
            }
        return hitungmotor;

    }
    
}