package com.example.schoolesbasic.repositories;

import com.example.schoolesbasic.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
