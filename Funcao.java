package funcao;
import java.util.Scanner;

public class Funcao {

    public static void main(String[] args) {       
        // TODO code application logic here
        double x, y;
        Scanner leia = new Scanner (System.in);
        System.out.println("Entre com o valor de x: ");
        x = leia.nextDouble();
        y = 3 + 2*x;
        System.out.println(" y= " + y);
        
    }
    
}
