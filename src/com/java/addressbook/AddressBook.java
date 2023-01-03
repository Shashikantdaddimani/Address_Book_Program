package com.java.addressbook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * imports the scanner class of the java.util package
 */
import java.util.*;

/**
 * Class to create AddressBook with different methods
 */
public class AddressBook {
	/*
	 * It represents a single diary where contact has been stored
	 */
	BookList bookList = new BookList();

	void addContact(File file) throws IOException {

		ContactPerson contact = new ContactPerson();
		contact.addContact();
		String contactDetails = contact.toString();
		Scanner input = new Scanner(file);
		StringBuffer stringBuffer = new StringBuffer();
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
		while (input.hasNext()) {
			System.out.println(1);
			stringBuffer.append(input.nextLine());
			stringBuffer.append("\n");
		}
		boolean duplicateContact = bookList.duplicateContact(file, contact.firstName);
		if (duplicateContact == true) {
			System.out.println("It is a duplicate contact.");
			bufferedWriter.close();
			return;
		} else {
			stringBuffer.append(contactDetails + "\n");
			bufferedWriter.write(stringBuffer.toString());
			bufferedWriter.flush();
			bufferedWriter.close();
			System.out.println("Contact added successfully");
		}

	}

	void deletePerson(String name, String bookName) throws IOException {
		File file = new File(
				"C:\\Users\\Rajani daddimani\\Desktop\\java practiced problem\\Day9-Address_Book_Program\\src"
						+ bookName + ".txt");
		bookList.deleteContact(file, name);
	}

	void editPerson(String name, String bookName) throws IOException {
		File file = new File(
				"C:\\Users\\Rajani daddimani\\Desktop\\java practiced problem\\Day9-Address_Book_Program\\src" + name
						+ ".txt");
		bookList.updateContact(file, bookName);
	}

	boolean viewSortedResult(int option, String bookName) throws IOException {
		File file = new File(
				"C:\\Users\\Rajani daddimani\\Desktop\\java practiced problem\\Day9-Address_Book_Program\\src"
						+ bookName + ".txt");
		return bookList.viewSortedResult(file, option);
	}

	public static void main(String[] args) throws IOException {
		BookList Book = new BookList();
		System.out.println("Welcome to Address Book Program ");
		while (true) {
			AddressBook addressBook = new AddressBook();
			Scanner scanner1 = new Scanner(System.in);
			System.out.println(
					"Enter the name of Book you want to  access or add  or type 'city' to search persons by city or type 'state' to search by state or press 'q' to quit");
			String bookName = scanner1.nextLine();
			if (bookName.equals("q")) {
				/*
				 *  if (addressBook.list.size() > 0) { book.addBook(bookName, addressBook);}				 
				 */
				System.out.println("The program is closed");
				break;
			} else if (bookName.equals("city")) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the name of city  :");
				String placeName = scanner.nextLine();
				Book.showPersonsByCity(placeName);
				continue;
			} else if (bookName.equals("state")) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the name of state  :");
				String placeName = scanner.nextLine();
				Book.showPersonsByState(placeName);
				continue;
			}
			/*
			 *  (It can return 0 or 1)It will return 1 if book exist b and breakdown loop
			 */
			int result = Book.checkBook(bookName);
			int condition = 0;// It will keep check on the addressbook created or not
			File file = new File(
					"C:\\Users\\Rajani daddimani\\Desktop\\java practiced problem\\Day9-Address_Book_Program\\src\\com\\java"
							+ bookName + ".txt");
			while (true) {
				if (result == 1) {
					break;
				}
				System.out.println(
						"Do you want to add/edit/delete/  the contacts (0/1/2) :Press 3 to Go back to main menu : Press 4 to sort contact");
				Scanner scanner = new Scanner(System.in);
				int input = scanner.nextInt();

				if (input == 0) {
					addressBook.addContact(file);

				} else if (input == 1) {
					Scanner scanner2 = new Scanner(System.in);
					System.out.println("Enter the first name of person you want to edit ");
					String name = scanner2.nextLine();
					addressBook.editPerson(name, bookName);

				} else if (input == 2) {
					Scanner scanner2 = new Scanner(System.in);
					System.out.println("Enter the first name of the person you want to delete : ");
					String name = scanner2.nextLine();
					addressBook.deletePerson(name, bookName);
				}

				else if (input == 3) {
					break;
				} else if (input == 4) {
					Scanner scanner3 = new Scanner(System.in);
					boolean value = true;
					while (value) {
						System.out.println(
								"Press \n 0 to sort by contact name \n 1 to sort by city \n 2 to sort by state \n 3 to sort by zip");
						int response = scanner3.nextInt();
						value = addressBook.viewSortedResult(response, bookName);
					}

				} else {
					System.out.println("Enter the valid command");
				}
			}
		}

	}
}
