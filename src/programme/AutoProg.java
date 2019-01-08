package programme;

import klassen.Auto1;
import vererbung.BMW;

public class AutoProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Auto1 bmw = new Auto1("Loto", "Winter", 300000.99, "bmw");
		Auto1 vw = new Auto1("Michelin", "sommer", 30000.299, "VW");

		Auto1[] auto1s = { bmw, vw, new Auto1("ALonso", "Herbst", 25000.851, "AUDI") };
		int index = 0;

		for (Auto1 auto1 : auto1s) {
			System.out.println(index++ + 1 + ". Auto mt dem " + auto1.getMarke() + " "
					+ auto1.roundedPreis(auto1.getPreis()) + " und Reifeanzahl:  " + Auto1.getReife());
			auto1.autoGasGeben();
			auto1.vergleichPreis(auto1s[0], auto1s[1]);

		}

		BMW bmw2 = new BMW(1200, 4, 5);
		System.out.println("Marke: " + bmw2.getHersteller() + " ,Leistung; " + bmw2.getLeistung() + " PS, Tür: "
				+ bmw2.getAnzahlTuer() + " ,Reife: " + bmw2.getAnzahlReife() + " ,Preis: " + bmw2.getPreis());
		
		System.out.println("-----------------Association------------------");
		System.out.println(vw.toString());
	}
	

}
