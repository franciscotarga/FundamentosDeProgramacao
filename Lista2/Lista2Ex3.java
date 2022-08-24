import java.util.Scanner;
public class Lista2Ex3
{
   public static void main(String args[]){
       Double altura;
       int sexo;
       Scanner input = new Scanner(System.in);
       
       System.out.println("Informe seu Sexo, digite 1 para feminino e 2 para masculino");
       sexo = input.nextInt();
       
       System.out.println("Informe sua altura em metros");
       altura = input.nextDouble();
       
       if(sexo == 1){
           System.out.print("Seu peso ideal é igual a: " + (62.1*altura-44.7));
       }
       else{
           System.out.print("Seu peso ideal é igual a: " + (72.7*altura-58) + " kg");
       }
   }
}
