import java.util.ArrayList;

public class MyStack {

    public ArrayList <String> stackList = new ArrayList<>();

    public boolean isEmpty() {
        return true;
    }

    public void push(String word) {
        stackList.add(word);
    }

    public String pop() {
        int counter = 0;
        for(int count = 1; count < stackList.size(); count++){
            counter++;
        }
        return stackList.remove(counter);
    }

    public String peek() {
        return stackList.get(0);
    }

    public int search(String name) {
        int count = 0;
        int counter = 0;
        for(; counter < stackList.size(); counter++){
            if(name.equalsIgnoreCase(stackList.get(counter))){
                count++;
            }
        }
        return counter;
    }
}
