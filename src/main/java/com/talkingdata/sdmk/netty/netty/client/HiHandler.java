package com.talkingdata.sdmk.netty.netty.client;

import org.jboss.netty.channel.*;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package com.talkingdata.sdmk.netty.netty.server
 * @Description:
 * @date 2018/9/1 19:14
 * @email 1242157902@qq.com
 */
public class HiHandler extends SimpleChannelHandler {

    /**
     * 接受信息
     * @param ctx
     * @param e
     * @throws Exception
     */
    @Override
    public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
        //接受信息
        String msg = (String)e.getMessage();
        System.out.println(msg);
        //回寫數據
        //ctx.getChannel().write("hi\r\n");
        super.messageReceived(ctx, e);
    }


    /**
     * 捕獲異常
     * @param ctx
     * @param e
     * @throws Exception
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) throws Exception {
        super.exceptionCaught(ctx, e);
    }

    /**
     * 新連接
     * @param ctx
     * @param e
     * @throws Exception
     */
    @Override
    public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
        super.channelConnected(ctx, e);
    }


    /**
     * 必須是連接已經建立，關閉通道的時候纔會觸發
     * @param ctx
     * @param e
     * @throws Exception
     */
    @Override
    public void channelDisconnected(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
        super.channelDisconnected(ctx, e);
    }


    /**
     * channel關閉的時候會觸發
     * @param ctx
     * @param e
     * @throws Exception
     */
    @Override
    public void channelClosed(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
        super.channelClosed(ctx, e);
    }
}
