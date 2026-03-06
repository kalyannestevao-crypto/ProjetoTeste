package ProjetoTeste;

import java.util.Scanner;

public class ProjetoTeste {

static double calcularTotal (double horaValor,  double horaTrabalhada) {
        return (horaValor * horaTrabalhada);
    }

static void informacoes (String nomeClie, String descriProblema, double horaValor, double horaTrabalhada, double horaTotal) {
        System.out.println("Nome do cliente: " + nomeClie);
        System.out.println("Descrição do problema: " + descriProblema);
        System.out.println("Valor da hora trabalhada: R$" + horaValor); 
        System.out.println("Quantidade de horas trabalhadas: " + horaTrabalhada);
        System.out.println("Valor total a ser pago: R$" + horaTotal);
    }

    public static void main(String[] args) {

        //Variáveis

        String nomeClie, descriProblema;
        Double horaValor, horaTrabalhada, horaTotal;

        //Usuario interage

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente:");
        nomeClie = scanner.nextLine();

        System.out.println("Digite a descrição do problema:");
        descriProblema = scanner.nextLine();

        System.out.println("Digite o valor da hora trabalhada:");
        horaValor = scanner.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas:");
        horaTrabalhada = scanner.nextDouble();

        //Calculo do total de horas trabalhadas

        horaTotal = calcularTotal( horaValor, horaTrabalhada);

        informacoes(nomeClie, descriProblema, horaValor, horaTrabalhada, horaTotal);









        scanner.close();
    }
} 