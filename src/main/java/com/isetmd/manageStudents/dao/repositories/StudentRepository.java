package com.isetmd.manageStudents.dao.repositories;

import com.isetmd.manageStudents.dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
