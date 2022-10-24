
import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;

	Account() {
		this(0, 0); 
	}

	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		this.dateCreated = new Date();
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
		return this.id;
	}
	public double getBalance() {
		return this.balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public String getDateCreated() {
		return this.dateCreated.toString();
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	public double getMonthlyInterest() {
		return this.balance * (getMonthlyInterestRate() / 100);
	}

	public void withdraw(double amount) {
		this.balance = this.balance - amount;
	}

	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}

	public String toString() {
		return "\nID : " + id + "\nDate created: " + getDateCreated()+ "\nBalance: $" + String.format("%.2f", balance) + "\nMonthly interest: $" + String.format("%.2f", getMonthlyInterest());
	}
}