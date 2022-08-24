import java.util.Scanner;
public class Lista2Ex7
{
   public static void main(String args[]){
       Double preco;
       
       Scanner input = new Scanner(System.in);
       System.out.println("Informe o preço de custo do produto: ");
       preco = input.nextDouble();
       
       if(preco<10){
           System.out.print("O lucro foi de 70%, ou seja: " + (preco*0.7));
       }
       else if(preco>=10 && preco<30){
           System.out.print("O lucro foi de 50%, ou seja: " + (preco*0.5));
       }
       else if(preco>=30 && preco<50){
           System.out.print("O lucro foi de 40%, ou seja: " + (preco*0.4));
       }
       else{
           System.out.print("O lucro foi de 30%, ou seja: " + (preco*0.3));
       }
   }
}
