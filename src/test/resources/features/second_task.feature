Feature: Advanced Date Picker

#  @Test
  Scenario Outline: Advanced Date Picker tests
    Given set up date picker with <enteredYear> <enteredMonth> <enteredDay>
    Then into DB submitted following date <expectedResult>

    Examples:
    | enteredYear    | enteredMonth        | enteredDay| expectedResult                  |
    | current        | current             | current   | today                           |
    | current        | current             |           | today                           |
    | current        | previous            |           | 15th date of the previous month |
    | current        | current - 2 or more |           | 15th date of the provided month |
    | current        | future              |           | 15th date of the provided month |
    | previous       | any                 |           | 15th date of the provided month |
    | -2 or more year| any                 |           | 15th date of the provided month |
    | previous       | any                 |           | 15th date of the provided month |
    | future         | any                 |           | 15th date of the provided month |
    | current        |                     |           | Half of the period passed       |
    | previous       |                     |           | 31 December of the previous year|
    | -2 or more year|                     |           | 30th June of the year entered   |
    | future         |                     |           | 30th June of the year entered   |

#  Please list most likely problems you could expect during such functionality testing.
#  1. Do not run tests at midnight.
#  2. "current - 2 or more" and "previous" month won't work in the begging of the year.