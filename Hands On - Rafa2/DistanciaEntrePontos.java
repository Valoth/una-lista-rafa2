import java.util.Scanner;

public class DistanciaEntrePontos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double latitude1, latitude2, longitude1, longitude2;
        double raioTerra = 6371.01;
        double distanciaFinal;

        System.out.println("Digite a latitude da coordenada 1: ");
        latitude1 = Math.toRadians(sc.nextDouble());

        System.out.println("Digite a longitude da coordenada 1: ");
        longitude1 = Math.toRadians(sc.nextDouble());

        System.out.println("Digite a latitude da coordenada 2: ");
        latitude2 = Math.toRadians(sc.nextDouble());

        System.out.println("Digite a longitude da coordenada 2: ");
        longitude2 = Math.toRadians(sc.nextDouble());

        distanciaFinal = raioTerra * Math.acos(
                Math.sin(latitude1) * Math.sin(latitude2) + Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longitude1 - longitude2));

        System.out.println("A distância entre esses pontos é: " + distanciaFinal + " km");

        sc.close();
    }
}