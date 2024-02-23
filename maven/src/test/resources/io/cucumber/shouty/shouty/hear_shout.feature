Feature: Hear shout
  Scenario: Listener hears a message
    Given a person named Lucy
    And a person named Sean
    When Sean shouts "free bagels at Sean's"
    Then Lucy heard Sean's message



  Scenario: Listener hears a different message
    Given Lucy is located 1 meter from Sean
    When Sean shouts "Free coffee!"
    Then Lucy heard new Sean's message