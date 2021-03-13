package seleniumgluecode;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_buscador extends TestBase {



    @Given("^El usario se debe encontrar en el Home principal de Imalittletester$")
    public void el_usario_se_debe_encontrar_en_el_Home_principal_de_Imalittletester() throws Throwable {

        Assert.assertTrue(homePage.homePageIsDisplayed());




    }

    @When("^Situarse en la caja de busqueda Search$")
    public void situarse_en_la_caja_de_busqueda_Search() throws Throwable {

        WebElement boxsearchLocator = driver.findElement(By.className("search-field"));


    }

    @And("^Ingresar la palabra Selenium$")
    public void ingresar_la_palabra_Selenium() throws Throwable {

        WebElement boxsearchLocator = driver.findElement(By.className("search-field"));

        boxsearchLocator.sendKeys("Selenium");

    }

    @And("^Ejecutar la busqueda precionando la tecla Enter$")
    public void ejecutar_la_busqueda_precionando_la_tecla_Enter() throws Throwable {

        WebElement boxsearchLocator = driver.findElement(By.className("search-field"));
        boxsearchLocator.submit();


    }

    @Then("^Se debe visualizar los resultados de la busqueda$")
    public void se_debe_visualizar_los_resultados_de_la_busqueda() throws Throwable {

        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://imalittletester.com/?s=Selenium",url);



    }





}
