/**
 * 
 */
package programme;

import klassen.GoogelKonto;

/**
 * @author lenovo
 *
 */
public class GoogleKontoErstellen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GoogelKonto peterKonto = new GoogelKonto("Peter", "12345");
		System.out.println("alte Password: "+ peterKonto.getPasswort());
		System.out.println("--------------------Passwort Überprüfen und verändert------------");
		peterKonto.setPasswort("12345");
	
	}

}
