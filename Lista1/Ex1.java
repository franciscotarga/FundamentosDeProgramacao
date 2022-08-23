//O Exercício 1 da lista questiona a respeito dos tipos de primitivos, seu tamanho (memória ocupada) e valores de representação. Ao executar o código abaixo, obtemos as respectivas respostas.

public class Ex1
{
    public static void main(String args[]){
        System.out.println("O tipo int utiliza 4 bytes e consegue representar valores inteiros de : " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
        System.out.println("O tipo double utiliza 8 bytes e consegue representar valores reais de : " + Double.MIN_VALUE + " a " + Double.MAX_VALUE);
        System.out.println("O tipo byte utiliza 1 byte e seu intervalo de representação é: " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
        System.out.println("O tipo short utiliza 2 bytes e consegue representar valores inteiros de : " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);
        System.out.println("O tipo long utiliza 8 bytes e consegue representar valores inteiros de : " + Long.MIN_VALUE + " a " + Long.MAX_VALUE);
        System.out.println("O tipo boolen utiliza 1 bit e consegue representar apenas os valores de True ou False");
        System.out.println("O tipo char utiliza 2 bytes e consegue representar apenas um caractere : " + Character.MIN_VALUE + " a " + Character.MAX_VALUE);
        System.out.println("O tipo float utiliza 4 bytes e consegue representar valores reais de " + Float.MIN_VALUE + " a " + Float.MAX_VALUE + " ,porém, com menos precisão que o tipo double");
    }
}

