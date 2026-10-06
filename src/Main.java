import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cantidad;
        int aprobados = 0;

        System.out.print("Introduce la cantidad de alumnos: ");
        cantidad = teclado.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Introduce la nota del alumno " + i + ": ");
            double nota = teclado.nextDouble();

            if (nota >= 6.00) {
                aprobados++;
            }
        }

        System.out.println("Cantidad de alumnos aprobados: " + aprobados);

        teclado.close();
    }
}git