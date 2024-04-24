package br.com.magna.task_list_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.magna.task_list_api.dto.TaskCreationDTO;
import br.com.magna.task_list_api.models.Task.Task;
import br.com.magna.task_list_api.repository.TaskRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("tasks")
public class TaskController {
	
	@Autowired
	private TaskRepository repository;
	
	@PostMapping
	@Transactional
	public void create(@RequestBody @Valid TaskCreationDTO data) {
		repository.save(new Task(data));
	}
	
}
