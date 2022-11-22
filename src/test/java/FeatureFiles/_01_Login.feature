#Senaryo ;
  #1- siteyi aciniz.
  #2- username ve password u gönderin ve Login butonuna tiklatin.
  #3- Login olduğunuzu doğrulayın.


  Feature: Login Functionality

    Scenario: Login with valid username and password

      Given Naviagate to Campus
      When Enter username and password and click Login button
      Then User should login successfuly