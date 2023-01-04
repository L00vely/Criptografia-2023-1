
import java.util.ArrayList;
import java.util.Formatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAVID
 */
public class HTable {
    
    public static ArrayList<HRegistro> registros= new ArrayList<>();
    
    public static void printTable(String title){
        
        int spaces = (104-title.length()) / 2;
        
        Formatter formateador = new Formatter();
        
        // Imprimir una línea separadora
        formateador.format("|%-20s|%20s|%20s|%20s|%20s|%n", "--------------------", "--------------------", "--------------------", "--------------------", "--------------------", "--------------------");
        
        // Imprimir una título de la tabla
        formateador.format("|"+"%"+spaces+"s%s%"+spaces+"s"+" |%n", "",title,"");
       
        // Imprimir una línea separadora
        formateador.format("|%-20s|%20s|%20s|%20s|%20s|%n", "--------------------", "--------------------", "--------------------", "--------------------", "--------------------", "--------------------");
        
        // Crear un formateador con un ancho de 20 para la columna de SHA-2 384
        // un ancho de 20 para la columna de SHA-2 512,
        // un ancho de 20 para la columna de SHA-3 384,
        // y un ancho de 20 para la columna de SHA-3 512
        formateador.format("|%-20s|%20s|%20s|%20s|%20s|%n", "Vector", "SHA-2 384 bits [ns]", "SHA-2 512 bits [ns]", "SHA-3 384 bits [ns]","SHA-3 512 bit[ns]");

        // Imprimir una línea separadora
        formateador.format("|%-20s|%20s|%20s|%20s|%20s|%n", "--------------------", "--------------------", "--------------------", "--------------------", "--------------------", "--------------------");

        // Recorrer la lista de personas e imprimir cada una
        for (HRegistro registro : registros) {
            formateador.format("|%-20s|%20d|%20d|%20d|%20d|%n", registro.vector, registro.timeSha2_384, registro.timeSha2_512, registro.timeSha3_384, registro.timeSha3_512);
        }

        // Imprimir una línea separadora
        formateador.format("|%-20s|%20s|%20s|%20s|%20s|%n", "--------------------", "--------------------", "--------------------", "--------------------", "--------------------");
        
        // Imprimir la tabla en pantalla
        System.out.println(formateador);        
    }
    
    
}

