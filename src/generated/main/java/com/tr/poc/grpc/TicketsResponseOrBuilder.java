// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ticket.proto

package com.tr.poc.grpc;

public interface TicketsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.tr.poc.grpc.TicketsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.tr.poc.grpc.Ticket ticket = 1;</code>
   */
  java.util.List<com.tr.poc.grpc.Ticket> 
      getTicketList();
  /**
   * <code>repeated .com.tr.poc.grpc.Ticket ticket = 1;</code>
   */
  com.tr.poc.grpc.Ticket getTicket(int index);
  /**
   * <code>repeated .com.tr.poc.grpc.Ticket ticket = 1;</code>
   */
  int getTicketCount();
  /**
   * <code>repeated .com.tr.poc.grpc.Ticket ticket = 1;</code>
   */
  java.util.List<? extends com.tr.poc.grpc.TicketOrBuilder> 
      getTicketOrBuilderList();
  /**
   * <code>repeated .com.tr.poc.grpc.Ticket ticket = 1;</code>
   */
  com.tr.poc.grpc.TicketOrBuilder getTicketOrBuilder(
      int index);
}