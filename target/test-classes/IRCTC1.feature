@Bus
Feature: Bus Tickets booking

Background: Launching the application
Given Launch the IRCTC application "https://www.irctc.co.in"



@Flights @Delta
Scenario Outline: Book a Flights
When User enters the from place "<From>"
And User enters the to place "<To>"
And User selects the future date
And User selects first class from the dropdown
And User selects the type of person
And User checks the flexible with date option
And User clicks on Search button
Then Validate the available Trains


Examples:
|From							|To			|
|CHENNAI EGMORE		|Delhi	|
|CHENNAI BEACH		|Mumbai	|
|TAMBARAM					|Kashmir|

@Train @alpha
Scenario Outline: Book a Flights
When User enters the from place "<From>"
And User enters the to place "<To>"
And User selects the future date
And User selects first class from the dropdown
And User selects the type of person
And User checks the flexible with date option
And User clicks on Search button
Then Validate the available Trains


Examples:
|From							|To			|
|CHENNAI EGMORE		|Delhi	|
|CHENNAI BEACH		|Mumbai	|
|TAMBARAM					|Kashmir|

@Buses
Scenario Outline: Book a Flights
When User enters the from place "<From>"
#And User enters the to place "<To>"
#And User selects the future date
#And User selects first class from the dropdown
#And User selects the type of person
#And User checks the flexible with date option
#And User clicks on Search button
#Then Validate the available Trains


Examples:
|From							|To			|
|CHENNAI EGMORE		|Delhi	|