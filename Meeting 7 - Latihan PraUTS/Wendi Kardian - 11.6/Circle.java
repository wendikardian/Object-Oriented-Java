// Nama     : Wendi Kardian(2100016)
// Kelas    : Pendidikan Ilmu Komputer - A

public class Circle{
    private double radius = 1;

    private static int totalObjects = 0;

    public Circle(){
        this.totalObjects += 1;
    }

    public Circle(double radius){
        this.radius = radius;
        this.totalObjects+= 1;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double newRadius){
        if (newRadius >=0){
            this.radius = newRadius;
        }else{
            this.radius = 0;
        }
    }

    public static int getTotalObjects(){
        return totalObjects;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }




}