package com.TODO.TODOAPP.services;

import com.TODO.TODOAPP.controller.TaskDTO;
import com.TODO.TODOAPP.model.Task;
import com.TODO.TODOAPP.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;



    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }




}
