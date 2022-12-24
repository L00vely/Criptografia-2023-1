import java.security.Key;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JEREMY
 */
public class EDComparation {
    public static void compareEncryptDecrypt(){
        try {
            
            //Definiendo los vectores de prueba
            String vector1 = "Nieve"; //Cadena de 5 caracteres.
            String vector2 = "Llueve hoy"; //Cadena de 10 caracteres.
            String vector3 = "Holaaa, ¿cómo estás?"; //Cadena de 20 caracteres
            String vector4 = "El profesor dijo que el examen será el próximo lunes"; //Cadena de 52 caracteres
            String vector5 = "El último libro que leí se llama El gran Gatsby y trata sobre la vida de un hombre en los años 20 en Estados Unidos."; //Cadena con 116 caracteres
            String vector6 = "Aunque el teléfono móvil que compré hace un mes ya no funciona, estoy muy contento de haber tomado la decisión de comprar uno nuevo. Después de todo, un teléfono móvil es una herramienta muy importante en nuestra vida diaria"; //Cadena con 224 caracteres
            
            //Definición de variables para medir el tiempo
            long startTime; //variable para almacenar el tiempo inicial
            long endTime; //variable para almacenar el tiempo final
            long timeCInterval1; //variable para almacenar la diferencia de tiempo de cifrado
            long timeCInterval2; //variable para almacenar la diferencia de tiempo de cifrado
            long timeCInterval3; //variable para almacenar la diferencia de tiempo de cifrado
            long timeCInterval4; //variable para almacenar la diferencia de tiempo de cifrado
            long timeCInterval5; //variable para almacenar la diferencia de tiempo de cifrado
            long timeCInterval6; //variable para almacenar la diferencia de tiempo de cifrado
            long timeCInterval7; //variable para almacenar la diferencia de tiempo de cifrado
            long timeCInterval8; //variable para almacenar la diferencia de tiempo de cifrado
            long timeCInterval9; //variable para almacenar la diferencia de tiempo de cifrado
            long timeCInterval10; //variable para almacenar la diferencia de tiempo de cifrado
            long timeCInterval11; //variable para almacenar la diferencia de tiempo de cifrado
            long timeCInterval12; //variable para almacenar la diferencia de tiempo de cifrado
            long timeCInterval13; //variable para almacenar la diferencia de tiempo de cifrado
            long timeCInterval14; //variable para almacenar la diferencia de tiempo de cifrado
            long timeCInterval15; //variable para almacenar la diferencia de tiempo de cifrado
            long timeCInterval16; //variable para almacenar la diferencia de tiempo de cifrado
            long timeCInterval17; //variable para almacenar la diferencia de tiempo de cifrado
            long timeCInterval18; //variable para almacenar la diferencia de tiempo de cifrado
            long timeDInterval1; //variable para almacenar la diferencia de tiempo de descifrado
            long timeDInterval2; //variable para almacenar la diferencia de tiempo de descifrado
            long timeDInterval3; //variable para almacenar la diferencia de tiempo de descifrado
            long timeDInterval4; //variable para almacenar la diferencia de tiempo de descifrado
            long timeDInterval5; //variable para almacenar la diferencia de tiempo de descifrado
            long timeDInterval6; //variable para almacenar la diferencia de tiempo de descifrado
            long timeDInterval7; //variable para almacenar la diferencia de tiempo de descifrado
            long timeDInterval8; //variable para almacenar la diferencia de tiempo de descifrado
            long timeDInterval9; //variable para almacenar la diferencia de tiempo de descifrado
            long timeDInterval10; //variable para almacenar la diferencia de tiempo de descifrado
            long timeDInterval11; //variable para almacenar la diferencia de tiempo de descifrado
            long timeDInterval12; //variable para almacenar la diferencia de tiempo de descifrado
            long timeDInterval13; //variable para almacenar la diferencia de tiempo de descifrado
            long timeDInterval14; //variable para almacenar la diferencia de tiempo de descifrado
            long timeDInterval15; //variable para almacenar la diferencia de tiempo de descifrado
            long timeDInterval16; //variable para almacenar la diferencia de tiempo de descifrado
            long timeDInterval17; //variable para almacenar la diferencia de tiempo de descifrado
            long timeDInterval18; //variable para almacenar la diferencia de tiempo de descifrado
            
            //Definición de variables para cifrado y descifrado.
            Key key; //variable para la llave.
            byte[] iv; //variable para el vector de inicialización.
            byte[] plaintextBytes; //variable para almacenar los bytes de una cadena.
            byte[] ciphertext1; //variable para almacenar el texto cifrado.
            byte[] ciphertext2; //variable para almacenar el texto cifrado.
            byte[] ciphertext3; //variable para almacenar el texto cifrado.
            byte[] ciphertext4; //variable para almacenar el texto cifrado.
            byte[] ciphertext5; //variable para almacenar el texto cifrado.
            byte[] ciphertext6; //variable para almacenar el texto cifrado.
            byte[] decryptedBytes; //variable para almacenar el texto descifrado en bytes.
            
            //Registros para la tabla
            ArrayList<EDRegistro> registros= new ArrayList<>();
            
            
            /*
            ####################################################
            #                     CHACHA20                     #
            #                                                  #
            ####################################################
            */
            
            // Genera una clave aleatoria de 256 bits
            key = ChaCha20Local.genKey();
            byte[] bytesKey = key.getEncoded();
            int sizeKey = bytesKey.length*8;
            
            System.out.println("sizeKey: " + sizeKey);
            // Genera un vector de inicialización (IV) aleatorio de 12 bytes
            iv = ChaCha20Local.genIV();

            //Prueba cifrado primer vector
            plaintextBytes = vector1.getBytes("UTF-8");
            // Cifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            ciphertext1 = ChaCha20Local.encrypt(key, iv, plaintextBytes);
            endTime = System.nanoTime();
            timeCInterval1 = endTime-startTime;
            
            //Prueba cifrado segundo vector
            plaintextBytes = vector2.getBytes("UTF-8");
            // Cifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            ciphertext2 = ChaCha20Local.encrypt(key, iv, plaintextBytes);
            endTime = System.nanoTime();
            timeCInterval2 = endTime-startTime;
            
            //Prueba cifrado tercer vector
            plaintextBytes = vector3.getBytes("UTF-8");
            // Cifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            ciphertext3 = ChaCha20Local.encrypt(key, iv, plaintextBytes);
            endTime = System.nanoTime();
            timeCInterval3 = endTime-startTime;
            
            //Prueba cifrado cuarto vector
            plaintextBytes = vector4.getBytes("UTF-8");
            // Cifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            ciphertext4 = ChaCha20Local.encrypt(key, iv, plaintextBytes);
            endTime = System.nanoTime();
            timeCInterval4 = endTime-startTime;

            //Prueba cifrado quinto vector
            plaintextBytes = vector5.getBytes("UTF-8");
            // Cifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            ciphertext5 = ChaCha20Local.encrypt(key, iv, plaintextBytes);
            endTime = System.nanoTime();
            timeCInterval5 = endTime-startTime;            
            
            //Prueba cifrado sexto vector
            plaintextBytes = vector6.getBytes("UTF-8");
            // Cifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            ciphertext6 = ChaCha20Local.encrypt(key, iv, plaintextBytes);
            endTime = System.nanoTime();
            timeCInterval6 = endTime-startTime;            
           
            //Prueba descifrado primer vector
            // Descifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            decryptedBytes = ChaCha20Local.decrypt(key, iv, ciphertext1);
            endTime = System.nanoTime();
            timeDInterval1 = endTime-startTime;

            //Prueba descifrado segundo vector
            // Descifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            decryptedBytes = ChaCha20Local.decrypt(key, iv, ciphertext2);
            endTime = System.nanoTime();
            timeDInterval2 = endTime-startTime;       

            //Prueba descifrado tercer vector
            // Descifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            decryptedBytes = ChaCha20Local.decrypt(key, iv, ciphertext3);
            endTime = System.nanoTime();
            timeDInterval3 = endTime-startTime;

            //Prueba descifrado cuarto vector
            // Descifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            decryptedBytes = ChaCha20Local.decrypt(key, iv, ciphertext4);
            endTime = System.nanoTime();
            timeDInterval4 = endTime-startTime;
            
            //Prueba descifrado quinto vector
            // Descifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            decryptedBytes = ChaCha20Local.decrypt(key, iv, ciphertext5);
            endTime = System.nanoTime();
            timeDInterval5 = endTime-startTime;
            
            //Prueba descifrado sexto vector
            // Descifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            decryptedBytes = ChaCha20Local.decrypt(key, iv, ciphertext6);
            endTime = System.nanoTime();
            timeDInterval6 = endTime-startTime;
            
            
            /*
            ####################################################
            #                      AESEBC                      #
            #                                                  #
            ####################################################
            */            
            
            // Genera una clave aleatoria de 256 bits
            key = AESECB.genKey();
            bytesKey = key.getEncoded();
            sizeKey = bytesKey.length*8;
            System.out.println("sizeKey: " + sizeKey);            

            //Prueba cifrado primer vector
            plaintextBytes = vector1.getBytes("UTF-8");
            // Cifra el texto utilizando la clave
            startTime = System.nanoTime();
            ciphertext1 = AESECB.encrypt(key, plaintextBytes);
            endTime = System.nanoTime();
            timeCInterval7 = endTime-startTime;
            
            //Prueba cifrado segundo vector
            plaintextBytes = vector2.getBytes("UTF-8");
            // Cifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            ciphertext2 = AESECB.encrypt(key, plaintextBytes);
            endTime = System.nanoTime();
            timeCInterval8 = endTime-startTime;
            
            //Prueba cifrado tercer vector
            plaintextBytes = vector3.getBytes("UTF-8");
            // Cifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            ciphertext3 = AESECB.encrypt(key, plaintextBytes);
            endTime = System.nanoTime();
            timeCInterval9 = endTime-startTime;
            
            //Prueba cifrado cuarto vector
            plaintextBytes = vector4.getBytes("UTF-8");
            // Cifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            ciphertext4 = AESECB.encrypt(key, plaintextBytes);
            endTime = System.nanoTime();
            timeCInterval10 = endTime-startTime;
            //System.out.println("Tiempo de cifrado vector 4: " + timeCInterval4 + " [ns]");

            //Prueba cifrado quinto vector
            plaintextBytes = vector5.getBytes("UTF-8");
            // Cifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            ciphertext5 = AESECB.encrypt(key, plaintextBytes);
            endTime = System.nanoTime();
            timeCInterval11 = endTime-startTime;
            //System.out.println("Tiempo de cifrado vector 5: " + timeCInterval5 + " [ns]");            
            
            //Prueba cifrado sexto vector
            plaintextBytes = vector6.getBytes("UTF-8");
            // Cifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            ciphertext6 = AESECB.encrypt(key, plaintextBytes);
            endTime = System.nanoTime();
            timeCInterval12 = endTime-startTime;
            //System.out.println("Tiempo de cifrado vector 6: " + timeCInterval6 + " [ns]");             
            
            //Prueba descifrado primer vector
            // Descifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            decryptedBytes = AESECB.decrypt(key, ciphertext1);
            endTime = System.nanoTime();
            timeDInterval7 = endTime-startTime;

            //Prueba descifrado segundo vector
            // Descifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            decryptedBytes = AESECB.decrypt(key, ciphertext2);
            endTime = System.nanoTime();
            timeDInterval8 = endTime-startTime;            

            //Prueba descifrado tercer vector
            // Descifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            decryptedBytes = AESECB.decrypt(key, ciphertext3);
            endTime = System.nanoTime();
            timeDInterval9 = endTime-startTime;
;   
            //Prueba descifrado cuarto vector
            // Descifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            decryptedBytes = AESECB.decrypt(key, ciphertext4);
            endTime = System.nanoTime();
            timeDInterval10 = endTime-startTime;
            
            //Prueba descifrado quinto vector
            // Descifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            decryptedBytes = AESECB.decrypt(key, ciphertext5);
            endTime = System.nanoTime();
            timeDInterval11 = endTime-startTime;
            
            //Prueba descifrado sexto vector
            // Descifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            decryptedBytes = AESECB.decrypt(key, ciphertext6);
            endTime = System.nanoTime();
            timeDInterval12 = endTime-startTime;

            /*
            ####################################################
            #                      AESCBC                      #
            #                                                  #
            ####################################################
            */            
            
            // Genera una clave aleatoria de 256 bits
            key = AESCBC.genKey();
            bytesKey = key.getEncoded();
            sizeKey = bytesKey.length*8;
            System.out.println("sizeKey: " + sizeKey);
 
            // Genera un vector de inicialización (IV) aleatorio de 16 bytes
            iv = AESCBC.genIV();            
            
            //Prueba cifrado primer vector
            plaintextBytes = vector1.getBytes("UTF-8");
            // Cifra el texto utilizando la clave
            startTime = System.nanoTime();
            ciphertext1 = AESCBC.encrypt(key, plaintextBytes, iv);
            endTime = System.nanoTime();
            timeCInterval13 = endTime-startTime;
            //System.out.println("Tiempo de cifrado vector 1: " + timeCInterval1 + " [ns]");
            
            //Prueba cifrado segundo vector
            plaintextBytes = vector2.getBytes("UTF-8");
            // Cifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            ciphertext2 = AESCBC.encrypt(key, plaintextBytes, iv);
            endTime = System.nanoTime();
            timeCInterval14 = endTime-startTime;
            //System.out.println("Tiempo de cifrado vector 2: " + timeCInterval2 + " [ns]");
            
            //Prueba cifrado tercer vector
            plaintextBytes = vector3.getBytes("UTF-8");
            // Cifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            ciphertext3 = AESCBC.encrypt(key, plaintextBytes, iv);
            endTime = System.nanoTime();
            timeCInterval15 = endTime-startTime;
            //System.out.println("Tiempo de cifrado vector 3: " + timeCInterval3 + " [ns]");
            
            //Prueba cifrado cuarto vector
            plaintextBytes = vector4.getBytes("UTF-8");
            // Cifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            ciphertext4 = AESCBC.encrypt(key, plaintextBytes, iv);
            endTime = System.nanoTime();
            timeCInterval16 = endTime-startTime;
            //System.out.println("Tiempo de cifrado vector 4: " + timeCInterval4 + " [ns]");

            //Prueba cifrado quinto vector
            plaintextBytes = vector5.getBytes("UTF-8");
            // Cifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            ciphertext5 = AESCBC.encrypt(key, plaintextBytes, iv);
            endTime = System.nanoTime();
            timeCInterval17 = endTime-startTime;
            //System.out.println("Tiempo de cifrado vector 5: " + timeCInterval5 + " [ns]");            
            
            //Prueba cifrado sexto vector
            plaintextBytes = vector6.getBytes("UTF-8");
            // Cifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            ciphertext6 = AESCBC.encrypt(key, plaintextBytes, iv);
            endTime = System.nanoTime();
            timeCInterval18 = endTime-startTime;
            //System.out.println("Tiempo de cifrado vector 6: " + timeCInterval6 + " [ns]");             
            
            //Resultados Cifrado
            EDTable.registros.add(new EDRegistro("Vector 1", timeCInterval1, timeCInterval7, timeCInterval13));
            EDTable.registros.add(new EDRegistro("Vector 2", timeCInterval2, timeCInterval8, timeCInterval14));
            EDTable.registros.add(new EDRegistro("Vector 3", timeCInterval3, timeCInterval9, timeCInterval15));
            EDTable.registros.add(new EDRegistro("Vector 4", timeCInterval4, timeCInterval10, timeCInterval16));
            EDTable.registros.add(new EDRegistro("Vector 5", timeCInterval5, timeCInterval11, timeCInterval17));
            EDTable.registros.add(new EDRegistro("Vector 6", timeCInterval6, timeCInterval12, timeCInterval18));
            EDTable.printTable("Encryption time");
            EDTable.registros.clear();
            
            //Prueba descifrado primer vector
            // Descifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            decryptedBytes = AESCBC.decrypt(key, ciphertext1, iv);
            endTime = System.nanoTime();
            timeDInterval13 = endTime-startTime;

            //Prueba descifrado segundo vector
            // Descifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            decryptedBytes = AESCBC.decrypt(key, ciphertext2, iv);
            endTime = System.nanoTime();
            timeDInterval14 = endTime-startTime;            

            //Prueba descifrado tercer vector
            // Descifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            decryptedBytes = AESCBC.decrypt(key, ciphertext3, iv);
            endTime = System.nanoTime();
            timeDInterval15 = endTime-startTime;
;   
            //Prueba descifrado cuarto vector
            // Descifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            decryptedBytes = AESCBC.decrypt(key, ciphertext4, iv);
            endTime = System.nanoTime();
            timeDInterval16 = endTime-startTime;
            
            //Prueba descifrado quinto vector
            // Descifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            decryptedBytes = AESCBC.decrypt(key, ciphertext5, iv);
            endTime = System.nanoTime();
            timeDInterval17 = endTime-startTime;
            
            //Prueba descifrado sexto vector
            // Descifra el texto utilizando la clave y el IV
            startTime = System.nanoTime();
            decryptedBytes = AESCBC.decrypt(key, ciphertext6, iv);
            endTime = System.nanoTime();
            timeDInterval18 = endTime-startTime;
            
            //Resultados Descifrado            
            EDTable.registros.add(new EDRegistro("Vector 1", timeDInterval1, timeDInterval7, timeDInterval13));
            EDTable.registros.add(new EDRegistro("Vector 2", timeDInterval2, timeDInterval8, timeDInterval14));
            EDTable.registros.add(new EDRegistro("Vector 3", timeDInterval3, timeDInterval9, timeDInterval15));
            EDTable.registros.add(new EDRegistro("Vector 4", timeDInterval4, timeDInterval10, timeDInterval16));
            EDTable.registros.add(new EDRegistro("Vector 5", timeDInterval5, timeDInterval11, timeDInterval17));
            EDTable.registros.add(new EDRegistro("Vector 6", timeDInterval6, timeDInterval12, timeDInterval18));
            EDTable.printTable("Decryption time");
            EDTable.registros.clear();
        } catch (Exception e){
            e.printStackTrace();
        }
     
    }    
 }