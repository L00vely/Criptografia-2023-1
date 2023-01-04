
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Security;
import java.security.Signature;
import java.util.Base64;
import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JEREMY
 */
public class ECDSABinaryFieldSignature {
    private KeyPair keyPair;

    public ECDSABinaryFieldSignature() throws Exception {
        //Se agrega el provedor de BouncyCastle por problema de soporte con el parámetro secp521r1.
        Security.addProvider(new BouncyCastleProvider()); //Agregamos el provedor de BouncyCastle
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("ECDSA","BC");
        keyGen.initialize(ECNamedCurveTable.getParameterSpec("secp521r1"));
        this.keyPair = keyGen.generateKeyPair();
    }

    public String sign(String text) throws Exception {
        Signature privateSignature = Signature.getInstance("SHA256withECDSA","BC");
        privateSignature.initSign(keyPair.getPrivate());
        privateSignature.update(text.getBytes());
        byte[] signatureBytes = privateSignature.sign();
        return Base64.getEncoder().encodeToString(signatureBytes);
    }

    public boolean verify(String text, String signature) throws Exception {
        Signature publicSignature = Signature.getInstance("SHA256withECDSA","BC");
        publicSignature.initVerify(keyPair.getPublic());
        publicSignature.update(text.getBytes());
        byte[] signatureBytes = Base64.getDecoder().decode(signature);
        return publicSignature.verify(signatureBytes);
    } 

    public void deleteBCProvider(){
        Security.removeProvider("BC");
    }    
    
}
