package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Properties;

public class ConfigReader {

    public static String getProperty(String key){

        Properties pro = new Properties();

        try {
            pro.load(Files.newInputStream(new File("./config/config.properties").toPath()));
        } catch (IOException e) {
            System.out.println("Could not find the file " + e.getMessage());
        }
        return pro.getProperty(key);

        }
    }

