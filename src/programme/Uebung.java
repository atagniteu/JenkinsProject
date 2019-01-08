package programme;

import klassen.Auto;

public class Uebung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auto[] auto = new Auto[3];
		for (int i = 0; i < auto.length; i++) {
			auto[i] = new Auto(120 + i, "BMW");
			auto[i].tuned(); 			
		}
		for (Auto a : auto) {
			a = new Auto(140, "BMW");
			System.out.println(a.getLeistung() + " " + a.getHersteller());			
		}

	}

}
