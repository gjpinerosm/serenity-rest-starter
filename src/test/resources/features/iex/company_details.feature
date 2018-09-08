Feature: Company Details

  Retreives the current company details for a given company

  Scenario: View company details

    Given I am an active trader on IEX
    When I request company information about AAPL
    Then I should receive the following company details:
      | symbol      | AAPL                 |
      | companyName | Apple Inc.           |
      | exchange    | Nasdaq Global Select |
      | industry    | Computer Hardware    |