package tr.edu.medipol.odevler.didem_laloglu.odev1;

/*-
Odev 1
En az 10 Matematiksel i�lem i�in 10 ayr� metod i�eren Hesaplama s�n�f� yaz�lacak. 
Bu 10 Matematikel i�lemin her biri i�in de 10 ayr� JUnit test metodu yaz�lacak. 
Uygulama Maven projesi �eklinde geli�tirilecek ve Maven test ve install komutlar�n �al��mas� kontrol edilecek. 
 */

// Maven degil: -25
// JUnit yok: -25
// Metodlar Yok: -20

public class MatematikOperatorler 
{
 
    public static void main(String[] args) 
    {
        // TODO Auto-generated method stub
         
        //Abs       Say�n�n mutlak de�erini bulur. 
        double sayi1 = -124.23;
        String Mutlak = Double.toString(Math.abs(sayi1));
        System.out.println("Mutlak: " + Mutlak);
 
        //Ceiling   Say�y� yukar� do�ru yuvarlar. 
        double sayi2 = Math.ceil(sayi1);
        String YukariYuvarla  =  Double.toString(sayi2);
        System.out.println("YukariYuvarla: " + YukariYuvarla);
 
        //Exp       e �st de�erini (�stel) hesaplamak i�in kullan�l�r. 
        double sayi3 = Math.exp(1);
        String EUstel = Double.toString(sayi3);
        System.out.println("EUstel: " + EUstel);
 
        //Floor     Say�y� a�a�� do�ru yuvarlar. 
        double sayi4 = Math.floor(28.98);
        String AsagiYuvarla = Double.toString(sayi4);
        System.out.println("Asa�� Yuvarla: " + AsagiYuvarla);
 
        //Log       e taban�ndaki logaritmay� hesaplar.
        double sayi5 = Math.log(10);
        String LogE = Double.toString(sayi5);
        System.out.println("Log E: " + LogE);
 
        //Log10     Say�n�n 10 tabanl� logaritmas�n� hesaplar 
        double sayi6 = Math.log10(10);
        String Log10 = Double.toString(sayi6);
        System.out.println("Log 10: " + Log10);
 
         
        //Max       �ki say�dan b�y�k olan�n� bulur.
        //Min       �ki say�dan k���k olan� bulur.
        int s1 = 99;
        int s2 = 88;
        String Maksimum = "Maksimum: " + Integer.toString(Math.max(s1, s2));
        String Minimum = "Minimum: " + Integer.toString(Math.min(s1, s2));
        System.out.println("Maksimum: " +  Maksimum); 
        System.out.println("Minimum: " + Minimum);
         
        //Pow       Say� �st alma i�lemini yapmak i�in kullan�l�r. 
        int taban = 3;
        int us = 4;
        String Kuvvet = "Kuuveti: " + Double.toString(Math.pow(taban, us));
        System.out.println("Taban: " + taban + " us: " + us + " Sonuc: " + Kuvvet);
 
        //Round     Say�y� en yak�n tamsay�ya �evirir, 
        String Yuvarlama = Double.toString(Math.round(28.88));
        System.out.println("Yuvarlama: " + Yuvarlama);
       
       //Sqrt   Karak�k�n� al�r.
        double sayi = 99;
        String Karekok = Double.toString(Math.sqrt(sayi));
        System.out.println("Karekok: " + Karekok);
         
    }
}