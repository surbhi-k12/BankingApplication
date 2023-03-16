package in.ineuron.main;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws Exception {
		Scanner s =new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println(".... CANARA ATM APPLICATION.... ");
			System.out.println();
			System.out.println("1. Withdrawl");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			
			System.out.print("ENETR YOUR OPTION :");
			int choice=s.nextInt();
			if(choice==1)
			{
				Withdrawl w=new Withdrawl();
				Accessing ac =new Accessing();
				ac.permit(w);
			}
			else if(choice==2)
			{
				Deposit d =new Deposit();
				Accessing ac1 =new Accessing();
				ac1.permit(d);
			}
			else if(choice==3)
			{
				Balance b =new Balance();
				Accessing ac2 =new Accessing();
				ac2.permit(b);
			}
			else
			{
				flag=false;
				System.exit(0);
			}
				
		}
	}
		

}
