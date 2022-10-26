import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        int n1 = (int)(Math.random() * 10);
        int n2 = (int)(Math.random() * 10);


        Scanner input = new Scanner(System.in);
        ArrayList<Integer> answer = new ArrayList<Integer>();

        System.out.println(n1 + " + " + n2 + "  =  ??" );
        int a = input.nextInt();

        while(n1 + n2 != a){
            if(answer.contains(a)){
                System.out.println("You've already answered that ");
            }

            System.out.println("Wrong answer, what is ");
            System.out.println(n1 + " + " + n2 + "  =  ??" );
            answer.add(a);
            a = input.nextInt();
        }

        System.out.println("Congrats, you answered it correctly");


    }
}