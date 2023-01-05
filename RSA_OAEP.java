import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Security;
import java.security.Signature;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Base64;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.spec.PSource;

//package RSA;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OCTAVIO
 */
public class RSA_OAEP {
    private KeyPair keyPair;
    private Cipher cifrado;
    private Cipher descifrado;

    public RSA_OAEP() throws Exception {
        //Generamos llaves
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(1024);
        this.keyPair = kpg.generateKeyPair();

        OAEPParameterSpec oaepParams = new OAEPParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), PSource.PSpecified.DEFAULT);
        this.cifrado = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
        this.descifrado = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
        cifrado.init(Cipher.ENCRYPT_MODE, keyPair.getPublic(), oaepParams);
        descifrado.init(Cipher.DECRYPT_MODE, keyPair.getPrivate(), oaepParams);
    }

    public byte[] encrypt(byte[] plaintext) throws GeneralSecurityException {
        return cifrado.doFinal(plaintext);
    }

    public byte[] decrypt(byte[] ciphertext) throws GeneralSecurityException {
        return descifrado.doFinal(ciphertext);
    }
    
}