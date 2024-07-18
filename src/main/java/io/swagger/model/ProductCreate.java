package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AgreementItemRef;
import io.swagger.model.BillingAccountRef;
import io.swagger.model.Characteristic;
import io.swagger.model.ProductOfferingRef;
import io.swagger.model.ProductPrice;
import io.swagger.model.ProductRefOrValue;
import io.swagger.model.ProductRelationship;
import io.swagger.model.ProductSpecificationRef;
import io.swagger.model.ProductStatusType;
import io.swagger.model.ProductTerm;
import io.swagger.model.RelatedParty;
import io.swagger.model.RelatedPlaceRefOrValue;
import io.swagger.model.RelatedProductOrderItem;
import io.swagger.model.ResourceRef;
import io.swagger.model.ServiceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A product offering procured by a customer or other interested party playing a party role. A product is realized as one or more service(s) and / or resource(s). Skipped properties: id,href
 */
@Schema(description = "A product offering procured by a customer or other interested party playing a party role. A product is realized as one or more service(s) and / or resource(s). Skipped properties: id,href")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-05T08:29:31.057695362Z[GMT]")


public class ProductCreate   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("isBundle")
  private Boolean isBundle = null;

  @JsonProperty("isCustomerVisible")
  private Boolean isCustomerVisible = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("orderDate")
  private OffsetDateTime orderDate = null;

  @JsonProperty("productSerialNumber")
  private String productSerialNumber = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  @JsonProperty("terminationDate")
  private OffsetDateTime terminationDate = null;

  @JsonProperty("agreement")
  @Valid
  private List<AgreementItemRef> agreement = null;

  @JsonProperty("billingAccount")
  private BillingAccountRef billingAccount = null;

  @JsonProperty("place")
  @Valid
  private List<RelatedPlaceRefOrValue> place = null;

  @JsonProperty("product")
  @Valid
  private List<ProductRefOrValue> product = null;

  @JsonProperty("productCharacteristic")
  @Valid
  private List<Characteristic> productCharacteristic = null;

  @JsonProperty("productOffering")
  private ProductOfferingRef productOffering = null;

  @JsonProperty("productOrderItem")
  @Valid
  private List<RelatedProductOrderItem> productOrderItem = null;

  @JsonProperty("productPrice")
  @Valid
  private List<ProductPrice> productPrice = null;

  @JsonProperty("productRelationship")
  @Valid
  private List<ProductRelationship> productRelationship = null;

  @JsonProperty("productSpecification")
  private ProductSpecificationRef productSpecification = null;

  @JsonProperty("productTerm")
  @Valid
  private List<ProductTerm> productTerm = null;

  @JsonProperty("realizingResource")
  @Valid
  private List<ResourceRef> realizingResource = null;

  @JsonProperty("realizingService")
  @Valid
  private List<ServiceRef> realizingService = null;

  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedParty> relatedParty = null;

  @JsonProperty("status")
  private ProductStatusType status = null;

  @JsonProperty("@baseType")
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")
  private String _atSchemaLocation = null;

  @JsonProperty("@type")
  private String _atType = null;

  public ProductCreate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Is the description of the product. It could be copied from the description of the Product Offering.
   * @return description
   **/
  @Schema(description = "Is the description of the product. It could be copied from the description of the Product Offering.")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductCreate isBundle(Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  /**
   * If true, the product is a ProductBundle which is an instantiation of a BundledProductOffering. If false, the product is a ProductComponent which is an instantiation of a SimpleProductOffering.
   * @return isBundle
   **/
  @Schema(description = "If true, the product is a ProductBundle which is an instantiation of a BundledProductOffering. If false, the product is a ProductComponent which is an instantiation of a SimpleProductOffering.")
      @NotNull

    public Boolean isIsBundle() {
    return isBundle;
  }

  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }

  public ProductCreate isCustomerVisible(Boolean isCustomerVisible) {
    this.isCustomerVisible = isCustomerVisible;
    return this;
  }

  /**
   * If true, the product is visible by the customer.
   * @return isCustomerVisible
   **/
  @Schema(description = "If true, the product is visible by the customer.")
      @NotNull

    public Boolean isIsCustomerVisible() {
    return isCustomerVisible;
  }

  public void setIsCustomerVisible(Boolean isCustomerVisible) {
    this.isCustomerVisible = isCustomerVisible;
  }

  public ProductCreate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the product. It could be the same as the name of the product offering
   * @return name
   **/
  @Schema(description = "Name of the product. It could be the same as the name of the product offering")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductCreate orderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
    return this;
  }

  /**
   * Is the date when the product was ordered
   * @return orderDate
   **/
  @Schema(description = "Is the date when the product was ordered")
      @NotNull

    @Valid
    public OffsetDateTime getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
  }

  public ProductCreate productSerialNumber(String productSerialNumber) {
    this.productSerialNumber = productSerialNumber;
    return this;
  }

  /**
   * Is the serial number for the product. This is typically applicable to tangible products e.g. Broadband Router.
   * @return productSerialNumber
   **/
  @Schema(description = "Is the serial number for the product. This is typically applicable to tangible products e.g. Broadband Router.")
      @NotNull

    public String getProductSerialNumber() {
    return productSerialNumber;
  }

  public void setProductSerialNumber(String productSerialNumber) {
    this.productSerialNumber = productSerialNumber;
  }

  public ProductCreate startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Is the date from which the product starts
   * @return startDate
   **/
  @Schema(description = "Is the date from which the product starts")
      @NotNull

    @Valid
    public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public ProductCreate terminationDate(OffsetDateTime terminationDate) {
    this.terminationDate = terminationDate;
    return this;
  }

  /**
   * Is the date when the product was terminated
   * @return terminationDate
   **/
  @Schema(description = "Is the date when the product was terminated")
      @NotNull

    @Valid
    public OffsetDateTime getTerminationDate() {
    return terminationDate;
  }

  public void setTerminationDate(OffsetDateTime terminationDate) {
    this.terminationDate = terminationDate;
  }

  public ProductCreate agreement(List<AgreementItemRef> agreement) {
    this.agreement = agreement;
    return this;
  }

  public ProductCreate addAgreementItem(AgreementItemRef agreementItem) {
    if (this.agreement == null) {
      this.agreement = new ArrayList<AgreementItemRef>();
    }
    this.agreement.add(agreementItem);
    return this;
  }

  /**
   * Get agreement
   * @return agreement
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<AgreementItemRef> getAgreement() {
    return agreement;
  }

  public void setAgreement(List<AgreementItemRef> agreement) {
    this.agreement = agreement;
  }

  public ProductCreate billingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
    return this;
  }

  /**
   * Get billingAccount
   * @return billingAccount
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public BillingAccountRef getBillingAccount() {
    return billingAccount;
  }

  public void setBillingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
  }

  public ProductCreate place(List<RelatedPlaceRefOrValue> place) {
    this.place = place;
    return this;
  }

  public ProductCreate addPlaceItem(RelatedPlaceRefOrValue placeItem) {
    if (this.place == null) {
      this.place = new ArrayList<RelatedPlaceRefOrValue>();
    }
    this.place.add(placeItem);
    return this;
  }

  /**
   * Get place
   * @return place
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<RelatedPlaceRefOrValue> getPlace() {
    return place;
  }

  public void setPlace(List<RelatedPlaceRefOrValue> place) {
    this.place = place;
  }

  public ProductCreate product(List<ProductRefOrValue> product) {
    this.product = product;
    return this;
  }

  public ProductCreate addProductItem(ProductRefOrValue productItem) {
    if (this.product == null) {
      this.product = new ArrayList<ProductRefOrValue>();
    }
    this.product.add(productItem);
    return this;
  }

  /**
   * Get product
   * @return product
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<ProductRefOrValue> getProduct() {
    return product;
  }

  public void setProduct(List<ProductRefOrValue> product) {
    this.product = product;
  }

  public ProductCreate productCharacteristic(List<Characteristic> productCharacteristic) {
    this.productCharacteristic = productCharacteristic;
    return this;
  }

  public ProductCreate addProductCharacteristicItem(Characteristic productCharacteristicItem) {
    if (this.productCharacteristic == null) {
      this.productCharacteristic = new ArrayList<Characteristic>();
    }
    this.productCharacteristic.add(productCharacteristicItem);
    return this;
  }

  /**
   * Get productCharacteristic
   * @return productCharacteristic
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<Characteristic> getProductCharacteristic() {
    return productCharacteristic;
  }

  public void setProductCharacteristic(List<Characteristic> productCharacteristic) {
    this.productCharacteristic = productCharacteristic;
  }

  public ProductCreate productOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
    return this;
  }

  /**
   * Get productOffering
   * @return productOffering
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public ProductOfferingRef getProductOffering() {
    return productOffering;
  }

  public void setProductOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
  }

  public ProductCreate productOrderItem(List<RelatedProductOrderItem> productOrderItem) {
    this.productOrderItem = productOrderItem;
    return this;
  }

  public ProductCreate addProductOrderItemItem(RelatedProductOrderItem productOrderItemItem) {
    if (this.productOrderItem == null) {
      this.productOrderItem = new ArrayList<RelatedProductOrderItem>();
    }
    this.productOrderItem.add(productOrderItemItem);
    return this;
  }

  /**
   * Get productOrderItem
   * @return productOrderItem
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<RelatedProductOrderItem> getProductOrderItem() {
    return productOrderItem;
  }

  public void setProductOrderItem(List<RelatedProductOrderItem> productOrderItem) {
    this.productOrderItem = productOrderItem;
  }

  public ProductCreate productPrice(List<ProductPrice> productPrice) {
    this.productPrice = productPrice;
    return this;
  }

  public ProductCreate addProductPriceItem(ProductPrice productPriceItem) {
    if (this.productPrice == null) {
      this.productPrice = new ArrayList<ProductPrice>();
    }
    this.productPrice.add(productPriceItem);
    return this;
  }

  /**
   * Get productPrice
   * @return productPrice
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<ProductPrice> getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(List<ProductPrice> productPrice) {
    this.productPrice = productPrice;
  }

  public ProductCreate productRelationship(List<ProductRelationship> productRelationship) {
    this.productRelationship = productRelationship;
    return this;
  }

  public ProductCreate addProductRelationshipItem(ProductRelationship productRelationshipItem) {
    if (this.productRelationship == null) {
      this.productRelationship = new ArrayList<ProductRelationship>();
    }
    this.productRelationship.add(productRelationshipItem);
    return this;
  }

  /**
   * Get productRelationship
   * @return productRelationship
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<ProductRelationship> getProductRelationship() {
    return productRelationship;
  }

  public void setProductRelationship(List<ProductRelationship> productRelationship) {
    this.productRelationship = productRelationship;
  }

  public ProductCreate productSpecification(ProductSpecificationRef productSpecification) {
    this.productSpecification = productSpecification;
    return this;
  }

  /**
   * Get productSpecification
   * @return productSpecification
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public ProductSpecificationRef getProductSpecification() {
    return productSpecification;
  }

  public void setProductSpecification(ProductSpecificationRef productSpecification) {
    this.productSpecification = productSpecification;
  }

  public ProductCreate productTerm(List<ProductTerm> productTerm) {
    this.productTerm = productTerm;
    return this;
  }

  public ProductCreate addProductTermItem(ProductTerm productTermItem) {
    if (this.productTerm == null) {
      this.productTerm = new ArrayList<ProductTerm>();
    }
    this.productTerm.add(productTermItem);
    return this;
  }

  /**
   * Get productTerm
   * @return productTerm
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<ProductTerm> getProductTerm() {
    return productTerm;
  }

  public void setProductTerm(List<ProductTerm> productTerm) {
    this.productTerm = productTerm;
  }

  public ProductCreate realizingResource(List<ResourceRef> realizingResource) {
    this.realizingResource = realizingResource;
    return this;
  }

  public ProductCreate addRealizingResourceItem(ResourceRef realizingResourceItem) {
    if (this.realizingResource == null) {
      this.realizingResource = new ArrayList<ResourceRef>();
    }
    this.realizingResource.add(realizingResourceItem);
    return this;
  }

  /**
   * Get realizingResource
   * @return realizingResource
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<ResourceRef> getRealizingResource() {
    return realizingResource;
  }

  public void setRealizingResource(List<ResourceRef> realizingResource) {
    this.realizingResource = realizingResource;
  }

  public ProductCreate realizingService(List<ServiceRef> realizingService) {
    this.realizingService = realizingService;
    return this;
  }

  public ProductCreate addRealizingServiceItem(ServiceRef realizingServiceItem) {
    if (this.realizingService == null) {
      this.realizingService = new ArrayList<ServiceRef>();
    }
    this.realizingService.add(realizingServiceItem);
    return this;
  }

  /**
   * Get realizingService
   * @return realizingService
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<ServiceRef> getRealizingService() {
    return realizingService;
  }

  public void setRealizingService(List<ServiceRef> realizingService) {
    this.realizingService = realizingService;
  }

  public ProductCreate relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ProductCreate addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedParty>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * Get relatedParty
   * @return relatedParty
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public ProductCreate status(ProductStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ProductStatusType getStatus() {
    return status;
  }

  public void setStatus(ProductStatusType status) {
    this.status = status;
  }

  public ProductCreate _atBaseType(String _atBaseType) {
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

  public ProductCreate _atSchemaLocation(String _atSchemaLocation) {
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

  public ProductCreate _atType(String _atType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCreate productCreate = (ProductCreate) o;
    return Objects.equals(this.description, productCreate.description) &&
        Objects.equals(this.isBundle, productCreate.isBundle) &&
        Objects.equals(this.isCustomerVisible, productCreate.isCustomerVisible) &&
        Objects.equals(this.name, productCreate.name) &&
        Objects.equals(this.orderDate, productCreate.orderDate) &&
        Objects.equals(this.productSerialNumber, productCreate.productSerialNumber) &&
        Objects.equals(this.startDate, productCreate.startDate) &&
        Objects.equals(this.terminationDate, productCreate.terminationDate) &&
        Objects.equals(this.agreement, productCreate.agreement) &&
        Objects.equals(this.billingAccount, productCreate.billingAccount) &&
        Objects.equals(this.place, productCreate.place) &&
        Objects.equals(this.product, productCreate.product) &&
        Objects.equals(this.productCharacteristic, productCreate.productCharacteristic) &&
        Objects.equals(this.productOffering, productCreate.productOffering) &&
        Objects.equals(this.productOrderItem, productCreate.productOrderItem) &&
        Objects.equals(this.productPrice, productCreate.productPrice) &&
        Objects.equals(this.productRelationship, productCreate.productRelationship) &&
        Objects.equals(this.productSpecification, productCreate.productSpecification) &&
        Objects.equals(this.productTerm, productCreate.productTerm) &&
        Objects.equals(this.realizingResource, productCreate.realizingResource) &&
        Objects.equals(this.realizingService, productCreate.realizingService) &&
        Objects.equals(this.relatedParty, productCreate.relatedParty) &&
        Objects.equals(this.status, productCreate.status) &&
        Objects.equals(this._atBaseType, productCreate._atBaseType) &&
        Objects.equals(this._atSchemaLocation, productCreate._atSchemaLocation) &&
        Objects.equals(this._atType, productCreate._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, isBundle, isCustomerVisible, name, orderDate, productSerialNumber, startDate, terminationDate, agreement, billingAccount, place, product, productCharacteristic, productOffering, productOrderItem, productPrice, productRelationship, productSpecification, productTerm, realizingResource, realizingService, relatedParty, status, _atBaseType, _atSchemaLocation, _atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCreate {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    isCustomerVisible: ").append(toIndentedString(isCustomerVisible)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    productSerialNumber: ").append(toIndentedString(productSerialNumber)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    terminationDate: ").append(toIndentedString(terminationDate)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productCharacteristic: ").append(toIndentedString(productCharacteristic)).append("\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
    sb.append("    productOrderItem: ").append(toIndentedString(productOrderItem)).append("\n");
    sb.append("    productPrice: ").append(toIndentedString(productPrice)).append("\n");
    sb.append("    productRelationship: ").append(toIndentedString(productRelationship)).append("\n");
    sb.append("    productSpecification: ").append(toIndentedString(productSpecification)).append("\n");
    sb.append("    productTerm: ").append(toIndentedString(productTerm)).append("\n");
    sb.append("    realizingResource: ").append(toIndentedString(realizingResource)).append("\n");
    sb.append("    realizingService: ").append(toIndentedString(realizingService)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    _atBaseType: ").append(toIndentedString(_atBaseType)).append("\n");
    sb.append("    _atSchemaLocation: ").append(toIndentedString(_atSchemaLocation)).append("\n");
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
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
