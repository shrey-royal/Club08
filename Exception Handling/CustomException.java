/*
In a banking application, an account should not allow transactions that would result in an overdraft (i.e., the account balance falls below zero). If a user tries to withdraw more money than they have in their account, you want to handle this situation gracefully.

Custom Exception:
We'll create a custom exception called InsufficientFundsException to represent this specific error condition.
*/

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance < amount) {
            throw new InsufficientFundsException("Attempted to withdraw " + amount + " but only " + balance + " is available.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful! New balance: " + balance);
    }
}

public class CustomException {
    public static void main(String[] args) {
        System.out.println("Before Exception");
        
        BankAccount account = new BankAccount(100);
        try {
            account.withdraw(90);
        } catch (Exception e) {
            // e.printStackTrace();
            // System.out.println(e.getMessage());
            System.out.println(e);
        }

        System.out.println("After Exception");
    }
}
