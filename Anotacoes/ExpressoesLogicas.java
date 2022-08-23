
/**
EXPRESSÕES LÓGICAS

TABELA VERDADE:

    && = E (Só é verdadeiro quando ambas proposições forem verdadeiras)
    || = Ou (Basta 1 ser verdadeiro para a proposição ser verdadeira)
    !variavel = Negação (inverte True e False)


OPERADORES RELACIONAIS:

    >  = Maior
    <  = Menor
    >= = Maior ou Igual
    <= = Menor ou Igual
    == = Igualdade
    != = Diferente

 */

import java.util.Scanner;
public class ExpressoesLogicas {
    public static void main(String args[]){
        int v1,v2;
        
        Scanner input = new Scanner(System.in);
       
        System.out.println("****************\n");
        
        System.out.println("Informe um valor v1: \n");
        v1 = input.nextInt();
        System.out.println("\nO valor de v1 é " + v1);
        
        System.out.println("\nInforme um valor v2: \n");
        v2 = input.nextInt();
        System.out.println("\nO valor de v2 é " + v2);
        
        System.out.println("\n****************\n");
        
        System.out.println("TESTANDO OPERADORES RELACIONAIS\n");
        
        System.out.println("v1 < v2: " + (v1 < v2));
        System.out.println("v1> v2: " + (v1 > v2));
        System.out.println("v1 <= v2: " + (v1 <= v2));
        System.out.println("v1 >= v2: " + (v1 >= v2));
        System.out.println("v1 == v2: " + (v1 == v2));
        
        System.out.println("\n****************\n");
         
        System.out.println("TESTANDO IF\n");
        if(v1 < v2) {
            System.out.println(v2 + " é maior que " + v1);
        }
        else if(v2 < v1) {
            System.out.println(v1 + " é maior que " + v2);
        }
        else {
            System.out.println(v1 + " e " + v2 + " são iguais");
        }
    }
}


