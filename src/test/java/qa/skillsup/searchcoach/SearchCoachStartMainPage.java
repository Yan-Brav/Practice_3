package qa.skillsup.searchcoach;

import qa.skillsup.pages.FindCoachesPage;

public class SearchCoachStartMainPage extends BaseTest {

    private FindCoachesPage findAllCoaches;


    public void testFindCoachJava()throws Exception{
        findAllCoaches = new FindCoachesPage(driver);
        findAllCoaches.jumpToOurTeamPage();
        assertTrue(findAllCoaches.checkCoachIsPresentedOnPage("Александр Галковский"));
    }

    public void testFindAdmin()throws Exception{
        findAllCoaches = new FindCoachesPage(driver);
        findAllCoaches.jumpToOurTeamPage();
        assertTrue(findAllCoaches.checkCoachIsPresentedOnPage("Михаил Чокан"));
    }

    public void testFindCoachQaAutomation()throws Exception{
        findAllCoaches = new FindCoachesPage(driver);
        findAllCoaches.jumpToOurTeamPage();
        assertFalse(findAllCoaches.checkCoachIsPresentedOnPage("Артем Карпов"));
    }

    public void testCheckByName(){
        String nameForFind = "Михаил Чокан";
        findAllCoaches = new FindCoachesPage(driver);
        findAllCoaches.jumpToOurTeamPage();
        findAllCoaches.jumpToPersonalPage(nameForFind);
        assertTrue(findAllCoaches.checkPersonalPage(nameForFind));
    }
    public void testCheckByProfession(){
        String nameForFind = "Алексей Педоренко";
        String professionForFind = "Diving into Java";
        findAllCoaches = new FindCoachesPage(driver);
        findAllCoaches.jumpToOurTeamPage();
        findAllCoaches.jumpToPersonalPage(nameForFind);
        assertTrue(findAllCoaches.checkPersonalPageByProfession(professionForFind));
    }
    public void testCheckByNameNegative(){
        String nameForFind = "Артем Карпов";
        findAllCoaches = new FindCoachesPage(driver);
        findAllCoaches.jumpToOurTeamPage();
        findAllCoaches.jumpToPersonalPage(nameForFind);
        assertFalse(findAllCoaches.checkPersonalPage(nameForFind));
    }



}
