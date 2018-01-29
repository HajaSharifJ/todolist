package com.todo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class TodoItemController {
	private TodoItemRepository todoRepo;

	public TodoItemController(TodoItemRepository todoRepo) {
        this.todoRepo = todoRepo;
    }

	@RequestMapping("/all")
	public List<TodoItem> getAll() {
		List<TodoItem> items = this.todoRepo.findAll();
		return items;
	}
	
	@PutMapping
	public void insert(@RequestBody TodoItem todo) {
		this.todoRepo.insert(todo);
	}
	
	@PostMapping
	public void update(@RequestBody TodoItem todo) {
		this.todoRepo.save(todo);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		this.todoRepo.delete(id);
	}
	
	
}
