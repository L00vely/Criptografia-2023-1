
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
public class SignComparation {
    public static void compareSign(){
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
            long timeSInterval1; //variable para almacenar la diferencia de tiempo de firma
            long timeSInterval2; //variable para almacenar la diferencia de tiempo de firma
            long timeSInterval3; //variable para almacenar la diferencia de tiempo de firma
            long timeSInterval4; //variable para almacenar la diferencia de tiempo de firma
            long timeSInterval5; //variable para almacenar la diferencia de tiempo de firma
            long timeSInterval6; //variable para almacenar la diferencia de tiempo de firma
            long timeSInterval7; //variable para almacenar la diferencia de tiempo de firma
            long timeSInterval8; //variable para almacenar la diferencia de tiempo de firma
            long timeSInterval9; //variable para almacenar la diferencia de tiempo de firma
            long timeSInterval10; //variable para almacenar la diferencia de tiempo de firma
            long timeSInterval11; //variable para almacenar la diferencia de tiempo de firma
            long timeSInterval12; //variable para almacenar la diferencia de tiempo de firma
            
            long timeSInterval13; //variable para almacenar la diferencia de tiempo de firma
            long timeSInterval14; //variable para almacenar la diferencia de tiempo de firma
            long timeSInterval15; //variable para almacenar la diferencia de tiempo de firma
            long timeSInterval16; //variable para almacenar la diferencia de tiempo de firma
            long timeSInterval17; //variable para almacenar la diferencia de tiempo de firma
            long timeSInterval18; //variable para almacenar la diferencia de tiempo de firma
            long timeSInterval19; //variable para almacenar la diferencia de tiempo de firma
            long timeSInterval20; //variable para almacenar la diferencia de tiempo de firma
            long timeSInterval21; //variable para almacenar la diferencia de tiempo de firma
            long timeSInterval22; //variable para almacenar la diferencia de tiempo de firma
            long timeSInterval23; //variable para almacenar la diferencia de tiempo de firma
            long timeSInterval24; //variable para almacenar la diferencia de tiempo de firma
                        
            
            /*
            ####################################################
            #                ECDSA-Prime Field                 #
            #                                                  #
            ####################################################
            */
                       
            ECDSAPrimeFieldSignature signer = new ECDSAPrimeFieldSignature();
            String signature = null;
            boolean isValid = false;
            //Prueba firma primer vector
            // Obtenemos la firma con ECDSA Prime Field
            startTime = System.nanoTime();
            signature = signer.sign(vector1);
            endTime = System.nanoTime();
            timeSInterval13 = endTime-startTime;
            isValid = signer.verify(vector1, signature);
            System.out.println(isValid);  // Imprime "true" 
            
            //Prueba firma segundo vector
            // Obtenemos la firma con ECDSA Prime Field
            startTime = System.nanoTime();
            signature = signer.sign(vector2);
            endTime = System.nanoTime();
            timeSInterval14 = endTime-startTime;
            isValid = signer.verify(vector2, signature);
            System.out.println(isValid);  // Imprime "true" 
                        
            //Prueba firma tercer vector
            // Obtenemos la firma con ECDSA Prime Field
            startTime = System.nanoTime();
            signature = signer.sign(vector3);
            endTime = System.nanoTime();
            timeSInterval15 = endTime-startTime;
            isValid = signer.verify(vector3, signature);
            System.out.println(isValid);  // Imprime "true"

            //Prueba firma cuarto vector
            // Obtenemos la firma con ECDSA Prime Field
            startTime = System.nanoTime();
            signature = signer.sign(vector4);
            endTime = System.nanoTime();
            timeSInterval16 = endTime-startTime;
            isValid = signer.verify(vector4, signature);
            System.out.println(isValid);  // Imprime "true"

            //Prueba firma quinto vector
            // Obtenemos la firma con ECDSA Prime Field
            startTime = System.nanoTime();
            signature = signer.sign(vector5);
            endTime = System.nanoTime();
            timeSInterval17 = endTime-startTime;
            isValid = signer.verify(vector5, signature);
            System.out.println(isValid);  // Imprime "true"

            //Prueba firma sexto vector
            // Obtenemos la firma con ECDSA Prime Field
            startTime = System.nanoTime();
            signature = signer.sign(vector6);
            endTime = System.nanoTime();
            timeSInterval18 = endTime-startTime;
            isValid = signer.verify(vector6, signature);
            System.out.println(isValid);  // Imprime "true"
                        
            
            /*
            ####################################################
            #                ECDSA-Binary Field                #
            #                                                  #
            ####################################################
            */
                       
            signer = new ECDSAPrimeFieldSignature();
            signature = null;
            isValid = false;
            //Prueba firma primer vector
            // Obtenemos la firma con ECDSA Binary Field
            startTime = System.nanoTime();
            signature = signer.sign(vector1);
            endTime = System.nanoTime();
            timeSInterval19 = endTime-startTime;
            isValid = signer.verify(vector1, signature);
            System.out.println(isValid);  // Imprime "true" 
            
            //Prueba firma segundo vector
            // Obtenemos la firma con ECDSA Binary Field
            startTime = System.nanoTime();
            signature = signer.sign(vector2);
            endTime = System.nanoTime();
            timeSInterval20 = endTime-startTime;
            isValid = signer.verify(vector2, signature);
            System.out.println(isValid);  // Imprime "true" 
                        
            //Prueba firma tercer vector
            // Obtenemos la firma con ECDSA Binary Field
            startTime = System.nanoTime();
            signature = signer.sign(vector3);
            endTime = System.nanoTime();
            timeSInterval21 = endTime-startTime;
            isValid = signer.verify(vector3, signature);
            System.out.println(isValid);  // Imprime "true"

            //Prueba firma cuarto vector
            // Obtenemos la firma con ECDSA Binary Field
            startTime = System.nanoTime();
            signature = signer.sign(vector4);
            endTime = System.nanoTime();
            timeSInterval22 = endTime-startTime;
            isValid = signer.verify(vector4, signature);
            System.out.println(isValid);  // Imprime "true"

            //Prueba firma quinto vector
            // Obtenemos la firma con ECDSA Binary Field
            startTime = System.nanoTime();
            signature = signer.sign(vector5);
            endTime = System.nanoTime();
            timeSInterval23 = endTime-startTime;
            isValid = signer.verify(vector5, signature);
            System.out.println(isValid);  // Imprime "true"

            //Prueba firma sexto vector
            // Obtenemos la firma con ECDSA Binary Field
            startTime = System.nanoTime();
            signature = signer.sign(vector6);
            endTime = System.nanoTime();
            timeSInterval24 = endTime-startTime;
            isValid = signer.verify(vector6, signature);
            System.out.println(isValid);  // Imprime "true"

            //Resultados firma
            SignTable.registros.add(new SignRegistro("Vector 1", timeSInterval13,timeSInterval19));
            SignTable.registros.add(new SignRegistro("Vector 2", timeSInterval14,timeSInterval20));
            SignTable.registros.add(new SignRegistro("Vector 3", timeSInterval15,timeSInterval21));
            SignTable.registros.add(new SignRegistro("Vector 4", timeSInterval16,timeSInterval22));
            SignTable.registros.add(new SignRegistro("Vector 5", timeSInterval17,timeSInterval23));
            SignTable.registros.add(new SignRegistro("Vector 6", timeSInterval18,timeSInterval24));
            SignTable.printTable("Signing runtime");
            SignTable.registros.clear();            
            
            
        }  catch (Exception e){
            e.printStackTrace();
        }
    }
}
