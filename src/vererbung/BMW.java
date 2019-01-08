package vererbung;

import klassen.Voiture;

public class BMW extends Voiture{

	

	@Override
	public boolean canBremsen() {
		// TODO Auto-generated method stub
		return super.canBremsen();
	}

	public BMW() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BMW(double preise, int anzahlReife, int anzahlTuer) {
		super("BMW", 200, preise, anzahlReife, anzahlTuer);
		// TODO Auto-generated constructor stub
	}

	

}
