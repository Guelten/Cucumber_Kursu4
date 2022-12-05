#Senaryo :
#  Employee menusu için Create-Exist-Delete bölümleri olan Senaryoyu yazınız
#  Daha sonra aynı senaryoru 5 farklı degerler için çalıştırınız.

Feature: Employee Functionality (DataTable - Scenario Outline)

  Background:
    Given Naviagate to Campus
    When Enter username and password and click Login button
    Then User should login successfuly

  Scenario Outline: Employee Functionality
    And Click on the element in left nav
      | humanResources |
      | employees      |

    And Click on the element in the Dialog
      | addButton  |

    And User sending the keys in Dialog content
      | firstnameInput    | <firstName> |
      | lastnameInput     | <lastName> |
      | genderCode        | <gender> |
      | statusCode        | <status> |
      | employeeTypeCode  | <employeeType> |

    And Click on the element in the Dialog
      |saveButton |

    Then Success message should be displayed

    And User delete item from Dialog
      | <firstName> |
      | <lastName> |


    Then Success message should be displayed


    Examples:
      | firstName | lastName  | gender   | status | employeeType |
      | sarya     | peter     | female   | active |  other       |
