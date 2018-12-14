package de.cnd.project.data.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Grade {

    @Id
    @GeneratedValue
    private Long gId;
    private double grade;
    @OneToOne
    @JoinColumn(name = "matrikelNummer")
    private Student student;

    Grade (double grade) {
        this.grade = grade;
    }
}