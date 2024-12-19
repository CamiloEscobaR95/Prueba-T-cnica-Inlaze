package defintions.login;

import cucumber.api.java.en.When;
import static models.InstancesLogin.SIGN_UP_STEPS;

public class SignUpDefinitions {


    @When("^complete the registration form \"([^\"]*)\" (.*) (.*)$")
    public void completeTheRegistrationForm(String fullName, String email, String password) {
        SIGN_UP_STEPS.filOutRegistration(fullName, email, password);
        SIGN_UP_STEPS.register();
    }

    @When("^complete the registration form whit validations \"([^\"]*)\" (.*) (.*)$")
    public void completeTheRegistrationFormWhitValidations(String fullName, String email, String password) {
        SIGN_UP_STEPS.filOutRegistration(fullName, email, password);
        SIGN_UP_STEPS.validateFields(fullName, email, password);
        SIGN_UP_STEPS.register();
    }


}
