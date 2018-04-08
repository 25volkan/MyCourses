package tr.edu.medipol.odevler.betul_ozdemir.odev1;
import org.junit.*;

/*-
Odev 1
En az 10 Matematiksel i�lem i�in 10 ayr� metod i�eren Hesaplama s�n�f� yaz�lacak. 
Bu 10 Matematikel i�lemin her biri i�in de 10 ayr� JUnit test metodu yaz�lacak. 
Uygulama Maven projesi �eklinde geli�tirilecek ve Maven test ve install komutlar�n �al��mas� kontrol edilecek. 
 */

public class Matematiksel�slemler {
	public static void main(String[]args) {
		int sonuc =Toplama(19,25);
		System.out.println(sonuc);
	}
	
	
	public static int K�pAlma(int sayi) {
		return sayi*sayi*sayi;
	}
	public static int B�lme(int sayi1,int sayi2) {
		return sayi1/sayi2;
	}
	public static int Toplama(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	public static int ��karma(int sayi1,int sayi2) {
		return sayi1-sayi2;

    }
	public static int �arpma(int sayi1,int sayi2) {
		return sayi1*sayi2;
}
	public static double K�kAlma(double sayi) {
		return Math.sqrt(sayi);
	}
	public static int MutlakDe�er(int sayi) {
		return Math.abs(sayi);
	}
	public static int MinSayi(int sayi1,int sayi2) {
		return Math.min(sayi1,sayi2);
}
	public static int MaxSayi(int sayi1,int sayi2) {
		return Math.max(sayi1,sayi2);
	}
	public static int ModAlma(int sayi1,int sayi2) {
		return (sayi1%sayi2);
}
}