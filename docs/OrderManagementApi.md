# OrderManagementApi

All URIs are relative to *https://api.cielo.com.br/order-management/v1*

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
> Response orderAddItem(clientId, accessToken, merchantId, id, body)



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
OrderItem body = new OrderItem(); // OrderItem | 
try {
    Response result = apiInstance.orderAddItem(clientId, accessToken, merchantId, id, body);
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
 **body** | [**OrderItem**](OrderItem.md)|  |

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orderCreate"></a>
# **orderCreate**
> Response orderCreate(clientId, accessToken, merchantId, body)



Recurso responsável por efetuar a criação de um pedido.

### Example
```java
// Import classes:
//import io.swagger.client.api.OrderManagementApi;

OrderManagementApi apiInstance = new OrderManagementApi();
String clientId = "clientId_example"; // String | Token da aplicação (APP Token) gerado durante o processo de cadastro.
String accessToken = "accessToken_example"; // String | Token de acesso (Access Token) gerado durante o processo de cadastro.
String merchantId = "merchantId_example"; // String | Identificador do estabelecimento comercial gerado durante o processo de cadastro.
Order body = new Order(); // Order | 
try {
    Response result = apiInstance.orderCreate(clientId, accessToken, merchantId, body);
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
 **body** | [**Order**](Order.md)|  |

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orderDeleteItem"></a>
# **orderDeleteItem**
> Response orderDeleteItem(clientId, accessToken, merchantId, id, itemId)



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
    Response result = apiInstance.orderDeleteItem(clientId, accessToken, merchantId, id, itemId);
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

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orderGet"></a>
# **orderGet**
> Order orderGet(clientId, accessToken, merchantId, id)



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
    Order result = apiInstance.orderGet(clientId, accessToken, merchantId, id);
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

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orderGetByParameters"></a>
# **orderGetByParameters**
> orderGetByParameters(clientId, accessToken, merchantId, parameters)



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
    apiInstance.orderGetByParameters(clientId, accessToken, merchantId, parameters);
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orderGetItem"></a>
# **orderGetItem**
> OrderItem orderGetItem(clientId, accessToken, merchantId, id)



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
    OrderItem result = apiInstance.orderGetItem(clientId, accessToken, merchantId, id);
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

[**OrderItem**](OrderItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orderGetTransactions"></a>
# **orderGetTransactions**
> Transaction orderGetTransactions(clientId, accessToken, merchantId, id)



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
    Transaction result = apiInstance.orderGetTransactions(clientId, accessToken, merchantId, id);
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

[**Transaction**](Transaction.md)

### Authorization

No authorization required

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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orderUpdateItem"></a>
# **orderUpdateItem**
> Response orderUpdateItem(clientId, accessToken, merchantId, id, itemId, body)



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
OrderItem body = new OrderItem(); // OrderItem | 
try {
    Response result = apiInstance.orderUpdateItem(clientId, accessToken, merchantId, id, itemId, body);
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
 **body** | [**OrderItem**](OrderItem.md)|  |

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

