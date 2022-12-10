package com.java.addressbook;
/**
 * imports the scanner class of the java.util package
 */
import java.util.*;
/**
 * Class to create AddressBookMain with different methods
 */
public class AddressBookMain {
	/*
	 * Taking user input using Scanner object
	 */
	static Scanner input = new Scanner(System.in);
	static ArrayList<ContactPerson> adressBook = new ArrayList<ContactPerson>();
	static ContactPerson addressBoook = new ContactPerson();

	public static void main(String[] args) {
		System.out.println("Welcome to the Address Book Problem");
		AddressBook addressBookList = new AddressBook();
		boolean condition = true;

		while (condition == true) {
			System.out.println("Enter a options" + "\n" + "1.Do you want to continue in existing addressbook" + "\n"
					+ "2.Create a new address book");
			int options = input.nextInt();
			switch (options) {
			case 1:
				boolean condition1 = true;
				while ((condition1) == true) {
					System.out.println(
							"1.add" + "\n" + "2.display" + "\n" + "3.edit" + "\n" + "4.delete" + "\n" + "5.exit");
					int option = input.nextInt();
					switch (option) {
					case 1:
						addressBookList.addContactPersonDetails();
						break;
					case 2:
						addressBookList.display();
						break;
					case 3:
						addressBookList.editContactPersonDetails();
						break;
					case 4:
						addressBookList.deleteContactPerson();
						break;
					case 5:
						condition1 = false;
						break;
					default:
						System.out.println("Invalid Input");
					}
				}
				break;
			case 2:
				HashMap<String, ArrayList<ContactPerson>> map = new HashMap<>();
				ArrayList<ContactPerson> arrayList = new ArrayList<>();
				ContactPerson addessBook1 = addressBoook;
				arrayList.add(addessBook1);
				map.put("Ram", arrayList);
				System.out.println(map);
				if (map.containsKey("Ram")) {
					ArrayList<ContactPerson> ram = map.get("Ram");
					ContactPerson addessBook2 = addressBoook;
					ram.add(addessBook2);
					map.put("Ram", ram);
				}
				System.out.println(map);
				ContactPerson addessBook3 = addressBoook;
				arrayList.add(addessBook3);
				map.put("Abhi", arrayList);
				System.out.println(map);
				break;
			default:
				System.out.println("Invalid Input");
			}
		}
	}

}
