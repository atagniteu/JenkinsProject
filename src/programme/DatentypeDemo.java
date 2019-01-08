package programme;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class DatentypeDemo {
	public static void main(String[] args) {
		// Es gibt 8 primitiven Datentypen
		System.out.println("----------------------INTEGER---------------------------");
		int integerZahl = 10000; // Werte Bereich -2.147.483.648 ... 2.147.483.647	32 Bit
		System.out.println("Integer Datentypen: " + integerZahl);
		System.out.println("Klasse Integer " + Integer.bitCount(integerZahl));
		System.out.println("Klasse Integer maxValue " + Integer.max(10, 5));
		System.out.println("Klasse Integer compare " + Integer.compare(20, 40 ));// -1 weil 20 kleiner ist als 40
		System.out.println("Klasse Integer compare " + Integer.compare(60, 40 )); // 1 weil 60 größer ist als 40
		System.out.println("Klasse Integer compare " + Integer.compare(40, 40 )); // 0 weil 40 == 40
		System.out.println("----------------------LONG---------------------------");
		long longZahl = 200L; // -263 bis 263-1, ab Java 8 auch 0 bis 264 -1[4] 64 Bit
		System.out.println("Long Datentypen: " + longZahl);
		System.out.println("Klasse LONG " + Long.bitCount(longZahl));
		System.out.println("Klasse LONG maxValue " + Long.MAX_VALUE);
		System.out.println("Klasse LONG parseLong " + Long.parseLong("12345")); // -1 weil 20 kleiner ist als 40
		System.out.println("Klasse LONG compare " + Long.compare(60L, 40L )); // 1 weil 60 größer ist als 40
		System.out.println("Klasse LONG divideUnsigned " + Long.divideUnsigned(16, 4)); 
		System.out.println("----------------------SHORT---------------------------");
		short shortZahl = -14780; // -32.768 ... 32.767	16 Bit
		System.out.println("Short Datentypen: " + shortZahl);
		System.out.println("Klasse Short " + Short.hashCode(shortZahl));
		System.out.println("Klasse Short MinValue " + Short.MIN_VALUE);
		System.out.println("Klasse Short divideUnsigned " + Short.toUnsignedInt(shortZahl)); 
		
		System.out.println("----------------------BYTES---------------------------");
		byte byteZahl = 100; // -128 ..... 127	 8 Bit
		System.out.println("Byte Datentypen: " + byteZahl);
		System.out.println("Klasse toString " + Byte.toString(byteZahl));
		System.out.println("Klasse bytes MinValue " + Byte.MAX_VALUE);
		System.out.println("Klasse bytes valueOf " + Byte.valueOf(byteZahl) ); 
		
		System.out.println("----------------------DOUBLE---------------------------");
		double doubleZahl = 236.2333333333333; // -128 ..... 127	64 Bit
		DecimalFormat decimalFormat = new DecimalFormat("##.####");
		BigDecimal bigDecimalFormat = new BigDecimal(doubleZahl);
		
		System.out.println("Byte Datentypen: " + doubleZahl);
		System.out.println("Byte Zahl mit 2 decimal: " + decimalFormat.format(doubleZahl));
		System.out.println("Byte BigDecimal byteValue: " + bigDecimalFormat.byteValue());
		System.out.println("Byte BigDecimal add: " + bigDecimalFormat.add(new BigDecimal(200)));
		System.out.println("Klasse toString " + Double.toHexString(doubleZahl));
		
		System.out.println("----------------------FLOAT---------------------------");
		float floatZahl = (float) Math.PI; // +/-1,4E-45 ... +/-3,4E+38	32 Bit
		System.out.println("Byte Datentypen float: " + floatZahl);
		System.out.println("Byte Datentypen float mit 2 commaZahl: " + floatZahl);
		 
		System.out.println("----------------------CHAR---------------------------");
		char charAusgabe1 = 68; //0 ... 65.535 (z. B. 'A')	1 Bit
		char charAusgabe2 = 35;
		char unicode = '\u0F90';
		//char unicode1 = '\u009A';
		char fragenzeichen = '?';
		System.out.println("Char Datentypen: " + charAusgabe1);
		System.out.println("Char Datentypen: " + charAusgabe2);
		System.out.println("Char unicode von  Fragezeichen: " + unicode);
		System.out.println("Char unicode Fragezeichen: " + fragenzeichen);
		
		System.out.println("----------------------BOOLEAN---------------------------");
		boolean booleanAssgabe = true; // true or false. false immer als default
		System.out.println("Boolean Datentypen: " + booleanAssgabe);
		System.out.println("Klasse getBoolean " + Boolean.getBoolean("Muriel"));
		System.out.println("Klasse toString " + Boolean.toString(booleanAssgabe));
		int zahl2 = 10 / 3;
		float zahl1 = 10 / 3f;
		double zahl3 = 10 / 3d;
		int zahl = 4 ;
		System.out.println(zahl2); 
		System.out.println(zahl1); // speicherplatz optimieren
		System.out.println(zahl3); // Taschenrechner benutzt
		
		
		System.out.println("-----------------------");
		System.out.println( "zahl: " +zahl);
		zahl++; // zahl um 1 erhöht;
		System.out.println( "zahl++ " + zahl); 
		zahl--; // zahl um 1 diminuiert
		System.out.println( "zahl-- " + zahl);
		
		zahl += zahl; // zahl 
		int erg = +zahl;
		System.out.println( "zahl +=Zahl " + zahl);
		System.out.println( "zahl++ " + zahl);
		System.out.println( "erg: " + erg);
		zahl -= zahl;
		System.out.println( "zahl -= zahl: " + zahl);
		System.out.println( "zahl++-------------------");
		int lebenGegner = 100;
		int geschossErnergie = 20;
		
		lebenGegner = lebenGegner - geschossErnergie;
		System.out.println( "lebenGegner " + lebenGegner);
		lebenGegner -= geschossErnergie;
		
		System.out.println( "lebenGegner " + lebenGegner);
		lebenGegner += geschossErnergie;
		System.out.println( "lebenGegner " + lebenGegner);
		lebenGegner -= geschossErnergie;
		if (lebenGegner == 0) {
			System.out.println("lebenGener hat keine punkte" );
		} else {
			System.out.println("noch punkte " + lebenGegner);
			lebenGegner -=geschossErnergie;
		}
		
		
		int alter = (int) 12.5;
		System.out.println(alter);
		double zaltatlter = alter;
		System.out.println(zaltatlter);
		
		int auto = 3500;
		double preis = 3200.40;
		
		int p = (int) preis; // explizite casten von grossen zu kleine
		double a = auto; // implizite von kleine zu größe
		System.out.println(p);
		System.out.println(a);
		
		
		
	}

}
