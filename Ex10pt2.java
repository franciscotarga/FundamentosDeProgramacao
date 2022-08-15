import java.util.Scanner;
public class Ex10pt2
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int tempo,horas,sobrahoras,minutos,sobraminutos,segundos;
        System.out.print("Informe um tempo em segundos: ");
        tempo = input.nextInt();
        horas = tempo/3600;
        minutos = tempo%3600/60;
        segundos = tempo%3600%60;
        System.out.println("O valor em segundos equivale a: " +horas+ " Horas " + minutos + " Minutos e " + segundos + " Segundos");
    }
}
