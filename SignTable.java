
import java.util.ArrayList;
import java.util.Formatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JEREMY
 */
public class SignTable {
    
    public static ArrayList<SignRegistro> registros= new ArrayList<>();
    
    public static void printTable(String title){
        
        int spaces = (104-title.length()) / 2;
        
        Formatter formateador = new Formatter();
        
        // Imprimir una línea separadora
        formateador.format("|%-20s|%20s|%20s|%20s|%20s|%n", "--------------------", "--------------------", "--------------------", "--------------------", "--------------------", "--------------------");
        
        // Imprimir una título de la tabla
        formateador.format("|"+"%"+spaces+"s%s%"+spaces+"s"+" |%n", "",title,"");
       
        // Imprimir una línea separadora
        formateador.format("|%-20s|%20s|%20s|%20s|%20s|%n", "--------------------", "--------------------", "--------------------", "--------------------", "--------------------", "--------------------");
        
        // Crear un formateador con un ancho de 20 para la columna de RSA-OAEP
        // un ancho de 20 para la columna de RSA-PSS,
        // un ancho de 20 para la columna de ECDSA Prime F.,
        // y un ancho de 20 para la columna de "ECDSA Binary F.
        formateador.format("|%-20s|%20s|%20s|%20s|%20s|%n", "Vector", "RSA-OAEP [ns]", "RSA-PSS [ns]", "ECDSA Prime F. [ns]","ECDSA Binary F. [ns]");

        // Imprimir una línea separadora
        formateador.format("|%-20s|%20s|%20s|%20s|%20s|%n", "--------------------", "--------------------", "--------------------", "--------------------", "--------------------", "--------------------");

        // Recorrer la lista de personas e imprimir cada una
        for (SignRegistro registro : registros) {
            formateador.format("|%-20s|%20d|%20d|%20d|%20d|%n", registro.vector, registro.timeRSA_OAEP, registro.timeRSA_PSS, registro.timeECDSA_PF, registro.timeECDSA_BF);
        }

        // Imprimir una línea separadora
        formateador.format("|%-20s|%20s|%20s|%20s|%20s|%n", "--------------------", "--------------------", "--------------------", "--------------------", "--------------------");
        
        // Imprimir la tabla en pantalla
        System.out.println(formateador);        
    }    
}
