package assignment5b;

public class Manager {
	
	public void modifyAccountBalance(Account account , double amount) 
	{
		if(account == null)
		{
			System.out.println("Error: Acct not found ");
			return;
		}
		if(amount <=0)
		{
			System.out.println("Error: Invalid amt");
		}
		account.setbalance(account.getbalance()+amount);
		System.out.println("Manager: Modifying Deposite account balance");
		account.setbalance(account.getbalance()-amount);
		System.out.println("Manager: Modifying Withdrawl account balance");

	}
	public void approveTransaction(Transaction transaction)
	{
		if(transaction == null)
		{
			System.out.println("Error: Invalid Transaction ");
			return;
		}
		System.out.println("Manager: Approving Transaction");
	}
	public void manageUser(User[] users)
	{
		if(users == null)
		{
			System.out.println("Error:  User list not found ");
			return;
		}
		System.out.println("Manager: Managing Users");
	}
	}


