# language: pt

@Global
Funcionalidade: Compra de um monitor

  Contexto:
    Dado que estou na página inicial

  Cenário: Compra bem-sucedida de um monitor
    Quando navego até a categoria Monitores
    E selecione um monitor para compra
    E adiciono o monitor ao carrinho
    E vou a página do carrinho
    E clico no botão de fazer pedido
    E finalizo o pedido preenchendo com os dados abaixo:
      | Nome   | Teste        |
      | País   | Brasil       |
      | Cidade | Porto Alegre |
      | Cartão | 123456789    |
      | Mês    | Julho        |
      | Ano    | 2025         |
    Entao devo ver mensagem de confirmação de compra na tela escrito "Thank you for your purchase!"
    E clicar em "OK"