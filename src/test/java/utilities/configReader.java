package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader {
     static Properties properties;

     static {
        String dosyaYolu="src/configuration.properties";
         try {

             FileInputStream fis= new FileInputStream(dosyaYolu);
             properties= new Properties();
             properties.load(fis);
         } catch (FileNotFoundException e) {


         } catch (IOException e) {
             System.out.println("properties okunamadı");
         }
     }
     public static String getProperty(String key){
         return properties.getProperty(key);
     }
}
