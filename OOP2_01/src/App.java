package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {

    private static Scanner s = new Scanner(System.in);

    public static void main(final String[] args) {


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
            System.out.println("[1] mobil");
            System.out.println("[2] motor");
            System.out.println("Masukkan angka pilihan");
            pil = input.readLine();
            p = Integer.parseInt(pil);
            switch(p)
                {
                case 1: 
                System.out.println("MENU PERHITUNGAN MOBIL DENDA");
                System.out.println("Masukkan pokokpkb mobil anda = "); pokokpkb=s.nextDouble();
                System.out.println("Masukkan pokokswk mobil anda = "); pokokswk=s.nextDouble();
                System.out.println("Masukkan bulan ="); bulan=s.nextDouble();
                Pajakmobil pmbl = new Pajakmobil(pokokpkb,pokokswk,bulan);
                hasil=pmbl.hitungkendaraandenda(bulan);
                System.out.println("Hasil Estimasi Pajak = " + hasil);
                break;
                case 2: 
                System.out.println("MENU PERHITUNGAN MOTOR DENDA");
                System.out.println("Masukkan pokokpkb motor anda = "); pokokpkb=s.nextDouble();
                System.out.println("Masukkan pokokswk motor anda = "); pokokswk=s.nextDouble();
                System.out.println("Masukkan bulan ="); bulan=s.nextDouble();
                Pajakmotor pmtr = new Pajakmotor(pokokpkb,pokokswk,bulan);
                hasil=pmtr.hitungkendaraandenda(bulan);
                System.out.println("Hasil Estimasi Pajak = " + hasil);
                break;
                }
                
            System.out.println("Lanjutgan?(O = keluar/1 = tidak)");
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