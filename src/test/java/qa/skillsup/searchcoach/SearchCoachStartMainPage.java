package qa.skillsup.searchcoach;

import org.junit.Test;
import qa.skillsup.pages.FindCoachesPage;

public class SearchCoachStartMainPage extends BaseTest {

    private FindCoachesPage findAllCoaches;

    @Test
    public void testFindCoachJava()throws Exception{
        findAllCoaches = new FindCoachesPage(driver);
        findAllCoaches.jumpToOurTeamPage();
        assertTrue(findAllCoaches.checkCoachIsPresentedOnPage("Александр Галковский"));
    }
    @Test
    public void testFindAdmin()throws Exception{
        findAllCoaches = new FindCoachesPage(driver);
        findAllCoaches.jumpToOurTeamPage();
        assertTrue(findAllCoaches.checkCoachIsPresentedOnPage("Михаил Чокан"));
    }
    @Test
    public void testFindCoachQaAutomation()throws Exception{
        findAllCoaches = new FindCoachesPage(driver);
        findAllCoaches.jumpToOurTeamPage();
        assertFalse(findAllCoaches.checkCoachIsPresentedOnPage("Артем Карпов"));
    }



}
