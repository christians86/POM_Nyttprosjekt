package test.java;

import no.interfoto.sider.Forside;
import no.interfoto.sider.Logginn;
import no.interfoto.util.util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test_login {

    public static Properties config = new Properties (  );


    public static void main(String [] args) throws IOException {


        WebDriver driver = new util.properties("Chrome");
        FileInputStream fis = new FileInputStream ( "C:\\Users\\Admin\\IdeaProjects\\Test_POM\\src\\main\\java\\com\\way2automation\\interfoto\\config\\OR.properties");
        config.load ( fis );

        startdriver.toString ().equalsIgnoreCase ( "Chrome" );
        driver.get (config.getProperty ("testsite")); WebDriverWait wait = new WebDriverWait (driver, 3);


        Forside forside = PageFactory.initElements ( driver, Forside.class );
        wait.until ( ExpectedConditions.elementToBeClickable ( forside.loginboks ) );
        util.properties("chrome")


    }



}



