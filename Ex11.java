import java.util.Scanner;
public class Ex11
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int valor,primeiro,segundo,terceiro,quarto,sobra1,sobra2;
        System.out.print("Informe um valor inteiro de 4 digitos: ");
        valor = input.nextInt();
        primeiro = valor%10;
        sobra1 = valor/10;
        segundo = sobra1%10;
        sobra2 = valor/100;
        terceiro = sobra2%10;
        quarto = valor/1000;
        System.out.print(primeiro+""+segundo+""+terceiro+""+quarto);
    }
}
