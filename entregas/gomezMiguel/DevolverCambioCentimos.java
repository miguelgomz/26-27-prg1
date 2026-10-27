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

        final int BILLETES100 = 10000;
        int numBilletes100 = cambiocent / BILLETES100;
        cambiocent = cambiocent % BILLETES100;
        System.out.println(numBilletes100 + " billete(s) de 100 €");

        final int BILLETES50 = 5000;
        int numBilletes50 = cambiocent / BILLETES50;
        cambiocent = cambiocent % BILLETES50;
        System.out.println(numBilletes50 + " billete(s) de 50 €");

        final int BILLETES20 = 2000;
        int numBilletes20 = cambiocent / BILLETES20;
        cambiocent = cambiocent % BILLETES20;
        System.out.println(numBilletes20 + " billete(s) de 20 €");

        final int BILLETES10 = 1000;
        int numBilletes10 = cambiocent / BILLETES10;
        cambiocent = cambiocent % BILLETES10;
        System.out.println(numBilletes10 + " billete(s) de 10 €");

        final int BILLETES5 = 500;
        int numBilletes5 = cambiocent / BILLETES5;
        cambiocent = cambiocent % BILLETES5;
        System.out.println(numBilletes5 + " billete(s) de 5 €");

        scanner.close();
    }
}