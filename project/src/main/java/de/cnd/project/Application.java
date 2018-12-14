package de.cnd.project;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.cnd.project.data.*;
import de.cnd.project.data.model.Grade;


@SpringBootApplication
@RestController
public class Application {
	private ArrayList<Double> todoList = new ArrayList<Double>();
	
	private StudentRepository studentRepos;
	private LectureRepository lectureRepos;
	private GradeRepository gradeRepos;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

/* 	@GetMapping("/hello")
	String sayHello(){

		return "Hello Esslingen!";
	} */

	@GetMapping("/studentgrades/{matrikelnr}")
	String getTodos(@PathVariable long matrikelnr){
		
		return studentRepos.findById(matrikelnr).toString();
	}

/* 	@PostMapping("/{todo}")
	String addTodo(@PathVariable double todo){

		todoList.add(todo);
		return  todo+" added";
	} */

	@RequestMapping(value = "/")
	public String addTodo(@RequestParam("todo") double todo) {
 	
		todoList.add(todo);
		return  todo+" added";
	}

/* 	@DeleteMapping("/{todo}")
	String removeTodo(@PathVariable double todo){

		todoList.remove(todo);
		return  todo+" removed";
	} */
}
