package spark.template.freemarker.ozkansari.finalproje;

import static spark.Spark.*;
import spark.*;
import spark.template.freemarker.*;

public class UyeSayfasi {

	public static void sayfalariTanimla() {

		// Default html dosyalarinin koyulacagi dizin: "spark/template/freemarker/"
		// http://0.0.0.0:4567//ozkansari/uye_sayfasi/
		FreeMarkerRoute girisSayfasi = new FreeMarkerRoute(
				"/ozkansari/uye_sayfasi/" // Sayfaya hangi URL ile erisecegimi tanimliyorum
		) {
			@Override
			public Object handle(Request istek, Response cevap) {
				return new ModelAndView(
						null, 
						"/ozkansari/finalproje/uye_sayfasi.html" // spark/template/freemarker/ altindaki dosya yolu
				);
			}
		};
		get(girisSayfasi);
	}
}