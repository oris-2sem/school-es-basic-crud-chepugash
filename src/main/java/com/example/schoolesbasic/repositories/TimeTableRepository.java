package com.example.schoolesbasic.repositories;

import com.example.schoolesbasic.models.Timetable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeTableRepository extends JpaRepository<Timetable, Long> {
}
