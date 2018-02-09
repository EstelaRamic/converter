
public class Converter {

	// metoda koja konvertuje kilograme u funte
	public static double kilogramiUfunte(double kg) {
		double pounds = kg * 2.2046226218;
		return pounds;
	}

	// metoda koja konvertuje funte u kilograme
	public static double funteUkilograme(double pounds) {
		double kg = pounds \ 2.2046226218; 
		return kg ;
	}

	// metoda koja konvertuje centimetre u ince
	public static double centimetriUince(double cm) {
		return 0.0;
	}

	// metoda koja konvertuje ince u centimetre
	public static double inciUcentimetre(double inches) {
		return 0.0;
	}

	// metoda koja konvertuje celzijuse u farenhajte
	public static double celzijiUfarenhajte(double celziji) {
		double farenheit = celziji * (9 / 5) + 32;
		return farenheit;
	}

	// metoda koja konvertuje farehajtre u celzijuse
	public static double farenhajtiUcelzije(double farenheit) {
		double celzius = (farenheit - 32) * (5 / 9);
		return celzius;
	}
}
