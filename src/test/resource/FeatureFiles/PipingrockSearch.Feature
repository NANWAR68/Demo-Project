@regression
Feature: Pipingrock search functionality
Scenario: Search for Men's Vitamins
				 Given open Pipingrock Homepage
			   When Click on search box
				 And Search for Men's Vitamins
				 And Click on search key
				 Then Item list should have Men's Vitamin products