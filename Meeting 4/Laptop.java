public class Laptop {
    private int ram;   
    private String CPU;   
    private int  Storage;

    public Laptop(int ramLaptop, String CPULaptop, int StorageLaptop){
        ram = ramLaptop;
        CPU = CPULaptop;
        Storage = StorageLaptop;
    }   

    public int getRam(){
        return ram;
    }

    public String getCPU(){
        return CPU;
    }    
}


