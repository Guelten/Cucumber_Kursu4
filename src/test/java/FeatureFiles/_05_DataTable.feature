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
      |saveButton |

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
        |saveButton |

      Then Success message should be displayed

      And User delete item from Dialog
        | gulha232323 |

      Then Success message should be displayed


      #TODO : Create a Fee, delete Fee
  Scenario: Fee Functionality
    And Click on the element in left nav
      | setupOne   |
      | parameters |
      | feesSetup  |

    And Click on the element in the Dialog
      | addButton  |

    And User sending the keys in Dialog content
      | nameInput  | gulhafees11 |
      | codeInput  | 3232 |
      | integrationCode  | 32333 |
      | priorityCode  | 888 |

    And Click on the element in the Dialog
      |toggleBar |
      |saveButton |

    Then Success message should be displayed

    And User delete item from Dialog
      | gulhafees11 |

    Then Success message should be displayed


      #    Senaryo Outline da verilen değerler için tüm senaryo her satır kadar tekrar çalıştırılıyordu.
      #    DataTable da ise, sadece ilgili step için toplu veri gönderme imkanı oluşuyor.
