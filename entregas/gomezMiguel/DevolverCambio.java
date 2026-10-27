import java.util.Scanner;

public class DevolverCambio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos euros debe pagar?");
        int dineroPagar = scanner.nextInt();

        System.out.println("¿Con cuántos euros paga?");
        int dineroEntregado = scanner.nextInt();

        int cambio = dineroEntregado - dineroPagar;

        scanner.close();
    }
}