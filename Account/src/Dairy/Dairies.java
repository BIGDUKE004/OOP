package Dairy;

import java.util.ArrayList;

public class Dairies {
    private ArrayList <Dairy> dairies = new ArrayList<>();

    public void addDairy(String userName, String password) {
        Dairy dairy = new Dairy(userName, password);
        dairies.add(dairy);
    }

    public int getListSize() {
        return this.dairies.size();
    }

    public Dairy findDairy(String userName) {
        for(int count = 0; count < dairies.size(); count++){
            if(!dairies.get(count).getUserName().equals(userName)){
                throw new IllegalArgumentException("Invalid username");
            } else {
                return dairies.get(count);
            }
        }
        return null;
    }

    public void delete(String userName, String password) {
        for(int count = 0; count < dairies.size(); count++){
            if(dairies.get(count).getUserName().equals(userName)){
                if(dairies.get(count).getPassword().equals(password)){
                    dairies.remove(count);
                    break;
                }
            }
        }
    }
}
