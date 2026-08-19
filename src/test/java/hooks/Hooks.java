package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;

public class Hooks {
	

    @Before
    public void setUp() {

        ConfigReader.loadProperties();

        DriverManager.initializeDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
    	if(scenario.isFailed()) {
    		WebDriver driver=DriverManager.getDriver();
    		byte[] screenshot=((TakesScreenshot) driver) .getScreenshotAs(OutputType.BYTES);
    		scenario.attach(screenshot, "image/png", "failed scenario");
    		System.out.println("scenari failed");
    	}
    	System.out.println("ssattached");
        DriverManager.quitDriver();
    }
//CHECKING TE JENKINS RUN
}
