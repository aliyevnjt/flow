Feature: Purchase Requisition Form

  @req_form
  Scenario: Purchase Requision Form
  Given User is on the login page
  And User logs in application with username "matt" and password "matt"
  Then User clicks on data panel
  And User clicks on "Purchase Requsion Form"
  And User click on "PRF" create
  Then Select School "School A"
  And Select Department "Science"
  And Input title "I will move"
  And Input description "Out of New Hampshire"
  And Click Add New
  And Select account "Student's Supply"
  And For "title" input "Moving out"
  And For "description" input "New Hampshire is a village"
  And Select vendor "Amazon"
  And Input url "http://amazon.com"
  And Input count "10"
  And Input price "2"
  And "save" All
  And User clicks on blue button
    And User saves request
#  And User clicks on send request
    And User clicks on "OK" request
    Then User clicks on data panel
    And User clicks on "Purchase Requsion Form"
