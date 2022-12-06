package com.java.addressbook;

/**
 * imports the scanner class of the java.util package
 */
import java.util.Scanner;

public class AddressBookMain {
	/**
	 * program execution starts from main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the AddressBook program");
		/*
		 * Declaring the object
		 */
		AddressBook adrressbook = new AddressBook();
		/*
		 * Taking user input using Scanner object
		 */
		Scanner input = new Scanner(System.in);
		int flag = 1;
		while (flag == 1) {
			System.out.println(" Welcome to address book program ");
			System.out.println(" Select a choice : 1. Add 2.Edit  3. Delete 4. Exit");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				adrressbook.addContact();
				break;
			case 2:
				if (adrressbook.contactsArrayList.isEmpty()) {
					System.out.println(" Address book is empty ");
					break;
				}
				adrressbook.editContact();
				break;
			case 3:
				if (adrressbook.contactsArrayList.isEmpty()) {
					System.out.println(" Address book is empty ");
					break;
				}
				adrressbook.deleteContact();
			case 4:
				flag = 0;
				break;

			default:
				System.out.println(" Enter a valid choice");
				break;
			}
		}
		System.out.println(adrressbook.contactsArrayList);

	}

}
