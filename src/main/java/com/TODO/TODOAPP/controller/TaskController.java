package com.TODO.TODOAPP.controller;

import com.TODO.TODOAPP.model.TaskModel;
import com.TODO.TODOAPP.services.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<TaskModel>  createEntity (TaskDTO taskDTO){
        taskService.createTask(taskDTO);
        return null;
    }







}
