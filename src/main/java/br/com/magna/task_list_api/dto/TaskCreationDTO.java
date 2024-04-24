package br.com.magna.task_list_api.dto;

import java.time.LocalDate;

import br.com.magna.task_list_api.models.Task.enums.Priority;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TaskCreationDTO(
		@NotBlank
		String title,
		
		String description,
		
		@NotNull
		LocalDate deadline,
		
		@NotNull
		Priority priority) {
}
