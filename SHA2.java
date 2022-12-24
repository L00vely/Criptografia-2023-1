import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAVID
 */

public class SHA2 {
    // Para obtener el mensaje "digerido" con SHA-2 de 384 bits
    public static String getSHA384(String input){
        try {
            // Empleamos la función hash SHA-2 de tamaño 384 bits
            MessageDigest md = MessageDigest.getInstance("SHA-384");
  
            // Se invoca el método digest y se almacena en una arreglo de bytes
            byte[] messageDigest = md.digest(input.getBytes());
  
            // Convertimos los bytes en números enteros
            BigInteger no = new BigInteger(1, messageDigest);
  
            // Convertimos los números enteros a valores hexadecimales
            String hashtext = no.toString(16);
  
            // Agregamos ceros para su representación en 32 bits
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
  
            // Devolvemos el valor hash
            return hashtext;
        }
  
        // En caso de errores al momento de digerir el mensaje
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    // Para obtener el mensaje "digerido" con SHA-2 de 512 bits
    public static String getSHA512(String input){

        try {
            // Empleamos la función hash SHA-2 de tamaño 512 bits
            MessageDigest md = MessageDigest.getInstance("SHA-512");
  
            // Se invoca el método digest y se almacena en una arreglo de bytes
            byte[] messageDigest = md.digest(input.getBytes());
  
            // Convertimos los bytes en números enteros
            BigInteger no = new BigInteger(1, messageDigest);
  
            // Convertimos los números enteros a valores hexadecimales
            String hashtext = no.toString(16);
  
            // Agregamos ceros para su representación en 32 bits
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
  
            // Devolvemos el valor hash
            return hashtext;
        }
  
        // En caso de errores al momento de digerir el mensaje
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
