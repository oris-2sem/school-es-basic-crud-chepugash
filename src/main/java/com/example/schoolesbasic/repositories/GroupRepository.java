package com.example.schoolesbasic.repositories;

import com.example.schoolesbasic.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
