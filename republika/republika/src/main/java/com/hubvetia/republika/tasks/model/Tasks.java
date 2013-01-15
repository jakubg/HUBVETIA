package com.hubvetia.republika.tasks.model;


import java.util.List;

public interface Tasks {

    void create(Task task);

    void deleteById(long id);

    List<Task> getAll();

    List<Task> getByUserId(String userId);
}