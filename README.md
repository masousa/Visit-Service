# Visit Service

## :paperclips: Sobre
Visit Service é um projeto desenvolvido como parte do curso Back-end Java da [Ada](https://ada.tech/) no módulo "Arquitetura de Software Ágil II".<br>
A proposta é implementar um  microsserviço responsável pelo controle das visitas técnicas realizadas para os assinantes dos pacotes de canais.

## :man_technologist: Conhecimentos aplicados
- **Linguagem de Programação:** Java 17
- **Framework:** Spring Boot
- **Banco de Dados:** PostgreSQL
- **Tecnologias utilizadas:** OpenAPI(Swagger), RabbitMQ
- **Arquitetura:** O projeto segue os princípios de SOLID, DDD e adota o padrão de arquitetura MVC (Model-View-Controller).
- **Metodologia de Desenvolvimento:** Scrum
- **Gerenciamento do Projeto:** Trello

## :pushpin: Funcionalidades principais

- Cadastrar Visita Técnicas: Cadastra uma visita através de uma requisição feita pelo microserviço Assinatura (quando um novo cliente assina um pacote) ou através de uma requisição POST da API. Recebe o id do usuário, um booleano indicando se o usuário é novo ou não e a data da assinatura.

- Visualizar Todas as Visitas Técnicas: Através de uma requisição GET retorna uma lista comm todas as visitas técnicas cadastradas.

- Visualizar Visita Técnica por Id: Através de uma requisição GET retorna uma visita cadastrada após fornecimento do id da visita.
  
- Cancelar Visita Técnica: Cancela uma visita técnica através de uma requisição DELETE após informado do id da visita.
  
- Atribuir Visita Técnica: Atribui um técnico a visita técnica atrvés de uma requisição POST apo´s informado do id da visita e das informações do Tecnico.


## Contratos
### VISITA-request-PAGAMENTO:
```json
{
    {
         "userId":"string",
    },
    {
        "userId":"string",
    }
}
```
### PAGAMENTO-response-VISITA:
```json
{ 
    //lista
    [
        {
            "invoiceId":"string",
        },
        {
            "invoiceId":"string",
        },
    ]
}
```
### ASSINATURA-request-VISITA:
```json
[
    {
        //boolean
        "newUser":true,
        "userId":"string",
    }
]
```
## 📚 Documentação (endpoints)
### :bust_in_silhouette: Visit
  <summary> Cadastro (POST) </summary>
    <br>

  | Método | Funcionalidade | URL |
  |---|---|---|
  | `POST` | Realiza o cadastro da visita no sistema | `http://localhost:8080/visit`
  
O desenvolvimento dos Microsserviços de Fatura e Visita Técnica da PAY-TV foi realizado por Dayane, Juliana, Karen, Natalia, Raquel e Thaís.
