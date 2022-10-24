
class Segitiga{
    private double alas;
    private double tinggi;
    private double sisi;
    Segitiga(double newAlas, double newTinggi, double newSisi){
        alas = newAlas;
        tinggi = newTinggi;
        sisi = newSisi;
    }

    public double getLuas(){
        return alas * tinggi /2;
    }

    public double getKeliling(){
        return sisi * 3;
    }

    public void setAlas(double newAlas){
        alas = newAlas;
    }
    public void setTinggi(double newTinggi){
        tinggi = newTinggi;
    }
    
    public void setSisi(double newSisi){
        sisi = newSisi;

    }
    
}


