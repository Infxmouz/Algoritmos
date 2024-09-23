package grausangulo;
import java.util.Scanner;

public class GrausAngulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em graus para o ângulo: ");
        double graus = scanner.nextDouble();

        double radianos = graus * (Math.PI / 180);

        double seno = Math.sin(radianos);
        double cosseno = Math.cos(radianos);
        double tangente = Math.tan(radianos);

        System.out.printf("Seno: %.4f\n", seno);
        System.out.printf("Cosseno: %.4f\n", cosseno);
        System.out.printf("Tangente: %.4f\n", tangente);
    }
    
}
