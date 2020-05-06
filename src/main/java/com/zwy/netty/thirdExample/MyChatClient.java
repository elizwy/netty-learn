package com.zwy.netty.thirdExample;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

public class MyChatClient {
    public static void main(String[] args)throws Exception {
        NioEventLoopGroup workEvent = new NioEventLoopGroup();
        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(workEvent).channel(NioSocketChannel.class).handler(new MyChatClientInitializer());
            ChannelFuture channelFuture = bootstrap.bind(8899).sync();
            channelFuture.channel().closeFuture().sync();
        }finally {
            workEvent.shutdownGracefully();
        }
    }
}
