package todo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue
    private int id;

    private String description;

    public Todo() {

    }

    public Todo(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
