package com.shuframework.ws;

import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author shuheng
 */
public class MyTest {

    @Test
    public void test1() {
//        String path = "ws://thrust.test.tuigeyou.com/ws/myim/13986109774";
        String path = "ws://localhost:8080/ws/myim/139861092";
//        URI url;
        try {
            URI url = new URI(path);
            JWebSClient client = new JWebSClient(url);

            try {
//                client.connect();
                client.connectBlocking();
                System.out.println("JWebSClient test 连接成功!");
                if(client.isOpen()){
                    client.send("[{\"toPhone\":\"13237110231\",\"sendMsg\":\"test1\"}]");
                    System.out.println("JWebSClient test 发送成功!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }

}
