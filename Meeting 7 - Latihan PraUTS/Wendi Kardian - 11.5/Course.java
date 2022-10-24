// Nama     : Wendi Kardian(2100016)
// Kelas    : Pendidikan Ilmu Komputer - A

import java.util.ArrayList;

public class Course {
    private String nameCourse;
    private ArrayList<String> listOfStudent;

    public Course(String name){
        this.nameCourse = name;
        listOfStudent = new ArrayList<String>();
    }

    public void addStudent(String student){
        listOfStudent.add(student);
    }

    public String[] getStudentList(){
        String[] toReturn = new String[listOfStudent.size()];
        return listOfStudent.toArray(toReturn);
    }

    public int getTotalStudent(){
        return listOfStudent.size();
    }

    public String getNameCourse(){
        return nameCourse;
    }

    public void dropStudent(String student){
        listOfStudent.remove(student);
    }
}
