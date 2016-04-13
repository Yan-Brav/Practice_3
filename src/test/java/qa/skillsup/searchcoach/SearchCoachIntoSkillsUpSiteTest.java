package qa.skillsup.searchcoach;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class SearchCoachIntoSkillsUpSiteTest extends BasePage{

    private String findCoach;
    private WebElement webElement;



    @Test
    public void testFindCoachJava()throws Exception{
        findCoach = "Александр Галковский";
        webElement = driver.findElement(By.xpath("//span[text()='Александр Галковский']/.."));

       assertEquals(findCoach, webElement.getText());
    }


}
