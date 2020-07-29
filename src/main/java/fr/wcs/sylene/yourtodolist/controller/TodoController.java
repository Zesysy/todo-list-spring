package fr.wcs.sylene.yourtodolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.wcs.sylene.yourtodolist.model.Todo;
import fr.wcs.sylene.yourtodolist.repository.TodoRepository;

@Controller
public class TodoController {

    @Autowired
    TodoRepository todoRepository;

    @GetMapping("/todo")
    public String getTodo() {

        return "todo";

    }

    @PostMapping("/todo")
    public String postTodo(@ModelAttribute Todo todo) {

        todoRepository.save(todo);

        return "redirect:/";
    }

}