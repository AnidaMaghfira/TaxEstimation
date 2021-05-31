package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class App {

    private static Scanner s = new Scanner(System.in);
    

    public static void main(final String[] args) {
        String newLine = System.getProperty("line.separator");
        double pokokpkb,pokokswk,bulan,hasil;

        try
        {
        System.out.println("Program Estimasi Pajak Kendaraan");
        final InputStreamReader r = new InputStreamReader(System.in);
        final BufferedReader input = new BufferedReader(r);
        
        String pil;
        int p = 9;
        while(p!=0)
            {
            System.out.println("Menu");
            System.out.println("[1] Perhitungan Pajak Mobil");
            System.out.println("[2] Perhitungan Pajak Motor");
            System.out.println("Masukkan angka pilihan");
            System.out.println("Keterlambatan pajak kendaraan (/bulan) "+newLine+"NOTE : Terhitung melewati 2 (dua) hari dari tanggal masa aktif pajak, maka dikenakan dalam hitungan 1 bulan denda."+newLine+" jika tidak inputkan nilai 0"); 
            pil = input.readLine();
            p = Integer.parseInt(pil);
            switch(p)
                {
                case 1: 
                System.out.println("MENU PERHITUNGAN MOBIL DENDA");
                System.out.println("Masukkan pokokpkb mobil anda = "); pokokpkb=s.nextDouble();
                System.out.println("Masukkan pokokswk mobil anda = "); pokokswk=s.nextDouble();
                System.out.println("Masukkan bulan ="); bulan=s.nextDouble();
                Mobil pmbl = new Mobil(pokokpkb,pokokswk,bulan);
                hasil=pmbl.hitungpajak(bulan);
                System.out.println("Hasil Estimasi Pajak = " + hasil);
                break;
                case 2: 
                System.out.println("MENU PERHITUNGAN MOTOR DENDA");
                System.out.println("Masukkan pokokpkb motor anda = "); pokokpkb=s.nextDouble();
                System.out.println("Masukkan pokokswk motor anda = "); pokokswk=s.nextDouble();
                System.out.println("Masukkan bulan ="); bulan=s.nextDouble();
                Motor pmtr = new Motor(pokokpkb,pokokswk,bulan);
                hasil=pmtr.hitungpajak(bulan);
                System.out.println("Hasil Estimasi Pajak = " + hasil);
                break;
                }
                
            System.out.println("Hitung Lagi ? [1] Ya [2] Tidak");
            pil = input.readLine();
            p = Integer.parseInt(pil);
            }
        }
    catch(final IOException e)
        {
        System.out.println("Error tidak dikenali");
        }
         
    }


    
}