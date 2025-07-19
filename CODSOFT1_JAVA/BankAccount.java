import java.util.*;

class BankAccount {
    double balance;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited Amount: " + amount);
            System.out.println("Available Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && balance >= amount){
            balance -= amount;
            System.out.println("Withdrawn Amount: " + amount);
            System.out.println("Available Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance or Invalid Amount");
        }
    }

    public double checkBalance(){
        return balance;
    }
}