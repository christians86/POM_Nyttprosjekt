package no.interfoto.util;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


// Beskriv her hvilke drivers du vil bruke. Du legger inn basert på config filen. Når du i configfilen sier du vil kjøre med Chrome
// så vil den plukke Chrome, hvis du siden må ha internet explorer så endrer du til det i Config filen, og denne klassen vil deretter prøve først chrome, deretter firefox
// deretter internetexplorer, og hvis ingen av de 3 er spesifisert, så går den by default til chrome

//Skriv inn hva driver skal hente etter å ha spesifisert hvilke nettlesere som er mulig.
//Bruk @ for å aktivere testng




public class createdriver {
    public WebDriver driver;

    @BeforeMethod
    public void startdriver()
    {
        if (util.properties ( "browserName" ).toString ().equalsIgnoreCase ( "chrome" ))
        {
            System.setProperty ( "webdriver.chrome.driver","Driver/chromedriver.exe" );
            WebDriver driver = new ChromeDriver();
        }
        else
        if (util.properties ( "browserName" ).toString ().equalsIgnoreCase ( "firefox" ))
        {
            WebDriver driver = new FirefoxDriver ();
        }
        else
        if (util.properties ( "browserName" ).toString ().equalsIgnoreCase ( "IE" ))
        {
            WebDriver driver = new InternetExplorerDriver ();
        }
        else
        {
            System.setProperty ( "webdriver.chrome.driver","Driver/chromedriver.exe" );
            driver = new ChromeDriver ();
        }

        driver.get (util.properties ( "applicationURL" ).toString ());
    }

    @AfterMethod
    public void enddriver()
    {
        driver.quit ();

    }

}
