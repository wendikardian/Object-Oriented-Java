public class Main{
    public static void main(String[] args) {
        Person nicki = new Person("Nicky", "St. Street no 93", "9089123213", "nicki@gmail.com");
        System.out.println(nicki.toString());

        Student jordan = new Student("Jordan pale pale", "Evelyn huugoo Street no 93", "0887123", "jordan@gmail.com", Student.SEPHOMORE);
        Student maria = new Student("Maria ", "Cornelia Street", "8712321", "maria@gmail.com", Student.JUNIOR);
        System.out.println(jordan.toString());
        System.out.println(maria.toString());


        Employee jhoni = new Employee("Jhony", "Evelyn huugoo Street no 97", "8217321213", "jhoni@gmail.com", 110, 21000 );
        System.out.println(jhoni.toString());

        Faculty jenifer = new Faculty("Jenifer", "Tokyo Streen=t no 88", "44123", "jenifer@gmail.com", 201, 7000, "5AM - 9 PM", "Lecture");
        Faculty timothee = new Faculty("Thimotheee", "Singapore Streen=t no 90", "135121223", "timothee@gmail.com", 301, 8000, "5AM - 7 PM", "Excecutive lecture");
        System.out.println(jenifer.toString());
        System.out.println(timothee.toString());


        Staff rhodee = new Staff("Rhoode", "New York St 98", "2123123", "rhodee@gmail.com", 90, 5000, "Accountant" );
        Staff bezooz = new Staff("Bezooz", "St. Hedwirg 90", "141212", "bezooz@gmail.com", 80, 7000, "Lead of Staff Administration" );

        System.out.println(rhodee.toString());
        System.out.println(bezooz.toString());

    }
}