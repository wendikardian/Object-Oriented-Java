// import java.util.Scanner;

// public class Solution {

//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         Scanner scan = new Scanner(System.in);
//         int num1 = scan.nextInt();
//         int num2 = scan.nextInt();
//         int num3 = scan.nextInt();
//         JajarGenjang jg1 = new JajarGenjang(num1, num2, num3);
//         System.out.print((int)jg1.getLuas() );
//         System.out.print(" ");
//         System.out.print( (int)jg1.getKeliling());
//     }
// }

// class JajarGenjang{
    
//     private double sisiMiring, alas, tinggi;
//     public JajarGenjang(){
        
//     }
    
//     public JajarGenjang(double alas, double sisiMiring, double tinggi){
//         this.sisiMiring =  sisiMiring;
//         this.alas = alas;
//         this.tinggi = tinggi;
//     }
    
//     public double getLuas(){
//         return this.alas * this.tinggi;
//     }
    
//     public double getKeliling(){
//         return 2*this.sisiMiring + 2 * this.alas;
//     }
    
// }

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Player p1 = new Player("Arthur" , 100, "Axe");
        // System.out.print(p1.attack());
        // System.out.print(" ");
        // System.out.println(p1.healing());
        // System.out.print(" ");
        // System.out.print(p1.changeWeapon("Sword"));
        // System.out.println(p1.attack() + " " + p1.healing() + " " + p1.changeWeapon("Sword"));
        System.out.println(p1.attack());
        System.out.println(p1.healing());
        System.out.println(p1.changeWeapon("Sword"));

    }
}

class Player{
    private String nama;
    private int health;
    private String weapons;
    public Player(String nama, int health, String weapons){
        this.nama = nama;
        this.health = health;
        this.weapons = weapons;
 
    }

    public String attack(){
        return this.nama + " is attacking \n" + this.nama + " healt before "  + this.health;
    }
    public String healing(){
        this.health +=50;
        return this.nama + " is healing \n" + this.nama + " healt after healing " + this.health;
    }

    public String changeWeapon(String newWeapon){
        this.weapons = newWeapon;
        return this.nama + " weapon now is " +this.weapons;
    }
}