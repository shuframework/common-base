package com.shuframework.ws;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.ServerHandshake;
import sun.rmi.runtime.Log;

import java.net.URI;

public class JWebSClient extends WebSocketClient {
 
 
    public JWebSClient(URI serverUri) {
        super(serverUri,new Draft_6455());
    }
 
    @Override
    public void onOpen(ServerHandshake handshakedata) {
        System.out.println("JWebSClient 连接打开onOpen");
    }
 
    @Override
    public void onMessage(String message) {
        System.out.println("JWebSClient:"+ message);
    }
 
    @Override
    public void onClose(int code, String reason, boolean remote) {
        System.out.println("JWebSClient 关闭 断开连接onClose");
    }
 
    @Override
    public void onError(Exception ex) {
        System.out.println("JWebSClient 错误 onError,异常信息："+ex.getMessage());
    }
 
}
