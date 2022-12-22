
import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.ChaCha20ParameterSpec;
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
public class ChaCha20Local{
    
    public static byte[] encrypt(Key secretKey, byte[] iv, byte[] plaintext) throws GeneralSecurityException {
        
        Cipher cipher = Cipher.getInstance("ChaCha20");
        
        ChaCha20ParameterSpec paramSpec = new ChaCha20ParameterSpec(iv, 0);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, paramSpec);
        return cipher.doFinal(plaintext);
    }

    public static byte[] decrypt(Key secretKey, byte[] iv, byte[] ciphertext) throws GeneralSecurityException {
        Cipher cipher = Cipher.getInstance("ChaCha20");
        ChaCha20ParameterSpec paramSpec = new ChaCha20ParameterSpec(iv, 0);
        cipher.init(Cipher.DECRYPT_MODE, secretKey, paramSpec);
        return cipher.doFinal(ciphertext);
    }
    
    public static Key genKey() throws Exception{
        byte[] key;
        key = new byte[256 / 8];
        java.security.SecureRandom.getInstanceStrong().nextBytes(key);
        Key secretKey = new SecretKeySpec(key, "ChaCha20");
        return secretKey;
    }
    
    public static byte[] genIV() throws Exception{
        byte[] iv = new byte[12];
        java.security.SecureRandom.getInstanceStrong().nextBytes(iv);
        return iv;
    }
    
}
    