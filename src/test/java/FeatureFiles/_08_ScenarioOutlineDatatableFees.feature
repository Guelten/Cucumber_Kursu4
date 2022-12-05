#Senaryo :
#  Daha önceki Create a Fee, delete Fee Senaryosunu
#  name, code, intCode ve priority için 5 farklı değerler için çalıştırınız.

  Feature: Fee Functionality (DataTable - Scenario Outline)

    Background:
      Given Naviagate to Campus
      When Enter username and password and click Login button
      Then User should login successfuly

    Scenario Outline: Fee Functionality
      And Click on the element in left nav
        | setupOne   |
        | parameters |
        | feesSetup  |

      And Click on the element in the Dialog
        | addButton  |

      And User sending the keys in Dialog content
        | nameInput  | <name> |
        | codeInput  | <code> |
        | integrationCode  | <intCode> |
        | priorityCode  | <priority> |

      And Click on the element in the Dialog
        |toggleBar |
        |saveButton |

      Then Success message should be displayed

      And User delete item from Dialog
        | <name> |

      Then Success message should be displayed
      Examples:
        | name     | code  | intCode   | priority |
        | gulfee11 | 01222 | paypal    | 14  |
        | gulfee22 | 02333 | applePay  | 31 |
        | gulfee33 | 03444 | googlePay | 51  |
        | gulfee44 | 04555 | intel     | 92 |
        | gulfee55 | 05666 | core      | 85 |
