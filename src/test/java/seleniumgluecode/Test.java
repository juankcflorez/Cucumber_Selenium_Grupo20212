package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test extends TestBase {

    // Primer Scenario


    @Given("^El usario se debe encontrar en la pagina Home principal de Imalittletester$")
    public void el_usario_se_debe_encontrar_en_la_pagina_Home_principal_de_Imalittletester() throws Throwable {


       Assert.assertTrue(homePage.homePageIsDisplayed());


    }

    @When("^se realice clic sobre el botón The Little Tester Comics$")
    public void se_realice_clic_sobre_el_botón_The_Little_Tester_Comics() throws Throwable {

        homePage.clickOnButtonTheLitterTesterComics();

    }

    @Then("^la aplicación debe redirigir al modulo de Comics$")
    public void la_aplicación_debe_redirigir_al_modulo_de_Comics() throws Throwable {

     Assert.assertTrue("No se redirecciono correctamente a la pagina Comics", comicsPage.isTitleComicsDisplayed());



    }


}
