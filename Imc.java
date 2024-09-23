package imc;
import java.util.Scanner;

public class Imc {

    
    public static void main(String[] args) {
        // TODO code application logic her
        double peso, altura;
        
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite o seu peso!");
        peso = leia.nextDouble();
        System.out.println("Digite sua altura!");
        altura = leia.nextDouble();
        
        double imc;
        imc = peso / (altura*altura);
        System.out.println("O IMC da pessoa é: " + imc + " Kg/m² ");      
    }
    
}
