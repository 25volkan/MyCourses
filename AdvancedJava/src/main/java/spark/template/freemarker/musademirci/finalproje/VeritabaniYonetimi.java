package spark.template.freemarker.musademirci.finalproje;

import java.sql.*;



public class VeritabaniYonetimi {

	private static Statement veritabaniStatement;
	
	public static Statement veritabaniBaglantisiKur() {
		try {
			
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
			
			Connection veritabaniBaglantisi = DriverManager.getConnection(
					"jdbc:derby:"
					 + ".\\.musademircidb\\" // windows ortami icin
					//+ "./.musademircidb/"
					+ ";create=true;"
					);
			
			veritabaniStatement = veritabaniBaglantisi.createStatement();
			
			return veritabaniStatement;
			
		} catch(Exception e) {
			System.out.println("Veritabanina baglanirken hata olustu");
		}
		
		return null;
	}
	
	public static boolean tablolariOlustur() {
		
		try  {
			veritabaniStatement.executeUpdate(
					"CREATE TABLE "
							+ "kullanicilar ("
								+ "kullanici_adi varchar(40), "
								+ "kullanici_tipi varchar(15), "
								+ "yas int, "
								+ "cinsiyet varchar(1), " // E-K
								+ "sifre varchar(25)"
							+ ")"
								
								+ "urunler ("
								+ "urun_id int primary key), "
								+ "urun_adi varchar(30), "
								+ "urun_kategori varchar(40), "
								+ "fiyat int, "
							+ ")"
								
								+ "siparisler ("
								+ "siparis_id int primary key), "
								+ "kullanici_adi varchar(30), "
								+ "urun_idler int, "
								+ "toplam_ucret int, "
								+ ")"
			);
						
			System.out.println("Tablolar basariyla olsuturuldu");
			
		} catch(Exception e) {
			System.out.println("Tablo zaten mevcut. Tekrar olusturulmayacak: " + e.getMessage());
		}
		
		return true;
	}
	
	public static Kullanici kullaniciSorgula(String kullaniciAdi) {
		
		try  {
			ResultSet sonuclar = veritabaniStatement.executeQuery(
					"SELECT * FROM kullanicilar WHERE kullanici_adi = '" + kullaniciAdi + "'"
			);
			while(sonuclar.next()) {
				String kullaniciTipi = sonuclar.getString("kullanici_tipi");
				int yas = sonuclar.getInt("yas");
				String cinsiyet = sonuclar.getString("cinsiyet");
				String sifre = sonuclar.getString("sifre");
				return new Kullanici(kullaniciAdi, kullaniciTipi, yas, cinsiyet, sifre);
			}
		} catch(Exception e) {
			System.out.println("Kullanici sorgu hata" + e.getMessage());
		}
		return null;
	}

	public static void kullanicilariOlustur() {
		
		if(kullaniciSorgula("guest") != null) {
			System.out.println("Sistem kullanicilari mevcut");
			return;
		}
		if(kullaniciSorgula("admin") != null) {
			System.out.println("Sistem kullanicilari mevcut");
			return;
		}
		
		try  {
			veritabaniStatement.executeUpdate("INSERT INTO kullanicilar VALUES ( "
					+ "'guest', 'NORMAL', 22, 'E', 'abcd'"
					+ ")");
		/*	veritabaniStatement.executeUpdate("INSERT INTO kullanicilar VALUES ( "
					+ "'admin', 'ADMIN', 22, 'K', 'xyz'"
					+ ")"); */
			System.out.println("kullanicilar olusturuldu.");
		} catch(Exception e) {
			System.out.println("Ayni id'li kayit olusturulamaz :" + e.getMessage());
		}
	}
	
	
public static void urunolustur() {
		
		if(kullaniciSorgula("kitap") != null) {
			System.out.println("urun mevcut");
			return;
		}
		
		
		try  {
			
			veritabaniStatement.executeUpdate("INSERT INTO urun VALUES ( "
					+ "'1', 'kitap', k�rtasiye, '15'"
					+ ")");
			veritabaniStatement.executeUpdate("INSERT INTO urun VALUES ( "
					+ "'2', 'kalem', k�rtasiye, '5',"
					+ ")");
			System.out.println("Urun olusturuldu.");
		} catch(Exception e) {
			System.out.println("Ayni id'li kayit olusturulamaz :" + e.getMessage());
		}
	}
	
}
