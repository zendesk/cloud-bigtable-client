// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/table.proto

package com.google.bigtable.admin.v2;

public interface SnapshotOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.Snapshot)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   *
   * <pre>
   * (`OutputOnly`)
   * The unique name of the snapshot.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/clusters/&lt;cluster&gt;/snapshots/&lt;snapshot&gt;`.
   * </pre>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   *
   * <pre>
   * (`OutputOnly`)
   * The unique name of the snapshot.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/clusters/&lt;cluster&gt;/snapshots/&lt;snapshot&gt;`.
   * </pre>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional .google.bigtable.admin.v2.Table source_table = 2;</code>
   *
   * <pre>
   * (`OutputOnly`)
   * The source table at the time the snapshot was taken.
   * </pre>
   */
  boolean hasSourceTable();
  /**
   * <code>optional .google.bigtable.admin.v2.Table source_table = 2;</code>
   *
   * <pre>
   * (`OutputOnly`)
   * The source table at the time the snapshot was taken.
   * </pre>
   */
  com.google.bigtable.admin.v2.Table getSourceTable();
  /**
   * <code>optional .google.bigtable.admin.v2.Table source_table = 2;</code>
   *
   * <pre>
   * (`OutputOnly`)
   * The source table at the time the snapshot was taken.
   * </pre>
   */
  com.google.bigtable.admin.v2.TableOrBuilder getSourceTableOrBuilder();

  /**
   * <code>optional int64 data_size_bytes = 3;</code>
   *
   * <pre>
   * (`OutputOnly`)
   * The size of the data in the source table at the time the snapshot was
   * taken.
   * </pre>
   */
  long getDataSizeBytes();

  /**
   * <code>optional .google.protobuf.Timestamp create_time = 4;</code>
   *
   * <pre>
   * (`OutputOnly`)
   * The time when the snapshot is created.
   * </pre>
   */
  boolean hasCreateTime();
  /**
   * <code>optional .google.protobuf.Timestamp create_time = 4;</code>
   *
   * <pre>
   * (`OutputOnly`)
   * The time when the snapshot is created.
   * </pre>
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <code>optional .google.protobuf.Timestamp create_time = 4;</code>
   *
   * <pre>
   * (`OutputOnly`)
   * The time when the snapshot is created.
   * </pre>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <code>optional .google.protobuf.Timestamp delete_time = 5;</code>
   *
   * <pre>
   * (`OutputOnly`)
   * The time when the snapshot will be deleted. The maximum amount of time a
   * snapshot can stay active is 365 days. If 'ttl' is not specified,
   * the default maximum of 365 days will be used.
   * </pre>
   */
  boolean hasDeleteTime();
  /**
   * <code>optional .google.protobuf.Timestamp delete_time = 5;</code>
   *
   * <pre>
   * (`OutputOnly`)
   * The time when the snapshot will be deleted. The maximum amount of time a
   * snapshot can stay active is 365 days. If 'ttl' is not specified,
   * the default maximum of 365 days will be used.
   * </pre>
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   * <code>optional .google.protobuf.Timestamp delete_time = 5;</code>
   *
   * <pre>
   * (`OutputOnly`)
   * The time when the snapshot will be deleted. The maximum amount of time a
   * snapshot can stay active is 365 days. If 'ttl' is not specified,
   * the default maximum of 365 days will be used.
   * </pre>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();
}
