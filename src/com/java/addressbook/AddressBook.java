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
	ArrayList<ContactPerson> list = new ArrayList<ContactPerson>();
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
			int temp1 = 0;
			for (int i = list.size() - 1; i >= 0; --i) {
				if (list.get(i).firstName.contains(name)) {
					list.remove(i);
					System.out.println("Contact deleted successfully");
					temp1 += 1;
					break;
				}
			}
			if (temp1 == 0) {
				System.out.println("No contact with the given name exist");
			}
		}

	}

	void editPerson(String name, ArrayList<ContactPerson> list) {
		if (list.size() == 0) {
			System.out.println("Addressbook is empty.Please add First");
		} else {
			int temp1 = 0;
			for (int i = list.size() - 1; i >= 0; --i) {
				if (list.get(i).firstName.contains(name)) {
					list.get(i).addContact();
					System.out.println("Contact Updated successfully");
					temp1 += 1;
					break;
				}
			}
			if (temp1 == 0) {
				System.out.println("No contact with the given name exist");
			}
		}

	}

	public int sort(int option, AddressBook addressBook) {
		int temp = 0;
		switch (option) {
		case 0:
			addressBook.list.sort((ContactPerson x1, ContactPerson x2) -> x1.firstName.compareTo(x2.firstName));
			addressBook.list.forEach((s) -> System.out.println(s));
			break;

		case 1:
			addressBook.list.sort((ContactPerson x1, ContactPerson x2) -> x1.city.compareTo(x2.city));
			addressBook.list.forEach((s) -> System.out.println(s));
			break;
		case 2:
			addressBook.list.sort((ContactPerson x1, ContactPerson x2) -> x1.state.compareTo(x2.state));
			addressBook.list.forEach((s) -> System.out.println(s));
			break;
		case 3:
			addressBook.list.sort((ContactPerson x1, ContactPerson x2) -> x1.zip.compareTo(x2.zip));
			addressBook.list.forEach((s) -> System.out.println(s));
			break;
		default:
			System.out.println("Enter valid option");
			temp = 1;
			break;
		}
		return temp;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program ");

		BookList Book = new BookList();

		while (true) {
			AddressBook addressBook = new AddressBook();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the name of Book you want to  access or add  or "
					+ "type 'city' to search persons by city or type 'state' to search by state or press 'q' to quit");
			String bookName = scanner.nextLine();
			if (bookName.equals("q")) {
				/*
				 * if (addressBook.list.size() > 0) { book.addBook(bookName, addressBook);}
				 */
				System.out.println("The program is closed");
				break;
			} else if (bookName.equals("city")) {
				Scanner scanner1 = new Scanner(System.in);
				System.out.println("Enter the name of city  :");
				String placeName = scanner1.nextLine();
				Book.showPersonsByCity(placeName);
				continue;
			} else if (bookName.equals("state")) {
				Scanner scanner1 = new Scanner(System.in);
				System.out.println("Enter the name of state  :");
				String placeName = scanner1.nextLine();
				Book.showPersonsByState(placeName);
				continue;
			}
			/*
			 * (It can return 0 or 1)It will return 1 if book exist b and break down loop
			 */
			int result = Book.checkBook(bookName);
			
			int condition = 0;// It will keep check on the addressbook created or not
			while (true) {
				if (result == 1) {
					break;
				}
				System.out.println(
						"Do you want to add/edit/delete/  the contacts (0/1/2) :Press 3 to Go back to main menu : Press 4 to sort contact");
				Scanner scanner1 = new Scanner(System.in);
				int input = scanner1.nextInt();

				if (input == 0) {
					addressBook.addContact();

				} else if (input == 1) {
					Scanner scanner2 = new Scanner(System.in);
					System.out.println("Enter the first name of person you to edit ");
					String name = scanner2.nextLine();
					addressBook.editPerson(name, addressBook.list);

				} else if (input == 2) {
					Scanner scanner3 = new Scanner(System.in);
					System.out.println("Enter the first name of the person you want to delete : ");
					String name = scanner3.nextLine();
					addressBook.deletePerson(name, addressBook.list);
				}

				else if (input == 3) {
					Book.addBook(bookName, addressBook);
					break;
				} else if (input == 4) {
					Scanner scanner4 = new Scanner(System.in);
					while (true) {
						System.out.println(
								"Press \n 0 to sort by contact name \n 1 to sort by city \n 2 to sort by state \n 3 to sort by zip");
						int response = scanner4.nextInt();
						int temp = addressBook.sort(response, addressBook);
						if (temp == 0) {
							break;
						}
					}

				}

				else {
					System.out.println("Enter the valid command");
				}
			}
		}

	}

}