package de.cnd.project.grading;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
class Grade {

    @Id
    @GeneratedValue
    private Long id;
    private double grade;
    @OneToOne
    @JoinColumn(name = "matrikelNummer")
    private Student student;

    Grade (double grade) {
        this.grade = grade;
    }
}