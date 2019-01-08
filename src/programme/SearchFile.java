package programme;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

import exceptions.CheckedException;

public class SearchFile {
	public static void main(String[] args) throws IOException {

	
		String pfad = "C:/emoji.txt";
		File file = new File(pfad);
		
		try {
			file.createNewFile();
			if(!file.exists()) {
				throw new FileAlreadyExistsException("File already exist");
			}
			
		} catch (Exception e) {
		}

	}

	static void dateiAnlegen(String pfad) throws CheckedException {
		boolean isDateiExist = true;
		if (isDateiExist) {
			throw new CheckedException("Datei existiert noch");
		}

	}
}
