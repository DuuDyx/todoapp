package com.TODO.TODOAPP.controller;

import com.TODO.TODOAPP.model.Task;
import com.TODO.TODOAPP.services.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public TaskService getTaskService(TaskService taskService){

    }



}
