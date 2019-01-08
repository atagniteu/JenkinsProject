package programme;

import klassen.Computer;
import klassen.Mainboard;

public class ComputerProg {
	
	public static void main(String[] args) {
		Mainboard mainboard = new Mainboard(500, 3, 2);
		Computer computer = new Computer("INtel Celeros", mainboard, 1200);
		String string = computer.toString();
		System.out.println(string);
		System.out.println("---------KarteSlot-------------");
		System.out.println(computer.getMainboard().getKarteSlot());
		
		Computer computer2 = new Computer(650, 8, 3, "Inter i5", 450);
		System.out.println("---------tostring()-------------");
		
		System.out.println(computer2.toString());
	}

}
