<html>

	<head>
	<h1 align="center">ANA SAYFA</h1>
	
	</head>
	
	<body>
	
<body bgcolor="#79cdcd">
	<table border="1" ALIGN="center">
<tr>
<th>Ogrenci No - Ad� Soyad� - B�l�m� - Tipi</th>


</tr>
<tr>
<td><!-- for(Ogrenci ogrenci : ogrenciler ) { -->
		 	  
			  <#list ogrenciler as adSoyad>
			  
			  	<li>${adSoyad.ogrenciBilgileriAl()}</li>
			  	
			 
			  
			  </#list>
			  
			  
			  <!-- } --></a></td>
</table>
	
			  <table border="3" ALIGN="center">
<tr>
<th>SE�ENEKLER</th>


</tr>
<tr>
<td>
 <button  onclick="window.location.href='/ogrenciekle'">OGRENC� EKLE</button>
			 <button onclick="window.location.href='/ogrencisil'">OGRENC� S�L</button>
			  <button onclick="window.location.href='/dersler'">DERSLER� G�R�NT�LE</button>
</table>
			
			 
	</body>
	
	
</html>