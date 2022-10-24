public class Element {
    private String name;
    public int number;
    private String symbol;
    private double mass;
    private int period;
    private int group;


    public Element(String elementName, int elementNumber, String elementSymbol, double elementMass, int elementPeriod, int elementGroup){
        name = elementName;
        number = elementNumber;
        symbol = elementSymbol;
        mass = elementMass;
        period = elementPeriod;
        group = elementGroup;
    }

    public String getName (){
        System.out.println(getNumber());
        return name;
    }

    private int getNumber(){
        return number;
    }


    public String getSymbol(){
        return symbol;
    }


    public double getMass(){
        return mass;
    }

    public int getPeriod(){
        return period;
    }

    public int getGroup(){
        return group;
    }

}


