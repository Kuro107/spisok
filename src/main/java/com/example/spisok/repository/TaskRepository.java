package com.example.spisok.repository;

import com.example.spisok.entity.Task;
import com.example.spisok.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface TaskRepository extends JpaRepository<Task,Integer> {
    List<Task> findAllByUsers(String name);

}
