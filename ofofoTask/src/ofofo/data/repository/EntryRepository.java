package ofofo.data.repository;

import ofofo.data.model.Entry;

import java.time.LocalDate;
import java.util.List;

public interface EntryRepository {
    void saveEntry(Entry entry);
    boolean existsById(String diaryId , int id);
    Entry findById(String diaryId , int id);
    void deleteById(int id);
    void deleteById(String diaryId, int id);
    void delete(Entry entry);
    void deleteAll(String diaryId);
    Entry findByTitle(String diaryId , String title);
    List<Entry> findAll(String diaryId);
    LocalDate getDate(int entry);
    long count();
}
