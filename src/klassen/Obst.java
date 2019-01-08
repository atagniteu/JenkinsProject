package klassen;

//final Klasse ist eine Klasse, die nicht abgeleitet werden kann
public final class Obst {
	private String bezeichnung;
	private int einkaufspreis; // in Euro
	private int verkaufspreis; // in Euro
	private int naehwert; // in kcal
	
		public Obst(String bezeichnung, int einkaufspreis, int naehwert) {
		super();
		this.bezeichnung = bezeichnung;
		this.einkaufspreis = einkaufspreis;
		this.verkaufspreis = einkaufspreis * 2 ;
		this.naehwert = naehwert;
	}
		
		public void obstAufpeppen(){
		naehwert = naehwert + 50;	
		verkaufspreis = verkaufspreis * 2 ;
		}

		public String getBezeichnung() {
			return bezeichnung;
		}

		public void setBezeichnung(String bezeichnung) {
			this.bezeichnung = bezeichnung;
		}

		public int getEinkaufspreis() {
			return einkaufspreis;
		}

		public void setEinkaufspreis(int einkaufspreis) {
			this.einkaufspreis = einkaufspreis;
		}

		public int getVerkaufspreis() {
			return verkaufspreis;
		}
		/*
		public void setVerkaufspreis(int verkaufspreis) {
			this.verkaufspreis = einkaufspreis * 2;
		}
		*/

		public int getNaehwert() {
			return naehwert;
		}

		public void setNaehwert(int naehwert) {
			this.naehwert = naehwert;
		}

		@Override
		public String toString() {
			return "Obst [bezeichnung=" + bezeichnung + ", einkaufspreis="
					+ einkaufspreis + ", verkaufspreis=" + verkaufspreis
					+ ", naehwert=" + naehwert + "]";
		}
		
		
		
		
	
}
