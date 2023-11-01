package OOPJLAB;
import java.util.*;
class Account
	{
		String accname,acctype;
		long accbalance,accno;
		Scanner sc=new Scanner(System.in);
		void openAccount()
		{
			System.out.print("\nEnter the name of the Account: ");
			 accname=sc.next();
			 System.out.print("Enter the type of the Account: ");
			 acctype=sc.next();
			 System.out.print("Enter the account number of the customer: ");
			 accno=sc.nextLong();
			 System.out.print("Enter account balance of the customer: ");
			 accbalance=sc.nextLong();

		}
		void displayAccount()
		{
			System.out.print("\n\tDetails of the Customer\n"+ "Account name="+accname+"\nAccount No:"+accno+"\n"+ "Account Balance:"+accbalance+"\nAccount Type:"+acctype+"\n");
		}

		void DepositMoney()
		{
			try
			{
				long depositAmount;
				System.out.print("\nEnter the amount to be deposited: ");
				depositAmount=sc.nextLong();
				if(depositAmount<=0)
				{
					throw new InvalidAmountException("Amount should be greater than zero!");
				}
				accbalance=accbalance+depositAmount;
				System.out.print("New balance in your account: "+accbalance+"\n");
			}
			catch(InvalidAmountException e)
			{
				System.out.print("InvalidAmountException:"+e.getMessage());			
			}
		}
		
		void WithdrawMoney()
		{
			try
			{
				long withdrawAmount;
				System.out.print("\nEnter the amount to be withdrawed: ");
				withdrawAmount=sc.nextLong();
				if(withdrawAmount>accbalance)
				{
					throw new InsufficientFundsException("Insufficent balance!!!");
				}
				if(withdrawAmount<=0)
				{
					throw new InvalidAmountException("Amount should be greater than zero!!");
				}
				if(accbalance>withdrawAmount)
				{
					accbalance=accbalance-withdrawAmount;
					System.out.print("New balance in your account:"+accbalance+"\n");
				}
			}
				catch(InsufficientFundsException e)
				{
					System.out.print("InsufficientAmountException: "+e.getMessage());
				}
				catch(InvalidAmountException e)
				{
					System.out.print("InvalidAmountException:"+e.getMessage());
				}
		}
		boolean searchAccount(long accnumber)
		{
			if(accno==accnumber)
			{
				return(true);
			}
			else
			{
				return(false);
			}
		}
	}
	public class BankAccountService{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Number of customers you want to enter: ");
	int num=sc.nextInt();
	int i=0,j=0;
	long accnumber;
	boolean value=false;
	
	Account a[]=new Account[num];
	
	char c;
	System.out.print("\tBANK ACCOUNT SERVICES\n");
	do
	{
		System.out.print("Bank offers the following services:\n1:Create Account\n2:Show Accounts"+"\n3:Deposit the amount\n4:Withdraw the amount\n5:Search Account\n6:Exit\nPlease enter your choice:");
		int ch=sc.nextInt();
		switch(ch) 
		{
			case 1:
				if(i<num)
				{
					a[i]=new Account();
					a[i].openAccount();
					i++;
					j++;
				}
				break;
				 			
			case 2:
				for(i=0;i<j;i++)
				{
					a[i].displayAccount();
				}
				break;
			
			case 3:
				System.out.print("\nEnter your account number: ");
				accnumber=sc.nextLong();
				value=false;
				for(i=0;i<j;i++)
				{
					value=a[i].searchAccount(accnumber);
					if(value)
					{
						a[i].displayAccount();
						a[i].DepositMoney();
						break;
					}
				}
				if(!value)
				{
					System.out.print("Account doesn't exist!!\n");
				}
				break;
			
			case 4:
				System.out.print("\nEnter your account number: ");
				accnumber=sc.nextLong();
				value=false;
				for(i=0;i<j;i++)
				{
					value=a[i].searchAccount(accnumber);
					if(value)
					{
						a[i].displayAccount();
						a[i].WithdrawMoney();
						break;
					}
				}
				if(!value)
				{
					System.out.print("Account doesn't exist!!\n");
				}
				break;
			case 5:
				System.out.print("\nEnter your account number: ");
				accnumber=sc.nextLong();
				value=false;
				for(i=0;i<j;i++)
				{
					value=a[i].searchAccount(accnumber);
					if(value)
					{
						System.out.print("Account Found!!");
						a[i].displayAccount();
						break;
					}
				}
				if(!value)
				{
					System.out.print("Account doesn't exist!!\n");
				}
				break;
			case 6:
				System.out.print("You have successfully exited!!!\nThank you!!");
				System.exit(0);
				break;
			default:
				System.out.print("Invalid input");
		}
	 System.out.print("\nDo you want to continue? y or n: ");
	 c=sc.next().charAt(0); 
	}
	while(c=='y'||c=='Y');

	sc.close();
}

}
