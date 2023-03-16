package in.ineuron.main;

public class Balance extends Server
{
	
	static void afterWithdraw(double amount)
	{
		bankBalance=bankBalance-amount;
	}
	static void afterDeposit(double amount)
	{
		bankBalance=bankBalance+amount;
	}
	void verify() throws NotMatchingException
	{
		if(uid==id && upw==pw)
		{
			System.out.println("Your Bank Balance fetched Successfully");
			System.out.println(bankBalance);
		}
		else
		{
			NotMatchingException ne=new NotMatchingException();
			throw ne;
		}
	}
	
}