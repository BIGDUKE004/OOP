package Dairy;

import java.util.ArrayList;

public class Dairy {
    private String userName;
    private String password;
    private boolean isLocked = true;
    private int id = 1000;
    private ArrayList <Entry> entries = new ArrayList<>();

    public Dairy(String username, String password) {
        this.userName = username;
        this.password = password;
    }

    public String getUserName(){
        return this.userName;
    }

    public String getPassword(){
        return this.password;
    }

    public boolean unLockDairy(String password){
        if(!this.password.equalsIgnoreCase(password)){
            throw new IllegalArgumentException("incorrect password");
        }
            return this.isLocked = false;
    }

    public boolean lockDairy() {
       return this.isLocked = true;
    }

    public void createEntry(String title, String body) {
        Entry entry = new Entry(id, title, body);
        entries.add(entry);
        id++;
    }

    public int getAmountOfEntries() {
        return this.entries.size();
    }

    public void deleteEntry(int id) {
        for (int count = 0; count < entries.size(); count++) {
            if (entries.get(count).getId() == id) {
                entries.remove(count);
            }
        }
    }

    public Entry findEntry(int id) {
        for(int count = 0; count < entries.size(); count++){
            if(entries.get(count).getId() == id){
                return entries.get(count);
            }
        }
        throw new IllegalArgumentException("Invalid Entry");
    }

    public void updateEntry(int id, String title, String body) {
        for(int count = 0; count < entries.size(); count++){
            if(entries.get(count).getId() == id){
                entries.get(count).setTitle(title);
                entries.get(count).setBody(body);
            }
        }
    }
}
