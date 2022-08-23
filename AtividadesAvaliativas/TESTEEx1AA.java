import java.util.Scanner;
public class TESTEEx1AA
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
        caixas = (int) (bolinhasGude/55.0); //Utiliza-se (int) ao invés de Math.ceil() para arrendondar o valor de caixas. Importante lembrar que este recurso transforma apenas o tipo do cálculo e não o tipo da variável.
        System.out.print("Serão necessárias: " + caixas + " caixas");
    }
}
