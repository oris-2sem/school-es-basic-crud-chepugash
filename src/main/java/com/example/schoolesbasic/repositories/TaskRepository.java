package com.example.schoolesbasic.repositories;

import com.example.schoolesbasic.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
