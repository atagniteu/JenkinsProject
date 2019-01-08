package programme;

import java.awt.Color;
import java.util.Locale;
import java.util.Scanner;

import klassen.Auto;

public class AutoProgramme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out
				.println("Hallo kommt zuerst und dans folgt die klasse Initialisierung");

		Auto bmw = new Auto(200, "BMW");
		Auto auto = new Auto(120, "Audi");
		Auto honda = new Auto(120, "Hondai", Color.blue);
		Auto toyota = new Auto(200, "toyota");
		Auto mercedez = new Auto(120, "Mercedez", Color.WHITE, Locale.FRANCE);
		System.out.println(auto.toString());
		System.out.println("----------------------------------");
		auto.tuned(10);
		// System.out.println(auto.toString() );
		// auto.tuned(22);
		System.out.println("----------------------------------");
		System.out.println(auto.getLeistung() + " PS");
		System.out.println(auto.getHersteller());
		auto.setHersteller("Mercedes");
		System.out.println("----------------------------------");
		auto.setLeistung(200);
		System.out.println(auto.getHersteller() + " " + auto.getLeistung()
				+ " " + auto.getFarbe());
		System.out.println("-----------------------------------");
		// System.out.println("Ausgeben static Klasse Methode aus der Auto Klasse ");
		// bmw.gibtAutoAus(auto); // kann man echreiben aber als java Konvention
		// nicht geeignet. nicht empfohlen
		// System.out.println("-----------------------------------");
		System.out
				.println("Ausgeben static Klasse Methode aus der Auto Klasse ");
		Auto.gibtAutoAus(bmw); // korrekt zugriff auf static Klasse Methode
		// System.out.println("-------------------TOYOTA----------------");

		System.out.println(toyota.getHersteller() + " " + toyota.getLeistung()
				+ " " + toyota.getFarbe());

		// System.out.println("-------------------Hondai----------------");

		System.out.println(honda.getHersteller() + " " + honda.getLeistung()
				+ " " + honda.getColor().toString());

		// System.out.println("-------------------Mercedez----------------");

		System.out.println(mercedez.getHersteller() + " "
				+ mercedez.getLeistung() + " " + mercedez.getColor().toString()
				+ " " + mercedez.getLocale().getDisplayName());
		System.out.println("-------------System--------------");
		System.out.println("Enter your username: ");
		Scanner scanner = new Scanner(System.in);
		try {
			String username = scanner.nextLine();
			System.out.println("Your username is: " + username);
			
			
		} finally {
			scanner.close();// TODO: handle finally clause
		}
		// System.out.println("-------------System.Error--------------");
		// System.err.println("C'est ton Vrai nom");
		// System.out.append(65 68);
		
		Auto peugeot = new Auto(600, "Peugeaot");
		Auto scenic = new Auto(140, "Scenic");

		System.out
				.println("------System ERror-------------Peugeot Ausgabe Prufung auf Negative Zahl oder Null--------------");

		
		System.out.println(peugeot.getLeistung());
		
		System.out.println(peugeot.getResult(peugeot.getHersteller()));
		System.out.println(peugeot.isLeistungPositiv());
		
		System.out.println("---------------// logische Oparatoren Schor circuit Evaluation------------");
		System.out.println("Anzahl erstellte Auto: " + Auto.erstellterAuto);
		if ((Auto.erstellterAuto  >= 2) &&  (scenic.getLeistung() != 0) && (scenic.getLeistung() < peugeot.getLeistung() )) {
			scenic.tuned();
		} else {
			System.out.println("wir können das Auto nicht tuned");
		}
			

	}

}
