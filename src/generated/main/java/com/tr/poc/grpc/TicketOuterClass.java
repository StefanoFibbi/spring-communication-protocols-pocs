// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ticket.proto

package com.tr.poc.grpc;

public final class TicketOuterClass {
  private TicketOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_tr_poc_grpc_Ticket_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_tr_poc_grpc_Ticket_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_tr_poc_grpc_TicketRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_tr_poc_grpc_TicketRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_tr_poc_grpc_TicketsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_tr_poc_grpc_TicketsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_tr_poc_grpc_TicketsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_tr_poc_grpc_TicketsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014ticket.proto\022\017com.tr.poc.grpc\"J\n\006Ticke" +
      "t\022\n\n\002id\030\001 \001(\t\022\r\n\005title\030\002 \001(\t\022\023\n\013descript" +
      "ion\030\003 \001(\t\022\020\n\010category\030\004 \001(\t\"\033\n\rTicketReq" +
      "uest\022\n\n\002id\030\001 \001(\t\"\020\n\016TicketsRequest\":\n\017Ti" +
      "cketsResponse\022\'\n\006ticket\030\001 \003(\0132\027.com.tr.p" +
      "oc.grpc.Ticket2\244\001\n\rTicketService\022L\n\007tick" +
      "ets\022\037.com.tr.poc.grpc.TicketsRequest\032 .c" +
      "om.tr.poc.grpc.TicketsResponse\022E\n\nticket" +
      "ById\022\036.com.tr.poc.grpc.TicketRequest\032\027.c" +
      "om.tr.poc.grpc.TicketB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_tr_poc_grpc_Ticket_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_tr_poc_grpc_Ticket_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_tr_poc_grpc_Ticket_descriptor,
        new java.lang.String[] { "Id", "Title", "Description", "Category", });
    internal_static_com_tr_poc_grpc_TicketRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_tr_poc_grpc_TicketRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_tr_poc_grpc_TicketRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_tr_poc_grpc_TicketsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_tr_poc_grpc_TicketsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_tr_poc_grpc_TicketsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_com_tr_poc_grpc_TicketsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_tr_poc_grpc_TicketsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_tr_poc_grpc_TicketsResponse_descriptor,
        new java.lang.String[] { "Ticket", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}