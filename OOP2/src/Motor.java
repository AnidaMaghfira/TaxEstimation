package src;

public class Motor extends Pajak {

    private double pokokpkb,pokokswk,bulan;

    public Motor(double pokokpkb, double pokokswk, double bulan) {
        this.pokokpkb = pokokpkb;
        this.pokokswk = pokokswk;
        this.bulan = bulan;
    }

    public double getBulan(){
        return bulan;

    }


    public double hitungpajak(double bulan) {

        double hitungmotor;
        bulan = getBulan();

        if(bulan == 0 ){

            hitungmotor = (pokokpkb + pokokswk);// jika tidak denda 
        }
        else{
                hitungmotor = ((pokokpkb * (0.25) * (bulan/12)) + 34000) + pokokpkb + pokokswk;//jika denda
            }
        return hitungmotor;

    }
    
}