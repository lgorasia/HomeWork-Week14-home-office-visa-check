package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends TestBase {

    StartPage startPage;
    SelectNationalityPage selectNationalityPage;
    ReasonForTravelPage reasonForTravelPage;
    DurationOfStayPage durationOfStayPage;
    WorkTypePage workTypePage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;
    @BeforeMethod
    public void inIt(){
        startPage= new StartPage();
        selectNationalityPage = new SelectNationalityPage();
        reasonForTravelPage = new ReasonForTravelPage();
        durationOfStayPage = new DurationOfStayPage();
        workTypePage = new WorkTypePage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
    }
    @Test(groups = {"smoke","sanity","regression"})
    public void anAustralianCominToUKForTourism(){
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Australia");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForTravel();
        reasonForTravelPage.clickOnContinueOnReasonFromTravelPage();
        String actualText =reasonForTravelPage.youNotNeedVisaText();
        String expectedText = "You will not need a visa to come to the UK";
        Assert.assertEquals(actualText,expectedText);

    }
    @Test(groups = {"regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths(){

        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Chile");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.getSelectResonForTravelForChile();
        reasonForTravelPage.clickOnContinueOnReasonFromTravelPage();
        durationOfStayPage.selectMoreThanSixMonth();
        durationOfStayPage.selectContinue();
        workTypePage.selectJob();
        workTypePage.clikONNextButton();
        String actualText=workTypePage.youNeedVisaText();
        String expectedText="You need a visa to work in health and care";
        Assert.assertEquals(actualText,expectedText);
    }
@Test(groups = {"sanity", "regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
    startPage.clickStartNow();
    selectNationalityPage.selectNationality("Colombia");
    selectNationalityPage.clickNextStepButton();
    reasonForTravelPage.selectReasonToTravelJoinFamily();
    reasonForTravelPage.clickOnContinueOnReasonFromTravelPage();
    familyImmigrationStatusPage.clickOnYes();
    familyImmigrationStatusPage.clickOnContinueButton();
    String expectedMessage = "You’ll need a visa to join your family or partner in the UK";
    String actualMessage=familyImmigrationStatusPage.youNeedVisa();
    Assert.assertEquals(actualMessage,expectedMessage);


}




}
