/*
 * Terminal API
 * Terminal is a unified API that makes it easy to integrate with the leading telematics service providers.  Contact Support:  Name: Terminal  Email: connect@withterminal.com
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.ConnectionsUpdateCurrentConnectionDetailsRequestCompany;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * ConnectionsUpdateCurrentConnectionDetailsRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ConnectionsUpdateCurrentConnectionDetailsRequest {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private ConnectionsUpdateCurrentConnectionDetailsRequestCompany company;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SYNC_MODE = "syncMode";
  @SerializedName(SERIALIZED_NAME_SYNC_MODE)
  private String syncMode;

  public ConnectionsUpdateCurrentConnectionDetailsRequest() {
  }

  public ConnectionsUpdateCurrentConnectionDetailsRequest tags(List<String> tags) {
    
    
    
    
    this.tags = tags;
    return this;
  }

  public ConnectionsUpdateCurrentConnectionDetailsRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"esse sit veniam et\",\"sunt u\"]", value = "")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    
    
    
    this.tags = tags;
  }


  public ConnectionsUpdateCurrentConnectionDetailsRequest company(ConnectionsUpdateCurrentConnectionDetailsRequestCompany company) {
    
    
    
    
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectionsUpdateCurrentConnectionDetailsRequestCompany getCompany() {
    return company;
  }


  public void setCompany(ConnectionsUpdateCurrentConnectionDetailsRequestCompany company) {
    
    
    
    this.company = company;
  }


  public ConnectionsUpdateCurrentConnectionDetailsRequest externalId(String externalId) {
    
    
    
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "eu cillum", value = "")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    
    
    
    this.externalId = externalId;
  }


  public ConnectionsUpdateCurrentConnectionDetailsRequest status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "incididunt reprehenderit sunt", value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public ConnectionsUpdateCurrentConnectionDetailsRequest syncMode(String syncMode) {
    
    
    
    
    this.syncMode = syncMode;
    return this;
  }

   /**
   * Get syncMode
   * @return syncMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "automatic", value = "")

  public String getSyncMode() {
    return syncMode;
  }


  public void setSyncMode(String syncMode) {
    
    
    
    this.syncMode = syncMode;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ConnectionsUpdateCurrentConnectionDetailsRequest instance itself
   */
  public ConnectionsUpdateCurrentConnectionDetailsRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionsUpdateCurrentConnectionDetailsRequest connectionsUpdateCurrentConnectionDetailsRequest = (ConnectionsUpdateCurrentConnectionDetailsRequest) o;
    return Objects.equals(this.tags, connectionsUpdateCurrentConnectionDetailsRequest.tags) &&
        Objects.equals(this.company, connectionsUpdateCurrentConnectionDetailsRequest.company) &&
        Objects.equals(this.externalId, connectionsUpdateCurrentConnectionDetailsRequest.externalId) &&
        Objects.equals(this.status, connectionsUpdateCurrentConnectionDetailsRequest.status) &&
        Objects.equals(this.syncMode, connectionsUpdateCurrentConnectionDetailsRequest.syncMode)&&
        Objects.equals(this.additionalProperties, connectionsUpdateCurrentConnectionDetailsRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, company, externalId, status, syncMode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionsUpdateCurrentConnectionDetailsRequest {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    syncMode: ").append(toIndentedString(syncMode)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("tags");
    openapiFields.add("company");
    openapiFields.add("externalId");
    openapiFields.add("status");
    openapiFields.add("syncMode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConnectionsUpdateCurrentConnectionDetailsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConnectionsUpdateCurrentConnectionDetailsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConnectionsUpdateCurrentConnectionDetailsRequest is not found in the empty JSON string", ConnectionsUpdateCurrentConnectionDetailsRequest.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      // validate the optional field `company`
      if (jsonObj.get("company") != null && !jsonObj.get("company").isJsonNull()) {
        ConnectionsUpdateCurrentConnectionDetailsRequestCompany.validateJsonObject(jsonObj.getAsJsonObject("company"));
      }
      if ((jsonObj.get("externalId") != null && !jsonObj.get("externalId").isJsonNull()) && !jsonObj.get("externalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalId").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("syncMode") != null && !jsonObj.get("syncMode").isJsonNull()) && !jsonObj.get("syncMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `syncMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("syncMode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConnectionsUpdateCurrentConnectionDetailsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConnectionsUpdateCurrentConnectionDetailsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConnectionsUpdateCurrentConnectionDetailsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConnectionsUpdateCurrentConnectionDetailsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ConnectionsUpdateCurrentConnectionDetailsRequest>() {
           @Override
           public void write(JsonWriter out, ConnectionsUpdateCurrentConnectionDetailsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ConnectionsUpdateCurrentConnectionDetailsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ConnectionsUpdateCurrentConnectionDetailsRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConnectionsUpdateCurrentConnectionDetailsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConnectionsUpdateCurrentConnectionDetailsRequest
  * @throws IOException if the JSON string is invalid with respect to ConnectionsUpdateCurrentConnectionDetailsRequest
  */
  public static ConnectionsUpdateCurrentConnectionDetailsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConnectionsUpdateCurrentConnectionDetailsRequest.class);
  }

 /**
  * Convert an instance of ConnectionsUpdateCurrentConnectionDetailsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

