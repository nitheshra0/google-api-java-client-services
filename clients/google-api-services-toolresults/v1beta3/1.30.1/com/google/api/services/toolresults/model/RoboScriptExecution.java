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

package com.google.api.services.toolresults.model;

/**
 * Execution stats for a user-provided Robo script.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tool Results API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RoboScriptExecution extends com.google.api.client.json.GenericJson {

  /**
   * The number of Robo script actions executed successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer successfulActions;

  /**
   * The total number of actions in the Robo script.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalActions;

  /**
   * The number of Robo script actions executed successfully.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSuccessfulActions() {
    return successfulActions;
  }

  /**
   * The number of Robo script actions executed successfully.
   * @param successfulActions successfulActions or {@code null} for none
   */
  public RoboScriptExecution setSuccessfulActions(java.lang.Integer successfulActions) {
    this.successfulActions = successfulActions;
    return this;
  }

  /**
   * The total number of actions in the Robo script.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalActions() {
    return totalActions;
  }

  /**
   * The total number of actions in the Robo script.
   * @param totalActions totalActions or {@code null} for none
   */
  public RoboScriptExecution setTotalActions(java.lang.Integer totalActions) {
    this.totalActions = totalActions;
    return this;
  }

  @Override
  public RoboScriptExecution set(String fieldName, Object value) {
    return (RoboScriptExecution) super.set(fieldName, value);
  }

  @Override
  public RoboScriptExecution clone() {
    return (RoboScriptExecution) super.clone();
  }

}
