package qa.skillsup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class FindCoachesPage {
    private By searchAllCoaches = By.className("name");
    private By clickOurTeam = By.linkText("Наша команда");
    private WebDriver driver;
    private String baseUrl = "http://skillsup.ua";

    private By searchByClass = By.xpath("//div[@class='greenHeader']");


    public FindCoachesPage(WebDriver driver) {
        this.driver = driver;
        driver.get(baseUrl);
        PageFactory.initElements(driver, this);
    }

    public void jumpToOurTeamPage(){
        driver.findElement(clickOurTeam).click();
    }

    public void findOnCoachPersonalPage(String name){
        List<WebElement> webElements = driver.findElements(searchAllCoaches);
        for (WebElement webElement : webElements){
            if (webElement.getText().contains(name)){
                webElement.click();
            }else {
                System.out.println("Element wasn't found");
            }
        }
       // return driver.findElement(searchByClass).getText().contains(name);
    }

    public Boolean checkPersonalPage(String person){
        findOnCoachPersonalPage(person);
        System.out.println(driver.findElement(searchByClass).getText());
        return driver.findElement(searchByClass).getText().contains(person);
    }

    public Boolean checkCoachIsPresentedOnPage(String person){
        return searchElementsWithCoachName().contains(person);
    }

    public List<String> searchElementsWithCoachName(){
        List<String> coachNames = new ArrayList<String>();
        List<WebElement> elements = driver.findElements(searchAllCoaches);
        for (WebElement element : elements){
            coachNames.add(element.getText());
        }
        return coachNames;
    }
}
