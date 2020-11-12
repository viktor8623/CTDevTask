Feature: Vacancies tests

  @Test
  Scenario: Verify Professional skills for Test Automation Engineer
    Given open "https://ctco.lv/en" page
    When navigate to "Careers" -> "Vacancies" page
    And open vacancy with title "Test Automation Engineer"
    Then verify that paragraph under Professional skills and qualification: contains exactly 5 skills