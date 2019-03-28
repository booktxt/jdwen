package com.air.garden.market.aio;

import org.smartboot.socket.transport.AioQuickClient;

/**
 * @author wenjd
 * @date 2019/03/28
 */
public class IntegerClient {
    public static void main(String[] args) throws Exception {
        IntegerClientProcessor processor = new IntegerClientProcessor();
        AioQuickClient<Integer> aioQuickClient = new AioQuickClient<Integer>("localhost", 8888, new IntegerProtocol(), processor);
        aioQuickClient.start();
        processor.getSession().write(9);
        Thread.sleep(1000);
        aioQuickClient.shutdown();
    }
}
