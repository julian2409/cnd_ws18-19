package de.cnd.project;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.cnd.project.data.*;
import de.cnd.project.data.model.*;

@SpringBootApplication
@RestController
public class Application {
	@Autowired
	private StudentRepository studentRepos;
	@Autowired
	private LectureRepository lectureRepos;
	@Autowired
	private GradeRepository gradeRepos;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);		
	}

	@GetMapping("/")
	void initializeStundents(){
		studentRepos.save(new Student(65416,"Julian", ""));
		studentRepos.save(new Student(5646512, "Nitin", ""));
	}

	@RequestMapping(value = "/studentgrades/")
	String getTodos(@RequestParam("mn") int mn){
		return studentRepos.findById(mn).get().getName();
	}

	
	@RequestMapping(value = "/students", method = RequestMethod.POST)
	String createStudent(@RequestParam int mn, @RequestParam String name, @RequestParam String firstName){
		return studentRepos.save(new Student(mn, name, firstName)).getName();	
	}

/* 	@DeleteMapping("/{todo}")
	String removeTodo(@PathVariable double todo){

		todoList.remove(todo);
		return  todo+" removed";
	} */
}
