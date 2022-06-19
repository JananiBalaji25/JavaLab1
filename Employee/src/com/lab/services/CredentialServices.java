package com.lab.services;
import java.util.Random;

import com.lab.model.Employee;
public class CredentialServices {

	public String generatePassword()
	{
		int first=(int)'!';//33
		int last=(int)'~';//126
		
	int range=last-first;
		
		Random random=new Random();
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<8;i++)
		{
			int randomNumber=random.nextInt(range);//0 93
			char randomCharacter=(char) (randomNumber+first);
			sb.append(randomCharacter);
			}
		
		return sb.toString();
		}
	public String generateEmailAddress(Employee emp,String dep)
	{
		String email=String.format("%s%s@%s.company.com",emp.getfirstName(),emp.getlastName(),dep);
		return email;	
	}
	public void  showCredentials(String firstName,String email ,String password)
	{
		System.out.printf("Dear %s your generated credentials are as follow \n"
				+"Email %s \n"
				+"password %s ",firstName,email,password);
		
		
		
	}
}
