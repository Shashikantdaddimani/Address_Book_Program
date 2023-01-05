package com.java.addressbook;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;


public class AddressBookFile {
	public void writeAddressBook() throws IOException {
		//System.out.println("Reading Data From CSV file");
		FileWriter outputfile = new FileWriter("C:\\Users\\Rajani daddimani\\Desktop\\java practiced problem\\Day9-Address_Book_Program\\src\\result.csv");

		// create CSVWriter object filewriter object as parameter
		CSVWriter writer = new CSVWriter(outputfile);

		// create a List which contains String array
		ArrayList<String[]> addrsBook = new ArrayList<String[]>();
		addrsBook.add(new String[] { "FirstName", "LastName", "City", "State", "Zip", "Email" });
		addrsBook.add(new String[] { "shashikant", "daddimani", "belagavi", "karnatak", "591309", "shashi0355daddi@gmail.com" });
		addrsBook.add(new String[] { "Aniket", "Pawar", "Pune", "Maharashtra", "413020", "pawaraniket@gmail.com" });
		addrsBook.add(new String[] { "Harsh", "Pukale", "Sangli", "Maarashtra", "445521", "harsh@gmail.com" });
		writer.writeAll(addrsBook);

		writer.writeAll(addrsBook);

//	         // closing writer connection
		writer.close();

	}

	public void readAddressBook() throws IOException, Exception {

		FileReader filereader = new FileReader("C:\\Users\\Rajani daddimani\\Desktop\\java practiced problem\\Day9-Address_Book_Program\\src\\result.csv");

		// create csvReader object and skip first Line
		CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
		List<String[]> allData = csvReader.readAll();

		// print Data
		for (String[] row : allData) {
			for (String cell : row) {
				System.out.print(cell + "\t");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) throws Exception {
		AddressBookFile obj = new AddressBookFile();
		obj.writeAddressBook();
		obj.readAddressBook();

	}
}
