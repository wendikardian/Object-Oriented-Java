

class Pet{
    protected String name;

    public String getName() {
        return name;
    }

    // public Pet(String petName){
    //     name = petName;
    // }

    public void setName(String petName){
        name =petName;
    }

    public String speak(){
        return "hello my name is " + name +" i'm your cuddly little pet.";
    }

    public static void main(String[] args){
        Cat myPet = new Cat();
        System.out.println(myPet.speak());
        Dog doggy = new Dog();
        System.out.println(doggy.fetch());
        doggy.setName("doggy");
        System.out.println(doggy.name);
    }
}



class Cat extends Pet{
    public String speak(){
        return "Meawwww";
    }
}


class Dog extends Pet{
    public Dog(){
        super();
    }


    public String fetch(){
        return "Yes Master, fetch I will.";
    }

    public void setName(String newName){
        name = newName;
    }
}