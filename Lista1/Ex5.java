import java.util.Scanner;
public class Ex5
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double n;
        System.out.println("Digite um valor para n: ");
        n = input.nextDouble();
        System.out.print("Os valores de n**2, n**3 e n**4 são, respectivamente, " + Math.pow(n,2) + ", " + Math.pow(n,3) + " e " + Math.pow(n,4));
    }
}
//Utilização da biblioteca Scanner para receber valores do usuário
//Ao receber um valor double o programa cálcula e mostra o resultado das 3 operações, utilizando a função Math.pow(var,pot)