class Person{
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private double height;
    private double weight;

    Person(String firstName, String lastName, int age, double height, double weight){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    Person(String firstName, String middleName, String lastName, int age, double height, double weight){
        this(firstName, lastName, age, height, weight);
        this.middleName = middleName;
    }

    public String fullName(){
        if(this.middleName == null){
            return this.firstName + " " + this.lastName;
        }else{
            return this.firstName + " " + this.middleName + " " + this.lastName ;
        }
    }

    public void printData(){
        System.out.println("Hello My name is " + this.fullName() + ".");
        System.out.println("I am " + this.age + "years old");
        System.out.println("I am" + this.height+ "m tall");
        System.out.println("My weight is " +this.weight+ "kg.");
        System.out.println("My BMI is " + Math.round(this.bmi()) + ".");
    }

    public double bmi(){
        return this.weight/ this.height/ this.height;
    }

    public void buy (Vehicle vehicle){
        vehicle.setOwner(this);
    }
}

abstract class Vehicle{
    private String name;
    private String color;
    protected int distance = 0;
    private Person owner;

    Vehicle(String name, String color){
        this.name = name;
        this.color = color;
    }

    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }

    public int getDistance(){
        return this.distance;
    }

    public Person getOwner(){
        return this.owner;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setOwner(Person person){
        this.owner = person;
    }

    public void printData(){
        System.out.println("Name : " + this.name);
        System.out.println("Color : " + this.color);
        System.out.println("Distance : " + this.distance + " km");
        
    }

    abstract public void run (int distance);

}

class Car extends Vehicle{
    private int fuel = 50;
    Car(String name, String color){
        super(name, color);
    }

    public int getFuel(){
        return this.fuel;
    }
    public void printData(){
        super.printData();
        System.out.println("Fuel : " + this.fuel + " L");
    }

    public void run(int distance){
        System.out.println("Moving + "+distance+ "km ......");
        if(distance <= this.fuel){
            this.distance += distance;
            this.fuel -= distance;
        }else{
            System.out.println("Not enought fuel ");
        }
        System.out.println("Distance : " + this.distance + " km");
        System.out.println("Fuel : " + this.fuel + " L");
    }

    public void charge(int litre){
        System.out.println("Adding " + litre + "L ....");
        if(litre <= 0){
            System.out.println("No Fuel added");
        }else if(litre + this.fuel >= 100){
            System.out.println("Tank is full now");
        }else{
            this.fuel += litre;
        }
        System.out.println("Fuel : " + this.fuel + " L");
    }
}

class Bicycle extends Vehicle{
    Bicycle(String name, String color){
        super(name, color);
    }

    public void run(int distance){
        System.out.println("Moving " + distance+ " km.....");
        this.distance += distance;
        System.out.println("Distance: " + this.distance+ " km");
    }
}


class main{
    public static void main(String[] args) {
        System.out.println("Hello World");
        Person person1  = new Person("Wendi", "Kardian", 27,  1.7, 60.0);
        // person1.printData();
        Car car1 = new Car("Ferrari", "Red");
        Bicycle bicycle1 = new Bicycle("bmx", "green");
        bicycle1.run(12);
        person1.buy(car1);
        car1.getOwner().printData();
    }
}