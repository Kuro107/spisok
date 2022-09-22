package com.example.spisok.controller;

import com.example.spisok.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TaskController {

    @Autowired
    TaskService taskService;


}
