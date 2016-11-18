// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/bigtable_table_admin.proto

package com.google.bigtable.admin.v2;

public interface ListTablesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.ListTablesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string parent = 1;</code>
   *
   * <pre>
   * The unique name of the instance for which tables should be listed.
   * Values are of the form `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
   * </pre>
   */
  java.lang.String getParent();
  /**
   * <code>optional string parent = 1;</code>
   *
   * <pre>
   * The unique name of the instance for which tables should be listed.
   * Values are of the form `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
   * </pre>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <code>optional .google.bigtable.admin.v2.Table.View view = 2;</code>
   *
   * <pre>
   * The view to be applied to the returned tables' fields.
   * Defaults to NAME_ONLY if unspecified (no others are currently supported).
   * </pre>
   */
  int getViewValue();
  /**
   * <code>optional .google.bigtable.admin.v2.Table.View view = 2;</code>
   *
   * <pre>
   * The view to be applied to the returned tables' fields.
   * Defaults to NAME_ONLY if unspecified (no others are currently supported).
   * </pre>
   */
  com.google.bigtable.admin.v2.Table.View getView();

  /**
   * <code>optional string page_token = 3;</code>
   *
   * <pre>
   * The value of `next_page_token` returned by a previous call.
   * </pre>
   */
  java.lang.String getPageToken();
  /**
   * <code>optional string page_token = 3;</code>
   *
   * <pre>
   * The value of `next_page_token` returned by a previous call.
   * </pre>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
