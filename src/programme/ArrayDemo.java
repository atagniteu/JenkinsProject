package programme;

public class ArrayDemo {

	public static void main(String[] args) {
		System.out.println("---------- String[] args Ausbabe von --------------");
		
		System.out.println("Args elements count " + args.length);
		System.out.println("Args elements count " + args[0] + " " + args[1]);
		
		// 2 Dimensionale Array 3 Zeile 2 Spalte
		int[][] intArray = new int[3][2];
		intArray[0][0] = 1980;
		intArray[0][1] = 1981;
		intArray[1][0] = 1982;
		intArray[1][1] = 1983;
		intArray[2][0] = 1984;
		intArray[2][1] = 1985;

		String[] stringArray = { "Muriel", "Annick", "Paul" };
		double[] doubleArray = new double[] { 2.00, 3.25, 8.28, 15.23 };
		System.out.println("----------Ausbabe von Array Liste --------------");
		System.out.println("intArray: " + intArray[2]);
		System.out.println("StringArray: " + stringArray[0]);
		System.out.println("StringArray: " + doubleArray[1]);

		System.out.println("----------Ausbabe von Array Liste --------------");
		System.out.println("Anzal der element: " + doubleArray.length);
		for (double doubleList : doubleArray) {
			System.out.println("DoubleArray: " + doubleList);
		}
		System.out.println("----------Ausbabe von Array Liste --------------");
		doubleArray = new double[] { 1.00, 3.00, 5.00, 15.22, 25.66, 33.00 };
		for (double d : doubleArray) {
			System.out.println("Anzal der element: " + d);

		}
		System.out.println("---------2 Dimensional Arrays --------------");
		System.out.println("Anzal der element: " + intArray.length);
		for (int i[]: intArray) {
			for(int j : i) {
				System.out.println(j);
			}			
			
		}
		
		System.out.println("---------2 Dimensional Arrays  Tabelle--------------");
				String[][] intArray1 = {{"Spalte1" , "Spalte2", "Spalte3"}, {"1", "2", "3"}, {"4", "5", "6"}};
		
		
		for (int zeile = 0; zeile < intArray1.length; zeile++) {
			System.out.print("Zeile " + zeile + ": " );
			for(int spalte = 0; spalte < intArray1[zeile].length; spalte++) {
				System.out.print(intArray1[zeile][spalte] + "\t");
			}
			System.out.println();
		}
	}

}
