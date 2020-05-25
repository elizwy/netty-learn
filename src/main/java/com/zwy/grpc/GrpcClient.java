package com.zwy.grpc;

import com.zwy.proto.MyRequest;
import com.zwy.proto.MyResponse;
import com.zwy.proto.StudentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 8899).usePlaintext().build();
        StudentServiceGrpc.StudentServiceBlockingStub stub = StudentServiceGrpc.newBlockingStub(managedChannel);
        MyResponse myresponse = stub.getRealNameByUsername(MyRequest.newBuilder().setUsername("zcc").build());
        System.out.println(myresponse.getRelaname());


    }
}
