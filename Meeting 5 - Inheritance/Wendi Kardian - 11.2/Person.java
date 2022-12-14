public class Person{
    private String name;
    private String address;
    private String phone;
    private String email;


    public Person(){
        this("-", "-", "-", "-");
    }

    public Person(String name, String address, String phone, String email){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void setPhone(String phone) {
            this.phone = phone;
        }

    public void setEmail(String email) {
        this.email = email;
        }
    
    public String toString(){
        return "\nName: " + name + "\nAddress: " + address + "\nPhone number: " + phone + "\nEmail address: " + email;
    }


}