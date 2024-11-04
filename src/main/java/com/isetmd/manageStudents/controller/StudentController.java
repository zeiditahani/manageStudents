package com.isetmd.manageStudents.controller;


import com.isetmd.manageStudents.dao.entities.Student;
import com.isetmd.manageStudents.dao.repositories.StudentRepository;
import com.isetmd.manageStudents.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentService studentService;

    @GetMapping(path = "/students")
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
    @PostMapping (path = "/student")
    public void saveStudent(@RequestBody Student student){
        studentRepository.save(student);
    }
    @DeleteMapping (path = "/student/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentRepository.deleteById(id);
    }
    @PutMapping (path = "/student/{id}")
    public void updateStudent(@PathVariable Long id,@RequestParam String firstname){
        studentService.updateStudent(id,firstname);
    }




}