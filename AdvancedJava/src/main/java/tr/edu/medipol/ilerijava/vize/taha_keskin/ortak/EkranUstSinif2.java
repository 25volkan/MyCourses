package tr.edu.medipol.ilerijava.vize.taha_keskin.ortak;

import java.util.Queue;

import javax.swing.JFrame;

public abstract class EkranUstSinif2 extends JFrame {

	public abstract void mesajEkle(String mesaj);
	
	public Queue<String> getMesajKuyrugu() {
		return null;
	}
}