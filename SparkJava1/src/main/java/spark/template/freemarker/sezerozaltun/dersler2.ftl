<html>

	<head>
	
	<h1 align="center">Dersler</h1>
	
	</head>
	
	<body>
	
<body bgcolor="#79cdcd">
	<table border="1" ALIGN="center">
<tr>
<th>Ders No - Ders Adi - Ders Tipi</th>


</tr>
<tr>
<td><!-- for(Ders ders : dersler ) { -->
		 	  
			  <#list dersler as dersAdi>
			  
			  	<li>${dersAdi.dersBilgileriniAl()}</li>
			  	
			 
			  
			  </#list>
			  
			  
			  <!-- } --></a></td>
</table>

<table border="3" ALIGN="center">
<tr>
	<th>SE�ENEKLER</th>


</tr>
<tr>
<td>
  <button onclick="window.location.href='/dersekle'">Ders EKLE</button>
			 <button onclick="window.location.href='/derssil'">Ders S�L</button>
			  <button onclick="window.location.href='/ogrenciler'">Ogrenci G�r�nt�le</button>
</table>
			  
			
			 
	</body>
	
	
</html>