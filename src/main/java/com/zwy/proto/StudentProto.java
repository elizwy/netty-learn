// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Student.proto

package com.zwy.proto;

public final class StudentProto {
  private StudentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_zwy_proto_MyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_zwy_proto_MyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_zwy_proto_MyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_zwy_proto_MyResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\rStudent.proto\022\rcom.zwy.proto\"\035\n\tMyRequ" +
      "est\022\020\n\010username\030\001 \001(\t\"\036\n\nMyResponse\022\020\n\010r" +
      "elaname\030\002 \001(\t2`\n\016StudentService\022N\n\025getRe" +
      "alNameByUsername\022\030.com.zwy.proto.MyReque" +
      "st\032\031.com.zwy.proto.MyResponse\"\000B\037\n\rcom.z" +
      "wy.protoB\014StudentProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_zwy_proto_MyRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_zwy_proto_MyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_zwy_proto_MyRequest_descriptor,
        new String[] { "Username", });
    internal_static_com_zwy_proto_MyResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_zwy_proto_MyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_zwy_proto_MyResponse_descriptor,
        new String[] { "Relaname", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
