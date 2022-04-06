import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Map;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    HomePage homePage;
    WebDriver driver;
    Map<String, Object> vars;
    JavascriptExecutor js;
    AddRemovePage addRemovePage;
    CheckBoxesPage uncheckedPositiveTest;

    @Before
    public void setUp() {
        /*System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();*/
        open("http://the-internet.herokuapp.com/");
        /*driver.manage().window().setSize(new Dimension(1792, 1010));*/
        homePage = new HomePage();
    }

}
