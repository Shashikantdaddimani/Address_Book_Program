package com.java.addressbook;

/**
 * imports the scanner class of the java.util package
 */
import java.util.ArrayList;
import java.util.Scanner;

//import com.addressbook.program.ContactPerson;

public class AddressBook {
	Scanner input = new Scanner(System.in);

	ContactPerson contactperson = new ContactPerson();
	ArrayList<ContactPerson> contactsArrayList = new ArrayList<ContactPerson>();

	/*
	 * Method to add contact details
	 */
	public void addContact() {
		ContactPerson contactperson = new ContactPerson();

		System.out.println("Enter FirstName");
		contactperson.setFirstName(input.next());
		System.out.println("Enter LastName");
		contactperson.setLastname(input.next());
		System.out.println("Enter Address");
		contactperson.setAddress(input.next());
		System.out.println("Enter City");
		contactperson.setCity(input.next());
		System.out.println("Enter State");
		contactperson.setState(input.next());
		System.out.println("Enter Email Id");
		contactperson.setEmailId(input.next());
		System.out.println("Enter Zip");
		contactperson.setZip(input.nextInt());
		System.out.println("Enter Mobile Number");
		contactperson.setMobileNumber(input.nextLong());

		contactsArrayList.add(contactperson);
	}

	/*
	 * method to show the contact details
	 */
	public void showContct() {
		System.out.println(contactperson.toString());
		for (int i = 0; i < contactsArrayList.size(); i++) {
			ContactPerson contacts = contactsArrayList.get(i);
			System.out.println(contacts.toString());
		}
	}

	/*
	 * method to edit the contact details
	 */
	public void editContact() {

		System.out.println("Enter the First Name to Edit : ");
		String FirstName = (input.next());
		boolean IsAvaible = false;

		for (ContactPerson contact : contactsArrayList) {
			if (contact.getFirstName().equals(FirstName)) {
				IsAvaible = true;

				System.out.println("Enter FirstName");
				contactperson.setFirstName(input.next());
				System.out.println("Enter LastName");
				contactperson.setLastname(input.next());
				System.out.println("Enter Address");
				contactperson.setAddress(input.next());
				System.out.println("Enter City");
				contactperson.setCity(input.next());
				System.out.println("Enter State");
				contactperson.setState(input.next());
				System.out.println("Enter Email Id");
				contactperson.setEmailId(input.next());
				System.out.println("Enter Zip");
				contactperson.setZip(input.nextInt());
				System.out.println("Enter Mobile Number");
				contactperson.setMobileNumber(input.nextLong());
			}

		}
		if (IsAvaible == false) {
			System.out.println("Contact Doesn't exist.");
		}
	}

}