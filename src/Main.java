import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();

        StringBuilder texto = new StringBuilder(cadena);

        System.out.println("Cadena invertida: " + texto.reverse());
    }
}