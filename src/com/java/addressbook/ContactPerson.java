package com.java.addressbook;

public class ContactPerson {
	/*
	 * Variable Declaration
	 */
	private String firstName, lastname, address, city, state, emailId;
	private int zip;
	private long mobileNumber;
	/*
	 * Adding getter and setter methods
	 */
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/*
	 * Method to convert to String
	 */

	@Override
	public String toString() {
		return "ContactPerson [firstName=" + firstName + ", lastname=" + lastname + ", address=" + address + ", city="
				+ city + ", state=" + state + ", emailId=" + emailId + ", zip=" + zip + ", mobileNumber=" + mobileNumber
				+ "]";
	}

}
