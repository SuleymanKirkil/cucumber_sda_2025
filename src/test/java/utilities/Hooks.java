package utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setup(Scenario scenario){
        System.out.println("Setting up the environment, making it ready .....");
        System.out.println("scenario.getId() = " + scenario.getId());
        System.out.println("scenario.getName() = " + scenario.getName());
        scenario.log("Some information for test");
    }

    @After
    public void tearDowm(Scenario scenario){
        System.out.println("Scenario with name : "+scenario.getName()+ " is completed");
        System.out.println("Scenario with id : "+scenario.getId()+ " is completed");
        if (scenario.isFailed()){
            byte[] screenShot =((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","FailedScenarioScreenShot");
            System.out.println("Screen shot is taken for failed scenario : "+ scenario.getName());
        }
        System.out.println(" Cleaning up the environment ....");
        Driver.quitDriver();
    }

    @Before("@SauceDemo")
    public void setUpSauce(Scenario scenario){
        System.out.println("This scenario is abour Sauce Demo aplication only");
    }
}
