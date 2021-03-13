Feature: Realizar una consulta a través del buscador

  Como usuario quiero realizar una consulta a través del buscador para obtener un mayor detalle de la información

  Scenario: Realizar una consulta a través del buscador del Home principal

    Given El usario se debe encontrar en el Home principal de Imalittletester
    When Situarse en la caja de busqueda Search
    And Ingresar la palabra Selenium
    And Ejecutar la busqueda precionando la tecla Enter
    Then Se debe visualizar los resultados de la busqueda