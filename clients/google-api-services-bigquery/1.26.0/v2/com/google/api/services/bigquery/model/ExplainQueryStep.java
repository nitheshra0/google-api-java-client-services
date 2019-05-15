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

package com.google.api.services.bigquery.model;

/**
 * Model definition for ExplainQueryStep.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExplainQueryStep extends com.google.api.client.json.GenericJson {

  /**
   * Machine-readable operation type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Human-readable stage descriptions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> substeps;

  /**
   * Machine-readable operation type.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Machine-readable operation type.
   * @param kind kind or {@code null} for none
   */
  public ExplainQueryStep setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Human-readable stage descriptions.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSubsteps() {
    return substeps;
  }

  /**
   * Human-readable stage descriptions.
   * @param substeps substeps or {@code null} for none
   */
  public ExplainQueryStep setSubsteps(java.util.List<java.lang.String> substeps) {
    this.substeps = substeps;
    return this;
  }

  @Override
  public ExplainQueryStep set(String fieldName, Object value) {
    return (ExplainQueryStep) super.set(fieldName, value);
  }

  @Override
  public ExplainQueryStep clone() {
    return (ExplainQueryStep) super.clone();
  }

}