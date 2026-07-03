import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyQueue {

    public ArrayList <String> queueList = new ArrayList<>();

    public boolean add(String name) {
        if(name == null){
            throw new NullPointerException();
        }
        queueList.add(name);
        return true;
    }

    public String element() {
        if(queueList.isEmpty()){
            throw new NoSuchElementException();
        }
        return queueList.get(0);
    }

    public String peek() {
        String message = "";
        if(queueList.isEmpty()){
            message = null;
        } else {
            message = queueList.get(0);
        }
        return message;
    }

    public String poll() {
        String message = "";
        if(queueList.isEmpty()){
            message = null;
        } else {
            message = queueList.remove(0);
        }
        return message;
    }

    public String remove() {
        return queueList.remove(0);
    }

}
