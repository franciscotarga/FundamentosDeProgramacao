import java.util.Scanner;
public class Ex4
{
   public static void main(String args[]){
       Scanner input = new Scanner(System.in);
       double area,raio;
       
       System.out.print("Informe o raio desejado: ");
       raio = input.nextDouble();
       area = (4*Math.PI)*(Math.pow(raio,2));
       System.out.format("A área de uma esfera de raio igual a " + raio + " é " + "%.3f",area);
   }
}
//Importada biblioteca Scanner para solicitar o input do valor do raio por parte do usuário.
//Utilizada função System.out.format com 3 casas decimais para melhorar visualização do resultado. 