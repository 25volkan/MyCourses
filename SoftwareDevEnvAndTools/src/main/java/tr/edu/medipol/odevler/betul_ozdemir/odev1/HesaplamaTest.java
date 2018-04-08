package tr.edu.medipol.odevler.betul_ozdemir.odev1;
import org.junit.*;

// Tum siniflarda: @Test annotation yok -20

public class HesaplamaTest {
	@Test
	public void K�pAlma(){
		Assert.assertEquals(1000,Matematiksel�slemler.K�pAlma(10));
	
	}
	public void B�lme() {
		int sonuc=Matematiksel�slemler.B�lme(20, 5);
	    Assert.assertEquals(4,sonuc);
	   
	}
	public void Toplama() {
		int sonuc=Matematiksel�slemler.Toplama(10, 10);
		Assert.assertEquals(20,sonuc);
	}
	public void ��karma() {
		int sonuc=Matematiksel�slemler.��karma(10, 2);
		Assert.assertEquals(8,sonuc);
	}
	public void �arpma() {
		int sonuc=Matematiksel�slemler.�arpma(5, 2);
		Assert.assertEquals(10,sonuc);
	}
	public void K�kAlma() {
		double sonuc=Matematiksel�slemler.K�kAlma(7);
		Assert.assertEquals(2,64,sonuc);
	}
	public void MutlakDe�er() {
		int sonuc=Matematiksel�slemler.MutlakDe�er(7);
		Assert.assertEquals(7,sonuc);
	}
	public void MinSayi() {
		int sonuc=Matematiksel�slemler.MinSayi(10, 5);
		Assert.assertEquals(5,sonuc);
	}
	public void MaxSayi() {
		int sonuc=Matematiksel�slemler.MaxSayi(10, 5);
		Assert.assertEquals(10,sonuc);
	}
	public void ModAlma() {
		int sonuc=Matematiksel�slemler.ModAlma(10, 5);
		Assert.assertEquals(0,sonuc);
}
}
