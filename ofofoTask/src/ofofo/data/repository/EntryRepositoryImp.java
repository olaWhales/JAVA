package ofofo.data.repository;

import ofofo.data.model.Entry;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EntryRepositoryImp implements EntryRepository {
    List<Entry> entries = new ArrayList<Entry>();
    private int count  = 0 ;

    @Override
    public void saveEntry(Entry entry) {
        entries.add(entry);
    }

    @Override
    public boolean existsById(String diaryId, int id) {
        for(Entry entry : entries){
            if(entry.getDiaryId().equals(diaryId) && entry.getId() == id){
                return true;
            }
        }
        return false;
    }

    @Override
    public Entry findById(String diaryId, int id) {
        for(Entry entry : entries){if(entry.getDiaryId().equals(diaryId) && entry.getId() == id) return entry ;}
        return null;
    }

    @Override
    public void deleteById(int id) {
        for(int index =0 ; index < entries.size() ; index++){
            if(entries.get(index).getId() == id){
                entries.remove(index);
            }
        }
    }

    @Override
    public void deleteById(String diaryId, int id) {
        for(int index = 0 ; index < entries.size() ; index++){
            if(entries.get(index).getId() == id && diaryId.equals(entries.get(index).getDiaryId())){
                entries.remove(index);
            }
        }
    }

    @Override
    public void delete(Entry entry) {
        entries.remove(entry);
    }

    @Override
    public void deleteAll(String diaryId) {
        for(int index = 0 ; index < entries.size() ; index++){
            if(entries.get(index).getDiaryId().equals(diaryId)){
                entries.remove(index);
            }
        }

    }

    @Override
    public Entry findByTitle(String diaryId, String title) {
        for(Entry entry : entries){
            if(entry.getDiaryId().equals(diaryId) && entry.getTitle().equals(title)){
                return entry ;
            }
        }
        return null;
    }

    @Override
    public List<Entry> findAll(String diaryId) {
        entries.stream()
                .filter(entry -> entry.getDiaryId().equals(diaryId));
        return entries ;
//        return List.of(entries.toArray(new Entry[entries.size()])) ;
    }

    @Override
    public LocalDate getDate(int entry) {
        return null;
    }

    @Override
    public long count() {
        return entries.size();
    }
}
