import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UncheckedPositiveTest extends Page {

    public UncheckedPositiveTest(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input:nth-child(3)")
    private WebElement uncheckedCheckBox;

    public void checkElement() {
        uncheckedCheckBox.click();
    }

    @FindBy(css = "input:nth-child(3)")
    private List<WebElement> checkBox2;

    public List<WebElement> getCheckBox2() {
        return checkBox2;
    }


    /* public boolean getCheckBox02() {
        return uncheckedCheckBox.isSelected();
    } */ //alternative
}
