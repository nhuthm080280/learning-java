/*
 * OpenAPI student info
 * This is a sample server Student info server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 0.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.Student;
import org.openapitools.client.model.StudentCollection;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueryStudentApi {
    private ApiClient localVarApiClient;

    public QueryStudentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public QueryStudentApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getAllstudents
     * @param firstName  (optional)
     * @param middleName  (optional)
     * @param lastName  (optional)
     * @param offset The number of students to skip before starting to collect the result set. (optional)
     * @param count The number of students to return. (optional, default to 20)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Student not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllstudentsCall(String firstName, String middleName, String lastName, Integer offset, Integer count, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/query-api/student-service/students";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (firstName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("firstName", firstName));
        }

        if (middleName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("middleName", middleName));
        }

        if (lastName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("lastName", lastName));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (count != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("count", count));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "student_auth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAllstudentsValidateBeforeCall(String firstName, String middleName, String lastName, Integer offset, Integer count, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getAllstudentsCall(firstName, middleName, lastName, offset, count, _callback);
        return localVarCall;

    }

    /**
     * Get all students
     * Returns all students
     * @param firstName  (optional)
     * @param middleName  (optional)
     * @param lastName  (optional)
     * @param offset The number of students to skip before starting to collect the result set. (optional)
     * @param count The number of students to return. (optional, default to 20)
     * @return StudentCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Student not found </td><td>  -  </td></tr>
     </table>
     */
    public StudentCollection getAllstudents(String firstName, String middleName, String lastName, Integer offset, Integer count) throws ApiException {
        ApiResponse<StudentCollection> localVarResp = getAllstudentsWithHttpInfo(firstName, middleName, lastName, offset, count);
        return localVarResp.getData();
    }

    /**
     * Get all students
     * Returns all students
     * @param firstName  (optional)
     * @param middleName  (optional)
     * @param lastName  (optional)
     * @param offset The number of students to skip before starting to collect the result set. (optional)
     * @param count The number of students to return. (optional, default to 20)
     * @return ApiResponse&lt;StudentCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Student not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StudentCollection> getAllstudentsWithHttpInfo(String firstName, String middleName, String lastName, Integer offset, Integer count) throws ApiException {
        okhttp3.Call localVarCall = getAllstudentsValidateBeforeCall(firstName, middleName, lastName, offset, count, null);
        Type localVarReturnType = new TypeToken<StudentCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get all students (asynchronously)
     * Returns all students
     * @param firstName  (optional)
     * @param middleName  (optional)
     * @param lastName  (optional)
     * @param offset The number of students to skip before starting to collect the result set. (optional)
     * @param count The number of students to return. (optional, default to 20)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Student not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllstudentsAsync(String firstName, String middleName, String lastName, Integer offset, Integer count, final ApiCallback<StudentCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllstudentsValidateBeforeCall(firstName, middleName, lastName, offset, count, _callback);
        Type localVarReturnType = new TypeToken<StudentCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getStudentById
     * @param id ID of student to return (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Student not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getStudentByIdCall(UUID id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/query-api/student-service/students/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "student_auth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getStudentByIdValidateBeforeCall(UUID id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getStudentById(Async)");
        }
        

        okhttp3.Call localVarCall = getStudentByIdCall(id, _callback);
        return localVarCall;

    }

    /**
     * Find student by ID
     * Returns a single student
     * @param id ID of student to return (required)
     * @return Student
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Student not found </td><td>  -  </td></tr>
     </table>
     */
    public Student getStudentById(UUID id) throws ApiException {
        ApiResponse<Student> localVarResp = getStudentByIdWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Find student by ID
     * Returns a single student
     * @param id ID of student to return (required)
     * @return ApiResponse&lt;Student&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Student not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Student> getStudentByIdWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call localVarCall = getStudentByIdValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<Student>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Find student by ID (asynchronously)
     * Returns a single student
     * @param id ID of student to return (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Student not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getStudentByIdAsync(UUID id, final ApiCallback<Student> _callback) throws ApiException {

        okhttp3.Call localVarCall = getStudentByIdValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<Student>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}