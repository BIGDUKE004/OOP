import java.util.ArrayList;

public class MySet {

    public ArrayList <String> set = new ArrayList<>();
    public int size = 0;

    public boolean setIsEmpty(){
        if(set.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

    public boolean add(String check) {
        if(check == null){
            throw new NullPointerException();
        }
        for(int count = 0; count < set.size(); count++){
            if(set.get(count).equalsIgnoreCase(check)){
                return false;
            }
        }
        set.add(check);
        return true;
    }

    public boolean contains(String check) {
        if(check == null){
            throw new NullPointerException();
        }
        for(int count = 0; count < set.size(); count++) {
            if (set.get(count).equals(check)) {
                return true;
            }
        }
        return false;
    }
}
