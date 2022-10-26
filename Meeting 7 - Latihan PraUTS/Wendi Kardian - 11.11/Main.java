// Nama     : Wendi Kardian(2100016)
// Kelas    : Pendidikan Ilmu Komputer - A

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.print("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			list.add(input.nextInt());
		}


		bubblesrt(list);

		System.out.println(list.toString());
	}

public static void bubblesrt(ArrayList<Integer> list)
{
    int temp;
    if (list.size()>1) {
        for (int x=0; x<list.size(); x++)
        {
            for (int i=0; i < list.size() - x - 1; i++){
                if (list.get(i).compareTo(list.get(i+1)) > 0)
                {
                    temp = list.get(i);
                    list.set(i,list.get(i+1) );
                    list.set(i+1, temp);
                }
            }
        }
    }

}
}