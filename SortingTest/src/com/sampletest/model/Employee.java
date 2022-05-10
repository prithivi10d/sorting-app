package com.sampletest.model;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
		
	private String name;
	
	private String phone;
	
	public Employee(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Employee u) {
	    if (getName() == null || u.getName() == null) {
	      return 0;
	    }
	    return getName().compareTo(u.getName());
	  }

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return  name + " - " + phone  ;
	}
	
}
