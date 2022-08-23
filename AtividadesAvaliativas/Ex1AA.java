import java.util.Scanner;
public class Ex1AA
{
    public static void main(String args[]){
        int bolinhasGude;
        double valor,precoFinal,caixas;

        System.out.println("Bem-Vindo(a) a loja de brinquedos do aluno Francisco Targa!");
        Scanner input = new Scanner(System.in);
        System.out.println("Informe quantas bolinhas você deseja comprar ");
        bolinhasGude = input.nextInt();
        System.out.println("Informe o valor de cada bolinha");
        valor = input.nextDouble();
        precoFinal = (bolinhasGude*valor);
        System.out.println("O valor para " + bolinhasGude + " bolinhas de gude é de: " + precoFinal);
        caixas = Math.ceil(bolinhasGude/55.0);
        System.out.print("Serão necessárias: " + caixas + " caixas");
    }
}
