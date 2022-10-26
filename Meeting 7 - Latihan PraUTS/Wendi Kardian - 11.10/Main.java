import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Stack stackList = new Stack();

        int j;
        System.out.println("Enter how many the data will you input ");
        j = input.nextInt();
        System.out.println("Enter x String :  ");

        for(int i = 0; i< j; i++){
            stackList.push(input.next());
        }


        System.out.println("List of the Stack");
        System.out.println("Stack : " + stackList.toString());
    }
}
