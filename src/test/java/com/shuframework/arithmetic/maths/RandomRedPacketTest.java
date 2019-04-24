package com.shuframework.arithmetic.maths;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * @author shuheng
 */
public class RandomRedPacketTest {

    @Test
    public void nextMoney() {
        RandomRedPacket redPacket = new RandomRedPacket(100, 10);
        for (int i = 0; i < 10; i++) {
            System.out.println(redPacket.nextMoney());
        }
    }

}