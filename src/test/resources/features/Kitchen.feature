
Feature: As a user I should be able to login to BookIT page.

  Scenario Outline: Login as student.
    Given student is on the login page.
    When student login using "<loginStudent>" and "<loginPassword>"
    And dashboard should displayed "bookit"

    Examples:
      | username              | password      |
      | dronaghan8v@google.ca | nonnayablsley |