
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
public class Table {
    
    public static ArrayList<Registro> registros= new ArrayList<>();
    
    public static void printTable(String title){
        
        int spaces = (83-title.length()) / 2;
        
        Formatter formateador = new Formatter();
        
        // Imprimir una línea separadora
        formateador.format("|%-20s|%20s|%20s|%20s|%n", "--------------------", "--------------------", "--------------------", "--------------------");
        
        // Imprimir una título de la tabla
        formateador.format("|"+"%"+spaces+"s%s%"+spaces+"s"+"|%n", "",title,"");
       
        // Imprimir una línea separadora
        formateador.format("|%-20s|%20s|%20s|%20s|%n", "--------------------", "--------------------", "--------------------", "--------------------");
        
        // Crear un formateador con un ancho de 20 para la columna de chacha20
        // un ancho de 20 para la columna de AES-EBC y un ancho de 20 para la columna de AES-CBC
        formateador.format("|%-20s|%20s|%20s|%20s|%n", "Vector", "ChaCha20 [ns]", "AES-EBC [ns]", "AES-CBC [ns]");

        // Imprimir una línea separadora
        formateador.format("|%-20s|%20s|%20s|%20s|%n", "--------------------", "--------------------", "--------------------", "--------------------", "--------------------");

        // Recorrer la lista de personas e imprimir cada una
        for (Registro registro : registros) {
            formateador.format("|%-20s|%20d|%20d|%20d|%n", registro.vector, registro.timeChacha20, registro.timeAESECB, registro.timeAESCBC);
        }

        // Imprimir una línea separadora
        formateador.format("|%-20s|%20s|%20s|%20s|%n", "--------------------", "--------------------", "--------------------", "--------------------");
        
        // Imprimir la tabla en pantalla
        System.out.println(formateador);        
    }
    
    
}
