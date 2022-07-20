Feature: Users at my bug catch application should be on their respective homepages

Scenario: Manager is on custom homepage

Given the manager is on custom homepage
When the manager enters a tester name
When the manager enters a defect
When the menager clicks the submit button
Then the manager will get an alert defect assigned