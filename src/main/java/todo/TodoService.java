package todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public void addTodo(String description) {
        this.todoRepository.save(new Todo(description));
    }

    public List<Todo> getTodos() {
        return todoRepository.findAll();

    }

}
