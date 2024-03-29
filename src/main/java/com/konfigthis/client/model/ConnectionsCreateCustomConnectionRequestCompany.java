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
 * ConnectionsCreateCustomConnectionRequestCompany
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ConnectionsCreateCustomConnectionRequestCompany {
  public static final String SERIALIZED_NAME_DOT_NUMBERS = "dotNumbers";
  @SerializedName(SERIALIZED_NAME_DOT_NUMBERS)
  private List<String> dotNumbers = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public ConnectionsCreateCustomConnectionRequestCompany() {
  }

  public ConnectionsCreateCustomConnectionRequestCompany dotNumbers(List<String> dotNumbers) {
    
    
    
    
    this.dotNumbers = dotNumbers;
    return this;
  }

  public ConnectionsCreateCustomConnectionRequestCompany addDotNumbersItem(String dotNumbersItem) {
    if (this.dotNumbers == null) {
      this.dotNumbers = new ArrayList<>();
    }
    this.dotNumbers.add(dotNumbersItem);
    return this;
  }

   /**
   * Get dotNumbers
   * @return dotNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"ipsum in\",\"anim pariatur Excepteur cupidatat enim\"]", value = "")

  public List<String> getDotNumbers() {
    return dotNumbers;
  }


  public void setDotNumbers(List<String> dotNumbers) {
    
    
    
    this.dotNumbers = dotNumbers;
  }


  public ConnectionsCreateCustomConnectionRequestCompany name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ipsum irure labore", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
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
   * @return the ConnectionsCreateCustomConnectionRequestCompany instance itself
   */
  public ConnectionsCreateCustomConnectionRequestCompany putAdditionalProperty(String key, Object value) {
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
    ConnectionsCreateCustomConnectionRequestCompany connectionsCreateCustomConnectionRequestCompany = (ConnectionsCreateCustomConnectionRequestCompany) o;
    return Objects.equals(this.dotNumbers, connectionsCreateCustomConnectionRequestCompany.dotNumbers) &&
        Objects.equals(this.name, connectionsCreateCustomConnectionRequestCompany.name)&&
        Objects.equals(this.additionalProperties, connectionsCreateCustomConnectionRequestCompany.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dotNumbers, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionsCreateCustomConnectionRequestCompany {\n");
    sb.append("    dotNumbers: ").append(toIndentedString(dotNumbers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("dotNumbers");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConnectionsCreateCustomConnectionRequestCompany
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConnectionsCreateCustomConnectionRequestCompany.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConnectionsCreateCustomConnectionRequestCompany is not found in the empty JSON string", ConnectionsCreateCustomConnectionRequestCompany.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("dotNumbers") != null && !jsonObj.get("dotNumbers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dotNumbers` to be an array in the JSON string but got `%s`", jsonObj.get("dotNumbers").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConnectionsCreateCustomConnectionRequestCompany.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConnectionsCreateCustomConnectionRequestCompany' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConnectionsCreateCustomConnectionRequestCompany> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConnectionsCreateCustomConnectionRequestCompany.class));

       return (TypeAdapter<T>) new TypeAdapter<ConnectionsCreateCustomConnectionRequestCompany>() {
           @Override
           public void write(JsonWriter out, ConnectionsCreateCustomConnectionRequestCompany value) throws IOException {
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
           public ConnectionsCreateCustomConnectionRequestCompany read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ConnectionsCreateCustomConnectionRequestCompany instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ConnectionsCreateCustomConnectionRequestCompany given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConnectionsCreateCustomConnectionRequestCompany
  * @throws IOException if the JSON string is invalid with respect to ConnectionsCreateCustomConnectionRequestCompany
  */
  public static ConnectionsCreateCustomConnectionRequestCompany fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConnectionsCreateCustomConnectionRequestCompany.class);
  }

 /**
  * Convert an instance of ConnectionsCreateCustomConnectionRequestCompany to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

