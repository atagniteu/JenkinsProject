package programme;

public class SwitchDemo {

	/**
	 * @param args
	 */
	public static final String JANUAR = "januar";
	public static final String APRIL = "april";
	public static final String JULY = "august";
	public static final String OKTOBER = "oktober";
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jahresZeit = "jAnuar";
		String statusAusgabe = null;
		
		switch (jahresZeit.toLowerCase()) {
		case JANUAR:
			statusAusgabe = "Wir sind im Winter." ;
			break;
		case APRIL:
			statusAusgabe = "Wir sind im Frühling.";
			break;
		case JULY:
			statusAusgabe = "Wir sind im Sommer.";
			break;
		case OKTOBER:
			statusAusgabe = "Wir sind im Herbst.";

		default:
				statusAusgabe = "Keine gültige Jahres Zeiten.";
		
			break;
		}

		System.out.println("Status des Kaufs: " + statusAusgabe);
		
		

	}

}
