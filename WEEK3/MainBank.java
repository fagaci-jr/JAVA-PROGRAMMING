
abstract class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends Account {

    SavingsAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Withdrawal denied.");
        }
    }
}

class CurrentAccount extends Account {

    CurrentAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Balance: " + balance);
    }

    void withdraw(double amount) {
        balance -= amount; // allows overdraft
        System.out.println("Withdrawn: " + amount + ", Balance: " + balance);
    }
}

public class MainBank {
    public static void main(String[] args) {
        Account savings = new SavingsAccount(1000);
        Account current = new CurrentAccount(1000);

        savings.deposit(500);
        savings.withdraw(200);
        savings.withdraw(2000); 

        current.deposit(500);
        current.withdraw(200);
        current.withdraw(2000); 
    }
}