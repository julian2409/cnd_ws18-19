package de.cnd.project.grading;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
class Student {

    @Id
    @GeneratedValue
    private Long matrikelnummer;
    private String name;
    private String firstName;
    private int semester;
    private int timeSemester;

    Student(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
    }
}