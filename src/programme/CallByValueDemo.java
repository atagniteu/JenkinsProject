package programme;

import klassen.Auto;

public class CallByValueDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		doStuff(a);
		
		System.out.println("die Werte von a wird übernommen " + a);  
		
		Auto auto1 = new Auto(120, "jjjjj");
		auto1 = doAuto(auto1);
		System.out.println("die Werte von a wird übernommen " + auto1.getLeistung());
		 
		doAutoStuff(auto1);
		System.out.println("die Werte von a auto1 übernommen " + auto1.getLeistung());

	}
	
	static void doStuff(int i){
		i *= 2;
		System.out.println("Die Ausgabe wird nicht übernommen: " + i);
	}
	static Auto doAuto(Auto auto){
		auto = new Auto(100, "BME");
		return auto;
		
	}
	static void doAutoStuff(Auto auto){
		auto.tuned(200);		
	}
}
