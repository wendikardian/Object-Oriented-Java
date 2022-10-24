public class Triangle extends GeometricObject{
    private double s1;
    private double s2;
    private double s3;


    Triangle(){
        s1 = 1.0;
        s2 = 1.0;
        s3 = 1.0;
    }


    Triangle(double s1, double s2, double s3){
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
        }
        
    public double getS1(){
        return s1;
    }

    public double getS2() { 
        return s2;
    }

    public double getS3() {
        return s3;
    }

    public double getArea(){
        double s = (s1+s2+s3)/2;
        return Math.sqrt(s * (s - this.s1) * (s - this.s2) * (s - this.s3));
    }


    public double getPerimeter(){
        return s1+s2+s3;
    }


    public String toString(){
        return "Triangle: side1 = " + s1 + " side2 = " + s2 + " side3 = " + s3;
    }
}