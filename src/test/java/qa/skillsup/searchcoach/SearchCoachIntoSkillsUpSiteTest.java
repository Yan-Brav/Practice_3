package qa.skillsup.searchcoach;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;


public class SearchCoachIntoSkillsUpSiteTest extends BasePage{

    private String findCoach;
    private WebElement webElement;



    @Test
    public void testFindCoachJava()throws Exception{
        findCoach = "http://skillsup.ua/media/22116/Alexander-Galkovskiy_P.jpg";
        //The line below is right too.
        //webElement = driver.findElement(By.cssSelector("img[src*='Galkovskiy']"));
        //The line below created with WebDriver Element Locator
        webElement = driver.findElement(By.xpath("//img[@src='/media/22116/Alexander-Galkovskiy_P.jpg']"));


       assertEquals(findCoach, webElement.getAttribute("src").toString());
    }
    @Test
    public void testFindAdmin()throws Exception{
        findCoach = "http://skillsup.ua/media/22166/Michael-Chokan_P.jpg";
        webElement = driver.findElement(By.cssSelector("img[src*='Chokan']"));

       assertEquals(findCoach, webElement.getAttribute("src").toString());
    }

    @Test(expected = NoSuchElementException.class)
    public void testFindCoachQAAutomation()throws NoSuchElementException {

        try {
            webElement = driver.findElement(By.cssSelector("img[src*='Karpov']"));
        } catch (NoSuchElementException e) {
            System.out.println("I catch NoSuchElementException, it's all right");
        }
    }



}
