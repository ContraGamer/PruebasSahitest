#Author: ander18158697@gmail.com

@libros
Feature: Pruebas de libros


  @comprar_libros
  Scenario Outline: CP010 Anadir libros y validar precio total
    Given login app web <user> <pass> 
    When anado libros para compra <java> <ruby> <python> 
    Then valido el precio de los libros

    Examples: 
      | user    |  pass  | java   |ruby  |python  |
      | "test"  |"secret"| "1"    |"2"   |"3"     | 
      | "test"  |"secret"| "4"    |"3"   |"4"     | 
      
