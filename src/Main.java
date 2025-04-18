import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> candidatos = new HashMap<>();

        for (int i = 0; i < 6; i++) { //entrada de 10 nomes e salário dos candidatos
            System.out.println("Digite o nome do candidato " + i + ":");
            String nome = scanner.nextLine();
            System.out.println("Digite o salário do candidato:");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha
            candidatos.put(nome, salario);
        }
        System.out.println("Lista de candidatos cadastrados:");
        for (String nome : candidatos.keySet()) {
            System.out.println("- " + nome);
        }

        // Exibindo os candidatos e seus salários
        System.out.print("\nDigite o nome do candidato para exibir o salário: ");
        String candidatoConsulta = scanner.nextLine();

        if (candidatos.containsKey(candidatoConsulta)) {
            System.out.println("Candidato: " + candidatoConsulta + ", Salário: " + candidatos.get(candidatoConsulta));
        } else {
            System.out.println("Candidato não encontrado.");

            scanner.close();
        }
    }
}



