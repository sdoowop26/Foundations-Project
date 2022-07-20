Feature: Users at my bug catch application should be on their respective homepages

Scenario: Tester is on custom homepage

Given the tester is on custom homepage
When the tester enters a defectId
When the tester enters descision
When the tester clicks  the submit button
Then the descision will be updated
Then the tester will get an alert cowabunga dude!

