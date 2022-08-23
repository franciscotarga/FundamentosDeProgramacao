import java.util.Scanner;
public class Ex2
{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um valor real: ");
        double valor = entrada.nextDouble();
        System.out.println("Resultado de floor(" + valor+ ")=" + Math.floor(valor));
        System.out.println("Resultado de ceil(" + valor+ ")=" + Math.ceil(valor));
        System.out.println("Resultado de round(" + valor+ ")=" + Math.round(valor));
}
    }

    //Função Math.floor() --> Retorna um valor matemáticamente inteiro (em Double) que é menor ou igual ao valor do input. Ex: Math.floor(25.2) = 25.0
    //Função Math.ceil() --> Retorna o maior valor matemáticamente inteiro (em Double) que é maior ou igual ao valor do input. Ex: Math.ceil(25.2) = 26.0
    //Função Math.round() --> Retorna o menor valor (em Integer) em relação ao valor inputado. Ex: Math.round(25.2) = 25