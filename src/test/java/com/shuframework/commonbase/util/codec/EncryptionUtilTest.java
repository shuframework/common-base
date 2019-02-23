package com.shuframework.commonbase.util.codec;

import org.junit.Before;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author shuheng
 */
public class EncryptionUtilTest {


    public String aes_getKey() {
        String key = "";
        try {
            key = AesUtil.initKey();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        // java.security.InvalidKeyException: Invalid AES key length: 18 bytes
        // key的长度要是8的倍数,从16往上
//        String key = Base64Util.encodeBase64("com.shuframework.com.shu");
        System.out.println(key);
        return key;
    }

    @Test
    public void aes_encryptAndDecrypt() {
        String key = aes_getKey();
        String data = "hello world";

        byte[] encrypt = AesUtil.encrypt(data.getBytes(), key);
        System.out.println(Arrays.toString(encrypt));
//        //乱码
//        System.out.println(new String(encrypt));

        System.out.println("=====解密======");
        byte[] decrypt = AesUtil.decrypt(encrypt, key);
        System.out.println(new String(decrypt));
    }


    @Test
    public void des_encrypt() {
    }

    @Test
    public void des_decrypt() {
    }

    @Test
    public void des_initKey() {
    }

}