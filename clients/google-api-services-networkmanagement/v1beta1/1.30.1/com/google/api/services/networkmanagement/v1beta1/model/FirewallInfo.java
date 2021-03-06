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

package com.google.api.services.networkmanagement.v1beta1.model;

/**
 * For display only. Metadata associated with a Compute Engine firewall rule.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FirewallInfo extends com.google.api.client.json.GenericJson {

  /**
   * Possible values: ALLOW, DENY
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String action;

  /**
   * Possible values: INGRESS, EGRESS
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String direction;

  /**
   * Name of a Compute Engine firewall rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * URI of a Compute Engine network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkUri;

  /**
   * Priority of the firewall rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer priority;

  /**
   * Target service accounts of the firewall rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> targetServiceAccounts;

  /**
   * Target tags of the firewall rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> targetTags;

  /**
   * URI of a Compute Engine firewall rule. Implied default rule does not have URI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Possible values: ALLOW, DENY
   * @return value or {@code null} for none
   */
  public java.lang.String getAction() {
    return action;
  }

  /**
   * Possible values: ALLOW, DENY
   * @param action action or {@code null} for none
   */
  public FirewallInfo setAction(java.lang.String action) {
    this.action = action;
    return this;
  }

  /**
   * Possible values: INGRESS, EGRESS
   * @return value or {@code null} for none
   */
  public java.lang.String getDirection() {
    return direction;
  }

  /**
   * Possible values: INGRESS, EGRESS
   * @param direction direction or {@code null} for none
   */
  public FirewallInfo setDirection(java.lang.String direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Name of a Compute Engine firewall rule.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Name of a Compute Engine firewall rule.
   * @param displayName displayName or {@code null} for none
   */
  public FirewallInfo setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * URI of a Compute Engine network.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkUri() {
    return networkUri;
  }

  /**
   * URI of a Compute Engine network.
   * @param networkUri networkUri or {@code null} for none
   */
  public FirewallInfo setNetworkUri(java.lang.String networkUri) {
    this.networkUri = networkUri;
    return this;
  }

  /**
   * Priority of the firewall rule.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPriority() {
    return priority;
  }

  /**
   * Priority of the firewall rule.
   * @param priority priority or {@code null} for none
   */
  public FirewallInfo setPriority(java.lang.Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Target service accounts of the firewall rule.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTargetServiceAccounts() {
    return targetServiceAccounts;
  }

  /**
   * Target service accounts of the firewall rule.
   * @param targetServiceAccounts targetServiceAccounts or {@code null} for none
   */
  public FirewallInfo setTargetServiceAccounts(java.util.List<java.lang.String> targetServiceAccounts) {
    this.targetServiceAccounts = targetServiceAccounts;
    return this;
  }

  /**
   * Target tags of the firewall rule.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTargetTags() {
    return targetTags;
  }

  /**
   * Target tags of the firewall rule.
   * @param targetTags targetTags or {@code null} for none
   */
  public FirewallInfo setTargetTags(java.util.List<java.lang.String> targetTags) {
    this.targetTags = targetTags;
    return this;
  }

  /**
   * URI of a Compute Engine firewall rule. Implied default rule does not have URI.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * URI of a Compute Engine firewall rule. Implied default rule does not have URI.
   * @param uri uri or {@code null} for none
   */
  public FirewallInfo setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public FirewallInfo set(String fieldName, Object value) {
    return (FirewallInfo) super.set(fieldName, value);
  }

  @Override
  public FirewallInfo clone() {
    return (FirewallInfo) super.clone();
  }

}
