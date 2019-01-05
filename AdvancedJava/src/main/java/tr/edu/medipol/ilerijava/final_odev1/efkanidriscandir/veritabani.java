package tr.edu.medipol.ilerijava.final_odev1.efkanidriscandir;

import javax.swing.*;
import java.sql.*;

public class veritabani extends JFrame 
  {
	JLabel bir,iki;
    static JTextField isim;
	static JTextField soyisim;
	static JButton ekle;
	
   public veritabani() 
   { 
    this.setTitle("Kullan�c� Ad� Kay�t etme"); //Ba�l�k
    this.setSize(300 , 300); //Pencere Boyu
    this.setLayout(null); //Yerle�im d�zeni
    
    //Olu�turma
    bir = new JLabel("Ad:");
    iki = new JLabel("Soyad:");
    isim = new JTextField();
    soyisim = new JTextField();
    ekle = new JButton("G�nder");
    
    //Ekleme
    this.add(isim);
    this.add(soyisim);
    this.add(bir);
    this.add(iki);
    this.add(ekle); 
    
    //Konumland�rma
    bir.setBounds(30,30,100,30);
    isim.setBounds(70,30,100,30);
    iki.setBounds(30,60,100,30);
    soyisim.setBounds(70,60,100,30);
    ekle.setBounds(70,100,100,40);
    
    this.setVisible(true); //Pencereyi g�r�n�r yapar
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //kapanma davran��� 
   } 
  

	public static void main(String[] args) throws Exception {
		//Ba�lant�
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
		Connection baglanti = DriverManager.getConnection("jdbc:derby://localhost:3306/"
				                                        + "veritabani;"
				                                        + "user=Efkan;"
				                                        + "password=12345;");
		
	    Statement sorgu = baglanti.createStatement();
		
	    
	    //Tablo olu�turma
		try  {
			sorgu.executeUpdate("CREATE TABLE " 
		                      + "isimler ("
					          + "Ad varchar(50), " 
					          + "Soyad varchar(50)"
					          +	")" );
		} catch(Exception e) {
			System.out.println("Tablo var. " + e.getMessage());
		}
		
		//Pencereyi ba�latma
		new veritabani();
		
		
		//Butona g�rev verme
		ekle.addActionListener(event->{
			try {
				
				//Ekleme
				sorgu.executeUpdate("INSERT INTO isimler VALUES ('"+isim.getText()+"','"+soyisim.getText()+"')");
				
				//Tablodaki verileri okuma
		        ResultSet veriler = sorgu.executeQuery("SELECT * FROM isimler");
	        	
		        while(veriler.next()) {
		         	String ad = veriler.getString("Ad");
		        	String soyad = veriler.getString("Soyad");
		        	
		        	//Tablodaki verileri g�sterme
		        	System.out.println(ad + " " + soyad);
	            	}
	        	
		        
		        //Tablodaki veriler bittikten sonra araya ay�rmak i�in �erit
	        	System.out.println("-----------------------------------");
	        	
	        	
			} catch (SQLException e) {
				e.printStackTrace();
			}
			});
	}
}