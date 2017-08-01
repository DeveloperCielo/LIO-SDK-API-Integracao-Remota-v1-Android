
# Body

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | UUID que identifica unicamente o pedido. | 
**number** | **String** | Número do pedido. Gerelmente esse número representa o identificador do pedido em um sistema externo através da integração com parceiros. |  [optional]
**reference** | **String** | Referência do pedido. Utilizada para facilitar o acesso ou localização do mesmo. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status do pedido. | 
**createdAt** | [**Date**](Date.md) | Data de criação do pedido. A data deve estar no formato: YYYY-MM-DDThh:mm:ssZ (Exemplo: 20151020T13:13:29.000Z) | 
**updatedAt** | [**Date**](Date.md) | Data de última atualização do pedido. A data deve estar no formato: YYYY-MM-DDThh:mm:ssZ (Exemplo: 20151020T13:13:29.000Z) | 
**items** | [**List&lt;OrdersItems&gt;**](OrdersItems.md) | Lista de itens contidos no pedido. | 
**notes** | **String** | Campo disponível para uso do Merchant para comunicação. |  [optional]
**transactions** | [**List&lt;OrdersTransactions&gt;**](OrdersTransactions.md) | Lista de transações de pagamento (ou outros tipos) efetuadas no pedido. | 
**price** | **Integer** | Valor total do pedido. Exemplo: O valor de R$ 10,00 é representado como 1000. | 
**remaining** | **Integer** | Valor restante do pagamento do pedido.Exemplo: O valor de R$ 10,00 é representado como 1000. | 


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----



