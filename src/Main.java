import java.util.Scanner;

public class Main {

    public static String obtenerFragmento(String cadena, int inicio, int fin) {
        return cadena.substring(inicio, fin).toUpperCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();

        System.out.print("Introduce la posición inicial: ");
        int inicio = sc.nextInt();

        System.out.print("Introduce la posición final: ");
        int fin = sc.nextInt();

        System.out.println(obtenerFragmento(cadena, inicio, fin));
    }
}