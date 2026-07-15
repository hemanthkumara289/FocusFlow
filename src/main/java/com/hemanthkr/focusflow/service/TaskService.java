package com.hemanthkr.focusflow.service;

import com.hemanthkr.focusflow.entity.Task;
import com.hemanthkr.focusflow.exception.TaskNotFoundException;
import com.hemanthkr.focusflow.repository.TaskRepository;
import com.hemanthkr.focusflow.dto.TaskRequest;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public Task createTask(TaskRequest request){

        Task task = new Task();

        task.setTitle(request.getTitle());
        task.setTaskDate(request.getTaskDate());
        task.setWeight(request.getWeight());
        task.setCompleted(false);

        return taskRepository.save(task);
    }

    public Task getTaskById(Long id){
        
        return taskRepository.findById(id)
        .orElseThrow(() -> new TaskNotFoundException(id));
    }

}
