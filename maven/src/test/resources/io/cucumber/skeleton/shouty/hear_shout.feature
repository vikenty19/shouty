Feature: Hear shout
  Scenario: Listener is within range
    Given Lucy is located 15 meters from Sean
    When Sean shouts "free bagels at Sean's"
    Then Lucy heard Sean's message



  Scenario: Listener hears a different mesage
    Given Lucy is located 15 meters from Sean
    When Sean shouts "Free coffee!"
    Then Lucy  hear Sean's message