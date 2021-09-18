package com.intellect.training.java.oops;

class Address {
	
	String addressline1;
	String addressline2;
	String city;
	String street;
	
	public String getAddressline1() {
		return addressline1;
	}
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}
	public String getAddressline2() {
		return addressline2;
	}
	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [addressline1=" + addressline1 + ", addressline2=" + addressline2 + ", city=" + city
				+ ", street=" + street + "]";
	}
	
	
	

}
