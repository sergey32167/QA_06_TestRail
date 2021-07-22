package core;

import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    protected Properties properties;

    public ReadProperties() {
        properties = new Properties();

        try {
            properties.load(getClass().getClassLoader().getResourceAsStream("resources.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getURL() {
        return properties.getProperty("url");
    }

    public String getBrowser() {
        return properties.getProperty("browser");
    }

    public String getPassword() {
        return properties.getProperty("password");
    }

    public String getUsername() {
        return properties.getProperty("username");
    }

    public int getTimeOut() { return Integer.parseInt(properties.getProperty("timeout"));}

    public boolean getHeadless() {
        return Boolean.parseBoolean(properties.getProperty("headless"));}
    }




