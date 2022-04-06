import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddRemovePage {

    @FindBy(css = "button")
    private WebElement addElementButton;

    public void addElement() {
        addElementButton.click();
    }

    @FindBy(css = ".added-manually")
    private WebElement deleteButton;

    public void removeElement() {
        deleteButton.click();
    }

    @FindBy(css = ".added-manually")
    private List<WebElement> deleteBtnList;

    public List<WebElement> getDeleteBtn() {
        return deleteBtnList;
    }
}
