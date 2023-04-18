package com.example.universitysystem.services;

import com.example.universitysystem.entities.Student;

import java.util.List;

public interface StudentService {
    // Create New Student
    Student saveStudent(Student student);
    // Get All Student
    List<Student> fetchStudents();
    // Get Student By ID
    Student getStudentById(Long id);
    // Update Student
    Student updateStudent(Long id, Student student);
    // Delete Student
    void deleteStudent(Long id);
}
