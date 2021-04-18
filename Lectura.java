import java.util.Scanner;

public class Lectura {
    
    public static int leerEntero(String mensaje){
        Scanner in = new Scanner(System.in);
        System.out.println(mensaje);
        return in.nextInt();
    }
}
