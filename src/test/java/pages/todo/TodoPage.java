package pages.todo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TodoPage {
    @FindBy(xpath = "//input[@type]")
    private WebElement addTodoField;

    public TodoPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void addTodo(String todo){
        addTodoField.sendKeys(todo + Keys.ENTER);
    }

    public void addListOfTodos(List<String> todoList){
        for (String todo:todoList){
            addTodo(todo);
        }
    }
}
