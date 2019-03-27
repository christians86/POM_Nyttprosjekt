package no.interfoto.sider;

import no.interfoto.util.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Forside {

    //Dette er din constructor

    public static
    Properties config = new Properties (  );
    FileInputStream fis = new FileInputStream ( "C:\\Users\\Admin\\IdeaProjects\\Test_POM\\src\\main\\java\\com\\way2automation\\interfoto\\config\\config.properties");


    WebDriver driver;
    public
    Forside ( WebDriver driver) throws FileNotFoundException {

        this.driver = driver;
        try {
            config.load ( fis );
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }


    //Du kan bruke @findby med type, feks xpath, eller du kan bruke how = how. og dermed trigge det du vanligvis bruker med findby.xpath/id etc.
    // Eksempel 1     @FindBy(id = "username") evn @FindBy(how = How.ID, using = "username")
    //Random kommentarer for å teste merge

    @FindBy(how = How.CSS, using = Configuration.logginn)
    private WebElement logginn;

    @FindBy(how = How.ID, using = Configuration.loginboks)
    public WebElement loginboks;

    //Poenget med denne er er å lage metoden. Dvs du kan ikke kalle @findby og så få noe til å skje, du må ha en method. Det er hva du beskriver under. Du må lage en method per item. I dette tilfellet om loginboks var noe med action så måtte du lagd det også.
    // på denne siden er "longinboks" et element, og det tar tid å laste. Selenium er veldig kjapp, og vil kræsje hvis siden din ikke holder følge, dermed så var det viktig å legge inn dette elementet for å kunne ha en wait method senere.
    private void landingpage (){

    }
    public void logginnboks (){

        loginboks.click ();
    }
    public void logginn (){

        logginn.click ();

    }

}