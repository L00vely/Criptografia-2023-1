
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.spec.ECGenParameterSpec;
import java.util.Base64;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JEREMY
 */
public class ECDSAPrimeFieldSignature {
    private KeyPair keyPair;

    public ECDSAPrimeFieldSignature() throws Exception {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("EC");
        keyGen.initialize(521);
        this.keyPair = keyGen.generateKeyPair();
    }

    public String sign(String text) throws Exception {
        Signature privateSignature = Signature.getInstance("SHA256withECDSA");
        privateSignature.initSign(keyPair.getPrivate());
        privateSignature.update(text.getBytes());
        byte[] signatureBytes = privateSignature.sign();
        return Base64.getEncoder().encodeToString(signatureBytes);
    }

    public boolean verify(String text, String signature) throws Exception {
        Signature publicSignature = Signature.getInstance("SHA256withECDSA");
        publicSignature.initVerify(keyPair.getPublic());
        publicSignature.update(text.getBytes());
        byte[] signatureBytes = Base64.getDecoder().decode(signature);
        return publicSignature.verify(signatureBytes);
    }
}
