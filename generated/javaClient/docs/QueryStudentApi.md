# QueryStudentApi

All URIs are relative to *https://dev-sg.portal.template.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllstudents**](QueryStudentApi.md#getAllstudents) | **GET** /query-api/student-service/students | Get all students
[**getStudentById**](QueryStudentApi.md#getStudentById) | **GET** /query-api/student-service/students/{id} | Find student by ID


<a name="getAllstudents"></a>
# **getAllstudents**
> StudentCollection getAllstudents(firstName, middleName, lastName, offset, count)

Get all students

Returns all students

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QueryStudentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-sg.portal.template.com");
    
    // Configure HTTP bearer authorization: student_auth
    HttpBearerAuth student_auth = (HttpBearerAuth) defaultClient.getAuthentication("student_auth");
    student_auth.setBearerToken("BEARER TOKEN");

    QueryStudentApi apiInstance = new QueryStudentApi(defaultClient);
    String firstName = "firstName_example"; // String | 
    String middleName = "middleName_example"; // String | 
    String lastName = "lastName_example"; // String | 
    Integer offset = 56; // Integer | The number of students to skip before starting to collect the result set.
    Integer count = 20; // Integer | The number of students to return.
    try {
      StudentCollection result = apiInstance.getAllstudents(firstName, middleName, lastName, offset, count);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryStudentApi#getAllstudents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstName** | **String**|  | [optional]
 **middleName** | **String**|  | [optional]
 **lastName** | **String**|  | [optional]
 **offset** | **Integer**| The number of students to skip before starting to collect the result set. | [optional]
 **count** | **Integer**| The number of students to return. | [optional] [default to 20]

### Return type

[**StudentCollection**](StudentCollection.md)

### Authorization

[student_auth](../README.md#student_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**400** | Invalid ID supplied |  -  |
**404** | Student not found |  -  |

<a name="getStudentById"></a>
# **getStudentById**
> Student getStudentById(id)

Find student by ID

Returns a single student

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QueryStudentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-sg.portal.template.com");
    
    // Configure HTTP bearer authorization: student_auth
    HttpBearerAuth student_auth = (HttpBearerAuth) defaultClient.getAuthentication("student_auth");
    student_auth.setBearerToken("BEARER TOKEN");

    QueryStudentApi apiInstance = new QueryStudentApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | ID of student to return
    try {
      Student result = apiInstance.getStudentById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryStudentApi#getStudentById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| ID of student to return |

### Return type

[**Student**](Student.md)

### Authorization

[student_auth](../README.md#student_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**400** | Invalid ID supplied |  -  |
**404** | Student not found |  -  |

