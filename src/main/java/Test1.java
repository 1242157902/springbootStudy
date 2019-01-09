import com.talkingdata.sdmk.RSAUtils;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Map;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package PACKAGE_NAME
 * @Description: ${todo}
 * @date 2018/3/3 19:20
 * @email 1242157902@qq.com
 */
public class Test1 {
    public static void main(String[] args) throws InvalidKeySpecException, NoSuchAlgorithmException {

        String privateStr = "U2FsdGVkX1+6zpzAS5vE3O9gNcXtuqFlgZ5cm19f9Ek=";
        System.out.println(privateStr.length());
        //String decodedData = RSAUtils.privateDecrypt(privateStr, RSAUtils.getPrivateKey("TalkingData"));
        //System.out.println("解密后文字: \r\n" + decodedData);
        byte[] result = decrypt( privateStr.getBytes(), "Happy");
        System.out.println(new String(result));

    }


    /**
     * 解密AES加密过的字符串
     *
     * @param content
     *            AES加密过过的内容
     * @param password
     *            加密时的密码
     * @return 明文
     */
    public static byte[] decrypt(byte[] content, String password) {
        try {
            KeyGenerator kgen = KeyGenerator.getInstance("AES");// 创建AES的Key生产者
            kgen.init(128, new SecureRandom(password.getBytes()));
            SecretKey secretKey = kgen.generateKey();// 根据用户密码，生成一个密钥
            byte[] enCodeFormat = secretKey.getEncoded();// 返回基本编码格式的密钥
            SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");// 转换为AES专用密钥
            Cipher cipher = Cipher.getInstance("AES");// 创建密码器
            cipher.init(Cipher.DECRYPT_MODE, key);// 初始化为解密模式的密码器
            byte[] result = cipher.doFinal(content);
            return result; // 明文

        }   catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
