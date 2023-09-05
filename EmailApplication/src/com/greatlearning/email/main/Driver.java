package com.greatlearning.email.main;

import java.security.Provider.Service;
import java.util.Scanner;

import com.greatlearning.email.model.Emp;
import com.greatlearning.email.service.CredentialService;
import com.greatlearning.email.service.ICredentialService;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ICredentialService service = new CredentialService();
		
		System.out.println("Creating credentials for new employees");
		System.out.println("Enter your FirstName :");
		String FirstName = scan.nextLine();     // Reads Intput
		
		
		System.out.println("Enter your LastName :");
		String LastName = scan.nextLine();       // Reads Intput
		
		
		Emp employee= new Emp(FirstName, LastName);
		
		System.out.println("Please Enter the department from below!");
		System.out.println("1. Technical");
		System.out.println("2. Finance");
		System.out.println("3. Recuritment");
		System.out.println("4. Learning");
		System.out.println("5. Admin");
		System.out.println("5. HumanResource");
		System.out.println("7. Legal");
		
		int dep = scan.nextInt();
		
		switch(dep)
		{
		case 1 : employee.setDepartment("tech");break;
		case 2 : employee.setDepartment("finance");break;
		case 3 : employee.setDepartment("recurt");break;
		case 4 : employee.setDepartment("l&d");break;
		case 5 : employee.setDepartment("admin");break;
		case 6 : employee.setDepartment("hr");break;
		case 7 : employee.setDepartment("leg");break;
		default:
			System.out.println("Please select valid department");break;
		}
	
	if(employee.getFirstName() != null && employee.getLastName() != null && employee.getDepartment() != null) 
	{
		service.EmailGenerator(employee);
		service.PasswordGenerator(employee);
		service.Employee_Credentials(employee);
	}
	
	else 
	{
		System.out.println("Invalid Employee details !!!");}
		scan.close();

	}
	
	}

