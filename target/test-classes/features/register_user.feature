Feature: As an Inlaze user I want to register my account on the platform

  @registration_successful @test
  Scenario Outline: User registration Successful
    Given that the user enters the registration module
    When complete the registration form <full_name> <email> <password>
    Then You can view the confirmation of your account creation

    Examples:
      | full_name       | email                  | password      |
      | "Register Test" | registerTest@gmail.com | Colombia2024. |
      | "Register Test" | registerTest@gmail.com | Colombia2024. |


  @validations_register @test
  Scenario Outline: User registration whit validations
    Given that the user enters the registration module
    When complete the registration form whit validations <full_name> <email> <password>
    Then You can view the confirmation of your account creation

    Examples:
      | full_name       | email                  | password      |
      | "Register Test" | registerTest@gmail.com | Colombia2024. |


