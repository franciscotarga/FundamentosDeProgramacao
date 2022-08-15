import java.util.Scanner;
public class Ex6
{
   public static void main(String args[]){
       Scanner input = new Scanner(System.in);
       double c,f;
       System.out.println("Informe a temperatura em graus Fahrenheit: ");
       f = input.nextDouble();
       c = (5.0/9)*(f-32.0);
       System.out.print(f + " graus Fahrenheit, equivalem a " + c + " graus Celsius");
   }
}
