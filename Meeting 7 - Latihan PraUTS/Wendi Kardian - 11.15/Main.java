import java.util.Scanner;
import java.util.ArrayList;


public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double area = getArea(input);

        System.out.println("Total : " + area);
    }

    public static double getArea(Scanner input) {
        ArrayList<ArrayList<Double>> node = findnode(input);
    
        double sum = 0.0;
        for (int i = 0; i < node.size() - 1; i++) {
          double x1 = node.get(i).get(0);
          double y1 = node.get(i).get(1);
          double x2 = node.get(i + 1).get(0);
          double y2 = node.get(i + 1).get(1);
          sum += ((x1 * y2) - (y1 * x2));
        }
    
        return Math.abs(sum / 2);
      }

      public static ArrayList<ArrayList<Double>> findnode(Scanner input) {
        System.out.print("Enter the number of the points: ");
        int size = input.nextInt();
        System.out.print("Enter the coordinates of the points: ");
        ArrayList<ArrayList<Double>> points = new ArrayList<>();
        for (int i = 0; i < size; i++) {
          ArrayList<Double> point = new ArrayList<>();
          point.add(input.nextDouble());
          point.add(input.nextDouble());
          points.add(point);
        }
        return points;
      }
    
}
