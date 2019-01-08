package klassen;

import interfaces.Verkaeuflich;

public class Warenbestand {
	
	private static Verkaeuflich[]  waren = new Verkaeuflich[10];
	
	private static int counter = 0;

	public static int getAnzahlWaren() {
		return counter;
	}
	
	public static void warenHinzufuegen(Verkaeuflich v) {
		if (counter <= waren.length) {
			waren[counter++] = v;
		}
	}
	
	public static double berechnetPreis() {
		double summe = 0;
		for (Verkaeuflich v : waren) {
			if(v == null) {
				break;
			} else {
				summe = summe + v.getPreis();
			}
			
		}
		return summe ;
		
	}


}
