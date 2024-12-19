Feature: As an Inlaze user I want to login my account for access platform


  @login_successful @test
  Scenario Outline: User Login Successful
    Given enter your credentials <email> <password>
    When enter the platform <user_name>
    Then you can log out

    Examples:
      | email                  | password      | user_name |
      | registerTest@gmail.com | Colombia2024. |Register Test|


  @login_validation @test
  Scenario Outline: User Login whit validation
    Given enter your credential whit validation <email> <password>
    When enter the platform <user_name>
    Then you can log out

    Examples:
      | email                  | password      | user_name |
      | registerTest@gmail.com | Colombia2024. |Register Test|


