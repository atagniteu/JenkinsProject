package programme;

import klassen.Laptop;
import vererbung.MacBook;

public class LaptopProgram {

	public static void main(String[] args) {
		Laptop laptop = new Laptop(500, "Lenovo", 800, "INtel Processor");
		System.out.println(laptop.toString() + " und die Frabe ist:  " + laptop.getFarbe());

		// laptop.klassemethode(); kann man auch so schreiben
		Laptop.klassemethode();

		Laptop macBook = new MacBook(500, "Apel", 1500, "Apel Cpu", true);
		String string = macBook.toString();
		System.out.println(string);
		macBook.starten();

	}

}
