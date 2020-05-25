package com.zwy.grpc;

import com.zwy.proto.MyRequest;
import com.zwy.proto.MyResponse;
import com.zwy.proto.StudentServiceGrpc;
import com.zwy.proto.StudentServiceGrpc.StudentServiceImplBase;
import io.grpc.stub.StreamObserver;

public class StudentServiceImpl extends StudentServiceImplBase {
    @Override
    public void getRealNameByUsername(MyRequest request, StreamObserver<MyResponse> responseObserver) {
        System.out.println("接收到客户端的信息：" + request.getUsername());
        responseObserver.onNext(MyResponse.newBuilder().setRelaname("zwy").build());
        responseObserver.onCompleted();
    }
}
