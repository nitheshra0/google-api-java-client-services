/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.content.model;

/**
 * Model definition for MerchantOrderReturnItem.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MerchantOrderReturnItem extends com.google.api.client.json.GenericJson {

  /**
   * The reason that the customer chooses to return an item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomerReturnReason customerReturnReason;

  /**
   * Product level item ID. If the returned items are of the same product, they will have the same
   * ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String itemId;

  /**
   * The reason that merchant chooses to accept a return item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RefundReason merchantReturnReason;

  /**
   * Product data from the time of the order placement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrderLineItemProduct product;

  /**
   * IDs of the return shipments that this return item belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> returnShipmentIds;

  /**
   * State of the item.
   *
   * Acceptable values are:   - "`canceled`"  - "`new`"  - "`received`"  - "`refunded`"  -
   * "`rejected`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The reason that the customer chooses to return an item.
   * @return value or {@code null} for none
   */
  public CustomerReturnReason getCustomerReturnReason() {
    return customerReturnReason;
  }

  /**
   * The reason that the customer chooses to return an item.
   * @param customerReturnReason customerReturnReason or {@code null} for none
   */
  public MerchantOrderReturnItem setCustomerReturnReason(CustomerReturnReason customerReturnReason) {
    this.customerReturnReason = customerReturnReason;
    return this;
  }

  /**
   * Product level item ID. If the returned items are of the same product, they will have the same
   * ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getItemId() {
    return itemId;
  }

  /**
   * Product level item ID. If the returned items are of the same product, they will have the same
   * ID.
   * @param itemId itemId or {@code null} for none
   */
  public MerchantOrderReturnItem setItemId(java.lang.String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The reason that merchant chooses to accept a return item.
   * @return value or {@code null} for none
   */
  public RefundReason getMerchantReturnReason() {
    return merchantReturnReason;
  }

  /**
   * The reason that merchant chooses to accept a return item.
   * @param merchantReturnReason merchantReturnReason or {@code null} for none
   */
  public MerchantOrderReturnItem setMerchantReturnReason(RefundReason merchantReturnReason) {
    this.merchantReturnReason = merchantReturnReason;
    return this;
  }

  /**
   * Product data from the time of the order placement.
   * @return value or {@code null} for none
   */
  public OrderLineItemProduct getProduct() {
    return product;
  }

  /**
   * Product data from the time of the order placement.
   * @param product product or {@code null} for none
   */
  public MerchantOrderReturnItem setProduct(OrderLineItemProduct product) {
    this.product = product;
    return this;
  }

  /**
   * IDs of the return shipments that this return item belongs to.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getReturnShipmentIds() {
    return returnShipmentIds;
  }

  /**
   * IDs of the return shipments that this return item belongs to.
   * @param returnShipmentIds returnShipmentIds or {@code null} for none
   */
  public MerchantOrderReturnItem setReturnShipmentIds(java.util.List<java.lang.String> returnShipmentIds) {
    this.returnShipmentIds = returnShipmentIds;
    return this;
  }

  /**
   * State of the item.
   *
   * Acceptable values are:   - "`canceled`"  - "`new`"  - "`received`"  - "`refunded`"  -
   * "`rejected`"
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * State of the item.
   *
   * Acceptable values are:   - "`canceled`"  - "`new`"  - "`received`"  - "`refunded`"  -
   * "`rejected`"
   * @param state state or {@code null} for none
   */
  public MerchantOrderReturnItem setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public MerchantOrderReturnItem set(String fieldName, Object value) {
    return (MerchantOrderReturnItem) super.set(fieldName, value);
  }

  @Override
  public MerchantOrderReturnItem clone() {
    return (MerchantOrderReturnItem) super.clone();
  }

}
