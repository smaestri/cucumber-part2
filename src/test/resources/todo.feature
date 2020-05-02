Feature: Gestion d'une liste de todos

  Scenario: Ajout d'un todo
    Given ma liste de todos est vide
    When j'insére un todo avec la description toto
    Then ma liste contient un todo avec la description toto
