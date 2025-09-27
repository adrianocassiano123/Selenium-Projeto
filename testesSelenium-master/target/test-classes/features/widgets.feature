#language:pt
#Author: adrianocassiano88@gmail.com
Funcionalidade: Progress Bar

  Cenário: Validar Progress Bar
    Dado que estou no sistema
    E clico na opçao Widgets
    E clico no submenu Progress Bar
    Quando inicio progresso parando antes de 25 porcento   
    Então valido se valor da progress Bar é menor ou igual a 25 por cento 
    Quando clico novamente no botão start
    E valido se chegou em 100 por cento
    Quando clico no botão resetar
    Então valido se barra de progresso foi resetada
    