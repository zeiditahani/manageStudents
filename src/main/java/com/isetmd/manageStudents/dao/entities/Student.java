package com.isetmd.manageStudents.dao.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Table (name = "etudiant")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    // @Column(name = "prenom")
    String firstname;
    String lastname;
    @Transient
    int age;

    public Student(Object o, String bekkey, String mohamed, int i) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}