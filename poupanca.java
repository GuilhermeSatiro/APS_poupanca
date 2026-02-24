import java.util.Scanner;

public class poupanca {
    public static void main (String [] args) {
        int ValorInicial, ValorMensal, tempo;
        double taxa = 10.75, rendimentoMensal;
        double taxaTR = 0.07 / 100;

        //codigo para fazer o calculo da poupança com a TR.

        Scanner ed = new Scanner (System.in);
        System.out.print("Insira o valor inicial: ");
        ValorInicial = ed.nextInt();

        System.out.print("Insira o deposito mensal: ");
        ValorMensal = ed.nextInt();

        System.out.print("Insira o tempo em meses: ");
        tempo = ed.nextInt();


        double saldoFinal = ValorInicial;

        if (taxa > 8.5) {
            rendimentoMensal = 0.005 + taxaTR;
        } else {
            rendimentoMensal = (0.7 * (taxa/100) / 12);
        }

        for (int mes = 1; mes <= tempo; mes++) {
            saldoFinal += saldoFinal * rendimentoMensal;

            saldoFinal += ValorMensal;

            System.out.printf("Mês %d: Saldo = R$ %.2f%n", mes, saldoFinal);
        }

        System.out.printf("Saldo final após %d meses: R$ %.2f%n", tempo, saldoFinal);
        
    }
}
