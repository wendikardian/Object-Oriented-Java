// Nama     : Wendi Kardian(2100016)
// Kelas    : Pendidikan Ilmu Komputer - A

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseMatrix{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Array size :");
        int number = input.nextInt();

        // Create an Array

        int[][] newArray = new int[number][number];
        
        fillMatrix(newArray);
        printArray(newArray);

        System.out.println("The largest row value is on index : ");
        printArray(findLargestRow(newArray));
        System.out.println("The largest column value is on index : ");
        printArray(findLargestColumn(newArray));
    }


    public static void printArray(ArrayList<Integer> i){
        for(int j = 0; j< i.size();j++){
            System.out.println(i.get(j) + " " );
        }
    }

    // Print the matrix
    public static void printArray(int[][] dataArray){
        System.out.println("The array is ");
        for(int i = 0; i< dataArray.length; i++){
            for(int j = 0; j<dataArray[i].length; j++){
                System.out.println(dataArray[i][j]);
            }
            System.out.println();
        }
    }

    public static void fillMatrix(int[][] dataArray){
        for(int i = 0; i<dataArray.length; i++){
            for(int j = 0; j< dataArray[i].length; j++){
                dataArray[i][j] = (int)(Math.random() * 2);
            }
        }
    }




    public static ArrayList<Integer> findLargestColumn(int[][] array){
        ArrayList<Integer> index = new ArrayList<Integer>();
        int[] count = new int[array.length];
        for(int i = 0; i< array.length; i++){
            for(int j = 0; j<array[i].length; j++){
                if(array[i][j] == 1){
                    count[j] += 1;
                }
            }
        }
        int max = max(count);
		getIndex(index, count, max);
		return index;
    }

    public static int max(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }
    
    public static void getIndex(ArrayList<Integer> list, int[] count, int x) {
        for (int i = 0; i < count.length; i++) {
            if (count[i] == x)
                list.add(i);
        }
    }

    public static ArrayList<Integer> findLargestRow(int[][] dataArray){
        ArrayList<Integer> index = new ArrayList<Integer>();
        int[] counter = new int[dataArray.length];
        for(int i = 0; i< dataArray.length; i++){
            for(int j = 0; j< dataArray[i].length; j++){
                    if(dataArray[j][i] == 1){
                        counter[j]++;
                    }
            }
        }
        int maxValue = max(counter);
        getIndex(index, counter, maxValue);
        return index;
    }



    
}