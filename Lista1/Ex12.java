import java.util.Scanner;
public class Ex12
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int reais,cem,cinquenta,vinte,dez,cinco,dois,um;
        reais = input.nextInt();
        cem = reais/100;
        System.out.println(cem + " Notas de 100");
        cinquenta = reais%100/50;
        System.out.println(cinquenta + " Notas de 50");
        vinte = reais%50/20;
        System.out.println(vinte + " Notas de 20");
        dez = reais%20/10;
        System.out.println(dez + " Notas de 10");
        cinco = reais%10/5;
        System.out.println(cinco + " Notas de 5");
        dois = reais%5/2;
        System.out.println(dois + " Notas de 2");
        um = reais%5;
        System.out.println(um + " Notas de 1");
    }
}