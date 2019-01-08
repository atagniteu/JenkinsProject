package klassen;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Reifen {
	private String reifenMarken;
	private String reifenTyp;
	@Override
	public String toString() {
		return "Reifen [reifenMarken=" + reifenMarken + ", reifenTyp=" + reifenTyp + "]";
	}
	
	
	

}
