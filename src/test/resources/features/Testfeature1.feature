Feature: Create a course

  @Login
  Scenario Outline: User is able to login to application

    Given I go to the login page "https://ineuron-courses.vercel.app/login"
    When I enter "<email>" and "<password>"
    And i click on sign in
    And i click on Manage
    And i click on Manage Courses
    And i click on Add new course
    And i upload a new file
    And i enter course name
    And i enter description
    And i enter instructor
    And i enter price
    And i select start date
    And i select end date
    And i select category
    And i click save


    Examples:

      | email              | password |
      | ineuron@ineuron.ai | ineuron  |

