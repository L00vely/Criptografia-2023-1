
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JEREMY
 */
public class AESCBC {
    public static byte[] encrypt( Key secretKey, byte[] plaintext, byte[] iv) throws Exception {
        ///PKCS5Padding rellena el mensaje para que su longitud sea multiplo del tamaño del bloque
        Cipher cipher = Cipher.getInstance("AES" + "/" + "CBC" + "/PKCS5PADDING");
        IvParameterSpec paramSpec = new IvParameterSpec(iv);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, paramSpec);
        return cipher.doFinal(plaintext);
    }

    public static byte[] decrypt(Key secretKey, byte[] ciphertext, byte[] iv) throws Exception {
        Cipher cipher = Cipher.getInstance("AES" + "/" + "CBC" + "/PKCS5PADDING");
        IvParameterSpec paramSpec = new IvParameterSpec(iv);
        cipher.init(Cipher.DECRYPT_MODE, secretKey, paramSpec);        
        return cipher.doFinal(ciphertext);
    }
    
    public static Key genKey() throws Exception{
        byte[] key;
        key = new byte[256 / 8];
        java.security.SecureRandom.getInstanceStrong().nextBytes(key);
        Key secretKey = new SecretKeySpec(key, "AES");
        return secretKey;
    }

    public static byte[] genIV() throws Exception{
        byte[] iv = new byte[16];
        java.security.SecureRandom.getInstanceStrong().nextBytes(iv);
        return iv;
    }
    
}
