Feature: Datatable Functionality

  Background:
    Given Naviagate to Campus
    When Enter username and password and click Login button
    Then User should login successfuly

  Scenario: Create Country
    And Click on the element in left nav
      | setupOne   |
      | parameters |
      | countries  |

    And Click on the element in the Dialog
      | addButton  |

    And User sending the keys in Dialog content
      | nameInput  | gulha232323 |
      | codeInput  | g32323      |

    And Click on the element in the Dialog
      |savaButton |

    And Success message should be displayed

    And User delete item from Dialog
      | gulha232323 |


    Scenario: Create a Nationality
      And Click on the element in left nav
        | setupOne   |
        | parameters |
        | countries  |

      And Click on the element in the Dialog
        | addButton  |

      And User sending the keys in Dialog content
        | nameInput  | gulha232323 |

      And Click on the element in the Dialog
        |savaButton |

      And Success message should be displayed

      And User delete item from Dialog
        | gulha232323 |

