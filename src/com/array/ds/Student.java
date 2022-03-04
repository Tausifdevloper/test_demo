package com.array.ds;

final public class Student {

	private final  String name;
	 private final int id;
	 
	 private final Address adr;
	
	public Student(String name, int id, Address adr) {
	
		this.name = name;
		this.id = id;
		this.adr= adr;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", adr=" + getAdr() + "]";
	}

	public Address getAdr() {
		return new Address(adr.getCity(), adr.getCountry());
	}

	
}
