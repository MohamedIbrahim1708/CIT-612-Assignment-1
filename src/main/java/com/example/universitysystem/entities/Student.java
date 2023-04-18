package com.example.universitysystem.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Student {

    @Id
    private Long studentId;
    @Column(nullable = false)
    private String studentName;
    private String Address;
    private String Phone;
    @Column(nullable = false)
    private String Username;
    @Column(nullable = false)
    private String Password;
    private String Dept;
}
