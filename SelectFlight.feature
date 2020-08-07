Feature: Select Flight Page.
Description: User navigates to the Select Flight page and chooses the best Itinerary.

Background:
Given I navigate to the Home Page

@Regression
Scenario: Verify that the user is able to search flights and pick the best itinerary
When I enter the Source "Hyderabad" and Destination "Bengaluru"
And I select the Departure Date "August-31-2020"
And I search for the available Itineraries
Then I am on the Flight Search Page
And I am able to select the best Itinerary