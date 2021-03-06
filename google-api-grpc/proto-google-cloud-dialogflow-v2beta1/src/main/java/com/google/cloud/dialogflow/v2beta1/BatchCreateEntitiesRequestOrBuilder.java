// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/entity_type.proto

package com.google.cloud.dialogflow.v2beta1;

public interface BatchCreateEntitiesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.BatchCreateEntitiesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the entity type to create entities in. Format:
   * `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The name of the entity type to create entities in. Format:
   * `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The entities to create.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.EntityType.Entity entities = 2;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.EntityType.Entity> getEntitiesList();
  /**
   *
   *
   * <pre>
   * Required. The entities to create.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.EntityType.Entity entities = 2;</code>
   */
  com.google.cloud.dialogflow.v2beta1.EntityType.Entity getEntities(int index);
  /**
   *
   *
   * <pre>
   * Required. The entities to create.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.EntityType.Entity entities = 2;</code>
   */
  int getEntitiesCount();
  /**
   *
   *
   * <pre>
   * Required. The entities to create.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.EntityType.Entity entities = 2;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.EntityType.EntityOrBuilder>
      getEntitiesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The entities to create.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.EntityType.Entity entities = 2;</code>
   */
  com.google.cloud.dialogflow.v2beta1.EntityType.EntityOrBuilder getEntitiesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. The language of entity synonyms defined in `entities`. If not
   * specified, the agent's default language is used.
   * [Many
   * languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
   * are supported. Note: languages must be enabled in the agent before they can
   * be used.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. The language of entity synonyms defined in `entities`. If not
   * specified, the agent's default language is used.
   * [Many
   * languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
   * are supported. Note: languages must be enabled in the agent before they can
   * be used.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();
}
