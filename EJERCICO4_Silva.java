public class EJERCICO4_Silva {
    
import java.util.Scanner;

    public static int leerMinutos(Scanner sc) {
        int minutos;

        do {
            System.out.print("Ingrese los minutos (1-1440): ");
            minutos = sc.nextInt();

            if (minutos < 1 || minutos > 1440) {
                System.out.println("Minutos invalidos. Intente nuevamente.");
            }

        } while (minutos < 1 || minutos > 1440);

        return minutos;
    }

    public static int horasCobradas(int minutos) {
        return (minutos + 59) / 60;
    }

    public static double tarifa(int horas, char tipo) {
        double precio;

        if (tipo == 'A' || tipo == 'a') {
            precio = 1.00;
        } else {
            precio = 0.50;
        }

        double total = horas * precio;

        if (horas > 8) {
            total = total * 0.80;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minutos = leerMinutos(sc);

        System.out.print("Ingrese tipo de vehiculo (A=Auto, M=Moto): ");
        char tipo = sc.next().charAt(0);

        int horas = horasCobradas(minutos);
        double total = tarifa(horas, tipo);

        System.out.println("\n===== PARQUEADERO =====");
        System.out.println("Minutos utilizados: " + minutos);
        System.out.println("Horas cobradas: " + horas);
        System.out.printf("Total a pagar: $%.2f%n", total);

        sc.close();
    }
}



