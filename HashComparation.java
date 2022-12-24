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
public class HashComparation {
    public static void compareHash(){
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
            long timeHInterval1; //variable para almacenar la diferencia de tiempo del hash
            long timeHInterval2; //variable para almacenar la diferencia de tiempo del hash
            long timeHInterval3; //variable para almacenar la diferencia de tiempo del hash
            long timeHInterval4; //variable para almacenar la diferencia de tiempo del hash
            long timeHInterval5; //variable para almacenar la diferencia de tiempo del hash
            long timeHInterval6; //variable para almacenar la diferencia de tiempo del hash
            long timeHInterval7; //variable para almacenar la diferencia de tiempo del hash
            long timeHInterval8; //variable para almacenar la diferencia de tiempo del hash
            long timeHInterval9; //variable para almacenar la diferencia de tiempo del hash
            long timeHInterval10; //variable para almacenar la diferencia de tiempo del hash
            long timeHInterval11; //variable para almacenar la diferencia de tiempo del hash
            long timeHInterval12; //variable para almacenar la diferencia de tiempo del hash
            
            long timeHInterval13; //variable para almacenar la diferencia de tiempo del hash
            long timeHInterval14; //variable para almacenar la diferencia de tiempo del hash
            long timeHInterval15; //variable para almacenar la diferencia de tiempo del hash
            long timeHInterval16; //variable para almacenar la diferencia de tiempo del hash
            long timeHInterval17; //variable para almacenar la diferencia de tiempo del hash
            long timeHInterval18; //variable para almacenar la diferencia de tiempo del hash
            long timeHInterval19; //variable para almacenar la diferencia de tiempo del hash
            long timeHInterval20; //variable para almacenar la diferencia de tiempo del hash
            long timeHInterval21; //variable para almacenar la diferencia de tiempo del hash
            long timeHInterval22; //variable para almacenar la diferencia de tiempo del hash
            long timeHInterval23; //variable para almacenar la diferencia de tiempo del hash
            long timeHInterval24; //variable para almacenar la diferencia de tiempo del hash
            
            //Registros para la tabla
            ArrayList<HRegistro> registros= new ArrayList<>();
            
            
            /*
            ####################################################
            #                     SHA-2                        #
            #                                                  #
            ####################################################
            */

            //Prueba hash primer vector
            // Obtenemos el hash con SHA-2 de 384 bits
            startTime = System.nanoTime();
            String sha2_384_v1 = SHA2.getSHA384(vector1);
            endTime = System.nanoTime();
            timeHInterval1 = endTime-startTime;
            
            //Prueba hash segundo vector
            // Obtenemos el hash con SHA-2 de 384 bits
            startTime = System.nanoTime();
            String sha2_384_v2 = SHA2.getSHA384(vector2);
            endTime = System.nanoTime();
            timeHInterval2 = endTime-startTime;
            
            //Prueba hash tercer vector
            // Obtenemos el hash con SHA-2 de 384 bits
            startTime = System.nanoTime();
            String sha2_384_v3 = SHA2.getSHA384(vector3);
            endTime = System.nanoTime();
            timeHInterval3 = endTime-startTime;

            //Prueba hash cuarto vector
            // Obtenemos el hash con SHA-2 de 384 bits
            startTime = System.nanoTime();
            String sha2_384_v4 = SHA2.getSHA384(vector4);
            endTime = System.nanoTime();
            timeHInterval4 = endTime-startTime;

            //Prueba hash quinto vector
            // Obtenemos el hash con SHA-2 de 384 bits
            startTime = System.nanoTime();
            String sha2_384_v5 = SHA2.getSHA384(vector5);
            endTime = System.nanoTime();
            timeHInterval5 = endTime-startTime;

            //Prueba hash sexto vector
            // Obtenemos el hash con SHA-2 de 384 bits
            startTime = System.nanoTime();
            String sha2_384_v6 = SHA2.getSHA384(vector6);
            endTime = System.nanoTime();
            timeHInterval6 = endTime-startTime;

            //Prueba hash primer vector
            // Obtenemos el hash con SHA-2 de 512 bits
            startTime = System.nanoTime();
            String sha2_512_v1 = SHA2.getSHA512(vector1);
            endTime = System.nanoTime();
            timeHInterval7 = endTime-startTime;

            //Prueba hash segundo vector
            // Obtenemos el hash con SHA-2 de 512 bits
            startTime = System.nanoTime();
            String sha2_512_v2 = SHA2.getSHA512(vector2);
            endTime = System.nanoTime();
            timeHInterval8 = endTime-startTime;
            
            //Prueba hash tercer vector
            // Obtenemos el hash con SHA-2 de 512 bits
            startTime = System.nanoTime();
            String sha2_512_v3 = SHA2.getSHA512(vector3);
            endTime = System.nanoTime();
            timeHInterval9 = endTime-startTime;
           
            //Prueba hash cuarto vector
            // Obtenemos el hash con SHA-2 de 512 bits
            startTime = System.nanoTime();
            String sha2_512_v4 = SHA2.getSHA512(vector4);
            endTime = System.nanoTime();
            timeHInterval10 = endTime-startTime;

            //Prueba hash quinto vector
            // Obtenemos el hash con SHA-2 de 512 bits
            startTime = System.nanoTime();
            String sha2_512_v5 = SHA2.getSHA512(vector5);
            endTime = System.nanoTime();
            timeHInterval11 = endTime-startTime;

            //Prueba hash sexto vector
            // Obtenemos el hash con SHA-2 de 512 bits
            startTime = System.nanoTime();
            String sha2_512_v6 = SHA2.getSHA512(vector6);
            endTime = System.nanoTime();
            timeHInterval12 = endTime-startTime;

            /*
            ####################################################
            #                     SHA-3                        #
            #                                                  #
            ####################################################
            */

            //Prueba hash primer vector
            // Obtenemos el hash con SHA-3 de 384 bits
            startTime = System.nanoTime();
            String sha3_384_v1 = SHA3.getSHA384(vector1);
            endTime = System.nanoTime();
            timeHInterval13 = endTime-startTime;
            
            //Prueba hash segundo vector
            // Obtenemos el hash con SHA-3 de 384 bits
            startTime = System.nanoTime();
            String sha3_384_v2 = SHA3.getSHA384(vector2);
            endTime = System.nanoTime();
            timeHInterval14 = endTime-startTime;
            
            //Prueba hash tercer vector
            // Obtenemos el hash con SHA-3 de 384 bits
            startTime = System.nanoTime();
            String sha3_384_v3 = SHA3.getSHA384(vector3);
            endTime = System.nanoTime();
            timeHInterval15 = endTime-startTime;

            //Prueba hash cuarto vector
            // Obtenemos el hash con SHA-3 de 384 bits
            startTime = System.nanoTime();
            String sha3_384_v4 = SHA3.getSHA384(vector4);
            endTime = System.nanoTime();
            timeHInterval16 = endTime-startTime;

            //Prueba hash quinto vector
            // Obtenemos el hash con SHA-3 de 384 bits
            startTime = System.nanoTime();
            String sha3_384_v5 = SHA3.getSHA384(vector5);
            endTime = System.nanoTime();
            timeHInterval17 = endTime-startTime;

            //Prueba hash sexto vector
            // Obtenemos el hash con SHA-3 de 384 bits
            startTime = System.nanoTime();
            String sha3_384_v6 = SHA3.getSHA384(vector6);
            endTime = System.nanoTime();
            timeHInterval18 = endTime-startTime;

            //Prueba hash primer vector
            // Obtenemos el hash con SHA-3 de 512 bits
            startTime = System.nanoTime();
            String sha3_512_v1 = SHA3.getSHA512(vector1);
            endTime = System.nanoTime();
            timeHInterval19 = endTime-startTime;

            //Prueba hash segundo vector
            // Obtenemos el hash con SHA-3 de 512 bits
            startTime = System.nanoTime();
            String sha3_512_v2 = SHA3.getSHA512(vector2);
            endTime = System.nanoTime();
            timeHInterval20 = endTime-startTime;
            
            //Prueba hash tercer vector
            // Obtenemos el hash con SHA-3 de 512 bits
            startTime = System.nanoTime();
            String sha3_512_v3 = SHA3.getSHA512(vector3);
            endTime = System.nanoTime();
            timeHInterval21 = endTime-startTime;
           
            //Prueba hash cuarto vector
            // Obtenemos el hash con SHA-3 de 512 bits
            startTime = System.nanoTime();
            String sha3_512_v4 = SHA3.getSHA512(vector4);
            endTime = System.nanoTime();
            timeHInterval22 = endTime-startTime;

            //Prueba hash quinto vector
            // Obtenemos el hash con SHA-3 de 512 bits
            startTime = System.nanoTime();
            String sha3_512_v5 = SHA3.getSHA512(vector5);
            endTime = System.nanoTime();
            timeHInterval23 = endTime-startTime;

            //Prueba hash sexto vector
            // Obtenemos el hash con SHA-3 de 512 bits
            startTime = System.nanoTime();
            String sha3_512_v6 = SHA3.getSHA512(vector6);
            endTime = System.nanoTime();
            timeHInterval24 = endTime-startTime;


            //Resultados hash
            HTable.registros.add(new HRegistro("Vector 1", timeHInterval1,timeHInterval7,timeHInterval13,timeHInterval19));
            HTable.registros.add(new HRegistro("Vector 2", timeHInterval2,timeHInterval8,timeHInterval14,timeHInterval20));
            HTable.registros.add(new HRegistro("Vector 3", timeHInterval3,timeHInterval9,timeHInterval15,timeHInterval21));
            HTable.registros.add(new HRegistro("Vector 4", timeHInterval4,timeHInterval10,timeHInterval16,timeHInterval22));
            HTable.registros.add(new HRegistro("Vector 5", timeHInterval5,timeHInterval11,timeHInterval17,timeHInterval23));
            HTable.registros.add(new HRegistro("Vector 6", timeHInterval6,timeHInterval12,timeHInterval18,timeHInterval24));
            HTable.printTable("Hashing runtime");
            HTable.registros.clear();
            
            
        } catch (Exception e){
            e.printStackTrace();
        }
     
    }    
 }