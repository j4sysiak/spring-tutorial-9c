package com.jaceksysiak.spring.test;

public class Person {
	
	private int id;
	private String name;
	private int taxId;
	private Address address;
	 
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

	public void speak(){
		System.out.println("Hello I'am a person.");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId
				+ ", address=" + address + "]";
	}
 
}