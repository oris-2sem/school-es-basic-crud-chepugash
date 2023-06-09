package com.example.schoolesbasic.repositories;

import com.example.schoolesbasic.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
