package programme;

public class VarArgsDemo {
	public static void main(String[] args) {
		int zahl = 4;
	// addition mit 2 Parameter
		System.out.println("summe des Ergebnis: " + adieren(3, 5));
		System.out.println("----------------------");
		// addition mit weiter Zahlen
		System.out.println("summe des Ergebnis: " + adieren(3, 5, 8, 10, 15));
		
		// for schleife
		System.out.println("--------For Schleife-------------");
		
		for (int i = 0; i <= zahl; i++ ) {
			System.out.println("i = " + i);
		} 
		System.out.println("--------While schleife-------------");
		
		int count = 1;
		while (count < 6) {
			System.out.println("Count: "+ count);
			count++;
			
		}
		
		System.out.println("--------DO While schleife-------------");
		int doCount = 0;
		do {

			System.out.println("doCount: "+ doCount );
			doCount++;
		} while (doCount <= 2);	

	}
	
	public static int adieren(int a, int b, int... weitereZahl) {
		int ergebnis = a + b;
		// for each schleife
		for (int i :  weitereZahl) {
			ergebnis = ergebnis + i;
		}
		return ergebnis ;
	}
	
	
}
