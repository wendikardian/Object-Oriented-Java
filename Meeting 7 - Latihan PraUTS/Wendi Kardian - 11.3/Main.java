public class Main{
    public static void main(String[] args) {
        Account account_1 = new Account(10, 2000);
        SavingsAccount saving_account_1 = new SavingsAccount(100, 4000);
        CheckingAccount checking_account_1 = new CheckingAccount(200, 4000, -50);

        account_1.setAnnualInterestRate(7.5);
        saving_account_1.setAnnualInterestRate(8.5);
        checking_account_1.setAnnualInterestRate(5.5);


        account_1.deposit(600);
        saving_account_1.deposit(700);
        checking_account_1.deposit(900);

        account_1.withdraw(800);
        saving_account_1.withdraw(900);
        checking_account_1.withdraw(1000);


        System.out.println(account_1.getBalance());
        System.out.println(saving_account_1.getBalance()); 
        System.out.println(checking_account_1.getBalance());


        System.out.println(account_1.toString());
        System.out.println(saving_account_1.toString());
        System.out.println(checking_account_1.toString());
    }
}