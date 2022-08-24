import java.util.Scanner;
public class Lista2Ex6
{
    public static void main(String args[]){
        double saldo;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o seu saldo médio: ");
        saldo = input.nextDouble;
        
        if(saldo<500){
            System.out.print("Não há limite");
        }
        else if(saldo>=500 && saldo<=1000){
            System.out.print("Seu limite é de: " + (saldo*0.08));
        }
        else{
            System.out.print("Seu limite é de: " + (saldo*0.15));
        }
    }
}
