import java.util.Date;
import java.util.ArrayList;

public class Account {
    private String name;
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions;

    Account(){
        this.name = "";
        this.id= 0;
        this.balance = 0;
        annualInterestRate = 0;
        this.dateCreated = new Date();
        this.transactions = new ArrayList<Transaction>();
    }


    Account(String name, int id, double balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
        this.transactions = new ArrayList<Transaction>();
        
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    
	public void setId(int id) {
		this.id = id;
	}

    public void setBalance(double balance) {
		this.balance = balance;
	}

    public void setAnnualInterestRate(double rate) {
		annualInterestRate = rate;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

    public double getAnualInterestRate() {
        return annualInterestRate;
    }



	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}


	public void withdraw(double amount) {
		balance -= amount;
		transactions.add(new Transaction('W', amount, balance, "Withdrawal from account"));
	}

    
	public void deposit(double amount) {
		balance += amount;
		transactions.add(new Transaction('D', amount, balance, "Deposit to account"));
	}

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }






}
