import java.util.Scanner;
public class Ex11Lista2{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int hi,mi,hf,mf,duracao;
        
        System.out.println("Informe a hora e o minuto inicial do jogo: ");
        hi = input.nextInt();
        mi = input.nextInt();
        
        if(hi<0 || hi>23 || mi<0 || mi>59){
            System.out.println("O Horário inicial do jogo inválido");
        }
        else{
            System.out.println("Informe a hora e o minuto finais do jogo: ");
            hf = input.nextInt();
            mf = input.nextInt();
             if(hi<0 || hi>23 || mi<0 || mi>59){
            System.out.println("O Horário final do jogo inválido");
        }
            else{
                mi = hi * 60 + mi;
                mf = hf * 60 + mf;
                if(mi<mf){
                    duracao = mf - mi;
                    System.out.println(duracao/60 + " horas " + duracao%60 + " minutos ");
                }
                else{
                    duracao = 24 * 60 - mi + mf;
                    System.out.println(duracao/60 + " horas " + duracao%60 + " minutos ");
                }
            }
        }    
    }
