#language:pt
#Author: adrianocassiano88@gmail.com
Funcionalidade: Registros

  Cenário: Criação, alteração e exclusão de de Registro
    Dado que estou no sistema..
    E clico na opcao Elements
    E clico no submenu Web Tables
    E clico no botão Add
    Quando insiro dados no formulario
    E clico no botão Submit
    Então dados são inseridos
    E clico no botão Alterar 
    E altero dados do formulario
    E clico no botão Submit
    Então dados são alterados
    Quando clico no botão excluir 
    Então os dados são excluídos
    