@regression
Feature: Assurant search functionality
Scenario: Search for Financial Service
				Given open Assurant Homepage
				When Click on search button 
				And Search for Financial Services
				And Click on search button 
				Then Item list should have financial service related infromation