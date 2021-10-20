#Author: gautam.email@your.domain.com
Feature: AddTraffPlan

  Scenario: AddTraffplan
    Given user launch demo telecom webpages
    And user click on addtraffplan button
    When user click the submit button
    Then user verify Congratulation is generted
  #Scenario: AddTraffplan
   # When user enter all  fields using one l dim list
   #   | 1 | 1 | 2 | 2 | 1 | 1 | 1 |
   # And user click the submit button
    #Then user verify Congratulation is generted
 # Scenario: AddTraffplan
  #  When user enter all  fields using one dim map
  #    | rental          | 1 |
  #    | local_minutes   | 2 |
  #    | inter_minutes   | 3 |
  #    | sms_pac         | 4 |
  #    | minutes_charges | 5 |
  #    | inter_charges   | 6 |
  #    | sms_charges     | 2 |
  #  And user click the submit button
  #  Then user verify Congratulation is generted
