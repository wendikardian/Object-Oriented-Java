import java.util.ArrayList;
import java.util.Date;


public class ExerciseMain{
    public static void main(String[] args) {
        ArrayList<Object> object = new ArrayList<Object>();
        object.add(new Loan());
        object.add(new Date());
        object.add(new Circle());
        object.add(new String("Class"));

        for(int i=0; i<object.size(); i++) {
            System.out.println(object.get(i).toString());
        }
    }
}