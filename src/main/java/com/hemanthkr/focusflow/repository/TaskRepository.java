package com.hemanthkr.focusflow.repository;

import com.hemanthkr.focusflow.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task , Long>{
    
}
