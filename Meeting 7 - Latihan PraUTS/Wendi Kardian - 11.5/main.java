public class main{
    public static void main(String[] args){
        Course c1 = new Course("Object Oriented Programming");
        Course c2 = new Course("Animation");


        c1.addStudent("Jesson");
        c1.addStudent("Derrian");
        c1.addStudent("Someone");


        c2.addStudent("Stivie");
        c2.addStudent("Joshep -- ; --");
        c2.addStudent("Radith");
        c2.addStudent("Maxim");


        System.out.println("Total the students of " + c1.getNameCourse() + " is : " + c1.getTotalStudent());
        String[] listofStudent1 = c1.getStudentList();
        for(int i=0 ; i<c1.getTotalStudent() ; i++){
            System.out.println((i+1) +  ". " + listofStudent1[i] );
        }

        System.out.println("Total the students of " + c2.getNameCourse() + " is : " + c2.getTotalStudent());
        String[] listofStudent2 = c2.getStudentList();
        for(int i=0 ; i<c2.getTotalStudent() ; i++){
            System.out.println((i+1) +  ". " + listofStudent2[i] );
        }
    }
}