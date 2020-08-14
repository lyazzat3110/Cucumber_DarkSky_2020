package stepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import runnerTest.webPages.HomePage;

public class HomePageSD {

HomePage homePage = new HomePage();

@Given ("^I am on DarkSky Home Page$")
    public void verificationHomePageTitlte(){
    Assert.assertEquals(homePage.getHomePageTitle(),"Dark Sky - Broadway, New York, NY");

}
@When ("^I click on Today and expand it$")
    public void expandTodayLine() throws InterruptedException {
    homePage.expandToday();
}
@Then ("^I verify lowest and highest temp is displayed correctly$")
    public void showMaxAndMinTemp() throws InterruptedException {
    homePage.findTodaysTemperature();

}}
