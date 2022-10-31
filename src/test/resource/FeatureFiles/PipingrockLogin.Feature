@regression
Feature: Pipingrock login functionality
Scenario: Login functionality with valid email and password
      Given Open Pipingrock home page
      When Click on my account button
      And Type valid Email address
      And Type valid password
      And Click on Sign In button
     Then login successfully