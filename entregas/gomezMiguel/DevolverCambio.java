import java.util.Scanner;

public class DevolverCambio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos euros debe pagar?");
        int dineroPagar = scanner.nextInt();

        System.out.println("¿Con cuántos euros paga?");
        int dineroEntregado = scanner.nextInt();

        int cambio = dineroEntregado - dineroPagar;

        final int BILLETES100 = 100;
        int numBilletes100 = cambio / BILLETES100;
        cambio = cambio % BILLETES100;
        System.out.println(numBilletes100 + " billete(s) de 100 €");

        final int BILLETES50 = 50;
        int numBilletes50 = cambio / BILLETES50;
        cambio = cambio % BILLETES50;
        System.out.println(numBilletes50 + " billete(s) de 50 €");

        final int BILLETES20 = 20;
        int numBilletes20 = cambio / BILLETES20;
        cambio = cambio % BILLETES20;
        System.out.println(numBilletes20 + " billete(s) de 20 €");

        scanner.close();
    }
}
