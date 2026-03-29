package com.TODO.TODOAPP.services;

import com.TODO.TODOAPP.controller.TaskDTO;
import com.TODO.TODOAPP.model.TaskModel;
import com.TODO.TODOAPP.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;


    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public TaskModel createNoTimeLimitTask(TaskDTO taskDTO){
        TaskModel taskModel = new TaskModel();
        taskModel.setTitulo(taskDTO.getTitulo());
        taskModel.setDescricao(taskDTO.getDescricao());
        taskModel.setStatus_atual(taskDTO.isStatus_atual());

        return taskRepository.save(taskModel);

    }

    public TaskModel createWithtimeLimitTask(TaskDTO taskDTO){
        TaskModel taskModel = new TaskModel();
        taskModel.setTitulo(taskDTO.getTitulo());
        taskModel.setDescricao(taskDTO.getDescricao());
        taskModel.setData_inicio(taskDTO.getData_inicio());
        taskModel.setData_limite(taskDTO.getData_limite());
        taskModel.setStatus_atual(taskDTO.isStatus_atual());

        return taskRepository.save(taskModel);

    }



}
