package backuputil;

import java.io.BufferedReader;
import java.io.FileNotFoundException; 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException; 

public class AddFieldsCSV {

	public static void main(String[] args) {

		AddFieldsCSV afc = new AddFieldsCSV(); 
		afc.run();

	}

	public void run() {

		String csvFile = "D:/GIT/SRINI/supportfiles/ADDF.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		int sum = 0;
		String a1 = ""; 

		try {
			br = new BufferedReader(new FileReader(csvFile));

			String csvFile2 = "D:/GIT/SRINI/supportfiles/ADDO.csv";
			
			FileWriter writer = new FileWriter(csvFile2);
				while ((line = br.readLine()) != null) {

				String[] str = line.split(cvsSplitBy);
				int[] numbers = new int[str.length];
				for (int i = 0; i < str.length; i++) { 
					try {
						numbers[i] = Integer.parseInt(str[i]);
					}

					catch (NumberFormatException nfe) {
						System.out.println(nfe); 
					}
				}
  			   
				for (int j = 0; j < numbers.length; j++) {

					sum = sum + numbers[j];

					a1 = Integer.toString(numbers[j]);
					writer.append(a1);

					writer.append(',');
				}

				String sum1 = Integer.toString(sum);
			writer.append(sum1);
				
			    writer.append('\n');
				

				System.out.println("Add of " + numbers[0] + "," + numbers[1] + "Result=" + sum);

			}
			
			writer.flush();
			writer.close();
			
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
