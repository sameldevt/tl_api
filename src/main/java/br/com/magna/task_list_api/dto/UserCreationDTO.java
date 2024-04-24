package br.com.magna.task_list_api.dto;

import java.util.List;

import br.com.magna.task_list_api.models.Task.Task;
import jakarta.validation.constraints.NotBlank;

public record UserCreationDTO(
		@NotBlank
		String name,
		
		@NotBlank
		List<Task> tasks) {
}
