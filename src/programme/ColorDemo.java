package programme;

import java.awt.Color;

public class ColorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color gelb = new Color(252, 250, 0);
		Color gelb1 = Color.YELLOW;
		Color gelb2 = Color.yellow;
		System.out.println("Color Red: " + gelb.getRed() + "; color green: "
				+ gelb.getGreen() + "; color blue:  " + gelb.getBlue());
		gelb = gelb.darker();
		System.out.println(gelb.getRed() + " " + gelb.getGreen() + " "
				+ gelb.getBlue());
		System.out.println(gelb1.getRed() + " " + gelb1.getGreen() + " "
				+ gelb1.getBlue());
		System.out.println(gelb2.getRed() + " " + gelb2.getGreen() + " "
				+ gelb2.getBlue());

	}

}
