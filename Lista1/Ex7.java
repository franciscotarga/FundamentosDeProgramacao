import java.util.Scanner;
public class Ex7
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a,b,soma,diferenca,media,distancia,maior,menor;
        
        System.out.print("Informe um valor inteiro: ");
        a = input.nextInt();
        System.out.print("Informe outro valor inteiro: ");
        b = input.nextInt();
        
        soma = (a+b);
        diferenca = (a-b);
        media = (soma/2);
        distancia = Math.abs(diferenca);
        maior = ((soma + distancia)/2);
        menor = ((soma - distancia)/2);
        
        System.out.print("Soma: " + soma + "\nDiferença: " + diferenca + "\nMédia: " + media + "\nDistância: " + distancia + "\nMenor Valor: " + menor + "\nMaior Valor: " + maior);
    }
}
//Utilizado biblioteca Scanner para receber inputs do usuário
//Utilizado método "\n" para pular linhas