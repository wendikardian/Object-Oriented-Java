import java.util.ArrayList;

public class Stack extends java.util.ArrayList{
    private ArrayList<Object> data;

    public Stack(){
        data = new ArrayList<Object>();
    }

    public void push(Object a){
        data.add(0, a);
    }

    public Object findFirst(){
        return data.get(0);
    }

    public Object pop(){
        Object toRemove = data.get(0);
        data.remove(0);
        return toRemove;
    }

    public String toString(){
        return "the list of stack : " +data.toString();
    }
}