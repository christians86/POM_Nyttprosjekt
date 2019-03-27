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

@SuppressWarnings("ALL")
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

    @FindBy(how = How.CSS, using = Configuration.forside_logginn)
    private WebElement logginn;

    @FindBy(how = How.ID, using = Configuration.forside_loginboks)
    private WebElement loginboks;

    @FindBy(how = How.ID, using = Configuration.forside_fotodropdown)
    public WebElement forside_fotodropdown;

    @FindBy(how = How.ID, using = Configuration.forside_videodropdown)
    public WebElement forside_videodropdown;

    @FindBy(how = How.ID, using = Configuration.forside_lysogstudiodropdown)
    public WebElement forside_lysogstudiodropdown;

    @FindBy(how = How.ID, using = Configuration.forside_bruktdropdown)
    public WebElement forside_bruktdropdown;

    @FindBy(how = How.ID, using = Configuration.forside_arrangementerdropdown)
    public WebElement forside_arrangementerdropdown;

    @FindBy(how = How.ID, using = Configuration.forside_omInterfoto)
    public WebElement forside_omInterfoto;

    @FindBy(how = How.ID, using = Configuration.meny_mellomformat)
    public WebElement meny_mellomformat;

    @FindBy(how = How.ID, using = Configuration.meny_analog)
    public WebElement meny_analog;

    @FindBy(how = How.ID, using = Configuration.meny_optikk)
    public WebElement meny_optikk;

    //Poenget med denne er er å lage metoden. Dvs du kan ikke kalle @findby og så få noe til å skje, du må ha en method. Det er hva du beskriver under. Du må lage en method per item. I dette tilfellet om loginboks var noe med action så måtte du lagd det også.
    // på denne siden er "longinboks" et element, og det tar tid å laste. Selenium er veldig kjapp, og vil kræsje hvis siden din ikke holder følge, dermed så var det viktig å legge inn dette elementet for å kunne ha en wait method senere.
    public void landingpage (){

    }
    public void logginnboks (){

        loginboks.click ();
    }
    public void logginn (){

        logginn.click ();

    }
    public void forside_fotodropdown (){

        forside_fotodropdown.click ();

    }
    public void forside_videodropdown (){

        forside_videodropdown.click ();

    }
    public void forside_lysogstudiodropdown (){

        forside_lysogstudiodropdown.click ();

    }
    public void forside_bruktdropdown (){

        forside_bruktdropdown.click ();

    }
    public void forside_arrangementerdropdown (){

        forside_arrangementerdropdown.click ();

    }
    public void forside_omInterfoto (){

        forside_omInterfoto.click ();

    }
    public void meny_mellomformat (){

        meny_mellomformat.click ();

    }
    public void meny_analog (){

        meny_analog.click ();

    }
    public void meny_optikk (){

        meny_optikk.click ();

    }

}