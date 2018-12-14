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
public class Lecture {

    @Id
    @GeneratedValue
    private Long lId;
    private String name;
    //private int creditPoints;
    @OneToMany
    @JoinColumn(name = "gId")
    private Set<Grade> grades;


    public Lecture (String name, int creditPoints) {
        this.setName(name);
        //this.creditPoints = creditPoints;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}