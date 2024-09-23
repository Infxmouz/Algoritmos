package media_quatro_valores;
import java.util.Scanner;

public class Media_quatro_valores {
    
    public static void main(String[] args) {
        // TODO code application logic here
        double n1, n2, n3, n4, media;
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite o 1º valor: ");
        n1 = leia.nextDouble();
        System.out.println("Digite o 2º valor: ");
        n2 = leia.nextDouble();
        System.out.println("Digite o 3º valor: ");
        n3 = leia.nextDouble();
        System.out.println("Digite o 4º valor: ");
        n4 = leia.nextDouble();
        media = (n1+n2+n3+n4)/ 4;
        System.out.println("A média dos valores é: " + media);
                
    }
    
}
