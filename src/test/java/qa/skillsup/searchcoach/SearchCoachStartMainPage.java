package qa.skillsup.searchcoach;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class SearchCoachStartMainPage extends BasePage {

    private String findCoach;
    private WebElement webElement;
    private By clickOurTeam = By.linkText("Наша команда");
    private By searchCoachJava = By.xpath("//img[@src='/media/22116/Alexander-Galkovskiy_P.jpg']");
    private By searchAdmin = By.cssSelector("img[src*='Chokan']");
    private By searchCoachQAAutomation = By.cssSelector("img[src*='Karpov']");



    @Test
    public void testFindCoachJava()throws Exception{
        driver.findElement(clickOurTeam).click();
        findCoach = "http://skillsup.ua/media/22116/Alexander-Galkovskiy_P.jpg";
        webElement = driver.findElement(searchCoachJava);

        assertEquals(findCoach, webElement.getAttribute("src").toString());
    }
    @Test
    public void testFindAdmin()throws Exception{
        driver.findElement(clickOurTeam).click();
        findCoach = "http://skillsup.ua/media/22166/Michael-Chokan_P.jpg";
        webElement = driver.findElement(searchAdmin);

        assertEquals(findCoach, webElement.getAttribute("src").toString());
    }

    @Test(expected = NoSuchElementException.class)
    public void testFindCoachQAAutomation()throws NoSuchElementException {

        try {
            driver.findElement(clickOurTeam).click();
            webElement = driver.findElement(searchCoachQAAutomation);
        } catch (NoSuchElementException e) {
            System.out.println("I catch NoSuchElementException, it's all right");
        }
    }
}
