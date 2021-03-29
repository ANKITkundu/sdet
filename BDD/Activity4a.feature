
@AlchemyJob4
Feature: Posting a job using parameterization
@Scenario4a
Scenario Outline: Post a job using details passed from the Feature file
    Given open the browser and go to Alchemy Jobs site and navigate to Post a Job page
    When User enters the "<Email>" and "<JobTitle>" and "<Descrip>" and "<Company>" and click Preview and submit
    Then Go to Jobs page and Confirm job listing is shown on page "<JobTitle>"
Examples:
    | Email                    | JobTitle          | Descrip                        | Company   |
    | testingankit20@gmail.com | Alchemy SDET AK5  | Test jobs for Cucumber project | IBM2      |

