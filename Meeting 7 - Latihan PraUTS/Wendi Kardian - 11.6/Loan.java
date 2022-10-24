// Nama         : Wendi Kardian(2100016)
// Kelas        

public class Loan 
{
    private double interestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan(){
        this(5, 2, 3000);
    }


    public Loan(double interestRate, int numberOfYears, double loanAmount){
        this.interestRate = interestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new java.util.Date();
    }

    public double getInterestRate(){
        return this.interestRate;
    }

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    public int getNumberofYears(){
        return this.numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }

    public double getLoadAmount(){
        return this.loanAmount;
    }

    public void setLoadAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }

    public double getMountlyPayment(){
        double monthlyInterestRate = this.interestRate/1200;
        double mountlyPayment = this.loanAmount * monthlyInterestRate / (1- (1/Math.pow(1  + monthlyInterestRate, this.numberOfYears * 12)));
        return mountlyPayment;
    }

    public double getTotalPayment(){
        return this.getMountlyPayment()  * this.numberOfYears * 12;
    }

    public java.util.Date getLoanDate(){
        return this.loanDate;
    }

}
