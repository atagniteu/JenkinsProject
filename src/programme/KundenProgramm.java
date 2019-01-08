package programme;
import klassen.Kunde;


public class KundenProgramm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Kunde mike = new  Kunde("Mike", "Tagueka");
		Kunde Noelle = new Kunde("Noelle", "Tagniteu");
		System.out.println("------------MIKE Kunde-----------");
		Kunde.toString(mike);
		System.out.println("----------Noelle Kunde-------------");
		Kunde.toString(Noelle);
		System.out.println("----------Anzahl Kunde-------------");
		Kunde.gibInfo();

	}

}
