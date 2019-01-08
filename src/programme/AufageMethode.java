package programme;

public class AufageMethode {

	public static void main(String[] args) {
		double product = malAugabe(10, 10);
		System.out.println("Das Product ist " + product);
		
		//int[] tableau  = new int[7];

	}

	public static double malAugabe(double zahl1, double zahl2) throws ArithmeticException{
		double product = 0;
		try {
			if (zahl1 > 0 && zahl2 > 0) {
				product = zahl1 * zahl2;
			} else {
				throw new ArithmeticException("Zahl ist ungültig");
			}

		} catch (Exception e) {
			e.getMessage();
		}

		return product;

	}

}
