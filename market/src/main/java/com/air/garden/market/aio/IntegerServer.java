package com.air.garden.market.aio;

import org.smartboot.socket.transport.AioQuickServer;

import java.io.IOException;

/**
 * @author wenjd
 * @date 2019/03/28
 */
public class IntegerServer {

    public static void main(String[] args) throws IOException {
        AioQuickServer<Integer> server = new AioQuickServer<Integer>(8888, new IntegerProtocol(), new IntegerServerProcessor());
        server.start();
    }
}
