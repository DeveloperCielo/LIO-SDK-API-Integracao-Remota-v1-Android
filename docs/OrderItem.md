
# OrderItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sku** | **String** | SKU do produto - identificação única do produto, preferencialmente usando identificações do mercado para o produto, como: &lt;br&gt; - Universal Product Code (UPC),&lt;br&gt; - International Article Number (EAN),&lt;br&gt; - Global Trade Item Number (GTIN),&lt;br&gt; - Australian Product Number (APN),&lt;br&gt; - Outros.&lt;br&gt; Caso seu produto não tenha uma identificação global, utilize informe um ID único proprietário para esse produto. | 
**skuType** | **String** | Tipo de SKU informado, por exemplo:&lt;br&gt; - PTY - para proprietário - ou seja, quando o SKU for sua identificação proprietária.&lt;br&gt; - UPC - Universal Product Code.&lt;br&gt; - EAN - International Article Number.&lt;br&gt; - GTIN - Global Trade Item Number.&lt;br&gt; - APN - Australian Product Number. | 
**name** | **String** | Nome do produto. |  [optional]
**description** | **String** | Descrição do produto. |  [optional]
**unitPrice** | **Integer** | Valor unitário do produto. Exemplo: O valor de R$ 10,00 é representado como 1000. | 
**quantity** | **Integer** | Quantidade de itens. Caso não seja informado será considerado o valor 1. |  [optional]
**unitOfMeasure** | [**UnitOfMeasureEnum**](#UnitOfMeasureEnum) | Unidade de medida. | 
**details** | **String** | Detalhes do produto. |  [optional]
**createdAt** | [**Date**](Date.md) | Data da criação/inclusão do item no pedido. A data deve estar no formato: YYYY-MM-DDThh:mm:ssZ (Exemplo: 20151020T13:13:29.000Z) | 
**updatedAt** | [**Date**](Date.md) | Data da última atualização do item no pedido. A data deve estar no formato: YYYY-MM-DDThh:mm:ssZ (Exemplo: 20151020T13:13:29.000Z) | 


<a name="UnitOfMeasureEnum"></a>
## Enum: UnitOfMeasureEnum
Name | Value
---- | -----



