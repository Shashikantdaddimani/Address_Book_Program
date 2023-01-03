package com.java.addressbook;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BookList {

	void addInfo(ContactPerson value) {
		RegularExpression regex = new RegularExpression();
		System.out.println("Enter First Name :");
		value.firstName = regex.validFirstName();
		System.out.println("Enter Last Name :");
		value.lastName = regex.validLastName();
		System.out.println("Enter the address :");
		value.address = regex.validAddress();
		System.out.println("Enter city : ");
		value.city = regex.validCity();
		System.out.println("Enter state : ");
		value.state = regex.validState();
		System.out.println("Enter Phone Number : ");
		value.phoneNumber = regex.validMobileNumber();
		System.out.println("Enter Email : ");
		value.email = regex.valid_email();
		System.out.println("Enter zip : ");
		value.zip = regex.validZip();
	}

	void showPersonsByCity(String placeName) throws IOException {
		int count = 0;
		ArrayList<String> lines = new ArrayList<String>();
		File file = new File(
				"C:\\Users\\Rajani daddimani\\Desktop\\java practiced problem\\Day9-Address_Book_Program\\src\\com\\java");
		File[] directoryListing = file.listFiles();
		BufferedReader reader;
		if (directoryListing != null) {
			for (File child : directoryListing) {
				if (child.getName().matches("(.txt)$")) {
					reader = new BufferedReader(new FileReader(child));
					String line = reader.readLine();
					while (line != null) {
						lines.add(line);
						line = reader.readLine();
					}
				}
			}
			List<String> matchedContact = lines.stream().filter(x -> x.split(",")[3].equals(placeName))
					.collect(Collectors.toList());
			System.out.println("The number of persons are " + matchedContact.size());
			matchedContact.stream().forEach(x -> System.out.println(x.split(",")[0]));

		} else {
			System.out.println("Booklist is empty");
		}

	}

	void showPersonsByState(String placeName) throws IOException {
		int count = 0;
		ArrayList<String> lines = new ArrayList<String>();
		File file = new File(
				"C:\\Users\\Rajani daddimani\\Desktop\\java practiced problem\\Day9-Address_Book_Program\\src");
		File[] directoryListing = file.listFiles();
		BufferedReader reader;
		if (directoryListing != null) {
			for (File child : directoryListing) {
				if (child.getName().matches("(.txt)$")) {
					reader = new BufferedReader(new FileReader(child));
					String line = reader.readLine();
					while (line != null) {
						lines.add(line);
						line = reader.readLine();
					}
				}
			}
			List<String> matchedContact = lines.stream().filter(x -> x.split(",")[4].equals(placeName))
					.collect(Collectors.toList());
			System.out.println("The number of persons are " + matchedContact.size());
			matchedContact.stream().forEach(x -> System.out.println(x.split(",")[0]));

		} else {
			System.out.println("Booklist is empty");
		}
	}

	boolean duplicateContact(File file, String firstName) {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(file));
			String line = reader.readLine();
			while (line != null) {
				if (line.split(",")[0].equals(firstName)) {
					reader.close();
					return true;
				}
				line = reader.readLine();
			}
		} catch (IOException e) {
			// e.printStackTrace();
		}
		return false;
	}

	void updateContact(File file, String firstName) throws IOException {
		Scanner scanner = new Scanner(file);
		StringBuffer buffer = new StringBuffer();
		while (scanner.hasNextLine()) {
			buffer.append(scanner.nextLine() + System.lineSeparator());
		}
		String fileContents = buffer.toString();
		scanner.close();
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = reader.readLine();
		while (line != null) {
			if (line.split(",")[0].equals(firstName)) {
				ContactPerson contact = new ContactPerson();
				contact.addContact();
				String oldLine = line;
				String newLine = contact.toString();
				fileContents = fileContents.replaceAll(oldLine, newLine);
				FileWriter writer = new FileWriter(file);
				writer.append(fileContents);
				writer.flush();
				writer.close();
				System.out.println("Contact Updated successfully");
				return;
			}
			line = reader.readLine();
		}
		System.out.println("Contact doesn't exist with the given name " + firstName);

	}

	void deleteContact(File file, String firstName) throws IOException {
		Scanner scanner = new Scanner(file);
		StringBuffer buffer = new StringBuffer();
		int track = 0;
		while (scanner.hasNextLine()) {
			if (scanner.nextLine().split(",")[0].equals(firstName)) {
				track = 1;
				continue;
			}
			buffer.append(scanner.nextLine() + System.lineSeparator());
		}
		if (track == 1) {
			String fileContents = buffer.toString();
			scanner.close();
			FileWriter writer = new FileWriter(file);
			writer.append(fileContents);
			writer.flush();
			writer.close();
			System.out.println("Contact deleted successfully");
		} else {
			System.out.println("No contact found with the given name");
			return;
		}
	}

	boolean viewSortedResult(File file, int sortingChoice) throws IOException {
		ArrayList<String> lines = new ArrayList<String>();
		BufferedReader reader;
		reader = new BufferedReader(new FileReader(file));
		String line = reader.readLine();
		boolean value = false;
		while (line != null) {
			lines.add(line);
			line = reader.readLine();
		}
		reader.close();
		switch (sortingChoice) {
		case 0:
			lines.sort((String x, String y) -> x.split(",")[0].compareTo(y.split(",")[0]));
			lines.forEach((s) -> System.out.println(s));
			break;
		case 1:
			lines.sort((String x, String y) -> x.split(",")[3].compareTo(y.split(",")[3]));
			lines.forEach((s) -> System.out.println(s));
			break;
		case 2:
			lines.sort((String x, String y) -> x.split(",")[4].compareTo(y.split(",")[4]));
			lines.forEach((s) -> System.out.println(s));
			break;
		case 3:
			lines.sort((String x, String y) -> x.split(",")[7].compareTo(y.split(",")[7]));
			lines.forEach((s) -> System.out.println(s));
			break;
		default:
			System.out.println("Enter valid command");
			value = true;
			break;
		}
		return value;
	}

	void operations(File file) throws IOException {

		Scanner input = new Scanner(System.in);
		int condition1 = 0;// This is for checking the contact name exist or not
		int condition = 0; // This is condition for running while loop
		while (condition == 0) {
			System.out.println(
					"Do you want to add/edit/delete contact (0/1/2) :Press 3 to go back to main menu: Press 4 to sort contact");
			int response = input.nextInt();
			switch (response) {
			case 0:
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
				PrintWriter printWriter = new PrintWriter(bufferedWriter);
				ContactPerson contact = new ContactPerson();
				contact.addContact();
				String contactDetails = contact.toString();
				System.out.println(contactDetails);
				boolean duplicateContact = duplicateContact(file, contact.firstName);
				if (duplicateContact == true) {
					System.out.println("It is a duplicate contact.");

				} else {
					printWriter.println(contactDetails);
					printWriter.close();
				}
				break;
			case 1:
				System.out.println("Enter the first name of person you want to edit :");
				Scanner scanner1 = new Scanner(System.in);
				String name1 = scanner1.nextLine();
				updateContact(file, name1);
				break;
			case 2:
				System.out.println("Enter the first name of person you want to delete :");
				Scanner scanner2 = new Scanner(System.in);
				String name2 = scanner2.nextLine();
				deleteContact(file, name2);
				break;
			case 3:
				condition = 1;
				break;

			case 4:
				Scanner scanner3 = new Scanner(System.in);
				boolean value = true;
				while (value) {
					System.out.println(
							"Press \n 0 to sort by contact name \n 1 to sort by city \n 2 to sort by state \n 3 to sort by zip");
					int response1 = scanner3.nextInt();
					value = viewSortedResult(file, response1);
				}
			default:
				System.out.println("Enter valid command");
				break;
			}
		}
	}

	int checkBook(String name) throws IOException {
		int result = 0;
		int track = 0;
		File file = new File(
				"C:\\Users\\Rajani daddimani\\Desktop\\java practiced problem\\Day9-Address_Book_Program\\src" + name
						+ ".txt");
		if (!file.exists()) {
			System.out.println("Booklist was empty. " + name + " is created.");
			file.createNewFile();
		} else {

			System.out.println("Book exist please go ahead");
			operations(file);
			track = 1;
			result = 1;

		}
		return result;
	}
}
