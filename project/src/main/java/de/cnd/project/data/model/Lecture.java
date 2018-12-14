package de.cnd.project.data.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
class Lecture {

    @Id
    @GeneratedValue
    private Long lId;
    private String name;
    private int creditPoints;
    @OneToMany
    @JoinColumn(name = "gId")
    private Set<Grade> grades;


    Lecture (String name, int creditPoints) {
        this.name = name;
        this.creditPoints = creditPoints;
    }
}