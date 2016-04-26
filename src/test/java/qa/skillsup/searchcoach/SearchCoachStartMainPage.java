package qa.skillsup.searchcoach;

import qa.skillsup.pages.FindCoachesPage;
import qa.skillsup.pages.PersonalDatePage;

public class SearchCoachStartMainPage extends BaseTest {

    private FindCoachesPage findAllCoaches;
    private PersonalDatePage personalDatePage;



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
        personalDatePage = new PersonalDatePage(driver);
        personalDatePage.jumpToPersonalPage(nameForFind);
        assertTrue(personalDatePage.checkPersonalPage(nameForFind));
    }
    public void testCheckByProfession(){
        String nameForFind = "������� ���������";
        String professionForFind = "Diving into Java";
        findAllCoaches = new FindCoachesPage(driver);
        findAllCoaches.jumpToOurTeamPage();
        personalDatePage = new PersonalDatePage(driver);
        personalDatePage.jumpToPersonalPage(nameForFind);
        assertTrue(personalDatePage.checkPersonalPageByProfession(professionForFind));
    }
    public void testCheckByNameNegative(){
        String nameForFind = "����� ������";
        findAllCoaches = new FindCoachesPage(driver);
        findAllCoaches.jumpToOurTeamPage();
        personalDatePage = new PersonalDatePage(driver);
        personalDatePage.jumpToPersonalPage(nameForFind);
        assertFalse(personalDatePage.checkPersonalPage(nameForFind));
    }


}
