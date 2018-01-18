
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.open;

import com.finder.Support;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.Properties;


public class BaseTest {
    @BeforeClass
    public void setUp(){
        Properties props = new Properties();
        try {
            props  = new Support().getProperties();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String browser = props.getProperty("browser");
        switch(browser){
            case ("chrome"):
                System.setProperty("webdriver.chrome.driver", props.getProperty("chromedriver"));
                Configuration.browser = "chrome";
                break;
            default:

        }
        open("https://www.finder.com.au/health-insurance");
    }
}
