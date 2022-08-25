import java.util.Scanner;
public class Lista2Ex11
{
   public static void main(String args[]){ 
       int horasinicio,minutosinicio,horasfinal,minutosfinal,duracaomin,duracaoh;
       
       Scanner input = new Scanner(System.in);
       System.out.print("Informe as horas do inicio do jogo: ");
       horasinicio = input.nextInt();
       System.out.print("Informe os minutos do inicio do jogo: ");
       minutosinicio = input.nextInt();
       System.out.print("Informe as horas do final do jogo: ");
       horasfinal = input.nextInt();
       System.out.print("Informe os minutos do final do jogo: ");
       minutosfinal = input.nextInt();
       
       duracaoh = horasfinal - horasinicio;
       duracaomin = minutosfinal - minutosinicio;
       
       if(horasfinal>=horasinicio && minutosfinal >=minutosinicio){
       System.out.println("A duração da partida foi de: " + duracaoh + " horas e " + duracaomin + " minutos"); 
       }
       else{
            System.out.println("A duração da partida foi de: " + Math.abs(duracaoh+24) + " horas e " + Math.abs(duracaomin+24) + " minutos");
       }
       
    }
}
