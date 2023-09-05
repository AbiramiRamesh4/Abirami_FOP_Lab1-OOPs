package com.greatlearning.email.model;

public class Emp {
	private String FirstName;
	private String LastName;
	private String Department;
	private String EmailAddress;
	private String Password;

	public Emp(String FirstName, String LastName ) {
		this.FirstName = FirstName;
		this.LastName = LastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}
	
	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	} 	
}
