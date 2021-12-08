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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Student;
import org.openapitools.client.model.StudentCollection;

import java.util.UUID;

import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QueryStudentApi
 */
@Ignore
public class QueryStudentApiTest {

    private final QueryStudentApi api = new QueryStudentApi();


    /**
     * Get all students
     * <p>
     * Returns all students
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllstudentsTest() throws ApiException {
        String firstName = null;
        String middleName = null;
        String lastName = null;
        Integer offset = null;
        Integer count = null;
        StudentCollection response = api.getAllstudents(firstName, middleName, lastName, offset, count);
        // TODO: test validations
    }

    /**
     * Find student by ID
     * <p>
     * Returns a single student
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStudentByIdTest() throws ApiException {
        UUID id = null;
        Student response = api.getStudentById(id);
        // TODO: test validations
    }

}
