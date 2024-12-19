package defintions.private_account;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static models.InstancesPrivateAccount.HOME_PAGE_STEPS;

public class HomePageDefinition {

    @When("^enter the platform (.*)$")
    public void enterThePlatform(String userName) {
        HOME_PAGE_STEPS.viewAccount(userName);
    }

    @Then("^you can log out$")
    public void youCanLogOut() {
        HOME_PAGE_STEPS.logOut();
    }
}
