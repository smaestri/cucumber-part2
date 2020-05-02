package todo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.Matchers.any;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TodoSteps {

    @Autowired
    TodoService todoService;

    @Autowired
    TodoRepository todoRepository;

    @Given("ma liste de todos est vide")
    public void initActions(){
    }

    @When("^j'insére un todo avec la description (.*)$")
    public void insertAction(String description) {
        todoService.addTodo(description);
    }

    @Then("^ma liste contient un todo avec la description (.*)$")
    public void checkAction(String description) {
        List<Todo> todos = todoService.getTodos();
        assertEquals(1, todos.size());
        assertEquals(description, todos.get(0).getDescription());

    }

}
