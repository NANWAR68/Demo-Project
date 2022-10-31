@api@regression 
Feature: User Should able to create and get employee information using API
Scenario: Employee Information
   Given Create Employee details
    When Get all employee record details
    Then Get single employee record details
