package com.example.todolist.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface TodoDao {

    @Insert
    void InsertTodo(TodoItem item);
    @Delete
    void deleteTodo(TodoItem item);
    @Query("delete FROM TODO")
    void deleteAllTodo();
    @Update
    void editTodo(TodoItem item);
    @Query("select * FROM TODO WHERE id = :id")
    TodoItem getTodo(int id); // void로 선언된 함수였는데 어떻게 하는지 몰라서... Todoitem으로 return type 바꿈
}
