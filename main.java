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
        System.out.println("| Option|                Description                  |");
        System.out.println("+-------+----------------------------------------------+");
        System.out.println("|   1   | Encryption / decryption algorithms          |");
        System.out.println("|   2   | Hashing algorithms                          |");
        System.out.println("|   3   | Signing algorithms                          |");
        System.out.println("|   4   | Exit                                        |");
        System.out.println("+-------+----------------------------------------------+");

        // Leemos la opción del usuario
        System.out.print("Please select the type of algorithm to compare: ");
        opcion = scanner.nextInt();

        // Ejecutamos la opción seleccionada
        switch (opcion){
            case 1:
                System.out.println("Encryption / decryption algorithms");
                EDComparation.compareEncryptDecrypt();
                break;
            case 2:
                System.out.println("Hashing algorithms");
                HashComparation.compareHash();
                break;
            case 3:
                System.out.println("Signing algorithms");
                SignComparation.compareSign();
                break;
            case 4:
                System.out.println("Finishing...");
                break;                
            default:
                System.out.println("Invalid option, please try again.");
                break;
        }
    }
    // Cerramos el scanner
        scanner.close();
       
    }
    
}