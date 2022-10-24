class Main{
    public static void main(String[] args){
        System.out.println("Hello World");
        Element e1 = new Element("Hydrogen", 1, "H", 1.00, 1, 1 );
        System.out.println(e1.getName());
        e1.number = 10;
        System.out.println(e1.number);
    }
}

