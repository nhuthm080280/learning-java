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
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MutationStudentApi
 */
@Ignore
public class MutationStudentApiTest {

    private final MutationStudentApi api = new MutationStudentApi();

    
    /**
     * Add new student
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addstudentTest() throws ApiException {
        Student student = null;
                Student response = api.addstudent(student);
        // TODO: test validations
    }
    
    /**
     * Deletes a student
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteStudentTest() throws ApiException {
        UUID id = null;
                api.deleteStudent(id);
        // TODO: test validations
    }
    
    /**
     * Update an existing student
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateStudentTest() throws ApiException {
        UUID id = null;
        Student student = null;
                Student response = api.updateStudent(id, student);
        // TODO: test validations
    }
    
}
