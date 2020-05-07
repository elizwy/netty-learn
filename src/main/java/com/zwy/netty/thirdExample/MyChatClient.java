package com.zwy.netty.thirdExample;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyChatClient {
    public static void main(String[] args)throws Exception {
        NioEventLoopGroup workEvent = new NioEventLoopGroup();
        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(workEvent).channel(NioSocketChannel.class).handler(new MyChatClientInitializer());
            Channel channel = bootstrap.bind(8899).sync().channel();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            for(;;){
                channel.writeAndFlush(bufferedReader.readLine()+"\r\n");
            }
        }finally {
            workEvent.shutdownGracefully();
        }
    }
}
