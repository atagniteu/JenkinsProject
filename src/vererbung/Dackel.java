package vererbung;

import klassen.Hund;

import interfaces.Verkaeuflich;

public class Dackel extends Hund implements Verkaeuflich{
	private double preis;
	

	public Dackel(double preis) {
		super();
		this.preis = preis;
	}


	@Override
	public double getPreis() {
		return preis;
	}


	@Override
	public String hallo() {
		// TODO Auto-generated method stub
		return "Wao Wao Wao ";
	}


	@Override
	public void essen() {
		System.out.println("Der Dakel iss leiber Nudel");;
	}
	
	

}
