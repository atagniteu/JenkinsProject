package klassen;

import java.util.Scanner;

public class GoogelKonto {
	private String userName;
	private String passwort;

	public GoogelKonto(String userName, String passwort) {
		super();
		this.userName = userName;
		this.passwort = passwort;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		if (passwort.equals(this.passwort)) {
			System.out.println("Passwort würde nicht geändert.  " + this.passwort + " = " + passwort
					+ ". Bitte gibt neuer Password ein! ");
			Scanner scanner = new Scanner(System.in);
			String newPassword = scanner.next();
			scanner.close();
			if (!newPassword.equals(this.passwort)) {
				this.passwort = newPassword;
				System.out.println("Das neue Password ist: " + this.passwort);		
			} else {
				System.out.println("password ist gleich");
			}
			
		} else {
			System.out.println("password falsch kann verändert werden");
		}
		this.passwort = passwort;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Password von " + userName + " ist: " + passwort;
	}

}
