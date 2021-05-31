package src;

abstract class Pajak {

    private double pokokpkb,pokokswk,bulan;

    abstract double hitungpajak(double bulan);

    public void setPokokpkb(double pkb)
    {
    pokokpkb = pkb;
    }

    public void setPokokswk(double swk)
    {
    pokokswk = swk;
    }

    public void setBulan(int b)
    {
    bulan = b;
    }

    public double getPokokpkb(){    
        return pokokpkb;
    }
    public double getPokokswk(){
        return pokokswk;
    }
    public double getBulan(){
        return bulan;
    }

}
