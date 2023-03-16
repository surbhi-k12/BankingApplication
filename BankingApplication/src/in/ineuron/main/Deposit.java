package in.ineuron.main;

class Deposit extends Server
{
	@Override
	void verify() throws Exception, NotMatchingException
	{
		if(uid==id && upw==pw)
		{
			System.out.println("Enter the amount to be deposited");
			amount=s.nextDouble();
			System.out.println("Loading........");
			Thread.sleep(4000);
			System.out.println("Your amount has been Deposited successfully ");
			Balance.afterDeposit(amount);
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