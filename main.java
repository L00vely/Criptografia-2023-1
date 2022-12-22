import java.util.Scanner;
/**
 *
 * @author JEREMY
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 4) {
        // Mostramos las opciones del menú
        System.out.println("+-------+----------------------------------------------+");
        System.out.println("| Opción|                Descripción                   |");
        System.out.println("+-------+----------------------------------------------+");
        System.out.println("|   1   | Algoritmos de Cifrado/Descifrado             |");
        System.out.println("|   2   | Algoritmos de Hash                           |");
        System.out.println("|   3   | Algoritmos de Firma                          |");
        System.out.println("|   4   | Salir                                        |");
        System.out.println("+-------+----------------------------------------------+");

        // Leemos la opción del usuario
        System.out.print("Selecciona el tipo de algoritmo que quieres comparar: ");
        opcion = scanner.nextInt();

        // Ejecutamos la opción seleccionada
        switch (opcion){
            case 1:
                System.out.println("Algoritmos de Cifrado/Descifrado");
                Compare.compareEncrypt();
                break;
            case 2:
                System.out.println("Algoritmos de Hash");
                break;
            case 3:
                System.out.println("Algoritmos de Firma");
                break;
            case 4:
                System.out.println("Salir...");
                break;                
            default:
                System.out.println("Opción inválida");
                break;
        }
    }
    // Cerramos el scanner
    scanner.close();
       
    }

    
}