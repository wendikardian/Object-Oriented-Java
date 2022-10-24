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
