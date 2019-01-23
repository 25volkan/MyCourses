package spark.template.freemarker.batuhankizil.finalproje;

import spark.*;
import spark.template.freemarker.*;
import static spark.Spark.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import spark.template.freemarker.batuhankizil.finalproje.model.Kullanici;
import spark.template.freemarker.batuhankizil.finalproje.model.Urun;
import spark.template.freemarker.batuhankizil.finalproje.service.KullaniciServis;
import spark.template.freemarker.batuhankizil.finalproje.service.SiparisServis;
import spark.template.freemarker.batuhankizil.finalproje.service.UrunServis;

public class UygulamaMain 
{
	
	public static Kullanici girisYapmisKullanici = null;
	public static Map<String, List<Urun>> siparisMap = new HashMap<>(); 
	
	
    public static void main( String[] args )
    {
    	
    	
    	/**
      	 * Tablolar� olu�turur.
    	 * */    	
    	
    	//VeritabaniYonetimi.createTable();
    	
    	KullaniciServis kullaniciServis = new KullaniciServis();
    	UrunServis urunServis = new UrunServis();
    	
    	/**
      	 * �r�n ekler.
    	 * */
    	
        
        //UrunServis urunServis = new UrunServis();
    	/*Urun urun = new Urun("Masa","E�ya",480.0);
        urunServis.urunEkle(urun);*/

    	
    	/**
      	 * Kullan�c� ekler.
    	 * */
        
        kullaniciServis.adminKullaniciEkle();
        kullaniciServis.questKullaniciEkle();
   
    	
    	FreeMarkerRoute girisSayfa = new GirisSayfasi("/batuhankizil/giris_sayfasi");
		get(girisSayfa);
		
		Route kullaniciGiris = new Route("/batuhankizil/girisyap") {
			@Override
			public Object handle(Request req, Response res) {
				String username = req.queryParams("username");
				String password = req.queryParams("password");
				
				/**
		      	 * Kullan�c� bilgileri kontrol edilir.
		    	 * */

				Kullanici kullanici = kullaniciServis.kullaniciGiris(username, password);
				
				if(kullanici != null) {
					
					if(kullanici.getKullanici_tipi().equals("ADMIN")) {
						
						/**
				      	 * Kullan�c� giri�i e�er do�ruysa giri� yapan kullan�c�ya set eder.
				    	 * */
						
						girisYapmisKullanici = kullanici;
						siparisMap.put(girisYapmisKullanici.getKullanici_adi(), new ArrayList());
						res.redirect("/batuhankizil/yonetici/");
						
					}else {
						
						/**
				      	 * Kullan�c� giri�i e�er do�ruysa giri� yapan kullan�c�ya set eder.
				    	 * */
						
						girisYapmisKullanici = kullanici;
						siparisMap.put(girisYapmisKullanici.getKullanici_adi(), new ArrayList());
						res.redirect("/batuhankizil/");						
					}
					
				}else {
					
					/**
			      	 * E�er giri�te hata al�n�rsa, hata sayfas�na y�nlendirilir.
			    	 * */
					
					//res.redirect("/batuhankizil/giris_sayfasi");
					res.redirect("/batuhankizil/hata_sayfasi/");	
				}
				return null;
			}
		};
		post(kullaniciGiris);
		
				
		Route kayitol = new Route("/batuhankizil/kayitol") {
			@Override
			public Object handle(Request req, Response res) {
				res.redirect("/batuhankizil/uye_sayfasi");
				return null;
			}
		};
		post(kayitol);
		

		
		/**
      	 * �ye sayfas�
    	 * */		
		FreeMarkerRoute kayit = new UyeSayfasi("/batuhankizil/uye_sayfasi");
		get(kayit);
		
		/**
      	 * Anasayfa
    	 * */		
		FreeMarkerRoute anasayfa = new AnaSayfa("/batuhankizil/");
		get(anasayfa);

		/**
      	 * Hata Sayfas�
    	 * */
		FreeMarkerRoute hata = new HataSayfa("/batuhankizil/hata_sayfasi/");
		get(hata);

		/**
      	 * Y�netici sayfas�
    	 * */
		FreeMarkerRoute yonetici = new YoneticiAnasayfa("/batuhankizil/yonetici/");
		get(yonetici);
		
		
		/**
      	 * Kullan�c� silme metodu.
    	 * */
		Route kullaniciSil = new Route("/batuhankizil/yonetici/kullanicisil") {
			@Override
			public Object handle(Request req, Response res) {
				String kullaniciAdi = req.queryParams("kullanici_adi");
				if (kullaniciAdi != null) {
					kullaniciServis.kullaniciSil(kullaniciAdi);
				}
				res.redirect("/batuhankizil/yonetici/");
				return null;
			}
		};
		post(kullaniciSil);
		
		
		/**
      	 * Kullan�c� ekleme metodu.
    	 * */
		Route kullaniciEkle = new Route("/batuhankizil/yonetici/kullaniciEkle") {
			@Override
			public Object handle(Request req, Response res) {
				String kullaniciAdi = req.queryParams("kullanici_adi");
				String kullaniciTipi = req.queryParams("kullanici_tipi");
				String kullaniciYas = req.queryParams("kullanici_yas");
				String kullaniciCinsiyet = req.queryParams("kullanici_cinsiyet");
				String kullaniciSifre = req.queryParams("kullanici_sifre");
				int yas = Integer.parseInt(kullaniciYas);
				Kullanici kullanici= new Kullanici(kullaniciAdi,kullaniciTipi,yas,kullaniciCinsiyet,kullaniciSifre);	
				if (kullanici != null) {
					kullaniciServis.kullaniciKaydet(kullanici);
				}
				res.redirect("/batuhankizil/yonetici/");
				return null;
			}
		};
		post(kullaniciEkle);
		
		/**
      	 * ��k�� yapma metodu.
    	 * */
		Route cikisyap = new Route("/batuhankizil/cikisyap") {
			@Override
			public Object handle(Request req, Response res) {
				girisYapmisKullanici = null;
				res.redirect("/batuhankizil/giris_sayfasi");
				return null;
			}
		};
		post(cikisyap);
		
		/**
      	 * Sepete ekleme metodu.
    	 * */
		Route sepeteEkle = new Route("/batuhankizil/sepeteEkle") {
			@Override
			public Object handle(Request req, Response res) {
				String urunId = req.queryParams("urunId");
				Urun urun = urunServis.urunGetir(Integer.parseInt(urunId));
				
				if(siparisMap.get(girisYapmisKullanici.getKullanici_adi()) != null) {
					siparisMap.get(girisYapmisKullanici.getKullanici_adi()).add(urun);
				}else {
					List<Urun> urunler = new ArrayList<>();
					urunler.add(urun);
					siparisMap.put(girisYapmisKullanici.getKullanici_adi(), urunler);
				}
				
				res.redirect("/batuhankizil/");
				return null;
			}
		};
		post(sepeteEkle);
		
		/**
      	 * Sipari� verme metodu.
    	 * */
		Route siparisVer = new Route("/batuhankizil/siparisVer") {
			@Override
			public Object handle(Request req, Response res) {
				Object urunObj = req.queryParams("urun");
				Urun urun = (Urun) urunObj;
				
				if(siparisMap.get(girisYapmisKullanici.getKullanici_adi()) != null) {
					List<Urun> siparisler = siparisMap.get(girisYapmisKullanici.getKullanici_adi());
					SiparisServis siparisServis = new SiparisServis();
					siparisServis.siparisVer(girisYapmisKullanici.getKullanici_adi(),siparisler);
					siparisMap.put(girisYapmisKullanici.getKullanici_adi(),new ArrayList<>());
				}else {
					System.out.println("Siparis Listesi Boş");
				}
				
				res.redirect("/batuhankizil/");
				return null;
			}
		};
		post(siparisVer);
		
		
    }
}
