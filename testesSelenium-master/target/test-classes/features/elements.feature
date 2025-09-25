#language:pt
#Author: adrianocassiano88@gmail.com
Funcionalidade: Registros

  Cenário: Criação de Registro
    Dado que estou no sistema..
    E clico na opcao Elements
    E clico no submenu Web Tables
    E clico no botão Add
    Quando Insiro dados no formulario
    E clico no botão Submit
    Então dados sao inseridos na grid
    E clico no botão Alterar 
    E Altero dados no formulario
    E clico no botão Submit
    Então dados sao alterados na grid
    Quando clico no botão excluir 
    E confirmo exclusão
    Então dados são excluídos
    
    

  Cenário: Alteração de Registro
    Dado que estou no sistema..
    E clico na opcao Elements
    E clico no submenu Web Tables
    Quando clico no botão Alterar 
    E Altero dados no formulario
    E clico no botão Submit
    Então dados sao alterados na grid

  Cenário: exclusão de Registro
    Dado que estou no sistema..
    E clico na opcao Elements
    E clico no submenu Web Tables
    Quando clico no botão excluir 
    E Confirmo exclusão
    Então dados são excluídos