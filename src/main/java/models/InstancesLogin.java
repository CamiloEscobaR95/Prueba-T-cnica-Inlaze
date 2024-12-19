package models;

import pages.login.SingInPage;
import pages.login.SingUpPage;
import steps.login.SingInSteps;
import steps.login.SingUpSteps;

public class InstancesLogin {

    public static final SingInSteps SIGN_IN_STEPS = new SingInSteps();
    public static final SingUpSteps SIGN_UP_STEPS = new SingUpSteps();

    public static final SingInPage SIGN_IN_PAGE = new SingInPage();
    public static final SingUpPage SIGN_UP_PAGE = new SingUpPage();
}
