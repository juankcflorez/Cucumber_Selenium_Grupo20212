package runner.browser_manager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager {


    @Override

    public void createDriver(){

        System.setProperty("webdriver.gecko.driver","./src/test/resources/Geckodriver/geckodriver.exe");
        driver = new FirefoxDriver();
    }



}
