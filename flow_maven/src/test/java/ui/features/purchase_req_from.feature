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
  And Input title "Cucumber Test title"
  And Input description "Cucumber Test description"
  And Click Add New
  And Select account "Student's Supply"
  And For "title" input "hey vdfdf"
  And For "description" input "hey"
  And Select vendor "Amazon"
  And Input url "http://amazon.com"
  And Input count "10"
  And Input price "2"
  And "save" All
  
  
   

  
