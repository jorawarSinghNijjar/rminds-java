package com.basics;

public class Address {

	private int houseId;
	private String street;
	private String city;
	private String country;
	private String state;
	private String pincode;
	private Student student;

	public Address(String street, String city, String state, String country, String pincode) {
		this.street = street;
		this.city = city;
		this.country = country;
		this.state = state;
		this.pincode = pincode;
	}

	public Address() {

	}

	public int getHouseId() {
		return houseId;
	}

	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
