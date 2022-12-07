package data.property;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

    private String filePath;
    private Properties properties = new Properties();
    private FileReader fileReader;
    private FileWriter fileWriter;


    public static PropertyFile load(String filePath) {
        return new PropertyFile(filePath).load();
    }

    private PropertyFile(String filePath) {
        this.filePath = filePath;
    }

    private PropertyFile load() {
        try {
            fileReader = new FileReader(filePath);
            fileWriter = new FileWriter(filePath);
            properties.load(fileReader);
        } catch (IOException e) {
            try {
                fileReader = new FileReader(filePath);
                properties.load(fileReader);
            }catch (Exception e1){
                throw new RuntimeException(e1);
            }
        }
        return this;
    }

    public PropertyFile update(String key, String value){
        properties.setProperty(key, value);
        return this;
    }


    public PropertyFile write(){
        try {
            properties.store(fileWriter, "");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public String get(String key) {
        return properties.getProperty(key);
    }

    public PropertyFile put(String key, String value) {
        properties.setProperty(key, value);
        return this;
    }

    public PropertyFile remove(String key) {
        properties.remove(key);
        return this;
    }
}
