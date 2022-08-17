import java.util.Scanner;
public class Ex12
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int valor,resto;
        
        System.out.print("Informe uma quantia em R$: ");
        valor = input.nextInt(); //456
        
        System.out.println(valor/100 + " Notas de cem");//4
        resto = valor%100;//56
        System.out.println(resto/50 + " Notas de cinquenta");//1
        resto = resto%50;//6
        System.out.println(resto/20 + " Notas de vinte");//0
        resto = resto%20;//0
        System.out.println(resto/10 + " Notas de dez");//0
        resto = resto%10;//0
        System.out.println(resto/5 + " Notas de cinco");//1
        resto = resto%5;//1
        System.out.println(resto/2 + " Notas de dois");//0
        System.out.println(resto%2 + " Notas de um");//1
    }
}
