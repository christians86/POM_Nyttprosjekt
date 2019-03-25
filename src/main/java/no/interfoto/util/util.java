package no.interfoto.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class util {

    public static Object properties( String key)
        {
        try {
            FileInputStream configfil = new FileInputStream ( "Config/config.properties" );
            Properties property = new Properties();
            property.load ( configfil );
            return property.get(key);
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
            return null;
        }

}
