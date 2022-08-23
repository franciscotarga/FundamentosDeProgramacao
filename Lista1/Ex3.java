public class Ex3
{
   public static void main(String args[]){
       double valorDaCompra = 19.93;
       double pagamento = 20.0;
       double diferenca = (pagamento - valorDaCompra);
       System.out.format("Diferença = " + "%.2f",diferenca);
   }
}

//  Ao invés de usar System.out.print para mostrar o valor da diferença,usei a função System.out.format, que oferece diversas formas de formatação para o print
//, nesse caso, utilizamos "%.2f", limitando o número de casas decimais para duas. 