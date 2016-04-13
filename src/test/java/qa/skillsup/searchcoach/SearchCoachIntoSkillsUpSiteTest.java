package qa.skillsup.searchcoach;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class SearchCoachIntoSkillsUpSiteTest extends BasePage{
    private String baseUrl;
    private String findCoach;
    private WebElement webElement;
    //private List<WebElement> elenents = new ArrayList<WebElement>();
    private String className = "member";


    @Before
    public void setUp(){
        baseUrl = "http://skillsup.ua/about/our-team.aspx#";
        driver.get(baseUrl);
    }

    @Test
    public void testFindCoachJava()throws Exception{
        findCoach = "Александр Галковский";
        webElement = driver.findElement(By.xpath("//span=Александр Галковский"));
        //elenents = driver.findElements(By.className(className));
        /*for (WebElement element : elenents){
            //assertEquals(findCoach, element.findElement(By.linkText(findCoach)));
            if (findCoach.equals(element.findElement(By.xpath("//span=Александр Галковский")))){
                return;
            }
        }*/

       assertEquals(findCoach, webElement.getText());
    }


}
