# MutationStudentApi

All URIs are relative to *https://dev-sg.portal.template.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addstudent**](MutationStudentApi.md#addstudent) | **POST** /mutation-api/student-service/students | Add new student
[**deleteStudent**](MutationStudentApi.md#deleteStudent) | **DELETE** /mutation-api/student-service/students/{id} | Deletes a student
[**updateStudent**](MutationStudentApi.md#updateStudent) | **PUT** /mutation-api/student-service/students/{id} | Update an existing student


<a name="addstudent"></a>
# **addstudent**
> Student addstudent(student)

Add new student

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MutationStudentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-sg.portal.template.com");
    
    // Configure HTTP bearer authorization: student_auth
    HttpBearerAuth student_auth = (HttpBearerAuth) defaultClient.getAuthentication("student_auth");
    student_auth.setBearerToken("BEARER TOKEN");

    MutationStudentApi apiInstance = new MutationStudentApi(defaultClient);
    Student student = new Student(); // Student | student object that needs to be added to the database
    try {
      Student result = apiInstance.addstudent(student);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MutationStudentApi#addstudent");
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
 **student** | [**Student**](Student.md)| student object that needs to be added to the database |

### Return type

[**Student**](Student.md)

### Authorization

[student_auth](../README.md#student_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**405** | Invalid input |  -  |

<a name="deleteStudent"></a>
# **deleteStudent**
> deleteStudent(id)

Deletes a student

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MutationStudentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-sg.portal.template.com");
    
    // Configure HTTP bearer authorization: student_auth
    HttpBearerAuth student_auth = (HttpBearerAuth) defaultClient.getAuthentication("student_auth");
    student_auth.setBearerToken("BEARER TOKEN");

    MutationStudentApi apiInstance = new MutationStudentApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | ID of student to delete
    try {
      apiInstance.deleteStudent(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling MutationStudentApi#deleteStudent");
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
 **id** | **UUID**| ID of student to delete |

### Return type

null (empty response body)

### Authorization

[student_auth](../README.md#student_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Successful operation |  -  |
**400** | Invalid ID supplied |  -  |
**404** | student not found |  -  |

<a name="updateStudent"></a>
# **updateStudent**
> Student updateStudent(id, student)

Update an existing student

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MutationStudentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-sg.portal.template.com");
    
    // Configure HTTP bearer authorization: student_auth
    HttpBearerAuth student_auth = (HttpBearerAuth) defaultClient.getAuthentication("student_auth");
    student_auth.setBearerToken("BEARER TOKEN");

    MutationStudentApi apiInstance = new MutationStudentApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | ID of student to update
    Student student = new Student(); // Student | student object that needs to be added to the database
    try {
      Student result = apiInstance.updateStudent(id, student);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MutationStudentApi#updateStudent");
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
 **id** | **UUID**| ID of student to update |
 **student** | [**Student**](Student.md)| student object that needs to be added to the database |

### Return type

[**Student**](Student.md)

### Authorization

[student_auth](../README.md#student_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**400** | Invalid ID supplied |  -  |
**404** | Student not found |  -  |
**405** | Validation exception |  -  |

