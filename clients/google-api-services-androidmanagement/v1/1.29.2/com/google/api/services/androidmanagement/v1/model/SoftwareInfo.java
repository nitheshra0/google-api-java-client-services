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

package com.google.api.services.androidmanagement.v1.model;

/**
 * Information about device software.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SoftwareInfo extends com.google.api.client.json.GenericJson {

  /**
   * Android build ID string meant for displaying to the user. For example, shamu-userdebug 6.0.1
   * MOB30I 2756745 dev-keys.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String androidBuildNumber;

  /**
   * Build time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String androidBuildTime;

  /**
   * The Android Device Policy app version code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer androidDevicePolicyVersionCode;

  /**
   * The Android Device Policy app version as displayed to the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String androidDevicePolicyVersionName;

  /**
   * The user-visible Android version string. For example, 6.0.1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String androidVersion;

  /**
   * The system bootloader version number, e.g. 0.6.7.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bootloaderVersion;

  /**
   * SHA-256 hash of android.content.pm.Signature
   * (https://developer.android.com/reference/android/content/pm/Signature.html) associated with the
   * system package, which can be used to verify that the system build hasn't been modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deviceBuildSignature;

  /**
   * Kernel version, for example, 2.6.32.9-g103d848.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deviceKernelVersion;

  /**
   * An IETF BCP 47 language code for the primary locale on the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String primaryLanguageCode;

  /**
   * Security patch level, e.g. 2016-05-01.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String securityPatchLevel;

  /**
   * Android build ID string meant for displaying to the user. For example, shamu-userdebug 6.0.1
   * MOB30I 2756745 dev-keys.
   * @return value or {@code null} for none
   */
  public java.lang.String getAndroidBuildNumber() {
    return androidBuildNumber;
  }

  /**
   * Android build ID string meant for displaying to the user. For example, shamu-userdebug 6.0.1
   * MOB30I 2756745 dev-keys.
   * @param androidBuildNumber androidBuildNumber or {@code null} for none
   */
  public SoftwareInfo setAndroidBuildNumber(java.lang.String androidBuildNumber) {
    this.androidBuildNumber = androidBuildNumber;
    return this;
  }

  /**
   * Build time.
   * @return value or {@code null} for none
   */
  public String getAndroidBuildTime() {
    return androidBuildTime;
  }

  /**
   * Build time.
   * @param androidBuildTime androidBuildTime or {@code null} for none
   */
  public SoftwareInfo setAndroidBuildTime(String androidBuildTime) {
    this.androidBuildTime = androidBuildTime;
    return this;
  }

  /**
   * The Android Device Policy app version code.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAndroidDevicePolicyVersionCode() {
    return androidDevicePolicyVersionCode;
  }

  /**
   * The Android Device Policy app version code.
   * @param androidDevicePolicyVersionCode androidDevicePolicyVersionCode or {@code null} for none
   */
  public SoftwareInfo setAndroidDevicePolicyVersionCode(java.lang.Integer androidDevicePolicyVersionCode) {
    this.androidDevicePolicyVersionCode = androidDevicePolicyVersionCode;
    return this;
  }

  /**
   * The Android Device Policy app version as displayed to the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getAndroidDevicePolicyVersionName() {
    return androidDevicePolicyVersionName;
  }

  /**
   * The Android Device Policy app version as displayed to the user.
   * @param androidDevicePolicyVersionName androidDevicePolicyVersionName or {@code null} for none
   */
  public SoftwareInfo setAndroidDevicePolicyVersionName(java.lang.String androidDevicePolicyVersionName) {
    this.androidDevicePolicyVersionName = androidDevicePolicyVersionName;
    return this;
  }

  /**
   * The user-visible Android version string. For example, 6.0.1.
   * @return value or {@code null} for none
   */
  public java.lang.String getAndroidVersion() {
    return androidVersion;
  }

  /**
   * The user-visible Android version string. For example, 6.0.1.
   * @param androidVersion androidVersion or {@code null} for none
   */
  public SoftwareInfo setAndroidVersion(java.lang.String androidVersion) {
    this.androidVersion = androidVersion;
    return this;
  }

  /**
   * The system bootloader version number, e.g. 0.6.7.
   * @return value or {@code null} for none
   */
  public java.lang.String getBootloaderVersion() {
    return bootloaderVersion;
  }

  /**
   * The system bootloader version number, e.g. 0.6.7.
   * @param bootloaderVersion bootloaderVersion or {@code null} for none
   */
  public SoftwareInfo setBootloaderVersion(java.lang.String bootloaderVersion) {
    this.bootloaderVersion = bootloaderVersion;
    return this;
  }

  /**
   * SHA-256 hash of android.content.pm.Signature
   * (https://developer.android.com/reference/android/content/pm/Signature.html) associated with the
   * system package, which can be used to verify that the system build hasn't been modified.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeviceBuildSignature() {
    return deviceBuildSignature;
  }

  /**
   * SHA-256 hash of android.content.pm.Signature
   * (https://developer.android.com/reference/android/content/pm/Signature.html) associated with the
   * system package, which can be used to verify that the system build hasn't been modified.
   * @param deviceBuildSignature deviceBuildSignature or {@code null} for none
   */
  public SoftwareInfo setDeviceBuildSignature(java.lang.String deviceBuildSignature) {
    this.deviceBuildSignature = deviceBuildSignature;
    return this;
  }

  /**
   * Kernel version, for example, 2.6.32.9-g103d848.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeviceKernelVersion() {
    return deviceKernelVersion;
  }

  /**
   * Kernel version, for example, 2.6.32.9-g103d848.
   * @param deviceKernelVersion deviceKernelVersion or {@code null} for none
   */
  public SoftwareInfo setDeviceKernelVersion(java.lang.String deviceKernelVersion) {
    this.deviceKernelVersion = deviceKernelVersion;
    return this;
  }

  /**
   * An IETF BCP 47 language code for the primary locale on the device.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrimaryLanguageCode() {
    return primaryLanguageCode;
  }

  /**
   * An IETF BCP 47 language code for the primary locale on the device.
   * @param primaryLanguageCode primaryLanguageCode or {@code null} for none
   */
  public SoftwareInfo setPrimaryLanguageCode(java.lang.String primaryLanguageCode) {
    this.primaryLanguageCode = primaryLanguageCode;
    return this;
  }

  /**
   * Security patch level, e.g. 2016-05-01.
   * @return value or {@code null} for none
   */
  public java.lang.String getSecurityPatchLevel() {
    return securityPatchLevel;
  }

  /**
   * Security patch level, e.g. 2016-05-01.
   * @param securityPatchLevel securityPatchLevel or {@code null} for none
   */
  public SoftwareInfo setSecurityPatchLevel(java.lang.String securityPatchLevel) {
    this.securityPatchLevel = securityPatchLevel;
    return this;
  }

  @Override
  public SoftwareInfo set(String fieldName, Object value) {
    return (SoftwareInfo) super.set(fieldName, value);
  }

  @Override
  public SoftwareInfo clone() {
    return (SoftwareInfo) super.clone();
  }

}
