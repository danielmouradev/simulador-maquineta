import java.util.Scanner;

public class SimuladorMaquineta {
    public static void main(String[] args) {
        System.out.println("SIMULADOR DE MAQUINETA \n");

        double valorCred, valorTotDeb, juros, valorparc, totdeb;
        char resp;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        valorCred = leitor.nextDouble();
        System.out.println("Débito(D) ou crédito(C): ");
        resp = leitor.next().charAt(0);

        if (resp == 'D') {
            totdeb = (valorCred * 0.0199) + valorCred;
            System.out.println("Valor total da compra + aditivo de juros: " + totdeb);

        } else if (resp == 'C') {

            for (int parcela = 1; parcela <= 12; parcela++) {
                valorTotDeb = (100 * valorCred) / 100 - 0.03;
                juros = (0.03 * valorCred) / 100;
                valorparc = valorTotDeb / parcela + juros;
                System.out.println("Parcela " + parcela + " R$ " + valorparc);
            }
        }
    }
}