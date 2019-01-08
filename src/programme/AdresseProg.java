package programme;

import java.util.ArrayList;
import java.util.Scanner;

import klassen.Adresse;

public class AdresseProg {

	public static void main(String[] args) {
		ArrayList<Adresse> adr1 = new ArrayList<Adresse>();
		adr1.add(new Adresse("Muriel", "LindenStr.6", "Berlin"));
		adr1.add(new Adresse("ANnick", "HAuptstr.12", "Munich"));
		adr1.add(new Adresse("Noelle", "Kepstr.136", "Koln"));
		adr1.add(0, new Adresse("Klaus", "Lindenstr. 132", "Berlin")); // füge adresse auf die erste Position

		Adresse[] AdrArrays = { new Adresse("Lou", "Klemkestr.58", "Berlin") };
		
		
		for (Adresse adresse : adr1) {
			System.out.println(adresse.getName());			
		}
		System.out.println(adr1.size());

		Scanner scanner = new Scanner(System.in);
		try {
			String name = scanner.nextLine();
			String strasse = scanner.nextLine();
			String stadt = scanner.nextLine();
			Adresse adresse4 = new Adresse(name, strasse, stadt);		
			adr1.add(adresse4);
		} finally {
			scanner.close();
		}
		
		
		
		//AdrArrays[1] = adresse4;

		System.out.println("---------------ArrayList-----------------------");
		System.out.println(adr1.size());
		for (Adresse adresse : adr1) {
			System.out.println(
					"Liste Adresse " + adresse.getName() + " " + adresse.getStrasse() + " " + adresse.getStadt() + " " + adresse.getName().length());
			}

		System.out.println("--------------Array-------------------------------");
		System.out.println(AdrArrays.length);
		for (Adresse adresse : AdrArrays) {
			System.out.println(
					"Liste Adresse " + adresse.getName() + " " + adresse.getStrasse() + " " + adresse.getStadt());
		}

	}

}
