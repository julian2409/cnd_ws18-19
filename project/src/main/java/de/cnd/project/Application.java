package de.cnd.project;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@SpringBootApplication
public class Application {
	private ArrayList<String> todoList = new ArrayList<String>();

	@GetMapping("/hello")
	String sayHello(){

		return "Hello Esslingen!";
	}

	@GetMapping("/")
	String getTodos(){

		return todoList.toString();
	}

	@PostMapping("/{todo}")
	String addTodo(@PathVariable String todo){

		todoList.add(todo);
		return  todo+" added";
	}

	@DeleteMapping("/{todo}")
	String removeTodo(@PathVariable String todo){

		todoList.remove(todo);
		return  todo+" removed";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
