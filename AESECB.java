import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import javax.crypto.KeyGenerator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JEREMY
 */
public class AESECB {
    
    public static byte[] encrypt( Key secretKey, byte[] plaintext) throws Exception {
        ///PKCS5Padding rellena el mensaje para que su longitud sea multiplo del tamaño del bloque
        Cipher cipher = Cipher.getInstance("AES" + "/" + "ECB" + "/PKCS5PADDING");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        return cipher.doFinal(plaintext);
    }

    public static byte[] decrypt(Key secretKey, byte[] ciphertext) throws Exception {
        Cipher cipher = Cipher.getInstance("AES" + "/" + "ECB" + "/PKCS5PADDING");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);        
        return cipher.doFinal(ciphertext);
    }
    
    public static Key genKey() throws Exception{
        byte[] key;
        key = new byte[256 / 8];
        java.security.SecureRandom.getInstanceStrong().nextBytes(key);
        Key secretKey = new SecretKeySpec(key, "AES");
        return secretKey;
    }
    
    
    
}
