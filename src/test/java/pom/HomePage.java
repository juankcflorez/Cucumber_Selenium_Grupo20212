package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super (driver);
    }

    String titleHomePage = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
    By titleComicsLocator = By.id("menu-item-20083");


    public boolean homePageIsDisplayed()throws Exception{
        return this.getTitle().equals(titleHomePage);

    }

    public void clickOnButtonTheLitterTesterComics () throws Exception{

        this.click(titleComicsLocator);
    }




}
