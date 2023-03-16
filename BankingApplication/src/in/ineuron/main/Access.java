package in.ineuron.main;

import java.util.ArrayList;
import java.util.Scanner;

class NotMatchingException extends Exception
{
	public NotMatchingException()
	{
		System.out.println("Exception Occurs");
	}
}


class Accessing 
{
	void permit(Server s) throws Exception
	{
		try
		{
			s.input();

			s.verify();
		}
		catch(InterruptedException | NotMatchingException nme)
		{
			System.out.println("Invalid Credentials");
			try 
			{
				s.input();
				s.verify();
			} 
			catch (NotMatchingException e)
			{
				System.out.println("Again Invalid Credentials ");
				try 
				{
					s.input();
					s.verify();
				} 
				catch (NotMatchingException ae) 
				{
					System.out.println("Not anymore to access.Your Account is blocked for 24hours");
				}
				
			}
			finally
			{
				System.out.println("Contact your nearest branch for more covenience");
			}
		}
	}


	
}
