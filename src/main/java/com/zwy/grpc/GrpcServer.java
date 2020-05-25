package com.zwy.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {
    private Server server;

    private void start() throws IOException {
        this.server=ServerBuilder.forPort(8899).addService(new StudentServiceImpl()).build().start();
        System.out.println(" servere started");
    }

    private void stop(){
        if(null!=this.server){
            server.shutdown();
        }
    }

    public void awaitTermination() throws InterruptedException{
        if(null!=this.server){
            server.awaitTermination();
        }
    }

    public static void main(String[] args)throws Exception {
        GrpcServer grpcServer=new GrpcServer();
        grpcServer.start();
        grpcServer.awaitTermination();
    }
}
