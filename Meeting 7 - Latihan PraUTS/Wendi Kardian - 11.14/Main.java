import java.util.Scanner;
import java.util.ArrayList;


public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> data1 = new ArrayList<Integer>();
        ArrayList<Integer> data2 = new ArrayList<Integer>();

        System.out.println("number of data 1 : (5 times) : ");
        for(int i = 0; i < 5; i++){
            data1.add(input.nextInt());
        }

        System.out.println("number of data 2 : (5 times) : ");
        for(int i = 0; i < 5; i++){
            data2.add(input.nextInt());
        }
        System.out.println("The combined data : " + findUnion(data1, data2));
    }

    public static ArrayList<Integer> findUnion(ArrayList<Integer> data1, ArrayList<Integer> data2){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.addAll(data1);
        temp.addAll(data2);
        return temp;
    }
}
