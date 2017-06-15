package spark.template.freemarker.omeroguzkasap;
import java.util.ArrayList;
import java.util.List;

public class Ogrenci {
	final List<Ogrenci> dersler = new ArrayList<Ogrenci>();
    public String adSoyad;
    public String bolum;
    public String ogrenciNo;
    public String ogrenciTipi;
    public String Ders;
 

    public Ogrenci(
    			   String adSoyad,
                   String ogrenciTipi,
                   String bolum,
                   String ogrenciNo               
                    ){
    	
        this.adSoyad = adSoyad;
        this.ogrenciTipi = ogrenciTipi;
        this.bolum = bolum;
        this.ogrenciNo=ogrenciNo;
 
    }
	public Ogrenci(String Ders) {
		
		this.Ders=Ders;
	}

	public String ogrenciBilgileri() {
       return  this.ogrenciNo+" - "+this.adSoyad;
    };
    public String ogrenciBilgileriDetay() {
    	
    
        return "��renci No: " + this.ogrenciNo +" "+
         	   "��renci Ad�: " + this.adSoyad +" "+
         	   "��renci Tipi: " + this.ogrenciTipi +" "+
         	   "��renci B�l�m�: " + this.bolum  ;
     };
     public String dersekle() {
         return "��renci Dersi: " + this.Ders ;
      };

    public String ogrenciBilgileriAl(boolean ekstraBilgi) {
        return "";
    }
    public String dersekle(boolean ekstraBilgi) {
        return "";
    }

	
}
