package programme;
import klassen.Obst;


public class ObstProgramm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Obst banane = new Obst("Banene", 2, 10);
		System.out.println(banane.toString());
		banane.obstAufpeppen();
		System.out.println("nach Aufpeppen");
		System.out.println(banane.toString());
		System.out.println(banane.getBezeichnung());		

	}

}
