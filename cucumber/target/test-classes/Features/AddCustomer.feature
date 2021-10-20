#Author: gautambe217.email@your.domain.com
Feature: Add Customer flow validation

  Scenario: Add Customer

  # Given user launch demo telecom applications
  # And user click on add customer button
  # When user enter all the fields
  # And user click on submit button
  # Then user verify customer id is generted
  Scenario: Add Customer validation by using 1 dim list

  # Given user launch demo telecom applications
  #  And user click on add customer button
  #  When user enter all the fields by one dim list concep
  #    | gautam | m | gautam217@gmail.com | chennai | 7845506049 |
  #  And user click on submit button
  #  Then user verify customer id is generted
  Scenario: Add Customer validation by using 1 dim map

  # Given user launch demo telecom applications
  # And user click on add customer button
  # When user enter all the fields by one dim map concep
  #   | fname       | gauatm              |
  #   | lname       | m                   |
  #   | email       | gautam217@gmail.com |
  #   | addr        | chennai             |
  #   | telephoneno |          7845506049 |
  # And user click on submit button
  # Then user verify customer id is generted
  Scenario: Add Customer validation by using 2 dim list

  #  Given user launch demo telecom applications
  #  And user click on add customer button
  # When user enter all the fields by two dim list concep
  #    | gautam  | m     | gautam217@gmail.com | chennai | 7845506049 |
  #    | pradeep | kumar | gautam217@gmail.com | chennai | 8455060490 |
  #    | divan   | r     | gautam217@gmail.com | chennai | 4550604912 |
  #    | saran   | m     | gautam217@gmail.com | chennai | 5506049221 |
  #    | deeraj  | m     | gautam217@gmail.com | chennai | 5506049221 |
  #  And user click on submit button
  #   Then user verify customer id is generted
  Scenario: Add Customer validation by using 2 dim map
    Given user launch demo telecom applications
    And user click on add customer button
    When user enter all the fields by two dim map concep
      | fname   | lname | email               | addr    | telephone  |
      | gautam  | m     | gautam217@gmail.com | chennai | 7845506049 |
      | pradeep | kumar | gautam217@gmail.com | chennai | 8455060490 |
      | divan   | r     | gautam217@gmail.com | chennai | 4550604912 |
      | saran   | g     | gautam217@gmail.com | chennai | 5506049221 |
      | deeraj  | a     | gautam217@gmail.com | chennai | 5506049221 |
    And user click on submit button
    Then user verify customer id is generted
