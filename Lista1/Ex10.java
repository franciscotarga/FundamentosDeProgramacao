import java.util.Scanner;
public class Ex10
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double tempo,horas,sobrahoras,minutos,sobraminutos,segundos;
        System.out.print("Informe um tempo em segundos: ");
        tempo = input.nextDouble();
        horas = tempo/3600.0;
        sobrahoras = (horas-Math.floor(horas));
        minutos = sobrahoras*60.0;
        sobraminutos = (minutos-Math.floor(minutos));
        segundos = (sobraminutos*60);
        System.out.println("O valor em segundos equivale a: " +Math.floor(horas)+ " Horas " + minutos + " Minutos e " + segundos + " Segundos");
    }
}
