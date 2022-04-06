import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;


public class HomePage {

    @FindBy(linkText = "Form Authentication")
    WebElement authenticationText;

    @FindBy(linkText = "Add/Remove Elements")
    WebElement addRemoveElt;

    @FindBy(linkText = "Checkboxes")
    SelenideElement checkboxes;


    public void goToLoginPage() {
        authenticationText.click();
    }

    public AddRemovePage goToAddRemovePage() {
        addRemoveElt.click();
        return page(AddRemovePage.class);
    }

    public CheckBoxesPage goToCheckboxesPage() {
      $(By.linkText("Checkboxes")).click();
        return page(CheckBoxesPage.class);
    }

}


