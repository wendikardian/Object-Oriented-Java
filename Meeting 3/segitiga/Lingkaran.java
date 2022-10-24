

class Lingkaran {
    
    /* Atribut */
    double radius = 1;

    /* Konstruktor tanpa variabel*/
    Lingkaran(double newRadius)
    {   
        radius = newRadius;
    }
    

    /* Method */
    double getLuas(){
        return radius * radius * Math.PI;
    }

    double getKeliling()
    {
        return 2 * Math.PI * radius;
    }

    void setRadius(double newRadius)
    {
        radius = newRadius; 
    }

}
