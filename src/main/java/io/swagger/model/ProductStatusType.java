package io.swagger.model;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Possible values for the status of the product
 */
public enum ProductStatusType {
  CREATED("created"),
    PENDINGACTIVE("pendingActive"),
    CANCELLED("cancelled"),
    ACTIVE("active"),
    PENDINGTERMINATE("pendingTerminate"),
    TERMINATED("terminated"),
    SUSPENDED("suspended"),
    ABORTED_("aborted ");

  private String value;

  ProductStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductStatusType fromValue(String text) {
    for (ProductStatusType b : ProductStatusType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
