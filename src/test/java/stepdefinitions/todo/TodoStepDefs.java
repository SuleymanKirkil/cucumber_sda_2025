package stepdefinitions.todo;

import io.cucumber.java.en.When;
import pages.todo.TodoPage;

import java.util.List;


public class TodoStepDefs {
    TodoPage todoPage = new TodoPage();
    @When("user enters new todos")
    public void user_enters_new_todos(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        List<String> todoList = dataTable.asList();
        //System.out.println("todoList = " + todoList);
        todoPage.addListOfTodos(todoList);
        Thread.sleep(3000);
    }
}
