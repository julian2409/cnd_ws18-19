package de.cnd.project.data;

import de.cnd.project.data.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}