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
        String nameForFind = "������ �����";
        findAllCoaches = new FindCoachesPage(driver);
        findAllCoaches.jumpToOurTeamPage();
        findAllCoaches.findOnCoachPersonalPage(nameForFind);
        assertTrue(findAllCoaches.checkPersonalPage(nameForFind));
    }
    public void testCheckByNameNegative(){
        String nameForFind = "����� ������";
        findAllCoaches = new FindCoachesPage(driver);
        findAllCoaches.jumpToOurTeamPage();
        findAllCoaches.findOnCoachPersonalPage(nameForFind);
        assertTrue(findAllCoaches.checkPersonalPage(nameForFind));;
    }



}
