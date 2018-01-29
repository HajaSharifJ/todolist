package com.todo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBSeeder implements CommandLineRunner {
	private TodoItemRepository todoRepo;

	public DBSeeder(TodoItemRepository todoRepo) {
        this.todoRepo = todoRepo;
    }


	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		TodoItem todo1 = new TodoItem("test");
		
		this.todoRepo.deleteAll();

        //add our hotels to the database
        List<TodoItem> todoitems = Arrays.asList(todo1);
		this.todoRepo.save(todoitems);
	}

}
