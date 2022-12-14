public class Faculty extends Employee {
    private String officeHours;
    private String rank;


    public Faculty(String name, String address, String phone, String email,  int office, double salary, String officeHours, String rank){
        super(name, address, phone, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours(){
        return this.officeHours;
    }

    public void setOfficeHours(String officeHours){
        this.officeHours = officeHours;
    }

    public String getRank(){
        return this.rank;
    }

    public void setRank(String rank){
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOffice hours: " + officeHours + "\nRank: " + rank;
}

}
