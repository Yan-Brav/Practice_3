package qa.skillsup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class FindCoachesPage {
    private By searchAllCoaches = By.className("name");
    private By clickOurTeam = By.linkText("���� �������");
    private WebDriver driver;
    private String baseUrl = "http://skillsup.ua";

    public FindCoachesPage(WebDriver driver) {
        this.driver = driver;
        driver.get(baseUrl);
        PageFactory.initElements(driver, this);
    }

    public void jumpToOurTeamPage(){
        driver.findElement(clickOurTeam).click();
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
