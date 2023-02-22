Feature: Contact Us

  Scenario: Verify fields on page
    Given we are on Contact Us page
    Then verify and close window

  Scenario: verifying information is submitting after entering given data
    Given we are on Contact Us page
    When user enters data in name field
    And user enters data in email field
    And user enters data in phone field
    And user enters data in message field
    And click on submit to customer care button
    Then verify and close window

  Scenario: verifying information is submitting without entering any data
    Given we are on Contact Us page
    When click on submit to customer care button
    Then verify and close window

  Scenario: verifying that phone field should not accept alphabets
    Given we are on Contact Us page
    When user enters data in name field
    And user enters data in email field
    And user enters alphabets data in phone field
    And user enters data in message field
    And click on submit to customer care button
    Then verify and close window

  Scenario: verifying information is not submitting without entering name field
    Given we are on Contact Us page
    When user enters data in email field
    And user enters data in phone field
    And user enters data in message field
    And click on submit to customer care button
    Then verify and close window

  Scenario: verifying information is not submitting without entering email field
    Given we are on Contact Us page
    When user enters data in name field
    And user enters data in phone field
    And user enters data in message field
    And click on submit to customer care button
    Then verify and close window

  Scenario: verifying information is not submitting without entering phone field
    Given we are on Contact Us page
    When user enters data in name field
    And user enters data in email field
    And user enters data in message field
    And click on submit to customer care button
    Then verify and close window

  Scenario: verifying information is not submitting without entering message field
    Given we are on Contact Us page
    When user enters data in name field
    And user enters data in email field
    And user enters data in phone field
    And click on submit to customer care button
    Then verify and close window

  Scenario: verifying that email field is accepting correct emailid or not
    Given we are on Contact Us page
    When user enters data in name field
    And entering wrong emailid
    And user enters data in phone field
    And user enters data in message field
    And click on submit to customer care button
    Then verify and close window
