package com.java.addressbook;

/**
 * Class to create ContactPerson with different methods
 * 
 */
public class ContactPerson {
	/*
	 * Variable Declaration
	 */
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String mobileNumber;
	private String email;

	/*
	 * Parameterized Constructor
	 */
	public ContactPerson(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber, String email) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAddress(address);
		this.setCity(city);
		this.setState(state);
		this.setZipCode(zip);
		this.setMobileNumber(phoneNumber);
		this.setEmail(email);
	}

	/*
	 * Default Constructor
	 */
	public ContactPerson() {
	}

	// creating getter and setter methods
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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 * toString method to represent the String of Object
	 */
	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", adddress=" + address + ", city=" + city
				+ ", state=" + state + ", zipCode=" + zipCode + ", mobileNumber=" + mobileNumber + ", email=" + email
				+ "]";
	}

}
