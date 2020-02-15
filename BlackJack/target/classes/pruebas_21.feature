@tag
Feature: Pruebas

@tag1
Scenario: Verificar la reparticion de las cartas
Given reparto de baraja
When cargan cartas
Then cartas en el mazo

@tag2
Scenario: La sumatoria de la mano está correcta
Given cartas J Q K
When se obtiene la suma
Then esta suma debe ser veinte

@tag3
Scenario: Verificar BlackJack
Given repartidas las cartas
When exista un as y un diez
Then el jugador gana