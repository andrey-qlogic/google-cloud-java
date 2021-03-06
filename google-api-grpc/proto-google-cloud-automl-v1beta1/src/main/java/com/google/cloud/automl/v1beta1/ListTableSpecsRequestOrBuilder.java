// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/service.proto

package com.google.cloud.automl.v1beta1;

public interface ListTableSpecsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.ListTableSpecsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the dataset to list table specs from.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The resource name of the dataset to list table specs from.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2;</code>
   */
  boolean hasFieldMask();
  /**
   *
   *
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2;</code>
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   *
   *
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Filter expression, see go/filtering.
   * </pre>
   *
   * <code>string filter = 3;</code>
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Filter expression, see go/filtering.
   * </pre>
   *
   * <code>string filter = 3;</code>
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Requested page size. The server can return fewer results than requested.
   * If unspecified, the server will pick a default size.
   * </pre>
   *
   * <code>int32 page_size = 4;</code>
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A token identifying a page of results for the server to return.
   * Typically obtained from the
   * [ListTableSpecsResponse.next_page_token][google.cloud.automl.v1beta1.ListTableSpecsResponse.next_page_token] field of the previous
   * [AutoMl.ListTableSpecs][google.cloud.automl.v1beta1.AutoMl.ListTableSpecs] call.
   * </pre>
   *
   * <code>string page_token = 6;</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A token identifying a page of results for the server to return.
   * Typically obtained from the
   * [ListTableSpecsResponse.next_page_token][google.cloud.automl.v1beta1.ListTableSpecsResponse.next_page_token] field of the previous
   * [AutoMl.ListTableSpecs][google.cloud.automl.v1beta1.AutoMl.ListTableSpecs] call.
   * </pre>
   *
   * <code>string page_token = 6;</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
