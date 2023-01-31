// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ticket.proto

package com.tr.poc.grpc;

public interface TicketOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.tr.poc.grpc.Ticket)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string category = 4;</code>
   * @return The category.
   */
  java.lang.String getCategory();
  /**
   * <code>string category = 4;</code>
   * @return The bytes for category.
   */
  com.google.protobuf.ByteString
      getCategoryBytes();

  /**
   * <code>.com.tr.poc.grpc.User issuer = 5;</code>
   * @return Whether the issuer field is set.
   */
  boolean hasIssuer();
  /**
   * <code>.com.tr.poc.grpc.User issuer = 5;</code>
   * @return The issuer.
   */
  com.tr.poc.grpc.User getIssuer();
  /**
   * <code>.com.tr.poc.grpc.User issuer = 5;</code>
   */
  com.tr.poc.grpc.UserOrBuilder getIssuerOrBuilder();

  /**
   * <code>.com.tr.poc.grpc.Agent owner = 6;</code>
   * @return Whether the owner field is set.
   */
  boolean hasOwner();
  /**
   * <code>.com.tr.poc.grpc.Agent owner = 6;</code>
   * @return The owner.
   */
  com.tr.poc.grpc.Agent getOwner();
  /**
   * <code>.com.tr.poc.grpc.Agent owner = 6;</code>
   */
  com.tr.poc.grpc.AgentOrBuilder getOwnerOrBuilder();
}
