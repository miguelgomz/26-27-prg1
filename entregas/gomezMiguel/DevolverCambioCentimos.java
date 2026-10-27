import java.util.Scanner;

public class DevolverCambioCentimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos euros debe pagar?");
        double dineroPagar = scanner.nextDouble();

        System.out.println("¿Con cuántos euros paga?");
        double dineroEntregado = scanner.nextDouble();

        int totalPagar = (int) Math.round(dineroPagar * 100);
        int totalEntregado = (int) Math.round(dineroEntregado * 100);
        int cambiocent = totalEntregado - totalPagar;

        scanner.close();
    }
}