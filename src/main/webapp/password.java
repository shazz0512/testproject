import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadPropertiesFileExample {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            // Load properties file from the file system
            InputStream inputStream = new FileInputStream("secret.properties");
            properties.load(inputStream);
            inputStream.close();

            // Access properties
           String password = properties.getProperty("password");

            System.out.println("Database URL: " + databaseUrl);
            System.out.println("Database Username: " + databaseUsername);
            System.out.println("Database Password: " + password);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
