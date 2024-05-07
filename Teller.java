package assignment5b;



class Teller {
     
    public void deposit(Account account, double amount) {
        double currentBalance = account.getbalance();
        account.setbalance(currentBalance + amount);
        System.out.println("Deposit of " + amount + " successful. New balance: " + account.getbalance());
    }

    
    public void withdraw(Account account, double amount) {
        double currentBalance = account.getbalance();
        if (currentBalance >= amount) {
            account.setbalance(currentBalance - amount);
            System.out.println("Withdrawal of " + amount + " successful. New balance: " + account.getbalance());
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}