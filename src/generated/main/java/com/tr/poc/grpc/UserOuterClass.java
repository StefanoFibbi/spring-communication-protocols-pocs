// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.tr.poc.grpc;

public final class UserOuterClass {
  private UserOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_tr_poc_grpc_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_tr_poc_grpc_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_tr_poc_grpc_UserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_tr_poc_grpc_UserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_tr_poc_grpc_UsersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_tr_poc_grpc_UsersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_tr_poc_grpc_UsersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_tr_poc_grpc_UsersResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nuser.proto\022\017com.tr.poc.grpc\"7\n\004User\022\n\n" +
      "\002id\030\001 \001(\t\022\021\n\tfirstName\030\002 \001(\t\022\020\n\010lastName" +
      "\030\003 \001(\t\"\031\n\013UserRequest\022\n\n\002id\030\001 \001(\t\"\016\n\014Use" +
      "rsRequest\"4\n\rUsersResponse\022#\n\004user\030\001 \003(\013" +
      "2\025.com.tr.poc.grpc.User2\226\001\n\013UserService\022" +
      "F\n\005users\022\035.com.tr.poc.grpc.UsersRequest\032" +
      "\036.com.tr.poc.grpc.UsersResponse\022?\n\010userB" +
      "yId\022\034.com.tr.poc.grpc.UserRequest\032\025.com." +
      "tr.poc.grpc.UserB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_tr_poc_grpc_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_tr_poc_grpc_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_tr_poc_grpc_User_descriptor,
        new java.lang.String[] { "Id", "FirstName", "LastName", });
    internal_static_com_tr_poc_grpc_UserRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_tr_poc_grpc_UserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_tr_poc_grpc_UserRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_tr_poc_grpc_UsersRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_tr_poc_grpc_UsersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_tr_poc_grpc_UsersRequest_descriptor,
        new java.lang.String[] { });
    internal_static_com_tr_poc_grpc_UsersResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_tr_poc_grpc_UsersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_tr_poc_grpc_UsersResponse_descriptor,
        new java.lang.String[] { "User", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}