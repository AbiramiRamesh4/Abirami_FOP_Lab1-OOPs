package com.greatlearning.email.service;

import java.util.Random;

import com.greatlearning.email.model.Emp;

public class CredentialService implements ICredentialService{
	
	private  String lower = "abcdefghijklmnopqrstuvwxyz";
	private  String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private  String digits = "0123456789";
	private  String punctuations = "!@#$%&*+|/?";
	private String PasswordChars = upper +lower + digits + punctuations;
	private Random random = new Random();

	@Override
	public void EmailGenerator(Emp employee) {
		String emailAddress = employee.getFirstName().toLowerCase()+employee.getLastName()+"@"+employee.getDepartment()+".maveric.in";
		employee.setEmailAddress(emailAddress);
		
	}

	@Override
	public void PasswordGenerator(Emp employee) {
		String Password ="";
		for (int i=0; i<8; i++) {
			Password = Password + PasswordChars.charAt(random.nextInt(PasswordChars.length()));
			employee.setPassword(Password);
		}		
	}

	@Override
	public void Employee_Credentials(Emp employee) {
		System.out.println("Dear\s"+ employee.getFirstName() + "\syour generated credentials below!!");
		System.out.println("Email :\s" +employee.getEmailAddress());
		System.out.println("password :\s" +employee.getPassword());
		
	}

}
