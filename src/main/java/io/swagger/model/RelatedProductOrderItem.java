package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RelatedProductOrderItem (ProductOrder item) .The product order item which triggered product creation/change/termination.
 */
@Schema(description = "RelatedProductOrderItem (ProductOrder item) .The product order item which triggered product creation/change/termination.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-05T08:29:31.057695362Z[GMT]")


public class RelatedProductOrderItem   {
  @JsonProperty("orderItemAction")
  private String orderItemAction = null;

  @JsonProperty("orderItemId")
  private String orderItemId = null;

  @JsonProperty("productOrderHref")
  private String productOrderHref = null;

  @JsonProperty("productOrderId")
  private String productOrderId = null;

  @JsonProperty("role")
  private String role = null;

  @JsonProperty("@baseType")
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")
  private String _atSchemaLocation = null;

  @JsonProperty("@type")
  private String _atType = null;

  @JsonProperty("@referredType")
  private String _atReferredType = null;

  public RelatedProductOrderItem orderItemAction(String orderItemAction) {
    this.orderItemAction = orderItemAction;
    return this;
  }

  /**
   * Action of the order item for this product
   * @return orderItemAction
   **/
  @Schema(description = "Action of the order item for this product")
      @NotNull

    public String getOrderItemAction() {
    return orderItemAction;
  }

  public void setOrderItemAction(String orderItemAction) {
    this.orderItemAction = orderItemAction;
  }

  public RelatedProductOrderItem orderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
    return this;
  }

  /**
   * Identifier of the order item where the product was managed
   * @return orderItemId
   **/
  @Schema(required = true, description = "Identifier of the order item where the product was managed")
      @NotNull

    public String getOrderItemId() {
    return orderItemId;
  }

  public void setOrderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
  }

  public RelatedProductOrderItem productOrderHref(String productOrderHref) {
    this.productOrderHref = productOrderHref;
    return this;
  }

  /**
   * Reference of the related entity.
   * @return productOrderHref
   **/
  @Schema(description = "Reference of the related entity.")
      @NotNull

    public String getProductOrderHref() {
    return productOrderHref;
  }

  public void setProductOrderHref(String productOrderHref) {
    this.productOrderHref = productOrderHref;
  }

  public RelatedProductOrderItem productOrderId(String productOrderId) {
    this.productOrderId = productOrderId;
    return this;
  }

  /**
   * Unique identifier of a related entity.
   * @return productOrderId
   **/
  @Schema(required = true, description = "Unique identifier of a related entity.")
      @NotNull

    public String getProductOrderId() {
    return productOrderId;
  }

  public void setProductOrderId(String productOrderId) {
    this.productOrderId = productOrderId;
  }

  public RelatedProductOrderItem role(String role) {
    this.role = role;
    return this;
  }

  /**
   * role of the product order item for this product
   * @return role
   **/
  @Schema(description = "role of the product order item for this product")
      @NotNull

    public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public RelatedProductOrderItem _atBaseType(String _atBaseType) {
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

  public RelatedProductOrderItem _atSchemaLocation(String _atSchemaLocation) {
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

  public RelatedProductOrderItem _atType(String _atType) {
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

  public RelatedProductOrderItem _atReferredType(String _atReferredType) {
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
    RelatedProductOrderItem relatedProductOrderItem = (RelatedProductOrderItem) o;
    return Objects.equals(this.orderItemAction, relatedProductOrderItem.orderItemAction) &&
        Objects.equals(this.orderItemId, relatedProductOrderItem.orderItemId) &&
        Objects.equals(this.productOrderHref, relatedProductOrderItem.productOrderHref) &&
        Objects.equals(this.productOrderId, relatedProductOrderItem.productOrderId) &&
        Objects.equals(this.role, relatedProductOrderItem.role) &&
        Objects.equals(this._atBaseType, relatedProductOrderItem._atBaseType) &&
        Objects.equals(this._atSchemaLocation, relatedProductOrderItem._atSchemaLocation) &&
        Objects.equals(this._atType, relatedProductOrderItem._atType) &&
        Objects.equals(this._atReferredType, relatedProductOrderItem._atReferredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderItemAction, orderItemId, productOrderHref, productOrderId, role, _atBaseType, _atSchemaLocation, _atType, _atReferredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedProductOrderItem {\n");
    
    sb.append("    orderItemAction: ").append(toIndentedString(orderItemAction)).append("\n");
    sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
    sb.append("    productOrderHref: ").append(toIndentedString(productOrderHref)).append("\n");
    sb.append("    productOrderId: ").append(toIndentedString(productOrderId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
