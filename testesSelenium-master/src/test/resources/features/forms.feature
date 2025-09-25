#language:pt
#Author: adrianocassiano88@gmail.com
Funcionalidade: Form

  Cenário: Preenchimento do Formulario
    Dado que estou no sistema
    E seleciono o menu Forms
    E seleciono o submenu Practice Form
    Quando preencho o formulario
    E envio o formulario
    Então sistema exibe mensagem "Thanks for submitting the form"