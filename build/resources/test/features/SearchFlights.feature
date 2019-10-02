Feature: Expedia Page
  As a web user
  I want to use Expedia page
  to look for a flight according to my needs

  @Scenario1
  Scenario Outline: Find a one way flight according to the filter
    Given that "<actor>" looks for the first one way flight departure
    When he completes the form with "<flying from>" and "<flying to>"
    And he changes the order of the flights listed by first flight departure
    Then he sees the list of flights according to the needs

    Examples: 
      | actor | flying from                                       | flying to                              |
      | Susan | Medellin, Colombia (MDE-Jose Maria Cordova Intl.) | Bogota, Colombia (BOG-El Dorado Intl.) |

  @Scenario2
  Scenario Outline: Find a flight with the same origin and destination
    Given that "<actor>" looks for the first one way flight departure
    When he completes the form with "<flying from>" and "<flying to>"
    Then he sees an error message

    Examples: 
      | actor | flying from                                       | flying to                                         |
      | Peter | Medellin, Colombia (MDE-Jose Maria Cordova Intl.) | Medellin, Colombia (MDE-Jose Maria Cordova Intl.) |

  Scenario: Select a destination date before the current date

  Scenario: Change the number of travelers to more than 1

  Scenario: Select a preferred airline

  Scenario: Select a preferred class

  Scenario: Select nonstop option

  Scenario: Select Refundable flight option

  Scenario: Add a hotel in the search
