package com.java.addressbook;

public class ContactPerson {
	/*
	 * Variable Declaration
	 */
	private String firstName, lastname, address, city, state, emailId;
	private int zip;
	private long mobileNumber;

	/*
	 * Default constructor
	 */
	ContactPerson() {
	}
	
	public ContactPerson(String firstName, String lastname, String address, String city, String state, String emailId,
			int zip, long mobileNumber) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.emailId = emailId;
		this.zip = zip;
		this.mobileNumber = mobileNumber;
	}
	/*
	 * method to convert to String
	 */
	@Override
	public String toString() {
		return "ContactPerson : [firstName=" + firstName + ", lastname=" + lastname + ", address=" + address + ", city="
				+ city + ", state=" + state + ", emailId=" + emailId + ", zip=" + zip + ", mobileNumber=" + mobileNumber
				+ "]";
	}

}
