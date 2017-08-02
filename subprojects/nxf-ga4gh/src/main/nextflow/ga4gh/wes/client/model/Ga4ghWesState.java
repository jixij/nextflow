/*
 * workflow_execution.proto
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: version not set
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package nextflow.ga4gh.wes.client.model;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ga4gh_wes_state
 */
@JsonAdapter(Ga4ghWesState.Adapter.class)
public enum Ga4ghWesState {
  
  UNKNOWN("Unknown"),
  
  QUEUED("Queued"),
  
  RUNNING("Running"),
  
  PAUSED("Paused"),
  
  COMPLETE("Complete"),
  
  ERROR("Error"),
  
  SYSTEMERROR("SystemError"),
  
  CANCELED("Canceled"),
  
  INITIALIZING("Initializing");

  private String value;

  Ga4ghWesState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Ga4ghWesState fromValue(String text) {
    for (Ga4ghWesState b : Ga4ghWesState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Ga4ghWesState> {
    @Override
    public void write(final JsonWriter jsonWriter, final Ga4ghWesState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Ga4ghWesState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Ga4ghWesState.fromValue(String.valueOf(value));
    }
  }
}

