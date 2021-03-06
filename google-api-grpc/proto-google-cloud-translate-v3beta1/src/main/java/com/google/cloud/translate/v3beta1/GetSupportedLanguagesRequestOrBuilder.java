// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3beta1/translation_service.proto

package com.google.cloud.translate.v3beta1;

public interface GetSupportedLanguagesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3beta1.GetSupportedLanguagesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Used for making regionalized calls.
   * Format: projects/{project-id}/locations/{location-id}.
   * For global calls, use projects/{project-id}/locations/global.
   * If missing, the call is treated as a global call.
   * Only custom model within the same location-id can be used.
   * Otherwise 400 is returned.
   * </pre>
   *
   * <code>string parent = 3;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Optional. Used for making regionalized calls.
   * Format: projects/{project-id}/locations/{location-id}.
   * For global calls, use projects/{project-id}/locations/global.
   * If missing, the call is treated as a global call.
   * Only custom model within the same location-id can be used.
   * Otherwise 400 is returned.
   * </pre>
   *
   * <code>string parent = 3;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The language to use to return localized, human readable names
   * of supported languages. If missing, default language is ENGLISH.
   * </pre>
   *
   * <code>string display_language_code = 1;</code>
   */
  java.lang.String getDisplayLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. The language to use to return localized, human readable names
   * of supported languages. If missing, default language is ENGLISH.
   * </pre>
   *
   * <code>string display_language_code = 1;</code>
   */
  com.google.protobuf.ByteString getDisplayLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. Get supported languages of this model.
   * The format depends on model type:
   * 1. Custom models:
   * projects/{project-id}/locations/{location-id}/models/{model-id}.
   * 2. General (built-in) models:
   * projects/{project-id}/locations/{location-id}/models/general/nmt
   * projects/{project-id}/locations/{location-id}/models/general/base
   * Returns languages supported by the specified model.
   * If missing, we get supported languages of Google general NMT model.
   * </pre>
   *
   * <code>string model = 2;</code>
   */
  java.lang.String getModel();
  /**
   *
   *
   * <pre>
   * Optional. Get supported languages of this model.
   * The format depends on model type:
   * 1. Custom models:
   * projects/{project-id}/locations/{location-id}/models/{model-id}.
   * 2. General (built-in) models:
   * projects/{project-id}/locations/{location-id}/models/general/nmt
   * projects/{project-id}/locations/{location-id}/models/general/base
   * Returns languages supported by the specified model.
   * If missing, we get supported languages of Google general NMT model.
   * </pre>
   *
   * <code>string model = 2;</code>
   */
  com.google.protobuf.ByteString getModelBytes();
}
