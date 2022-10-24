import java.util.Date;

public class Transaction{
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description){
        this.date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }


    public String getDate(){
        return this.date.toString();
    }

    public void setType(char type){
        this.type = type;
    }

    public char getType(){
        return this.type;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public double getAmmount(){
        return this.amount;
    }


    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setDescription(String description){
        this.description = description;
    }
    
    public String getDescription(){
        return this.description;
    }
    
}