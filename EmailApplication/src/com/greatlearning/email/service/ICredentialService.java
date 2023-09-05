package com.greatlearning.email.service;

import com.greatlearning.email.model.*;

public interface ICredentialService
{
	public void EmailGenerator(Emp employee);
	public void PasswordGenerator(Emp employee);
	public void Employee_Credentials(Emp employee);
	

}
