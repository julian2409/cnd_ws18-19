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


@SpringBootApplication
@RestController
public class Application {
	private ArrayList<Double> todoList = new ArrayList<Double>();

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/hello")
	String sayHello(){

		return "Hello Esslingen!";
	}

	@GetMapping("/")
	String getTodos(){

		return todoList.toString();
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
