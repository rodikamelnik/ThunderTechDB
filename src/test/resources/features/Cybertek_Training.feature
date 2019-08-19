@smoke
Feature: Teachers' and Students' Functionalities

   @Add_Teachers
   Scenario: Ability to add teachers
    When Admin is on School page
    And Admin clicks on Teachers module
    When Admin chooses Add teachers sub-category
    And Admin fills out all necessary fields
    Then Admin clicks on submit button

    @Check_TeacherDB
    Scenario: Cheking if teacher is created
      When Admin is on School page
      And Admin clicks on Teachers module
      And Admin chooses All teachers sub-category
      And Admin clicks and types "name" of teacher in the teacher name box
      And Admin clicks on search button and clicks on teacher
      Then UI and DB values must match


   @Add_Student
   Scenario: Abbility to add a student
    When Admin is on School page
    And Admin clicks on Student module
    When Admin chooses Add student sub-category
    And Admin fills out all necessary fields for student
    Then Admin clicks on submit button


   @Check_StudentDB
   Scenario: Checking if student is created in DB
    When Admin is on School page
    And Admin clicks on Student module
    And Admin chooses All students sun-category
    And Admin clicks and types "name" of the student in student name box
    And Admin clicks on search button and clicks on student
    Then UI and database must match



    @Delete_Student
    Scenario: Delete a student
      When Admin is on School page
      And Admin clicks on Student module
      And Admin chooses All students sun-category
      And Admin clicks and types "name" of the student in student name box
      And Admin clicks on search button
      And Admin clicks on three dots and choose delete option
      Then Delete window pops up and Admin clicks Delete



     @Check_Student_Deleted_DB
     Scenario: Check if Student is deleted
       When Admin is on School page
       And Admin clicks on Student module
       And Admin chooses All students sun-category
       And Admin clicks and types "name" of the student in student name box
       And Admin clicks on search button
       Then UI and DB must be same


     @Delete_Teacher
     Scenario: Delete a teacher
       When Admin is on School page
       And Admin clicks on Teachers module
       And Admin chooses All teachers sub-category
       And Admin clicks and types "name" of teacher in the teacher name box
       And Admin clicks on search button
       And Admin clicks on three dotd and choose to delete teacher
       Then Delete employee window pop ups and Admin clicks Delete


     @Check_Techer_delete_DB
     Scenario: Chef if Techer is deleted
       When Admin is on School page
       And Admin clicks on Teachers module
       And Admin chooses All teachers sub-category
       And Admin clicks and types "name" of teacher in the teacher name box
       And Admin clicks on search button
       Then UI values must match DB