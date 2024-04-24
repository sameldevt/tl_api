package br.com.magna.task_list_api.models.user;

import java.util.List;

import br.com.magna.task_list_api.models.Task.Task;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

//@Table(name = "Users")
//@Entity(name = "User")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

	//@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private List<Task> tasks;	
	
}
