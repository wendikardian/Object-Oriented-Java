// Nama     : Wendi Kardian(2100016)
// Kelas    : Pendidikan Ilmu Komputer - A

import java.util.Scanner;
import java.util.ArrayList;

public class Shuffle{


    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<Integer>();

        System.out.println("Enter the number (0 to exit) : ");
        Integer n = input.nextInt();

        while(n.intValue() != 0){
            data.add(n);
            n = input.nextInt();
        }

        java.util.Collections.shuffle(data);

        for(int i= 0; i< data.size(); i++){
            System.out.print(data.get(i) + " - " );
        }
    }
}