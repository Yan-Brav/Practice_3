package qa.skillsup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PersonalDatePage {
    private By findAllCoaches = By.className("name");
    private WebDriver driver;
    private By searchByClass = By.xpath("//div[@class='greenHeader']");
    private By searchByClassText = By.xpath("//div[@class='text']/p[1]");
    private String person;

    public PersonalDatePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void jumpToPersonalPage(String name){
        List<WebElement> webElements = driver.findElements(findAllCoaches);
        for (WebElement webElement : webElements){
            if (webElement.getText().contains(name)){
                webElement.click();
                break;
            }
        }
    }

    public Boolean checkPersonalPage(String person){
        jumpToPersonalPage(person);
        System.out.println(driver.findElement(searchByClass).getText());
        return driver.findElement(searchByClass).getText().contains(person);
    }
    public Boolean checkPersonalPageByProfession(String profession){
        jumpToPersonalPage(person);
        System.out.println(driver.findElement(searchByClassText).getText());
        return driver.findElement(searchByClassText).getText().contains(profession);
    }
}
