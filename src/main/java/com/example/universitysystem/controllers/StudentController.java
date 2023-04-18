package com.example.universitysystem.controllers;

import com.example.universitysystem.entities.Student;
import com.example.universitysystem.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    // Insert New Student
    @PostMapping("/student")
    public String saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return "Student Added successfully";
    }
    // Get all Student
    @GetMapping("/student")
    public List<Student> fetchStudents(){
        return studentService.fetchStudents();
    }
    // Get Student By ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }
    // Update Student
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }
    // Delete Student
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}