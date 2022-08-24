import java.util.Scanner;
public class Lista2Ex10
{
   public static void main(String args[]){
       int nota;
       
       Scanner input = new Scanner(System.in);
       
       System.out.println("Informe uma nota com pontuação de 0 a 10: ");
       nota = input.nextInt();       
       
       if(nota<0 || nota>10){
           System.out.println("A nota deve possuir pontuação de 0 a 10");
       }
       else{
           if(nota>=9){
               System.out.print("Seu conceito foi: A");
           }
           else if(nota>=7 && nota<=8.9){
               System.out.print("Seu conceito foi: B");
           }
           else if(nota>=5 && nota<=6.9){
               System.out.print("Seu conceito foi: C");
           }
           else if(nota>=3 && nota<=4.9){
               System.out.print("Seu conceito foi: D");
           }
           else{
               System.out.print("Seu conceito foi: E");
           }
       }
   }
}
