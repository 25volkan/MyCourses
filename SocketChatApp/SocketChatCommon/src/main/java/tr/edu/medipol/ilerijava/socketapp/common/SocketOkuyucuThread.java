package tr.edu.medipol.ilerijava.socketapp.common;

import java.net.*;
import java.io.*;
import java.lang.System.LoggerFinder;
import java.util.*;
import java.util.logging.Logger;

public class SocketOkuyucuThread extends SocketThreadUstSinif {
	
	private static final Logger LOGGER = Logger.getLogger(SocketOkuyucuThread.class.getName());

	private BufferedReader socketOkuyucu;
	
	private EkranUstSinif ekran;
	
	public SocketOkuyucuThread(Socket socketBaglantisi) {
		super(socketBaglantisi, false);
		init(socketBaglantisi);
	}
	
	public SocketOkuyucuThread(Socket socketBaglantisi, boolean sunucu) {
		super(socketBaglantisi, sunucu);
		init(socketBaglantisi);
	}

	public SocketOkuyucuThread(Socket socketBaglantisi, boolean sunucu, 
			EkranUstSinif ekran) {
		super(socketBaglantisi, sunucu);
		init(socketBaglantisi);
		this.ekran = ekran;
	}

	public void init(Socket socketBaglantisi) {
		// Istemci okuyucu ac
		socketOkuyucu = SocketYardimciAraclari.
				socketOkuyucuOlustur(socketBaglantisi);
		LOGGER.info("Okuyucu Thread olusturuldu" + socketIsmi);
	}

	@Override
	public void run() {
		
		LOGGER.info("Okuyucu Thread calisiyor" + socketIsmi);

		int i=1;
		String mesaj = "";
		do {
			try {
				// istemciden mesaj gelene kadar bekler
				mesaj = socketOkuyucu.readLine(); 
				if (mesaj == null) {
					continue;
				}
				LOGGER.info("[" + socketIsmi +  " " + i + "]" + mesaj);
				if (ekran != null) {
					String mesajVeGonderen = "";					
					if (sunucu) {
						mesajVeGonderen = socketBaglantisi.getInetAddress() + ">>  " + mesaj;
						ekran.getMesajKuyrugu().offer(mesajVeGonderen);
					} else {
						mesajVeGonderen += "" + mesaj;
					}
					ekran.mesajEkle(mesajVeGonderen);
				}
				i++;
			} catch (IOException e) {
				LOGGER.severe("Okuma hata: " + e.getMessage());
				break;
			}
		} while(!mesaj.equals("Bye"));
		
	}

	

}
