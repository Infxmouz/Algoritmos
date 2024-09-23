package pisoscalculo;
import java.util.Scanner;

public class PisosCalculo {

    public static void main(String[] args) {
       double largura;
       double comprimento;
       double valorUnitario;
       
       Scanner teclado = new Scanner(System.in);
        
       System.out.println("Medida largura:");
       largura = teclado.nextDouble();
       
       System.out.println("Medida comprimento:");
       comprimento = teclado.nextDouble();
       
       System.out.println("Valor da caixa de piso:");
       valorUnitario = teclado.nextDouble();
        
       double areaTotal = largura * comprimento;
       System.out.println("A area é: " + areaTotal);
        
       double caixapisoNesc = areaTotal / 2.5;
       System.out.println("A quantidade caixa de piso necessario é: " + caixapisoNesc);
               
       double custoTotal = valorUnitario * caixapisoNesc;
       System.out.println("O custo é R$:  "  + custoTotal);      
    }
    
}
