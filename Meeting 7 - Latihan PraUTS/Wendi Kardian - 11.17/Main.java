import java.util.ArrayList;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        System.out.println("Enter value : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        ArrayList<Integer> factor = new ArrayList<Integer>();

        findFactor(a, factor);

        int smallestSquare = smallestSquare(factor);
        System.out.println("The smallest number n for m * n to be a perfect square is " + smallestSquare);
        System.out.println("m * n = " + (a * smallestSquare));


    }

    private static void findFactor(int number, ArrayList<Integer> factor) {
        int counter = 2;
        while(counter <= number){
            if(number%counter == 0){
                factor.add(counter);
                number = number/counter;
            }else{
                counter++;
            }
        }
    }

    private static int smallestSquare(ArrayList<Integer> factors) {

        int[][] occurrences = dublicate(factors);
        for (int i : factors) {
            find(occurrences, i);
        }

        ArrayList<Integer> oddSequenceFactors = remove(occurrences);
        int smallestSquare = 1;
        for (int i : oddSequenceFactors) {
            smallestSquare *= i;
        }
        return smallestSquare;
    }

    private static int[][] dublicate(ArrayList<Integer> factor){
        int[][] x = new int[factor.size()][2];
        for(int i = 0; i< x.length;i++){
            x[i][0] = factor.get(i);
        }
        return x;

    }

    private static void find(int[][] x, int number){
        for(int i = 0; i< x.length ; i++){
            if(x[i][0] == number){
                x[i][1]++;
            }
        }
    }

    private static ArrayList<Integer> remove(int[][] x){
        ArrayList<Integer> a = new ArrayList<>();

        for(int i = 0; i< x.length; i++){
            if(x[i][1] % 2 != 0){
                a.add(x[i][0]);
            }
        }

        ArrayList<Integer> toRemoved = new ArrayList<>();

        for(int i = 0; i< a.size(); i++){
            if(!toRemoved.contains(a.get(i))){
                toRemoved.add(a.get(i));
            }
        }


        return toRemoved;
    }
}