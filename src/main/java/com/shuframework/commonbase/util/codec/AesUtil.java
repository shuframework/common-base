package com.shuframework.commonbase.util.codec;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

/**
 * AES对称加密 与DES几乎一样只是key的长度(密钥长度)不同
 * 1.还原密钥
 * 2.初始化,设置为加密(解密)模式
 * 3.执行操作
 *
 * @author shuheng
 */
public class AesUtil {

    public static final String ALGORITHM = DigestKeyEnum.AES.getKey();
    /**
     * AES key size must be equal to 128, 192 or 256,but 192 and 256 bits may not be available
     */
    public static final int KEY_SIZE = 128;


    /**
     * 加密
     *
     * @param data 需要加密的数据
     * @param key  initKey()生成的key经过base64加密了
     */
    public static byte[] encrypt(byte[] data, String key) {
        return initCipherAndReturn(data, key, Cipher.ENCRYPT_MODE);
    }

    /**
     * 解密
     *
     * @param data 需要解密的数据
     * @param key  initKey()生成的key经过base64加密了
     */
    public static byte[] decrypt(byte[] data, String key) {
        return initCipherAndReturn(data, key, Cipher.DECRYPT_MODE);
    }

    private static byte[] initCipherAndReturn(byte[] data, String key, int decryptMode) {
        byte[] decryptBytes;
        try {
            Key k = toKey(Base64Util.decodeBase64toByte(key));
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(decryptMode, k);
            decryptBytes = cipher.doFinal(data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return decryptBytes;
    }


    /**
     * 转换密钥<br>
     *
     * @param key
     */
    private static Key toKey(byte[] key) {
        // 当使用其他对称加密算法时，如AES、Blowfish等算法时，用下述代码替换上述三行代码
        SecretKey secretKey = new SecretKeySpec(key, ALGORITHM);
        return secretKey;
    }

    /**
     * 生成密钥, 先生成密钥然后通过base64加密
     *
     * @throws NoSuchAlgorithmException
     */
    public static String initKey() throws NoSuchAlgorithmException {
        KeyGenerator kg = KeyGenerator.getInstance(ALGORITHM);
        kg.init(KEY_SIZE);
        SecretKey secretKey = kg.generateKey();
        byte[] keyEncoded = secretKey.getEncoded();
        return Base64Util.encodeBase64(keyEncoded);
    }


    public static void main(String[] args) throws NoSuchAlgorithmException {
//        String key = DesUtil.initKey();
        // java.security.InvalidKeyException: Invalid AES key length: 18 bytes
        // key的长度要是8的倍数,从16往上
        String key = Base64Util.encodeBase64("com.shuframework.com.shu");
        System.out.println(key);
        String data = "hello world";

        byte[] encrypt = AesUtil.encrypt(data.getBytes(), key);

//        System.out.println(encrypt);
//        //乱码
//        System.out.println(new String(encrypt));

        byte[] decrypt = AesUtil.decrypt(encrypt, key);
        System.out.println(new String(decrypt));
    }

}
