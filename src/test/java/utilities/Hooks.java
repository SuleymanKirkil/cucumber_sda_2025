package utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    @Before
    public void setup(Scenario scenario){
        System.out.println("Setting up the environment, making it ready .....");
        System.out.println("scenario.getId() = " + scenario.getId());
        System.out.println("scenario.getName() = " + scenario.getName());
    }

    @After
    public void tearDowm(Scenario scenario){
        System.out.println("Scenario with name : "+scenario.getName()+ " is completed");
        System.out.println("Scenario with id : "+scenario.getId()+ " is completed");
        System.out.println(" Cleaning up the environment ....");
        Driver.quitDriver();
    }

    @Before("@SauceDemo")
    public void setUpSauce(Scenario scenario){
        System.out.println("This scenario is abour Sauce Demo aplication only");
    }
}
