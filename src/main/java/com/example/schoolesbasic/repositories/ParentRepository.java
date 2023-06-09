package com.example.schoolesbasic.repositories;

import com.example.schoolesbasic.models.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepository extends JpaRepository<Parent, Long> {
}
