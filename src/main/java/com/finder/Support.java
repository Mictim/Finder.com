package com.finder;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Support {
    private InputStream stream;

    public Properties getProperties() throws IOException {
        Properties props = new Properties();
        String filename = "config.properties";
        try {

            stream = getClass().getClassLoader().getResourceAsStream(filename);

            if(stream != null){
                props.load(stream);
            } else {
                throw new FileNotFoundException("File does not exist");
            }
        } catch (Exception e){
            System.out.println("Exception: " + e);
        } finally {
            stream.close();
        }
        return props;
    }
}
