package tr.edu.medipol.ilerijava.vize.ertugrulsueren;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ErtugrulSueren {

private static final int SERVER_PORT = 1234;

private static Socket sunucubag;

public static void main(String[] args) throws InterruptedException{
	
Scanner input = new Scanner(System.in);

int say�1=0,say�2=0;

String al;

System.out.print("Say� Gir:");

say�1 = input.nextInt();

say�2 = input.nextInt();

System.out.println("��lem Se�");

al = input.next();

System.out.println("Istemciye Giriliyor");

PrintWriter msj = null;

try {
	
	sunucubag = new Socket("localhost",

	ErtugrulSueren.SERVER_PORT);

msj =

new PrintWriter(sunucubag.getOutputStream());

} catch (UnknownHostException e) {
	
System.out.println("IP hatali" + e.getMessage());

} catch (IOException e) {
	
System.out.println("Sunucu Ba�lant�s� Hata" +

e.getMessage());

}
msj.println(say�1);

msj.println(say�2);

msj.println(al);

msj.flush();

}
}