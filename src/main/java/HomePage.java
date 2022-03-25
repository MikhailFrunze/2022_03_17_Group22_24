import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;

public class HomePage extends Page{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy (linkText = "Form Authentication")
    WebElement authenticationText;

    @FindBy (linkText = "Add/Remove Elements")
    WebElement addRemoveElt;

    public void goToLoginPage (){
        authenticationText.click();
    }

    public AddRemovePage goToAddRemovePage() {
        addRemoveElt.click();
        return new AddRemovePage(driver);
    }

}


