// package segitiga;

public class main {
    public static void main(String[] args) {
        System.out.println("Segitiga");
        Segitiga segitiga1 = new Segitiga(1,1,1);
        Segitiga segitiga2 = new Segitiga(30,10,90);
        Segitiga segitiga3 = new Segitiga(20,30,60);
        System.out.println("Segitiga 1 Luas : ");
        System.out.println(segitiga1.getLuas());
        System.out.println("Segitiga 2 Luas : ");
        System.out.println(segitiga2.getLuas());
        System.out.println("Segitiga 3 Luas : ");
        System.out.println(segitiga3.getLuas());
        
        segitiga3.setTinggi(5);
        segitiga2.setAlas(10);
        
        System.out.println("New Segitiga 3 Luas : ");
        System.out.println(segitiga3.getLuas());
        System.out.println("New Segitiga 2 Luas : ");
        System.out.println(segitiga2.getLuas());
        
        PersegiPanjang pp1 = new PersegiPanjang(1,1);
        PersegiPanjang pp2 = new PersegiPanjang(30,40);
        PersegiPanjang pp3 = new PersegiPanjang(25,35);
        
        System.out.println("Persegi Panjang 1 Luas : " );
        System.out.println("Luas : " + pp1.getLuas());
        System.out.println("Keliling : " + pp1.getKeliling());

        System.out.println("Persegi Panjang 2 Luas : ");
        System.out.println("Luas : " + pp2.getLuas());
        System.out.println("Keliling : " + pp2.getKeliling());
        System.out.println("Persegi Panjang 3 Luas : ");
        System.out.println("Luas : " + pp3.getLuas());
        System.out.println("Keliling : " + pp3.getKeliling());
        
        pp1.setLebar(30);
        pp2.setPanjang(60);
        System.out.println("New Persegi Panjang 3 Luas : ");
        System.out.println("Luas : " + pp3.getLuas());
        System.out.println("Keliling : " + pp3.getKeliling());

        

        Lingkaran lingkaran1 = new Lingkaran(7);
        Lingkaran lingkaran2 = new Lingkaran(14);
        Lingkaran lingkaran3 = new Lingkaran(21);
        System.out.println("Luas lingkaran 1 : " + lingkaran1.getLuas());
        System.out.println("Luas lingkaran 2 : " + lingkaran2.getLuas());
        lingkaran1.setRadius(70);;
        System.out.println("New Luas lingkaran 1 : " + lingkaran1.getLuas());
    }   

}




