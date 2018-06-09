FINAL PROJESI
Teslim Tarihi: 31 Mayis 23:59 (Raporunuzu ozkan.sari@outlook.com e-posta ile g�nderebilirsiniz)

Sunum Tarihi: 02.06.2018 13:00 MYO LAB. (IMAC)

**************************************************************************
Degerlendirme:

* [ /5] Spring Boot Projesi (Ekle/G�r�nt�le/Sil)  - Aciklama
* [ /15] Githuba commit
* [ /10] Rapor D�zeni & Aciklamalar
* [ /5] Javadoc
* [ /10] JUnit/Birim Test
* [ /5] Test kapsama (Coverage)
* [ /5] Maven site
* [ /15] Travis CI & Codecov.io
* [ /15] Jenkins - Github maven build
* [ /10] SonarQube - Jenkins tetikleme
* [ /5] Postman
* [ /10] Jmeter
* [ /10] UML
---------------------------
* [ /120] Toplam

**************************************************************************

Maven (Bkz. Hafta 4-5) kullanarak bir Spring Boot projesi (Bkz. Hafta 10) gelistireceksiniz. Projenizde su REST servisler bulunacak:

�grenci Ekleme
�grenci G�r�nt�leme
�grenci Silme
https://github.com/ozkansari/FinalProje �rnek alinabilir.

Projenizi kurallara uygun gelistirecek ve bir rapor hazirlayacaksiniz. Ayrica final zamani gelip projenizi sunacaksiniz ve a�iklayacaksiniz. Projeyi a�iklayamama veya projeyi �grencinin kendisi yapmamasi durumunda final notu sifir olarak girilecektir.

Raporunuzda asagida belirtilmis olan t�m adimlari, ayri basliklar altinda a�iklamanizi ve ekran g�r�n�t�leriyle desteklemenizi istiyorum.

�NEMLI: Raporunuz sade ve anlasilir olmali.

Gelistirdiginiz proje ve kodlariniz hakkinda kurallar:

Maven projesi olacak (Bkz. Hafta 4-5)
Spring Boot disinda �zel bir teknoloji kullanilmayacak (Bkz. Hafta 10)
Kodlariniz okunakli olacak: degiskenler, siniflar ve metotlar d�zg�n isimlendirilmis olacak ve Turk�e karakter i�ermeyecek
T�m sinif ve metotlariniz javadoc (Bkz. Hafta 8) standardiyla dok�mante edilmis olacak. Javadoc raporu olusturulup, olusturma adimlariyla birlikte rapora konulacak.
T�m metotlariniz i�in JUnit ile birim testler yazilacak. (Bkz. Hafta 4-5)
Yazdiginiz birim testlerin coverage'ini yani test kapsama oranini (Bkz. Hafta 9) hesaplatip, nasil hesaplattiginizin bilgisiyle birlikte raporunuza ekleyeceksiniz.
Projenizden otomatik olarak bir maven site (Bkz. Hafta 8) olusturacaksiniz ve yaptiginiz islemleri adim adim ekran g�r�nt�leriyle a�iklayacaksiniz.

Kodlarinizi github'da yeni bir repository olusturularak (Bkz. Hafta 4-5) oraya commitleyeceksiniz. Nasil yaptiginizi adim adim anlatmanizi ve sonu�taki github repository adresinizi raporunuza koymanizi istiyorum.

Kodlarinizi Travis CI (Bkz. Hafta 11) ile entegre edip otomatik derlettireceksiniz ve CodeCov.io (Bkz. Hafta 11) entegrasyonuyla kodunuun coverage (test kapsama) degerlerinin otomatik hesaplanmasini saglayacaksiniz. Yaptiginiz islemleri ve sonu�larini adim adim ekran g�r�nt�leriyle a�iklayacaksiniz ve raporunuzda paylasacaksiniz.

Kodunuzu Postman (Bkz.Hafta 10) ve JMeter (Bkz. Hafta 11) ile test edip, nasil test ettiginizi ve test sonu�larini raporunuzda adim adim paylasacaksiniz.

T�m siniflarinizin UML diagramlarini (Bkz.Hafta 3) �izeceksiniz. Tercihen ArgoUML ya da benzer bir ara� kullanabilirsiniz. UML diagramlari da rapora koyulacak ve a�iklanacak.

Jenkins (Bkz. Hafta 6 & 7) kuracaksiniz ve yaptiginiz islemleri adim adim ekran g�r�nt�leriyle a�iklayacaksiniz ve projenizin jenkins'te otomatik derlenmesini saglayacaksiniz ve iliskili adimlari rapora koyacaksiniz ve a�iklayacaksiniz.

SonarQube (Bkz. Hafta 7) kurulumu yapacaksiniz ve yaptiginiz islemleri adim adim ekran g�r�nt�leriyle a�iklayacaksiniz ve jenkinsden tetiklenerek projenizin analiz edilmesini saglayacaksiniz. Analiz sonu�larinizi da rapora ekleyeceksiniz.

Bonus
Unit testlerde Spring REST testleri kullanilmasi. �rnek: https://www.petrikainulainen.net/programming/spring-framework/unit-testing-of-spring-mvc-controllers-rest-api/