package qa.skillsup.searchcoach;

import qa.skillsup.pages.FindCoachesPage;

public class SearchCoachStartMainPage extends BaseTest {

    private FindCoachesPage findAllCoaches;


    public void testFindCoachJava()throws Exception{
        findAllCoaches = new FindCoachesPage(driver);
        findAllCoaches.jumpToOurTeamPage();
        assertTrue(findAllCoaches.checkCoachIsPresentedOnPage("��������� ����������"));
    }

    public void testFindAdmin()throws Exception{
        findAllCoaches = new FindCoachesPage(driver);
        findAllCoaches.jumpToOurTeamPage();
        assertTrue(findAllCoaches.checkCoachIsPresentedOnPage("������ �����"));
    }

    public void testFindCoachQaAutomation()throws Exception{
        findAllCoaches = new FindCoachesPage(driver);
        findAllCoaches.jumpToOurTeamPage();
        assertFalse(findAllCoaches.checkCoachIsPresentedOnPage("����� ������"));
    }

    public void testCheckByName(){
        findAllCoaches = new FindCoachesPage(driver);
        findAllCoaches.jumpToOurTeamPage();
        assertTrue(findAllCoaches.findOnCoachPersonalPage("��� �������������"));
    }



}
