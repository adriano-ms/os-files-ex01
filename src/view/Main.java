package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {

		File file = new File("c:\\temp\\generic_food.csv");
		
		try {
			if (!file.exists()) {
				throw new Exception("File doesn't exist!");
			}
			BufferedReader reader = new BufferedReader(new FileReader(file));
			StringBuilder sb = new StringBuilder();
			reader.readLine();
			String line = reader.readLine();
			while (line != null) {
				String[] l = line.split(",");
				if(l[2].equals("Fruits")) {
					sb.append(l[0] + "\t");
					sb.append(l[1] + "\t");
					sb.append(l[3] + "\n");
				}
				line = reader.readLine();
			}
			System.out.println(sb);
			reader.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
