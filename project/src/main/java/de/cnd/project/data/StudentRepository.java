package de.cnd.project.data;

import de.cnd.project.data.model.*;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}