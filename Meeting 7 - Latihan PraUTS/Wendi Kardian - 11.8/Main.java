class Main{
    public static void main(String[] args){
        System.out.println("Hello World!");

        Account wendi = new Account("Wendi", 12, 3000);

        System.out.println(wendi.getBalance());
        wendi.setAnnualInterestRate(10);

        wendi.deposit(50);
        System.out.println("Wendi Menabung 50 dolar");
        System.out.println(wendi.getAnualInterestRate());
        System.out.println(wendi.getBalance());
        
        
        wendi.withdraw(100);
        System.out.println("Wendi Mengambil uang 100");
        System.out.println(wendi.getAnualInterestRate());
        System.out.println(wendi.getBalance());


        System.out.println("\n\n===Data Transaksi=== \n");
        for(int i=0; i<wendi.getTransactions().size() ; i++){
            System.out.println(wendi.getTransactions().get(i).getDescription());
            System.out.println(wendi.getTransactions().get(i).getAmmount());
        }
        
    }
}