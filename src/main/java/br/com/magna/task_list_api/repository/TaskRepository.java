package br.com.magna.task_list_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.magna.task_list_api.models.Task.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
