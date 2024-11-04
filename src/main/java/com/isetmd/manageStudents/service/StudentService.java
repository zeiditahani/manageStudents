package com.isetmd.manageStudents.service;

import com.isetmd.manageStudents.dao.entities.Student;
import com.isetmd.manageStudents.dao.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public void updateStudent (Long id, String firstname){
        Student student = studentRepository.findById(id).get();
        student.setFirstname(firstname);
        studentRepository.save(student);


    }
}
