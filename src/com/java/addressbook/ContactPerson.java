package com.java.addressbook;

import java.util.Scanner;



/**
 * Class to create ContactPerson with different methods
 * 
 */
public class ContactPerson {
	 String firstName, lastName, address, city, state, phoneNumber, email, zip;
		
		/*
		 * constructor 
		 */
		public ContactPerson() {
		
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.city = city;
			this.state = state;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.zip = zip;
		}
		
		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getZip() {
			return zip;
		}

		public void setZip(String zip) {
			this.zip = zip;
		}

		/*
		 * method for adding the contact details
		 */
		void addContact() {
			RegularExpression regex =new RegularExpression();
			System.out.println("Enter First Name :");
			this.firstName = regex.validFirstName();
			System.out.println("Enter Last Name :");
			this.lastName = regex.validLastName();
			System.out.println("Enter the address :");
			this.address = regex.validAddress();
			System.out.println("Enter city : ");
			this.city = regex.validCity();
			System.out.println("Enter state : ");
			this.state = regex.validState();
			System.out.println("Enter Phone Number : ");
			this.phoneNumber = regex.validMobileNumber();
			System.out.println("Enter Email : ");
			this.email = regex.valid_email();
			System.out.println("Enter zip : ");
			this.zip = regex.validZip();
		}
		@Override
		public String toString() {
			return "ContactPerson [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
					+ city + ", state=" + state + ", phoneNumber=" + phoneNumber + ", email=" + email + ", zip=" + zip
					+ "]";
		}

}
