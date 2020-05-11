package com.zwy.protobuf;

public class ProtoBufTest {
    public static void main(String[] args) {
        DataInfo.Student student = DataInfo.Student.newBuilder().setName("zwy").setAge(23).setAddress("北京").build();



    }
}
