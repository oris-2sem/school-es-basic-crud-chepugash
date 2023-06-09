package com.example.schoolesbasic.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String profile;

    @OneToMany(mappedBy = "parent")
    private List<Student> children;
}
