package de.cnd.project.data.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Student {

    @Id
    private int matrikelnummer;

    private String name;
    private String firstName;
 /*    private int semester;
    private int timeSemester; */

public Student(){}

    public Student(int matrikelnr, String name, String firstName) {
        this.setName(name);
        this.setFirstName(firstName);
        this.matrikelnummer = matrikelnr;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
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