import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();

        System.out.print("Introduce un carácter: ");
        char caracter = sc.next().charAt(0);

        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }

        System.out.println("El caracter '" + caracter +
                "' se repite " + contador + " veces");
    }
}