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
	 * Taking user input using Scanner object
	 */
	static Scanner input = new Scanner(System.in);
	static ArrayList<ContactPerson> adressBook = new ArrayList<ContactPerson>();
	static ContactPerson addressBoook = new ContactPerson();

	/*
	 * Method Nmae
	 */
	public void addContactPersonDetails() {
		ContactPerson details = new ContactPerson();

		System.out.println("Enter a first name:");
		String firstName = input.next();
		details.setFirstName(input.next());
		System.out.println("Enter a last name:");
		String lastName = input.next();
		details.setLastName(input.next());
		System.out.println("Enter a Address:");
		String address = input.next();
		details.setAddress(input.next());
		System.out.println("Enter a City name:");
		String city = input.next();
		details.setCity(input.next());
		System.out.println("Enter a state:");
		String state = input.next();
		details.setState(input.next());
		System.out.println("Enter a email:");
		String email = input.next();
		details.setEmail(input.next());
		System.out.println("Enter a zip code:");
		String zip = input.next();
		details.setZipCode(input.next());
		System.out.println("Enter a phone number:");
		String phoneNumber = input.next();
		details.setMobileNumber(input.next());

		adressBook.add(details);
		ContactPerson details1 = new ContactPerson(firstName, lastName, address, city, state, email, zip, phoneNumber);
		adressBook.add(details1);
		System.out.print(adressBook);
		System.out.println("succesfully added person new ContactPersons");
	}

	/*
	 * Edit ContactPerson Deatils method using SwitchCase
	 */
	public void editContactPersonDetails() {
		System.out.println("enter a name for edit:");
		String editName = input.next();
		for (int i = 0; i < adressBook.size(); i++) {
			if (adressBook.get(i).getFirstName().equals(editName)) {
				System.out.println("select options");
				System.out.println(
						"\n1.First Name\n2.Last Name\n3.Address\n4.City\n5.State\n6.Zip\n7.Phone Number\n8.Email");
				int editOption = input.nextInt();

				switch (editOption) {
				case 1:
					System.out.println("enter 1 for add firstName");
					System.out.println("Enter a First name:");
					String editFirstName = input.next();
					adressBook.get(i).setFirstName(editFirstName);
					System.out.println(editFirstName);
					break;
				case 2:
					System.out.println("enter 2 for add LastName");
					System.out.print("Enter a Last name:");
					adressBook.get(i).setLastName(input.next());
					break;
				case 3:
					System.out.print("Enter a Address:");
					adressBook.get(i).setAddress(input.next());
					break;
				case 4:
					System.out.print("Enter a city:");
					adressBook.get(i).setCity(input.next());
					break;
				case 5:
					System.out.print("Enter a state:");
					adressBook.get(i).setState(input.next());
					break;
				case 6:
					System.out.print("Enter a zip code:");
					adressBook.get(i).setZipCode(input.next());
					break;
				case 7:
					System.out.print("Enter a phone number:");
					adressBook.get(i).setMobileNumber(input.next());
					break;
				case 8:
					System.out.print("Enter a email:");
					adressBook.get(i).setEmail(input.next());
					break;
				default:
					System.out.println("enter valid ContactPerson");
				}
			}
			System.out.println("Edited list is:");
			System.out.println(adressBook);
		}
	}

	/*
	 * Delete ContactPerson Method for person address book
	 */
	public void deleteContactPerson() {
		System.out.println("confirm the name to delete ContactPerson");
		String confirmName = input.next();
		for (int i = 0; i < adressBook.size(); i++) {
			if (adressBook.get(i).getFirstName().equalsIgnoreCase(confirmName))
				;
			ContactPerson person = adressBook.get(i);
			adressBook.remove(person);
		}
		System.out.println(adressBook);
	}

	/*
	 * Method Name:Disply(); logic for Display the address book
	 */
	public void display() {
		for (int i = 0; i < adressBook.size(); i++) {
			ContactPerson person = adressBook.get(i);
			System.out.println("FirstName" + ":=" + person.getFirstName() + "\n" + "lastname" + ":= "
					+ person.getLastName() + "\n" + "Address" + ":= " + person.getAddress() + "\n" + "City" + ":= "
					+ person.getCity() + "\n" + "State" + ":=" + person.getState() + "\n" + "Zip" + ":= "
					+ person.getZipCode() + "\n" + "PhoneNumber" + ":= " + person.getMobileNumber() + "\n" + "Email"
					+ ":= " + person.getEmail());
		}
	}

}