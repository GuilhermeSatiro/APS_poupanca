import java.util.Scanner;

public class orcamento {
    public static void main(String[] args) {
        Scanner ed = new Scanner (System.in);
        
        //codigo para calculo do orcamento.
        
        double receita, despesa, resto;

        System.out.print("insira sua receita atual: ");
        receita = ed.nextDouble();

        System.out.print("insira suas despesas atuais: ");
        despesa = ed.nextDouble();

        resto = receita - despesa;

        if (resto >= receita/2) {
            System.out.println(" Você economizou "+resto+". Muito bem, continue assim,\n"
            +" e aqui vão algumas dicas para continuar nesse caminho:\n\n"
            +"  - Priorize os despesas essenciais, como contas e emprestimos, e evite gastos desnecessarios.\n"
            +"  - Tente guardar um pouco do saldo positivo para investimentos ou reserva de emergência.\n"
            +"  - Mantenha o controle financeiro para seus objetivos futuros, como a compra de uma casa.\n"
            +"  - Se recompesse por suas disciplina, mas sem exageros.");
        } else if (resto > 0 && resto < receita/2 ) {
            System.out.println(" Você economizou "+resto+". Muito bem, porem a economia está muito proxíma das despesas,\n"
            +" aqui vão algumas dicas para tentar economizar mais:\n\n"
            +"  - Reveja seus gastos para localizar onde é possivel cortar despesas.\n"
            +"  - Priorize os despesas essenciais, como contas e emprestimos, e evite gastos desnecessarios.\n"
            +"  - Crie um palno de semanal para reorganizar suas financias ao pouco.\n"
            +"  - Utilize ferramentas finaneiras para acompanhar seus gastos.");
        } else {
            System.out.println(" Você economizou "+resto+". Notamos que a conta não fecha,\n"
            +" aqui vão algumas dicas para economizar e recuperar o controle:\n\n"
            +"  - Reveja seus gastos para localizar onde é possivel cortar despesas.\n"
            +"  - Priorize os despesas essenciais, como contas e emprestimos, e evite gastos desnecessarios.\n"
            +"  - Crie um palno de semanal para reorganizar suas financias ao pouco.\n"
            +"  - Utilize ferramentas finaneiras para acompanhar seus gastos.");
        }
    }
}
