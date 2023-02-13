@testfeature
Feature: US 001 | TS1 | Iniciar sesión y agregar un item al carrito de compra
  Como usuario
  Quiero iniciar sesion
  Para agregar un item al carrito de compra

  Scenario: US 001 | TS1 | TC1: Iniciar sesión
    Given que me encuentro en la página de login de Saucedemo
    When inicio sesión con las credenciales usuario: "standard_user" y contraseña: "secret_sauce"
    Then valido que debería aparecer el título de "PRODUCTS"
    And también valido que al menos exista un item
    And agrego un item al carrito de compras
    And reviso que el carrito de compras tenga un item agregado
    And valido que el item agregado se llame "Sauce Labs Bike Light"
