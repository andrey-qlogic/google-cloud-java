// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iot/v1/device_manager.proto

package com.google.cloud.iot.v1;

public interface ListDeviceRegistriesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iot.v1.ListDeviceRegistriesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The registries that matched the query.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
   */
  java.util.List<com.google.cloud.iot.v1.DeviceRegistry> getDeviceRegistriesList();
  /**
   *
   *
   * <pre>
   * The registries that matched the query.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
   */
  com.google.cloud.iot.v1.DeviceRegistry getDeviceRegistries(int index);
  /**
   *
   *
   * <pre>
   * The registries that matched the query.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
   */
  int getDeviceRegistriesCount();
  /**
   *
   *
   * <pre>
   * The registries that matched the query.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
   */
  java.util.List<? extends com.google.cloud.iot.v1.DeviceRegistryOrBuilder>
      getDeviceRegistriesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The registries that matched the query.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
   */
  com.google.cloud.iot.v1.DeviceRegistryOrBuilder getDeviceRegistriesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If not empty, indicates that there may be more registries that match the
   * request; this value should be passed in a new
   * `ListDeviceRegistriesRequest`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * If not empty, indicates that there may be more registries that match the
   * request; this value should be passed in a new
   * `ListDeviceRegistriesRequest`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
