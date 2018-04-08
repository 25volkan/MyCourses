package tr.edu.medipol.odevler.yunus_emre_dogan.odev1;

/*-
Odev 1
En az 10 Matematiksel i�lem i�in 10 ayr� metod i�eren Hesaplama s�n�f� yaz�lacak. 
Bu 10 Matematikel i�lemin her biri i�in de 10 ayr� JUnit test metodu yaz�lacak. 
Uygulama Maven projesi �eklinde geli�tirilecek ve Maven test ve install komutlar�n �al��mas� kontrol edilecek. 
 */

// Maven degil: -25
// JUnit yok: -25

public class HR160048YUNUSEMREDOGAN  {

	public static void main(String[] args)
	{
		int toplam_sonuc=topla(29,54);
		System.out.println("Toplama sonucu: "+toplam_sonuc);
		int carpma_sonuc=carpma(46,56);
		System.out.println("�arpma sonucu: "+carpma_sonuc);
		int cikarma_sonuc=cikarma(28,12);
		System.out.println("��karma sonucu: "+cikarma_sonuc);
		int bolme_sonuc=bolme(25,5);
		System.out.println("B�lme sonucu: "+bolme_sonuc);
		int d�kdortgencevresi_sonuc=d�kdortgencevresi(43,12);
		System.out.println("�evre sonucu: "+d�kdortgencevresi_sonuc);
		int buyukDeger_sonuc=buyukDeger(13,14);
		System.out.println("B�y�k Say� sonucu: "+buyukDeger_sonuc);
		int alan_sonuc=alan(75,92);
		System.out.println("Alan sonucu: "+alan_sonuc);
		int kalan_sonuc=kalan(28,9);
		System.out.println("Kalan sonucu: "+kalan_sonuc);
		int mutlakDeger = Math.abs(-15);
		System.out.println("Mutlak de�er sonucu: "+mutlakDeger);
		int karakok = (int) Math.sqrt(16);
		System.out.println("Karak�k sonucu: "+karakok);
		

	}

	public static int topla(int sayi1, int sayi2) {
		
		return sayi1 + sayi2;
	}

	public static int carpma(int sayi1, int sayi2)
	{
		return sayi1 * sayi2;
	}

	public static int cikarma(int sayi1, int sayi2)
	{
		return sayi1 - sayi2;
	}
	
	public static int bolme(int sayi1, int sayi2) 
	{
		return sayi1 / sayi2;
	}

	public static int d�kdortgencevresi(int sayi1,int sayi2)
	{
		return (sayi1*sayi2)*2;
	}
	public static int buyukDeger(int sayi1,int sayi2)
	{
		return Math.max(sayi1,sayi2);
	}
	public static int alan(int sayi1,int sayi2) 
	{
		return sayi1*sayi2;
	}
	public static int kalan(int sayi1,int sayi2)
	{
		return sayi1%sayi2;
	}
	public static int mutlakDeger(int sayi1,int sayi2)
	{
		return Math.abs(sayi1%sayi2);
	}
	public static double karakok(int sayi1)
	{
		return Math.cbrt(0);
	}
}

