import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;

public class CheckBoxesPage {

    private static final By checkboxes = By.xpath("//form[@id='checkboxes']/input");


    public void checkElement(int index) {
        $$(checkboxes).get(index).click();
    }

    public SelenideElement isCheckboxSelected(int ind) { // при тесте мы выбираем сразу какой элемент нам нужен

        return $$(checkboxes).get(ind); // try catch exception
    }










    /* public boolean getCheckBox02() {
        return uncheckedCheckBox.isSelected();
    } */ //alternative
}
