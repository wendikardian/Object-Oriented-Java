public class Student extends Person{
    private int stat;
    public final static int FRESHMAN = 1;
    public final static int SEPHOMORE = 2;
    public final static int JUNIOR = 3;
    public final static int SENIOR = 4;


    public Student(String name, String address, String phone, String email, int status){
        super(name, address, phone, email);
        this.stat = status;
    }


    public void setStat(int stat){
        this.stat = stat;
    }


    public String getStat(){
        if(this.stat == 1){
            return "Freshman";
        }else if(this.stat == 2){
            return "Sephomore";
        }else if(this.stat == 3){
            return "Junior";
       }else{
           return "Senior";
       }
    }

    public String toString(){
        return super.toString() + "\nStatus: "+this.getStat();
    }

}