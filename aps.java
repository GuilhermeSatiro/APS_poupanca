import java.util.Scanner;

public class aps {
    public static void main (String [] args) {
        Scanner ed = new Scanner (System.in);
        String nome, enter;

        System.out.println("Bem vindo(a) para a FinHelp, o aplicativo para saber tudo sobre o financeiro");
        System.out.print("Antes de iniciar, qual é o seu nome?: ");
        nome = ed.nextLine();
        System.out.println("Seja bem vindo "+nome+", estamos lisonjeados que escolheu nosso programa para calcular seus gastos financeiros");
        System.out.println("Vamos começar calculando seu orçamento mensal.\n");
        
        //codigo para calculo do orcamento.
        
        double receita, despesa, resto;

        System.out.print("Insira sua receita atual (salário, investimentos, etc): ");
        receita = ed.nextDouble();
        
        System.out.print("Insira suas despesas atuais(aluguel, empréstimos, mercado, etc): ");
        despesa = ed.nextDouble();
        
        resto = receita - despesa;
        
        if (resto >= receita/2) {
            System.out.println(" Você economizou "+resto+". Muito bem, continue assim,\n"
            +" e aqui vão algumas dicas para continuar nesse caminho:\n"
            +"  - Priorize os despesas essenciais, como contas e emprestimos, e evite gastos desnecessários.\n"
            +"  - Tente guardar um pouco do saldo positivo para investimentos ou reserva de emergência.\n"
            +"  - Mantenha o controle financeiro para seus objetivos futuros, como a compra de uma casa.\n"
            +"  - Se recompense por suas disciplina, mas sem exageros.");
        } else if (resto > 0 && resto < receita/2 ) {
            System.out.println(" Você economizou "+resto+". Muito bem, porém o valor do restante está próximo das despesas,\n"
            +" aqui vão algumas dicas para tentar economizar mais:\n"
            +"  - Reveja seus gastos para localizar onde é possível cortar despesas.\n"
            +"  - Priorize os despesas essenciais, como contas e empréstimos, e evite gastos desnecessários.\n"
            +"  - Crie um plano de semanal para reorganizar suas finanças ao pouco.\n"
            +"  - Utilize ferramentas financeiras para acompanhar seus gastos.");
        } else {
            System.out.println(" Você economizou "+resto+". Notamos que a conta não fecha,\n"
            +" aqui vão algumas dicas para economizar e recuperar o controle:\n"
            +"  - Reveja seus gastos para localizar onde é possivel cortar despesas.\n"
            +"  - Priorize os despesas essenciais, como contas e empréstimos, e evite gastos desnecessários.\n"
            +"  - Crie um palno de semanal para reorganizar suas financias ao pouco.\n"
            +"  - Utilize ferramentas financeiras para acompanhar seus gastos.");
        }
        ed.nextLine();

        System.out.print("\nPressione a tecla Enter para continuar:");
        enter = ed.nextLine();
        
        
        System.out.println("\nAgora vamos entender o que é poupança.");
        System.out.println("\nPoupança é uma conta bancária para guardar dinheiro de forma segura, permitindo que o titular receba\n"
        +"um pequeno rendimento sobre o valor depositado. O funcionamento é simples: Basta colocar um valor inicial na conta e\n"
        +"depositar um valor menor mensalmente, e o banco escolhido deve pagar os juros com base no saldo na conta.\n"
        +"No Brasil, o rendimento varia de acordo com a Taxa Selic, que atualmente está em 10,75% ao ano, logo, de acordo com a regra,\n"
        +"ela irá render 0,5% ao mês mais a Taxa Referencial (TR), atualmente em 0,07 ao mês.\n");
        System.out.println("Agora vamos fazer uma simulação de poupança:");
        
        //codigo para fazer o calculo da poupança com a TR.
        
        int ValorInicial, ValorMensal, tempo;
        double taxa = 10.75, rendimentoMensal;
        double taxaTR = 0.07 / 100;
        String continua;

        do {
            System.out.print("Insira o valor inicial(R$): ");
            ValorInicial = ed.nextInt();

            System.out.print("Insira o depósito mensal(R$): ");
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

            System.out.printf("\nSaldo final após %d meses: R$ %.2f%n", tempo, saldoFinal);
            System.out.print("Deseja fazer outra simulação de poupança(S/N)?: ");
            continua = ed.next();

        } while (continua.equalsIgnoreCase("S"));

        ed.nextLine();

        //Quiz de 4 perguntas.
        
        int pontuacao = 0;
        String resposta;

        System.out.println("\nAgora vamos fazer um pequeno quiz para testar seus conhecimentos sobre finanças.\n");
        System.out.println(" 1. O que significa o conceito de juros compostos em finanças?");
        System.out.println("  A) Juros calculados apenas sobre o valor principal investido");
        System.out.println("  B) Juros aplicados ao valor principal e também aos juros acumulados anteriormente");
        System.out.println("  C) Juros calculados apenas sobre o valor das dívidas");
        System.out.println("  D) Juros fixos aplicados mensalmente sem variação");
        System.out.print("  Escolha sua resposta: ");
        resposta = ed.nextLine().toUpperCase();

        switch (resposta) {
            case "B":
                pontuacao++;
                System.out.println("  Correto!\n");
                break;
            default:
                System.out.println("  Errado. A resposta correta é B, pois juros compostos são calculados sobre o valor principal e\n"
                +"sobre os juros acumulados anteriormente, o que faz com que os ganhos aumentem progressivamente.\n");
        }

        System.out.println(" 2. Qual é a principal diferença entre 'poupança' e 'investimento'?");
        System.out.println("  A) Poupança oferece maior risco e maior retorno que investimentos");
        System.out.println("  B) Poupança é a reserva para emergências, enquanto investimento é dinheiro utilizado para pagar dívidas");
        System.out.println("  C) Poupança é uma aplicação segura com menor retorno, enquanto investimentos buscam maior rentabilidade com diferentes níveis de risco");
        System.out.println("  D) Poupança sempre gera mais lucro do que qualquer tipo de investimento");
        System.out.print("  Escolha sua resposta: ");
        resposta = ed.nextLine().toUpperCase();

        switch (resposta) {
            case "C":
                pontuacao++;
                System.out.println("  Correto!\n");
                break;
            default:
                System.out.println("  Errado. A resposta correta é C, pois a poupança é uma aplicação de baixo risco e menor retorno,\n"
                +"enquanto investimentos podem oferecer maior rentabilidade, mas com diferentes níveis de risco.\n");
        }

        System.out.println(" 3. Se você estiver endividado, qual é o passo mais recomendável para começar a se recuperar financeiramente?");
        System.out.println("  A) Pegar um empréstimo maior para cobrir todas as dívidas");
        System.out.println("  B) Continuar pagando apenas o valor mínimo de suas dívidas");
        System.out.println("  C) Priorizar o pagamento das dívidas com juros mais altos e evitar novas dívidas");
        System.out.println("  D) Aumentar os gastos para ter mais benefícios financeiros");
        System.out.print("  Escolha sua resposta: ");
        resposta = ed.nextLine().toUpperCase();

        switch (resposta) {
            case "C":
                pontuacao++;
                System.out.println("  Correto!\n");
                break;
            default:
                System.out.println("  Errado. A resposta correta é C, pois priorizar o pagamento das dívidas com juros mais altos ajuda\n"
                +"a reduzir os custos da dívida mais rapidamente e evita novos endividamentos.\n");
        }

        System.out.println(" 4. O que significa o termo “liquidez” em finanças pessoais?");
        System.out.println("  A) A facilidade com que um ativo pode ser transformado em dinheiro sem perda significativa de valor");
        System.out.println("  B) A quantidade de dinheiro disponível em uma conta de poupança");
        System.out.println("  C) O tempo que um investimento leva para gerar lucros");
        System.out.println("  D) A taxa de retorno que um investimento oferece anualmente");
        System.out.print("  Escolha sua resposta: ");
        resposta = ed.nextLine().toUpperCase();

        switch (resposta) {
            case "A":
                pontuacao++;
                System.out.println("  Correto!\n");
                break;
            default:
                System.out.println("  Errado. A resposta correta é A, pois liquidez refere-se à facilidade de converter um ativo em dinheiro rapidamente,\n"
                +"sem perder valor significativo, o que é essencial em emergências financeiras.\n");
        }

        // Resultado final
        System.out.println("  Você acertou " + pontuacao + " de 4 perguntas.");

        System.out.print("\nPressione a tecla Enter para continuar:");
        enter = ed.nextLine();

        System.out.println("\nAgora, você sabe o que é CDB? Ações? Tesouro direto? Possivelmente não");
        System.out.println("Por isso vou lhe dar diversas opções de investimentos, e você irá selecionar aqueles que tiver dúvida");

        //codigo para explicar tipos de investimentos.

        int investimentos;
        String continua2;
        
        do {
            System.out.println(" 1- Ações.");
            System.out.println(" 2- Fundos Imobiliários.");
            System.out.println(" 3- Tesouro Direto.");
            System.out.println(" 4- CDB (Certificado de Depósito Bancário).");
            System.out.println(" 5- Fundos de Investimentos");
            System.out.println(" 6- Poupança.");
            System.out.print(" Escolha de 1 a 6: ");
            investimentos = ed.nextInt();

            switch (investimentos) {
                case 1:
                    System.out.println(" Ao investir em ações, você se torna sócio de uma empresa, podendo lucrar com a valorização e dividendos.\n"
                    +" A liquidez varia de acordo com a ação e a empresa, sendo maior em grandes companhias. O risco é alto, pois o preço das ações oscila bastante no curto prazo.\n"
                    +" No entanto, a rentabilidade pode ser alta no longo prazo, dependendo do desempenho da empresa.");
                    break;
                case 2:
                    System.out.println(" São investimentos em imóveis por meio de cotas negociadas em bolsa, com liquidez geralmente média a alta.\n"
                    +" O risco é moderado, pois depende do mercado imobiliário e da gestão do fundo. A rentabilidade vem de alugueis pagos pelos imóveis e da valorização das cotas,\n"
                    +" com potencial de gerar rendimentos mensais.");
                    break;
                case 3:
                    System.out.println(" Programa do governo que permite a compra de títulos públicos, com liquidez alta, já que podem ser vendidos a qualquer momento. O risco é baixo,\n"
                    +" pois são garantidos pelo governo. A rentabilidade varia conforme o tipo de título, sendo mais previsível e segura em comparação com outros investimentos.");
                    break;
                case 4:
                    System.out.println(" Título emitido por bancos, com liquidez que pode ser diária ou no vencimento. O risco é baixo a moderado, pois o investimento é garantido pelo FGC até R$ 250.000\n"
                    +" A rentabilidade é geralmente atrelada ao CDI, podendo ser interessante, especialmente em prazos mais longos ou bancos menores.");
                    break;
                case 5:
                    System.out.println(" Os fundos reúnem diversos investidores em uma carteira gerida por um gestor. A liquidez e o risco variam de acordo com o tipo de fundo,\n"
                    +"podendo ser de renda fixa (baixo risco) ou ações (alto risco). A rentabilidade também varia, dependendo da composição dos ativos e da estratégia do gestor.");
                    break;
                case 6:
                    System.out.println(" É um dos investimentos mais simples e seguros, com liquidez diária, permitindo resgatar o dinheiro a qualquer momento. O risco é muito baixo, garantido pelo FGC.\n"
                    +" No entanto, a rentabilidade é baixa, geralmente inferior à inflação, o que pode reduzir o poder de compra ao longo do tempo.");
                    break;
                default:
                    System.out.println(" Resposta inválida");
                    break;
            }
            System.out.print("  \nQuer saber sobre outro tipo de investimento(S/N)?: ");
            continua2 = ed.next();
        
        }while (continua2.equalsIgnoreCase("S"));

        int satisfacao;
        System.out.println("\nObrigado por utilizar a FinHelp.");
        System.out.print("Se você pudesse dar uma nota de 1 a 10, qual seria?: ");
        satisfacao = ed.nextInt();

        if (satisfacao >= 8) {
            System.out.println("\nVemos que a avaliação foi positiva, fico feliz que tenha gostado.");
        } else if (satisfacao >= 4) {
            System.out.println("\nVemos que sua avaliação foi moderada, vamos trabalhar para melhorar a experiência.");
        } else {
            System.out.println("\nVemos que a avaliação foi negativa, lamentamos sua experiência e vamos trabalhar para melhorá-la.");
        }

    ed.close();



    }
}