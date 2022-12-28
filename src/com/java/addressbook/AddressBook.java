package com.java.addressbook;

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
	ArrayList<ContactPerson> list = new ArrayList<ContactPerson>();// It represents a single diary where contact has been stored
	String bookName; // It represent the name of diary

	void addContact() {
		ContactPerson contact = new ContactPerson();
		contact.addContact();
		boolean duplicateContact = list.stream().anyMatch(x -> x.firstName.equals(contact.firstName));
		if (duplicateContact == true) {
			System.out.println("It is a duplicate contact.");
			return;
		} else {
			list.add(contact);
			System.out.println("Contact added successfully");
		}

	}

	void deletePerson(String name, ArrayList<ContactPerson> list) {
		if (list.size() == 0) {
			System.out.println("Address book is empty.Please Add First");
		} else {
			int temp = 0;
			for (int i = list.size() - 1; i >= 0; --i) {
				if (list.get(i).firstName.contains(name)) {
					list.remove(i);
					System.out.println("Contact deleted successfully");
					temp += 1;
					break;
				}
			}
			if (temp == 0) {
				System.out.println("No contact with the given name exist");
			}
		}

	}

	void editPerson(String name, ArrayList<ContactPerson> list) {
		if (list.size() == 0) {
			System.out.println("Addressbook is empty.Please add First");
		} else {
			int temp = 0;
			for (int i = list.size() - 1; i >= 0; --i) {
				if (list.get(i).firstName.contains(name)) {
					list.get(i).addContact();
					System.out.println("Contact Updated successfully");
					temp += 1;
					break;
				}
			}
			if (temp == 0) {
				System.out.println("No contact with the given name exist");
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Address Book Program ");

		BookList book = new BookList();

		while (true) {
			AddressBook addressBook = new AddressBook();
			Scanner scan3 = new Scanner(System.in);
			System.out.println(
					"Enter the name of Book you want to  access or add  or type 'city' to search persons by city or type 'state' to search by state or press 'q' to quit");
			String bookName = scan3.nextLine();
			if (bookName.equals("q")) {
				/*
				 * if (addressBook.list.size() > 0) { book.addBook(bookName, addressBook); }
				 */
				System.out.println("The program is closed");
				break;
			} else if (bookName.equals("city")) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the name of city  :");
				String placeName = scanner.nextLine();
				book.showPersonsByCity(placeName);
				continue;
			} else if (bookName.equals("state")) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the name of state  :");
				String placeName = scanner.nextLine();
				book.showPersonsByState(placeName);
				continue;
			}
			/*
			 * (It can return 0 or 1)It will return 1 if book exist b and breakdown loop
			 */
			int result = book.checkBook(bookName);
			/*
			 * It will keep check on the addressbook created or not
			 */
			int condition = 0;
			while (true) {
				if (result == 1) {
					break;
				}
				System.out.println(
						"Do you want to add/edit/delete/  the contacts (0/1/2) :Press 4 to see the sorted contacts Press 3 to Go back to main menu");
				Scanner scanner = new Scanner(System.in);
				int input = scanner.nextInt();

				if (input == 0) {
					addressBook.addContact();

				} else if (input == 1) {
					Scanner scanner1 = new Scanner(System.in);
					System.out.println("Enter the first name of person you to edit ");
					String name = scanner1.nextLine();
					addressBook.editPerson(name, addressBook.list);

				} else if (input == 2) {
					Scanner scanner2 = new Scanner(System.in);
					System.out.println("Enter the first name of the person you want to delete : ");
					String name = scanner2.nextLine();
					addressBook.deletePerson(name, addressBook.list);
				}

				else if (input == 3) {
					book.addBook(bookName, addressBook);
					break;
				} else if (input == 4) {
					addressBook.list.sort((ContactPerson x1, ContactPerson x2) -> x1.firstName.compareTo(x2.firstName));
					addressBook.list.forEach((s) -> System.out.println(s));
				}

				else {
					System.out.println("Enter the valid command");
				}
			}
		}

	}

}