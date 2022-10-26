import java.util.Scanner;
import java.util.ArrayList;


public class Main{
    public static void main(String[] args){
        System.out.println("Enter the number (10 times) : ");
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int i = 0; i< 10; i++) {
            numbers.add(input.nextInt());
        }
        System.out.println("Remove duplicates number ==========");
        removeDuplicates(numbers);
        System.out.println("The new List");
        System.out.println(numbers);
    }

    public static void removeDuplicates(ArrayList<Integer> numbers) {
        ArrayList<Integer> t = new ArrayList<Integer>();
        for(int i = 0; i< numbers.size(); i++){
            if(!t.contains(numbers.get(i))){
                t.add(numbers.get(i));
            }
        }
        numbers.clear();
        numbers.addAll(t);
    }
}