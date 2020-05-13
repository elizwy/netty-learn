package com.zwy.netty.sixthExample;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.concurrent.EventExecutorGroup;

import java.util.Random;

public class TestClientHandler extends SimpleChannelInboundHandler <MyDataInfo.Person> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MyDataInfo.Person msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        int random = new Random().nextInt(3);
        MyDataInfo.MyMessage myMessage=null;
        if(1==random){
            myMessage = MyDataInfo.MyMessage.newBuilder().setDataType(MyDataInfo.MyMessage.DataType.PersonType).setPerson(
                    MyDataInfo.Person.newBuilder().setName("zwy").setAge(25).setAddress("beijing").build()
            ).build();
        }else if (2==random){
            myMessage = MyDataInfo.MyMessage.newBuilder().setDataType(MyDataInfo.MyMessage.DataType.DogType).setDog(
                    MyDataInfo.Dog.newBuilder().setName("haha").setAge(12).build()
            ).build();
        }else if (3==random){
            myMessage = MyDataInfo.MyMessage.newBuilder().setDataType(MyDataInfo.MyMessage.DataType.CatType).setCat(
                    MyDataInfo.Cat.newBuilder().setName("CAT01").setAddress("beijing").build()
            ).build();
        }
        ctx.channel().writeAndFlush(myMessage);
    }
}
