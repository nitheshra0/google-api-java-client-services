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

package com.google.api.services.groupsmigration.model;

/**
 * JSON response template for groups migration API.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Groups Migration API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Groups extends com.google.api.client.json.GenericJson {

  /**
   * The kind of insert resource this is.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The status of the insert request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String responseCode;

  /**
   * The kind of insert resource this is.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of insert resource this is.
   * @param kind kind or {@code null} for none
   */
  public Groups setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The status of the insert request.
   * @return value or {@code null} for none
   */
  public java.lang.String getResponseCode() {
    return responseCode;
  }

  /**
   * The status of the insert request.
   * @param responseCode responseCode or {@code null} for none
   */
  public Groups setResponseCode(java.lang.String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  @Override
  public Groups set(String fieldName, Object value) {
    return (Groups) super.set(fieldName, value);
  }

  @Override
  public Groups clone() {
    return (Groups) super.clone();
  }

}
