import java.util.Scanner;

public class quiz {
    public static void main (String [] args) {
        Scanner ed = new Scanner (System.in);
        
        //Quiz de 4 perguntas.
        
        int pontuacao = 0;
        String resposta;

        System.out.println("Agora vamos fazer um pequeno quiz para testar seus conhecimentos sobre financias.");
        System.out.println(" 1. O que significa o conceito de “juros compostos” em finanças?");
        System.out.println("  A) Juros calculados apenas sobre o valor principal investido");
        System.out.println("  B) Juros aplicados ao valor principal e também aos juros acumulados anteriormente");
        System.out.println("  C) Juros calculados apenas sobre o valor das dívidas");
        System.out.println("  D) Juros fixos aplicados mensalmente sem variação");
        System.out.print("Escolha sua resposta: ");
        resposta = ed.nextLine().toUpperCase();

        switch (resposta) {
            case "B":
                pontuacao++;
                System.out.println("Correto!\n");
                break;
            default:
                System.out.println("Errado. A resposta correta é B.\n");
        }

        System.out.println("2. Qual é a principal diferença entre 'poupança' e 'investimento'?");
        System.out.println("A) Poupança oferece maior risco e maior retorno que investimentos");
        System.out.println("B) Poupança é a reserva para emergências, enquanto investimento é dinheiro utilizado para pagar dívidas");
        System.out.println("C) Poupança é uma aplicação segura com menor retorno, enquanto investimentos buscam maior rentabilidade com diferentes níveis de risco");
        System.out.println("D) Poupança sempre gera mais lucro do que qualquer tipo de investimento");
        System.out.print("Escolha sua resposta: ");
        resposta = ed.nextLine().toUpperCase();

        switch (resposta) {
            case "C":
                pontuacao++;
                System.out.println("Correto!\n");
                break;
            default:
                System.out.println("Errado. A resposta correta é C.\n");
        }

        System.out.println("3. Se você estiver endividado, qual é o passo mais recomendável para começar a se recuperar financeiramente?");
        System.out.println("A) Pegar um empréstimo maior para cobrir todas as dívidas");
        System.out.println("B) Continuar pagando apenas o valor mínimo de suas dívidas");
        System.out.println("C) Priorizar o pagamento das dívidas com juros mais altos e evitar novas dívidas");
        System.out.println("D) Aumentar os gastos para ter mais benefícios financeiros");
        System.out.print("Escolha sua resposta: ");
        resposta = ed.nextLine().toUpperCase();

        switch (resposta) {
            case "C":
                pontuacao++;
                System.out.println("Correto!\n");
                break;
            default:
                System.out.println("Errado. A resposta correta é C.\n");
        }

        System.out.println("4. O que significa o termo “liquidez” em finanças pessoais?");
        System.out.println("A) A facilidade com que um ativo pode ser transformado em dinheiro sem perda significativa de valor");
        System.out.println("B) A quantidade de dinheiro disponível em uma conta de poupança");
        System.out.println("C) O tempo que um investimento leva para gerar lucros");
        System.out.println("D) A taxa de retorno que um investimento oferece anualmente");
        System.out.print("Escolha sua resposta: ");
        resposta = ed.nextLine().toUpperCase();

        switch (resposta) {
            case "A":
                pontuacao++;
                System.out.println("Correto!\n");
                break;
            default:
                System.out.println("Errado. A resposta correta é A.\n");
        }

        // Resultado final
        System.out.println("Você acertou " + pontuacao + " de 4 perguntas.");

        System.out.println("\nPoupança é uma conta bancaria para guardar dinheiro de forma segura, permitindo que o titular receba\n"
        +"um pequeno rendimento sobre o valor depositado. O funcionamento é simples: Basta colocar um valor inicial na conta e\n"
        +"depositar um valor menor mensalmente, e o banco escolhido deve pagar os juros com base no saldo na conta.\n"
        +"No Brasil, o rendimento varia de acordo com a Taxa Selic, a taxa Selic atualmente está em 10,75%, logo, de acordo com a regra,\n"
        +"ela irá render 0,5% ao mês mais a Taxa Referencial (TR).\n");
    }
}