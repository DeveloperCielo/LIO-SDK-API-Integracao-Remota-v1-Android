# OrderManagementApi

All URIs are relative to *https://api.cielo.com.br/sandbox-lio/order-management/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderAddItem**](OrderManagementApi.md#orderAddItem) | **POST** /orders/{id}/items | 
[**orderCreate**](OrderManagementApi.md#orderCreate) | **POST** /orders | 
[**orderDelete**](OrderManagementApi.md#orderDelete) | **DELETE** /orders/{id} | 
[**orderDeleteItem**](OrderManagementApi.md#orderDeleteItem) | **DELETE** /orders/{id}/items/{itemId} | 
[**orderGet**](OrderManagementApi.md#orderGet) | **GET** /orders/{id} | 
[**orderGetByParameters**](OrderManagementApi.md#orderGetByParameters) | **GET** /orders | 
[**orderGetItem**](OrderManagementApi.md#orderGetItem) | **GET** /orders/{id}/items | 
[**orderGetTransactions**](OrderManagementApi.md#orderGetTransactions) | **GET** /orders/{id}/transactions | 
[**orderUpdate**](OrderManagementApi.md#orderUpdate) | **PUT** /orders/{id} | 
[**orderUpdateItem**](OrderManagementApi.md#orderUpdateItem) | **PUT** /orders/{id}/items/{itemId} | 


<a name="orderAddItem"></a>
# **orderAddItem**
> InlineResponse201 orderAddItem(clientId, accessToken, merchantId, id, body)



Recurso responsável por efetuar a inclusão de um novo item em um pedido.

### Example
```java
// Import classes:
//import io.swagger.client.api.OrderManagementApi;

OrderManagementApi apiInstance = new OrderManagementApi();
String clientId = "clientId_example"; // String | Token da aplicação (APP Token) gerado durante o processo de cadastro.
String accessToken = "accessToken_example"; // String | Token de acesso (Access Token) gerado durante o processo de cadastro.
String merchantId = "merchantId_example"; // String | Identificador do estabelecimento comercial gerado durante o processo de cadastro.
String id = "id_example"; // String | Identificador do pedido.
Body1 body = new Body1(); // Body1 | 
try {
    InlineResponse201 result = apiInstance.orderAddItem(clientId, accessToken, merchantId, id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderManagementApi#orderAddItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Token da aplicação (APP Token) gerado durante o processo de cadastro. |
 **accessToken** | **String**| Token de acesso (Access Token) gerado durante o processo de cadastro. |
 **merchantId** | **String**| Identificador do estabelecimento comercial gerado durante o processo de cadastro. |
 **id** | **String**| Identificador do pedido. |
 **body** | [**Body1**](Body1.md)|  |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[access-token](../README.md#access-token), [client-id](../README.md#client-id), [merchant-id](../README.md#merchant-id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orderCreate"></a>
# **orderCreate**
> InlineResponse201 orderCreate(clientId, accessToken, merchantId, body)



Recurso responsável por efetuar a criação de um pedido.

### Example
```java
// Import classes:
//import io.swagger.client.api.OrderManagementApi;

OrderManagementApi apiInstance = new OrderManagementApi();
String clientId = "clientId_example"; // String | Token da aplicação (APP Token) gerado durante o processo de cadastro.
String accessToken = "accessToken_example"; // String | Token de acesso (Access Token) gerado durante o processo de cadastro.
String merchantId = "merchantId_example"; // String | Identificador do estabelecimento comercial gerado durante o processo de cadastro.
Body body = new Body(); // Body | 
try {
    InlineResponse201 result = apiInstance.orderCreate(clientId, accessToken, merchantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderManagementApi#orderCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Token da aplicação (APP Token) gerado durante o processo de cadastro. |
 **accessToken** | **String**| Token de acesso (Access Token) gerado durante o processo de cadastro. |
 **merchantId** | **String**| Identificador do estabelecimento comercial gerado durante o processo de cadastro. |
 **body** | [**Body**](Body.md)|  |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[access-token](../README.md#access-token), [client-id](../README.md#client-id), [merchant-id](../README.md#merchant-id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orderDelete"></a>
# **orderDelete**
> orderDelete(clientId, accessToken, merchantId, id)



Recurso responsável por efetuar a exclusão de um pedido.

### Example
```java
// Import classes:
//import io.swagger.client.api.OrderManagementApi;

OrderManagementApi apiInstance = new OrderManagementApi();
String clientId = "clientId_example"; // String | Token da aplicação (APP Token) gerado durante o processo de cadastro.
String accessToken = "accessToken_example"; // String | Token de acesso (Access Token) gerado durante o processo de cadastro.
String merchantId = "merchantId_example"; // String | Identificador do estabelecimento comercial gerado durante o processo de cadastro.
String id = "id_example"; // String | Identificador do pedido.
try {
    apiInstance.orderDelete(clientId, accessToken, merchantId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderManagementApi#orderDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Token da aplicação (APP Token) gerado durante o processo de cadastro. |
 **accessToken** | **String**| Token de acesso (Access Token) gerado durante o processo de cadastro. |
 **merchantId** | **String**| Identificador do estabelecimento comercial gerado durante o processo de cadastro. |
 **id** | **String**| Identificador do pedido. |

### Return type

null (empty response body)

### Authorization

[access-token](../README.md#access-token), [client-id](../README.md#client-id), [merchant-id](../README.md#merchant-id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orderDeleteItem"></a>
# **orderDeleteItem**
> InlineResponse201 orderDeleteItem(clientId, accessToken, merchantId, id, itemId)



Recurso responsável por efetuar a exclusão de um item de um pedido.

### Example
```java
// Import classes:
//import io.swagger.client.api.OrderManagementApi;

OrderManagementApi apiInstance = new OrderManagementApi();
String clientId = "clientId_example"; // String | Token da aplicação (APP Token) gerado durante o processo de cadastro.
String accessToken = "accessToken_example"; // String | Token de acesso (Access Token) gerado durante o processo de cadastro.
String merchantId = "merchantId_example"; // String | Identificador do estabelecimento comercial gerado durante o processo de cadastro.
String id = "id_example"; // String | Identificador do pedido.
String itemId = "itemId_example"; // String | Identificador do item do pedido.
try {
    InlineResponse201 result = apiInstance.orderDeleteItem(clientId, accessToken, merchantId, id, itemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderManagementApi#orderDeleteItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Token da aplicação (APP Token) gerado durante o processo de cadastro. |
 **accessToken** | **String**| Token de acesso (Access Token) gerado durante o processo de cadastro. |
 **merchantId** | **String**| Identificador do estabelecimento comercial gerado durante o processo de cadastro. |
 **id** | **String**| Identificador do pedido. |
 **itemId** | **String**| Identificador do item do pedido. |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[access-token](../README.md#access-token), [client-id](../README.md#client-id), [merchant-id](../README.md#merchant-id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orderGet"></a>
# **orderGet**
> InlineResponse200 orderGet(clientId, accessToken, merchantId, id)



Recurso responsável por efetuar a consulta de um pedido.

### Example
```java
// Import classes:
//import io.swagger.client.api.OrderManagementApi;

OrderManagementApi apiInstance = new OrderManagementApi();
String clientId = "clientId_example"; // String | Token da aplicação (APP Token) gerado durante o processo de cadastro.
String accessToken = "accessToken_example"; // String | Token de acesso (Access Token) gerado durante o processo de cadastro.
String merchantId = "merchantId_example"; // String | Identificador do estabelecimento comercial gerado durante o processo de cadastro.
String id = "id_example"; // String | Identificador do pedido.
try {
    InlineResponse200 result = apiInstance.orderGet(clientId, accessToken, merchantId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderManagementApi#orderGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Token da aplicação (APP Token) gerado durante o processo de cadastro. |
 **accessToken** | **String**| Token de acesso (Access Token) gerado durante o processo de cadastro. |
 **merchantId** | **String**| Identificador do estabelecimento comercial gerado durante o processo de cadastro. |
 **id** | **String**| Identificador do pedido. |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[access-token](../README.md#access-token), [client-id](../README.md#client-id), [merchant-id](../README.md#merchant-id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orderGetByParameters"></a>
# **orderGetByParameters**
> List&lt;InlineResponse200&gt; orderGetByParameters(clientId, accessToken, merchantId, parameters)



Recurso responsável por efetuar a consulta de pedidos, com a possibilidade de aplicar filtros.

### Example
```java
// Import classes:
//import io.swagger.client.api.OrderManagementApi;

OrderManagementApi apiInstance = new OrderManagementApi();
String clientId = "clientId_example"; // String | Token da aplicação (APP Token) gerado durante o processo de cadastro.
String accessToken = "accessToken_example"; // String | Token de acesso (Access Token) gerado durante o processo de cadastro.
String merchantId = "merchantId_example"; // String | Identificador do estabelecimento comercial gerado durante o processo de cadastro.
String parameters = "parameters_example"; // String | Parâmetros para filtrar a consulta. Os possíveis parâmetros são: number (Número do pedidos), reference (Referência do pedido) e status (Status do pedidos: DRAFT, ENTERED, CANCELED, PAID, APPROVED, REJECTED, RE-ENTERED e CLOSED).
try {
    List<InlineResponse200> result = apiInstance.orderGetByParameters(clientId, accessToken, merchantId, parameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderManagementApi#orderGetByParameters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Token da aplicação (APP Token) gerado durante o processo de cadastro. |
 **accessToken** | **String**| Token de acesso (Access Token) gerado durante o processo de cadastro. |
 **merchantId** | **String**| Identificador do estabelecimento comercial gerado durante o processo de cadastro. |
 **parameters** | **String**| Parâmetros para filtrar a consulta. Os possíveis parâmetros são: number (Número do pedidos), reference (Referência do pedido) e status (Status do pedidos: DRAFT, ENTERED, CANCELED, PAID, APPROVED, REJECTED, RE-ENTERED e CLOSED). | [enum: number, reference, status]

### Return type

[**List&lt;InlineResponse200&gt;**](InlineResponse200.md)

### Authorization

[access-token](../README.md#access-token), [client-id](../README.md#client-id), [merchant-id](../README.md#merchant-id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orderGetItem"></a>
# **orderGetItem**
> OrdersItems orderGetItem(clientId, accessToken, merchantId, id)



Recurso responsável por efetuar a consulta de um item em um pedido.

### Example
```java
// Import classes:
//import io.swagger.client.api.OrderManagementApi;

OrderManagementApi apiInstance = new OrderManagementApi();
String clientId = "clientId_example"; // String | Token da aplicação (APP Token) gerado durante o processo de cadastro.
String accessToken = "accessToken_example"; // String | Token de acesso (Access Token) gerado durante o processo de cadastro.
String merchantId = "merchantId_example"; // String | Identificador do estabelecimento comercial gerado durante o processo de cadastro.
String id = "id_example"; // String | Identificador do pedido.
try {
    OrdersItems result = apiInstance.orderGetItem(clientId, accessToken, merchantId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderManagementApi#orderGetItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Token da aplicação (APP Token) gerado durante o processo de cadastro. |
 **accessToken** | **String**| Token de acesso (Access Token) gerado durante o processo de cadastro. |
 **merchantId** | **String**| Identificador do estabelecimento comercial gerado durante o processo de cadastro. |
 **id** | **String**| Identificador do pedido. |

### Return type

[**OrdersItems**](OrdersItems.md)

### Authorization

[access-token](../README.md#access-token), [client-id](../README.md#client-id), [merchant-id](../README.md#merchant-id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orderGetTransactions"></a>
# **orderGetTransactions**
> OrdersTransactions orderGetTransactions(clientId, accessToken, merchantId, id)



Recurso responsável por efetuar a consulta das transações de um pedido.

### Example
```java
// Import classes:
//import io.swagger.client.api.OrderManagementApi;

OrderManagementApi apiInstance = new OrderManagementApi();
String clientId = "clientId_example"; // String | Token da aplicação (APP Token) gerado durante o processo de cadastro.
String accessToken = "accessToken_example"; // String | Token de acesso (Access Token) gerado durante o processo de cadastro.
String merchantId = "merchantId_example"; // String | Identificador do estabelecimento comercial gerado durante o processo de cadastro.
String id = "id_example"; // String | Identificador do pedido.
try {
    OrdersTransactions result = apiInstance.orderGetTransactions(clientId, accessToken, merchantId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderManagementApi#orderGetTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Token da aplicação (APP Token) gerado durante o processo de cadastro. |
 **accessToken** | **String**| Token de acesso (Access Token) gerado durante o processo de cadastro. |
 **merchantId** | **String**| Identificador do estabelecimento comercial gerado durante o processo de cadastro. |
 **id** | **String**| Identificador do pedido. |

### Return type

[**OrdersTransactions**](OrdersTransactions.md)

### Authorization

[access-token](../README.md#access-token), [client-id](../README.md#client-id), [merchant-id](../README.md#merchant-id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orderUpdate"></a>
# **orderUpdate**
> orderUpdate(clientId, accessToken, merchantId, id, operation)



Recurso responsável por efetuar o cancelamento de um pedido.

### Example
```java
// Import classes:
//import io.swagger.client.api.OrderManagementApi;

OrderManagementApi apiInstance = new OrderManagementApi();
String clientId = "clientId_example"; // String | Token da aplicação (APP Token) gerado durante o processo de cadastro.
String accessToken = "accessToken_example"; // String | Token de acesso (Access Token) gerado durante o processo de cadastro.
String merchantId = "merchantId_example"; // String | Identificador do estabelecimento comercial gerado durante o processo de cadastro.
String id = "id_example"; // String | Identificador do pedido.
String operation = "operation_example"; // String | Operação que deve ser executada. As possíveis operações são: cancel (cancelamento de um pedido), close (fechamento de um pedido), place (liberação de um pedido para pagamento).
try {
    apiInstance.orderUpdate(clientId, accessToken, merchantId, id, operation);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderManagementApi#orderUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Token da aplicação (APP Token) gerado durante o processo de cadastro. |
 **accessToken** | **String**| Token de acesso (Access Token) gerado durante o processo de cadastro. |
 **merchantId** | **String**| Identificador do estabelecimento comercial gerado durante o processo de cadastro. |
 **id** | **String**| Identificador do pedido. |
 **operation** | **String**| Operação que deve ser executada. As possíveis operações são: cancel (cancelamento de um pedido), close (fechamento de um pedido), place (liberação de um pedido para pagamento). |

### Return type

null (empty response body)

### Authorization

[access-token](../README.md#access-token), [client-id](../README.md#client-id), [merchant-id](../README.md#merchant-id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orderUpdateItem"></a>
# **orderUpdateItem**
> InlineResponse201 orderUpdateItem(clientId, accessToken, merchantId, id, itemId, body)



Recurso responsável por efetuar a alteração de um item de um pedido.

### Example
```java
// Import classes:
//import io.swagger.client.api.OrderManagementApi;

OrderManagementApi apiInstance = new OrderManagementApi();
String clientId = "clientId_example"; // String | Token da aplicação (APP Token) gerado durante o processo de cadastro.
String accessToken = "accessToken_example"; // String | Token de acesso (Access Token) gerado durante o processo de cadastro.
String merchantId = "merchantId_example"; // String | Identificador do estabelecimento comercial gerado durante o processo de cadastro.
String id = "id_example"; // String | Identificador do pedido.
String itemId = "itemId_example"; // String | Identificador do item do pedido.
Body2 body = new Body2(); // Body2 | 
try {
    InlineResponse201 result = apiInstance.orderUpdateItem(clientId, accessToken, merchantId, id, itemId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderManagementApi#orderUpdateItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Token da aplicação (APP Token) gerado durante o processo de cadastro. |
 **accessToken** | **String**| Token de acesso (Access Token) gerado durante o processo de cadastro. |
 **merchantId** | **String**| Identificador do estabelecimento comercial gerado durante o processo de cadastro. |
 **id** | **String**| Identificador do pedido. |
 **itemId** | **String**| Identificador do item do pedido. |
 **body** | [**Body2**](Body2.md)|  |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[access-token](../README.md#access-token), [client-id](../README.md#client-id), [merchant-id](../README.md#merchant-id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

