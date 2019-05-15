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

package com.google.api.services.blogger.model;

/**
 * Model definition for User.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Blogger API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class User extends com.google.api.client.json.GenericJson {

  /**
   * Profile summary information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String about;

  /**
   * The container of blogs for this user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Blogs blogs;

  /**
   * The timestamp of when this profile was created, in seconds since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime created;

  /**
   * The display name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The identifier for this User.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The kind of this entity. Always blogger#user
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * This user's locale
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Locale locale;

  /**
   * The API REST URL to fetch this resource from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The user's profile page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * Profile summary information.
   * @return value or {@code null} for none
   */
  public java.lang.String getAbout() {
    return about;
  }

  /**
   * Profile summary information.
   * @param about about or {@code null} for none
   */
  public User setAbout(java.lang.String about) {
    this.about = about;
    return this;
  }

  /**
   * The container of blogs for this user.
   * @return value or {@code null} for none
   */
  public Blogs getBlogs() {
    return blogs;
  }

  /**
   * The container of blogs for this user.
   * @param blogs blogs or {@code null} for none
   */
  public User setBlogs(Blogs blogs) {
    this.blogs = blogs;
    return this;
  }

  /**
   * The timestamp of when this profile was created, in seconds since epoch.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getCreated() {
    return created;
  }

  /**
   * The timestamp of when this profile was created, in seconds since epoch.
   * @param created created or {@code null} for none
   */
  public User setCreated(com.google.api.client.util.DateTime created) {
    this.created = created;
    return this;
  }

  /**
   * The display name.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The display name.
   * @param displayName displayName or {@code null} for none
   */
  public User setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The identifier for this User.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The identifier for this User.
   * @param id id or {@code null} for none
   */
  public User setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The kind of this entity. Always blogger#user
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of this entity. Always blogger#user
   * @param kind kind or {@code null} for none
   */
  public User setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * This user's locale
   * @return value or {@code null} for none
   */
  public Locale getLocale() {
    return locale;
  }

  /**
   * This user's locale
   * @param locale locale or {@code null} for none
   */
  public User setLocale(Locale locale) {
    this.locale = locale;
    return this;
  }

  /**
   * The API REST URL to fetch this resource from.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * The API REST URL to fetch this resource from.
   * @param selfLink selfLink or {@code null} for none
   */
  public User setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * The user's profile page.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * The user's profile page.
   * @param url url or {@code null} for none
   */
  public User setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public User set(String fieldName, Object value) {
    return (User) super.set(fieldName, value);
  }

  @Override
  public User clone() {
    return (User) super.clone();
  }

  /**
   * The container of blogs for this user.
   */
  public static final class Blogs extends com.google.api.client.json.GenericJson {

    /**
     * The URL of the Blogs for this user.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String selfLink;

    /**
     * The URL of the Blogs for this user.
     * @return value or {@code null} for none
     */
    public java.lang.String getSelfLink() {
      return selfLink;
    }

    /**
     * The URL of the Blogs for this user.
     * @param selfLink selfLink or {@code null} for none
     */
    public Blogs setSelfLink(java.lang.String selfLink) {
      this.selfLink = selfLink;
      return this;
    }

    @Override
    public Blogs set(String fieldName, Object value) {
      return (Blogs) super.set(fieldName, value);
    }

    @Override
    public Blogs clone() {
      return (Blogs) super.clone();
    }

  }

  /**
   * This user's locale
   */
  public static final class Locale extends com.google.api.client.json.GenericJson {

    /**
     * The user's country setting.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String country;

    /**
     * The user's language setting.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String language;

    /**
     * The user's language variant setting.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String variant;

    /**
     * The user's country setting.
     * @return value or {@code null} for none
     */
    public java.lang.String getCountry() {
      return country;
    }

    /**
     * The user's country setting.
     * @param country country or {@code null} for none
     */
    public Locale setCountry(java.lang.String country) {
      this.country = country;
      return this;
    }

    /**
     * The user's language setting.
     * @return value or {@code null} for none
     */
    public java.lang.String getLanguage() {
      return language;
    }

    /**
     * The user's language setting.
     * @param language language or {@code null} for none
     */
    public Locale setLanguage(java.lang.String language) {
      this.language = language;
      return this;
    }

    /**
     * The user's language variant setting.
     * @return value or {@code null} for none
     */
    public java.lang.String getVariant() {
      return variant;
    }

    /**
     * The user's language variant setting.
     * @param variant variant or {@code null} for none
     */
    public Locale setVariant(java.lang.String variant) {
      this.variant = variant;
      return this;
    }

    @Override
    public Locale set(String fieldName, Object value) {
      return (Locale) super.set(fieldName, value);
    }

    @Override
    public Locale clone() {
      return (Locale) super.clone();
    }

  }

}