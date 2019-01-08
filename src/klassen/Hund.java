package klassen;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Hund extends Object {
	private String name;

	public Hund() {
		super();
	}

	public void essen() {
		System.out.println("alle Hunde essen Fleich");
	}

	

}