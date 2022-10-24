import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of thes triangle sides:");
        System.out.println("The first side:");
        double s1 = scan.nextDouble();
        System.out.println("The second side:");
        double s2 = scan.nextDouble();
        System.out.println("The third side:");
        double s3 = scan.nextDouble();


        System.out.println("Enter the color:");
        String color = scan.next();


        System.out.println("is filled ? ");
        boolean isFilled = scan.nextBoolean();

        Triangle t1= new Triangle(s1,s2,s3);
        t1.setColor(color);
        t1.setFilled(isFilled);

        System.out.println(t1.toString());
        System.out.println("The area of the triangle is");
        System.out.println(t1.getArea());
        System.out.println("The Parimeter of the triangle is");
        System.out.println(t1.getPerimeter());
        System.out.println("The Color of the triangle is");
        System.out.println(t1.getColor());
        System.out.println("Is the triangle filled ? (boolean please answer with true or false)");
        System.out.println(t1.isFilled());

    }

}