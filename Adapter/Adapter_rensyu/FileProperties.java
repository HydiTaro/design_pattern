package Adapter.Adapter_rensyu;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements FileIO{

    Properties p = new Properties();
    String width,height,depth;

    public FileProperties(){
        super();
    }
    
    @Override
    public void readFromFile(String filename) throws IOException {
        p.load(new FileReader(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        p.store(new FileWriter(filename),"Written bt FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        p.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return p.getProperty(key);
    }
}
