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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

/**
 * Student info
 */
@ApiModel(description = "Student info")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-07T14:27:37.301097+07:00[Asia/Ho_Chi_Minh]")
public class Student {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_POLITY_ID = "polityId";
  @SerializedName(SERIALIZED_NAME_POLITY_ID)
  private UUID polityId;

  public static final String SERIALIZED_NAME_SAINT_ID = "saintId";
  @SerializedName(SERIALIZED_NAME_SAINT_ID)
  private UUID saintId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "dateOfBirth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private String dateOfBirth;

  public static final String SERIALIZED_NAME_PLACE_OF_BIRTH = "placeOfBirth";
  @SerializedName(SERIALIZED_NAME_PLACE_OF_BIRTH)
  private String placeOfBirth;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_SCHOOL_NAME = "schoolName";
  @SerializedName(SERIALIZED_NAME_SCHOOL_NAME)
  private String schoolName;


  public Student id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "53f549b9-99bf-4e12-88e3-c2f868953283", value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public Student polityId(UUID polityId) {
    
    this.polityId = polityId;
    return this;
  }

   /**
   * Get polityId
   * @return polityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4d084b56-54e1-4bd2-878e-c52675497c2b", value = "")

  public UUID getPolityId() {
    return polityId;
  }


  public void setPolityId(UUID polityId) {
    this.polityId = polityId;
  }


  public Student saintId(UUID saintId) {
    
    this.saintId = saintId;
    return this;
  }

   /**
   * Get saintId
   * @return saintId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "40e6215d-b5c6-4896-987c-f30f3678f608", value = "")

  public UUID getSaintId() {
    return saintId;
  }


  public void setSaintId(UUID saintId) {
    this.saintId = saintId;
  }


  public Student title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PRIEST", value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Student firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Nguyen", value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public Student middleName(String middleName) {
    
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Huu", value = "")

  public String getMiddleName() {
    return middleName;
  }


  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  public Student lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Chien", value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public Student dateOfBirth(String dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * date of birth in format YYYY-MM-DD
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1983-05-16", value = "date of birth in format YYYY-MM-DD")

  public String getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public Student placeOfBirth(String placeOfBirth) {
    
    this.placeOfBirth = placeOfBirth;
    return this;
  }

   /**
   * Get placeOfBirth
   * @return placeOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tra Vinh", value = "")

  public String getPlaceOfBirth() {
    return placeOfBirth;
  }


  public void setPlaceOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
  }


  public Student email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "binh@sunrise.vn", value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public Student phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+84 1228019700", value = "")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public Student schoolName(String schoolName) {
    
    this.schoolName = schoolName;
    return this;
  }

   /**
   * Get schoolName
   * @return schoolName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Dai Chung Vien Thanh Quy - Can Tho", value = "")

  public String getSchoolName() {
    return schoolName;
  }


  public void setSchoolName(String schoolName) {
    this.schoolName = schoolName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return Objects.equals(this.id, student.id) &&
        Objects.equals(this.polityId, student.polityId) &&
        Objects.equals(this.saintId, student.saintId) &&
        Objects.equals(this.title, student.title) &&
        Objects.equals(this.firstName, student.firstName) &&
        Objects.equals(this.middleName, student.middleName) &&
        Objects.equals(this.lastName, student.lastName) &&
        Objects.equals(this.dateOfBirth, student.dateOfBirth) &&
        Objects.equals(this.placeOfBirth, student.placeOfBirth) &&
        Objects.equals(this.email, student.email) &&
        Objects.equals(this.phone, student.phone) &&
        Objects.equals(this.schoolName, student.schoolName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, polityId, saintId, title, firstName, middleName, lastName, dateOfBirth, placeOfBirth, email, phone, schoolName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Student {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    polityId: ").append(toIndentedString(polityId)).append("\n");
    sb.append("    saintId: ").append(toIndentedString(saintId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    placeOfBirth: ").append(toIndentedString(placeOfBirth)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    schoolName: ").append(toIndentedString(schoolName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

