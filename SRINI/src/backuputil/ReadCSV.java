package backuputil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {

	public static void main(String[] args) {

		ReadCSV obj = new ReadCSV();
		obj.run();

	}

	public void run() {

		String csvFile = "D:/GIT/SRINI/supportfiles/TEST.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		try {

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] ErrorReport = line.split(cvsSplitBy);

				if (ErrorReport[4].contentEquals("Application") && ErrorReport[5].contentEquals("Function") ) {   
					continue;      
				}

				System.out.println("Pivot [Application= " + ErrorReport[4] + " , Function=" + ErrorReport[5] + "]");
			}

		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("Done");
	}

}