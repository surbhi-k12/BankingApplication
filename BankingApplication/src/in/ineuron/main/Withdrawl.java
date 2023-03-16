package in.ineuron.main;

public class Withdrawl extends Server
{
	void verify() throws InterruptedException, NotMatchingException
	{
		if(uid==id && upw==pw)
		{
			System.out.println("Enter the amount to be Withdraw");
			amount=s.nextDouble();
			System.out.println("Loading........");
			Thread.sleep(4000);
			System.out.println("Your amount is Withdraw successfully ");
			Thread.sleep(2000);
			Balance.afterWithdraw(amount);
			System.out.println("Thank you");
			System.out.println("Your bank Balance is");
			System.out.println(bankBalance);
		}
		else
		{
			NotMatchingException ne=new NotMatchingException();
			throw ne;
		}
	}
}
