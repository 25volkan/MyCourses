package tr.edu.medipol.odev1.mustafacanyilmaz;

public abstract class Ogrenci {

	public String adSoyad;
	public String bolum;
	
	public Ogrenci(String adSoyad, String bolum){
		this.adSoyad = adSoyad;
		this.bolum = bolum;
	}
	public abstract String ogrenciBilgileriAl();
	public abstract String ogrenciTipiniAl();
	public String ogrenciBilgileriAl(boolean ekstrabilgi){

		String bilgi = "��renci : ";
		bilgi +=bolum.trim();
		bilgi+=adSoyad.toUpperCase();
		bilgi+=ogrenciBilgileriAl();
		return bilgi;
		
		
	}
	
	
	
	
}
