package klassen;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Mainboard {

	
	private int ramSlot;
	private int karteSlot;
	private int usbSlot;
	@Override
	public String toString() {
		return "Mainboard [ramSlot=" + ramSlot + ", karteSlot=" + karteSlot + ", usbSlot=" + usbSlot + "]";
	}
	
	
}
