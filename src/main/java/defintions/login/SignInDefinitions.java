package defintions.login;

import cucumber.api.java.en.*;

import static models.InstancesLogin.SIGN_IN_STEPS;

public class SignInDefinitions {

    @Given("^enter your credentials (.*) (.*)$")
    public void enterYourCredentials(String email, String password) {
        SIGN_IN_STEPS.enterTheAccount(email, password);
    }

    @Given("^enter your credential whit validation (.*) (.*)$")
    public void enterYourCredentialsValidation(String email, String password) {
        SIGN_IN_STEPS.enterTheAccountWhitValidation(email, password);
    }

    @Given("^that the user enters the registration module$")
    public void thatTheUserEntersTheRegistrationModule() {
        SIGN_IN_STEPS.enterToRegister();
    }


    @Then("^You can view the confirmation of your account creation$")
    public void youCanViewTheConfirmationOfYourAccountCreation() {
        SIGN_IN_STEPS.viewAccountCreationAlert();
    }
}
