package com.namnt.roomlivedatamodelapplication;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface NoteDao {
    @Insert
    void insert(Note note);

    @Delete
    int delete(Note note);

    @Update
    void update(Note note);

    @Query("Delete from note_table")
    void deleteAll();

    @Query("SELECT * FROM note_table ORDER BY priority DESC")
    LiveData<List<Note>> getAllNote();


}
