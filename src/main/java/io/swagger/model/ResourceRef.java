package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResourceRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-05T08:29:31.057695362Z[GMT]")


public class ResourceRef   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("@baseType")
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")
  private String _atSchemaLocation = null;

  @JsonProperty("@type")
  private String _atType = null;

  @JsonProperty("@referredType")
  private String _atReferredType = null;

  public ResourceRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of a related entity.
   * @return id
   **/
  @Schema(required = true, description = "Unique identifier of a related entity.")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ResourceRef href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the related entity.
   * @return href
   **/
  @Schema(description = "Reference of the related entity.")
      @NotNull

    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ResourceRef name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the resource
   * @return name
   **/
  @Schema(description = "Name of the resource")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResourceRef value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The resource value that can be used to identify a resource with a public key (e.g.: a tel nr, an msisdn)
   * @return value
   **/
  @Schema(description = "The resource value that can be used to identify a resource with a public key (e.g.: a tel nr, an msisdn)")
      @NotNull

    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ResourceRef _atBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return _atBaseType
   **/
  @Schema(description = "When sub-classing, this defines the super-class")
      @NotNull

    public String getAtBaseType() {
    return _atBaseType;
  }

  public void setAtBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
  }

  public ResourceRef _atSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return _atSchemaLocation
   **/
  @Schema(description = "A URI to a JSON-Schema file that defines additional attributes and relationships")
      @NotNull

    public String getAtSchemaLocation() {
    return _atSchemaLocation;
  }

  public void setAtSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
  }

  public ResourceRef _atType(String _atType) {
    this._atType = _atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class entity name
   * @return _atType
   **/
  @Schema(description = "When sub-classing, this defines the sub-class entity name")
      @NotNull

    public String getAtType() {
    return _atType;
  }

  public void setAtType(String _atType) {
    this._atType = _atType;
  }

  public ResourceRef _atReferredType(String _atReferredType) {
    this._atReferredType = _atReferredType;
    return this;
  }

  /**
   * The actual type of the target instance when needed for disambiguation.
   * @return _atReferredType
   **/
  @Schema(description = "The actual type of the target instance when needed for disambiguation.")
      @NotNull

    public String getAtReferredType() {
    return _atReferredType;
  }

  public void setAtReferredType(String _atReferredType) {
    this._atReferredType = _atReferredType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceRef resourceRef = (ResourceRef) o;
    return Objects.equals(this.id, resourceRef.id) &&
        Objects.equals(this.href, resourceRef.href) &&
        Objects.equals(this.name, resourceRef.name) &&
        Objects.equals(this.value, resourceRef.value) &&
        Objects.equals(this._atBaseType, resourceRef._atBaseType) &&
        Objects.equals(this._atSchemaLocation, resourceRef._atSchemaLocation) &&
        Objects.equals(this._atType, resourceRef._atType) &&
        Objects.equals(this._atReferredType, resourceRef._atReferredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, value, _atBaseType, _atSchemaLocation, _atType, _atReferredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    _atBaseType: ").append(toIndentedString(_atBaseType)).append("\n");
    sb.append("    _atSchemaLocation: ").append(toIndentedString(_atSchemaLocation)).append("\n");
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    _atReferredType: ").append(toIndentedString(_atReferredType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
