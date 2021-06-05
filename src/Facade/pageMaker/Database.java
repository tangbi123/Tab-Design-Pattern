package Facade.pageMaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
    private Database(){}
    public static Properties getProperties(String dbname){
        String filename = dbname + ".txt";
        Properties prop = new Properties();
        try{
            prop.load(new FileInputStream(filename));
        }catch (IOException e){
            System.out.println("warning:" + filename + "is not found.");
        }
        return prop;
    }
}
