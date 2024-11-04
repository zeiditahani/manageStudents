package com.isetmd.manageStudents;

import com.isetmd.manageStudents.dao.entities.Student;
import com.isetmd.manageStudents.dao.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManageStudentsApplication implements CommandLineRunner {
	@Autowired
	StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(ManageStudentsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student(null,"Zeidi","Tahani",20);
		studentRepository.save(student);
		studentRepository.save(new Student(null,"Tahani","Zeidi",21));
		studentRepository.findAll().forEach(s-> System.out.println(s.getFirstname().toUpperCase()+ " "+s.getLastname()));

	}
}
