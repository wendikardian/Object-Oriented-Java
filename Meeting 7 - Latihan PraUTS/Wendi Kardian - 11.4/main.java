// Nama     : Wendi Kardian (2100016)
// Kelas    : Pendidikan Ilmu Komputer - A

import java.util.Scanner;
import java.util.ArrayList;


public class main{

    public static Integer findMax(ArrayList<Integer> data){

        // Return null if the list length is 0
        if(data.size() == 0){
            return null;
        }


        Integer maxValue = data.get(0);
        for(int i = 0; i< data.size(); i++){
            if(data.get(i) > maxValue){
                maxValue = data.get(i);
            }
        }

        return maxValue;


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> data = new ArrayList<Integer>();


        System.out.println("Enter the number (enter 0 to stop input)");
        Integer dataInput = input.nextInt();

        while (dataInput.intValue() != 0){
            data.add(dataInput);
            dataInput = input.nextInt();
        }

        System.out.println("The max/largest value of this array list is " + findMax(data));
    }
}

