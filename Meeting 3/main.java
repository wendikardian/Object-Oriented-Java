class Main{
    public static void main(String arg[]) {
        System.out.println("Word");
        Student student1 = new Student();
        student1.setName("Wenddiii");
        System.out.println(student1.name);
    }

}


class Student{
    public String name;
    private String email;
    
    Student(){
        name = "Unassignment";
        email = "Unassignment";
    }

    
    public String getEmail(){
        return email;
    }

    public String getName(){
        return name;
    }

    public void setEmail(String emailAdress){
        email = emailAdress;
    }

    public void setName(String nameStudent){
        name = nameStudent;
    }
}


class LibraryCard{
    private Student owner;
    private int borrowCnt;
    public LibraryCard(){
        owner = null;
        borrowCnt = 0;
    }

    public void checkOut(int numOfBooks){
        borrowCnt += numOfBooks;
    }

    public int getNumberOfBooks(){
        return borrowCnt;
    }


    public String getOwnerName(){
        return owner.getName();
    }

    public void setOwner(Student student){
        owner = student;
    }

    public String toString(){
        return "Owner Name : " + owner.getName() + "\n" + "Email : " + owner.getEmail() + "\n" + "Books borrowed : " + borrowCnt;
    }

}