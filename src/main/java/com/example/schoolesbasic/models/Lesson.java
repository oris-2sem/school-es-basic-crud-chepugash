package com.example.schoolesbasic.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "lesson")
    private List<Task> tasks;

    @ManyToOne
    @JoinColumn(name = "timetable_id", referencedColumnName = "id")
    private Timetable timetable;

    private String subject;
    private String topic;
}
