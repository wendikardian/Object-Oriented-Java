

public class Student {
    protected final static int NUM_OF_TESTS  = 3;
    protected String name;
    protected int[] test;
    protected String courseGrade;

    public Student(){
        this("No name");
    }

    public Student(String studentName){
        name = studentName;
        test = new int[NUM_OF_TESTS];
        courseGrade = "***";
    }

    public String getCouseGrade(){
        return this.courseGrade;
    }

    public String getName(){
        return this.name;
    }


    public int getTestScore(int testNumber){
        return this.test[testNumber - 1];
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setTestScore(int testNumber, int testScore){
        this.test[testNumber - 1] = testScore;
    }

    public void computeCouseGrade(){
    }

}


class GraduateStudent extends Student{
    public void computateCouseGrade(){
        int total = 0;
        for(int i = 0; i < NUM_OF_TESTS; i++){
            total += test[i];
        }

        if(total/NUM_OF_TESTS >= 80){
            courseGrade = "Pass";
        }else{
            courseGrade  = "No Pass";
        }
    }
}


class UndergraduateStudent extends Student{
    public void computeCourseGrade(){
        int total = 0;
        for (int i = 0; i< NUM_OF_TESTS; i++){
            total += test[i];
        }

        if(total/NUM_OF_TESTS >= 70){
            courseGrade = "Pass";
        }else{
            courseGrade = "No Pass";
        }
    }
}




