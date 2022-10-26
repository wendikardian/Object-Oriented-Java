import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : (5 times)");
        ArrayList<Double> data = new ArrayList<Double>();

        for(int i = 0; i< 5; i++){
            data.add(input.nextDouble());
        }

        System.out.println("The total SUM of the 5 numbers = " + sum(data));

    }

    public static double sum(ArrayList<Double> data) {
        double totalSum = 0;
        for(double i : data){
            totalSum+= i;
        }

        return totalSum;
    }
}