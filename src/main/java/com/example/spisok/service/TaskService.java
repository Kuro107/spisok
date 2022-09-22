package com.example.spisok.service;

import com.example.spisok.entity.Task;
import com.example.spisok.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepository;
    public Task getTask(Integer id){
        return taskRepository.getReferenceById(id);
    }

    public void save(Task task) {
        this.taskRepository.save(task);
    }
}
