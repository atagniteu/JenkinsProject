package klassen;

public class Kunde {
	private String vorname, nachname;
	private static int idCounter = 1;
	private final int id;
	private static int anzahlKunde;
	{
		id = idCounter;
		idCounter = id + idCounter;
	}

	public Kunde(String vorname, String nachname) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		anzahlKunde ++;
	}
	
	public static void gibInfo(){
		System.out.println("Es würde " + anzahlKunde + " Kunden angelegt");
	}
	
	public String getVorname() {
		return vorname;
	}
	
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
	public int getId() {
		return id;
	}

	public static void toString(Kunde kunde) {
		System.out.println(kunde.getId() + " " + kunde.getNachname() + " " + kunde.getVorname());
	}	
	
}
