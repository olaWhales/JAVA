package Diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private boolean lock ;
    private int addEntries ;
    private String password ;
    private Entry entry;
    public List<Entry> entryList = new ArrayList<>();

    public Diary() {
        this.lock = false;
        this.addEntries = 0;
        this.password = "password";
    }

    public Diary(String koko, String love) {
        this.lock = true;
    }


    public boolean islock(){
        return lock;
    }

    public void isUnlocked() {
        this.lock = false;
    }

    public void isLock() {
        this.lock = true ;
    }

    public void addEntry(String title, String body) {
        if(!this.lock){
            entry = new Entry(title, body, 2);
        entryList.add(entry);
        }else{
            addEntries = 0 ;
        }
    }

    public int getSize() {
        return entryList.size() ;
    }

    public void deleteEntry() {
        if(this.lock == false) {
            entryList.remove(addEntries);
        }else{
            addEntries = 0 ;
        }
    }

    public void password(String pass) {
        if(pass.equals(this.password)){
            this.lock = true;
        }
        else{
            this.lock = false;
        }
    }
}