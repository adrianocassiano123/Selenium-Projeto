#language:pt
#Author: adrianocassiano88@gmail.com
Funcionalidade: Registros

  Cenário: Criação, alteração e exclusão de Registro
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
    E deleto o registro criado
    
  
  Cenário: Criar 12 registros e os deletar
  Dado que estou no sistema..
  E clico na opcao Elements
  E clico no submenu Web Tables
  Quando crio os seguintes registros:
    | nome     | sobrenome | email             | idade | salario | departamento |
    | João     | Silva     | joao@test.com     | 25    | 3000    | TI           |
    | Maria    | Souza     | maria@test.com    | 28    | 3500    | Financeiro   |
    | Pedro    | Lima      | pedro@test.com    | 32    | 4000    | Marketing    |
    | Ana      | Costa     | ana@test.com      | 29    | 3700    | RH           |
    | Lucas    | Rocha     | lucas@test.com    | 35    | 4200    | Jurídico     |
    | Carla    | Mendes    | carla@test.com    | 26    | 3100    | Vendas       |
    | Bruno    | Santos    | bruno@test.com    | 31    | 3900    | TI           |
    | Fernanda | Oliveira  | fernanda@test.com | 27    | 3600    | Compras      |
    | Paulo    | Castro    | paulo@test.com    | 33    | 4100    | Engenharia   |
    | Julia    | Martins   | julia@test.com    | 24    | 2800    | RH           |
    | André    | Almeida   | andre@test.com    | 36    | 4500    | Financeiro   |
    | Camila   | Ferreira  | camila@test.com   | 30    | 3800    | Marketing    |
  Então deleto apenas os registros criados
    