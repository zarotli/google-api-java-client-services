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

package com.google.api.services.vision.v1p1beta1.model;

/**
 * Parameters for a product search request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p1beta1ProductSearchParams extends com.google.api.client.json.GenericJson {

  /**
   * The bounding polygon around the area of interest in the image. If it is not specified, system
   * discretion will be applied.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p1beta1BoundingPoly boundingPoly;

  /**
   * The filtering expression. This can be used to restrict search results based on Product labels.
   * We currently support an AND of OR of key-value expressions, where each expression within an OR
   * must have the same key. An '=' should be used to connect the key and value.
   *
   * For example, "(color = red OR color = blue) AND brand = Google" is acceptable, but "(color =
   * red OR brand = Google)" is not acceptable. "color: red" is not acceptable because it uses a ':'
   * instead of an '='.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * The list of product categories to search in. Currently, we only consider the first category,
   * and either "homegoods-v2", "apparel-v2", "toys-v2", "packagedgoods-v1", or "general-v1" should
   * be specified. The legacy categories "homegoods", "apparel", and "toys" are still supported but
   * will be deprecated. For new products, please use "homegoods-v2", "apparel-v2", or "toys-v2" for
   * better product search accuracy. It is recommended to migrate existing products to these
   * categories as well.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> productCategories;

  /**
   * The resource name of a ProductSet to be searched for similar images.
   *
   * Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productSet;

  /**
   * The bounding polygon around the area of interest in the image. If it is not specified, system
   * discretion will be applied.
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1BoundingPoly getBoundingPoly() {
    return boundingPoly;
  }

  /**
   * The bounding polygon around the area of interest in the image. If it is not specified, system
   * discretion will be applied.
   * @param boundingPoly boundingPoly or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1ProductSearchParams setBoundingPoly(GoogleCloudVisionV1p1beta1BoundingPoly boundingPoly) {
    this.boundingPoly = boundingPoly;
    return this;
  }

  /**
   * The filtering expression. This can be used to restrict search results based on Product labels.
   * We currently support an AND of OR of key-value expressions, where each expression within an OR
   * must have the same key. An '=' should be used to connect the key and value.
   *
   * For example, "(color = red OR color = blue) AND brand = Google" is acceptable, but "(color =
   * red OR brand = Google)" is not acceptable. "color: red" is not acceptable because it uses a ':'
   * instead of an '='.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * The filtering expression. This can be used to restrict search results based on Product labels.
   * We currently support an AND of OR of key-value expressions, where each expression within an OR
   * must have the same key. An '=' should be used to connect the key and value.
   *
   * For example, "(color = red OR color = blue) AND brand = Google" is acceptable, but "(color =
   * red OR brand = Google)" is not acceptable. "color: red" is not acceptable because it uses a ':'
   * instead of an '='.
   * @param filter filter or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1ProductSearchParams setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * The list of product categories to search in. Currently, we only consider the first category,
   * and either "homegoods-v2", "apparel-v2", "toys-v2", "packagedgoods-v1", or "general-v1" should
   * be specified. The legacy categories "homegoods", "apparel", and "toys" are still supported but
   * will be deprecated. For new products, please use "homegoods-v2", "apparel-v2", or "toys-v2" for
   * better product search accuracy. It is recommended to migrate existing products to these
   * categories as well.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProductCategories() {
    return productCategories;
  }

  /**
   * The list of product categories to search in. Currently, we only consider the first category,
   * and either "homegoods-v2", "apparel-v2", "toys-v2", "packagedgoods-v1", or "general-v1" should
   * be specified. The legacy categories "homegoods", "apparel", and "toys" are still supported but
   * will be deprecated. For new products, please use "homegoods-v2", "apparel-v2", or "toys-v2" for
   * better product search accuracy. It is recommended to migrate existing products to these
   * categories as well.
   * @param productCategories productCategories or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1ProductSearchParams setProductCategories(java.util.List<java.lang.String> productCategories) {
    this.productCategories = productCategories;
    return this;
  }

  /**
   * The resource name of a ProductSet to be searched for similar images.
   *
   * Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductSet() {
    return productSet;
  }

  /**
   * The resource name of a ProductSet to be searched for similar images.
   *
   * Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`.
   * @param productSet productSet or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1ProductSearchParams setProductSet(java.lang.String productSet) {
    this.productSet = productSet;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p1beta1ProductSearchParams set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p1beta1ProductSearchParams) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p1beta1ProductSearchParams clone() {
    return (GoogleCloudVisionV1p1beta1ProductSearchParams) super.clone();
  }

}
