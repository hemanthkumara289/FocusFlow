package com.hemanthkr.focusflow.controller;

import com.hemanthkr.focusflow.entity.Task;
import com.hemanthkr.focusflow.service.TaskService;
import com.hemanthkr.focusflow.dto.TaskRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public Task createTask(@RequestBody TaskRequest request) {
            return taskService.createTask(request);
    }
    
    @GetMapping("/{id}")
    public Task getTaslById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }
    
}
