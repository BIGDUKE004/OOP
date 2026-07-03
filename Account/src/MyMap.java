import java.util.ArrayList;

public class MyMap {
    public ArrayList <String> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size(ArrayList<Integer> list) {
        int count = 0;
         for(int counter = 0; counter < list.size(); counter+=2){
             count++;
         }
         return count;
    }

    public void add(String key, String value) {
        this.list.add(key);
        this.list.add(value);
    }

    public boolean containsValue( String user) {
        String key = "name";
        String value = "miracle";
        String keyOne = "age";
        String valueOne = "19";
        list.add(key);
        list.add(value);
        list.add(keyOne);
        list.add(valueOne);

        for(int count = 1; count < list.size(); count+=2){
            if(list.get(count).equalsIgnoreCase(user)){
                return true;
            }
        }
        return false;
    }

    public boolean containsKey(String user) {
        String key = "name";
        String value = "miracle";
        String keyOne = "age";
        String valueOne = "19";
        list.add(key);
        list.add(value);
        list.add(keyOne);
        list.add(valueOne);

        for(int count = 0; count < list.size(); count+=2){
            if(list.get(count).equalsIgnoreCase(user)){
                return true;
            }
        }
        return false;
    }

    public String get(String user) {
        String key = "name";
        String value = "miracle";
        String keyOne = "age";
        String valueOne = "19";
        list.add(key);
        list.add(value);
        list.add(keyOne);
        list.add(valueOne);
        String outPut = "";
        for(int count = 0; count < list.size(); count+=2){
            if(list.get(count).equalsIgnoreCase(user)){
                outPut = list.get(count+1);
            }
        }
        return outPut;
    }

    public void put(String userKey, String rewrite) {
        for(int count = 0; count < list.size(); count+=2){
            if(list.get(count).equalsIgnoreCase(userKey)){
               list.set(count+1, rewrite);
            }
        }
    }
}
