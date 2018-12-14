package de.cnd.project.data;

import de.cnd.project.data.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

interface GradeRepository extends JpaRepository<Grade, Long> {

}

interface LectureRepository extends JpaRepository<Lecture, Long> {

}

interface StudentRepository extends JpaRepository<Student, Long> {

}
