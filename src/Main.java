import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> candidatos = new HashMap<>();
        //gerando variáveis
        double salarioBase = 2000;
        double salario = 0;
        // entrada de dados usando scanner.
        for (int i = 0; i < 6; i++) { //entrada de 10 nomes e salário dos candidatos
            System.out.println("Digite o nome do candidato " + i + ":");
            String nome = scanner.nextLine();
            System.out.println("Digite o salário do candidato:");
            salario = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha
            candidatos.put(nome, salario);
        }
        // transformando Hashmap em array para posterior consulta
        List<String> nome = new ArrayList<>(candidatos.keySet());
        List<Double> salarios = new ArrayList<>(candidatos.values());
        System.out.println("Lista de candidatos inscritos:");
        for ( int i =0; i < nome.size(); i++) { //gerando lista de candidatos para facilitar consulta
            System.out.println("Candidato Nº 0" + i + ": " + nome.get(i));
        }


        // consutando os candidatos e seus salários.
        for (int tent = 0; tent < 4; tent++) {
            System.out.print("\nDigite o nome do candidato para exibir o salário: ");
            String candidatoConsulta = scanner.nextLine();

            if (candidatos.containsKey(candidatoConsulta)) { //verificando consulta e imprimindo resultado
                System.out.println("Candidato: " + candidatoConsulta + ", Salário: " + candidatos.get(candidatoConsulta));
            } else {
                System.out.println("Candidato não encontrado.");
            }
        }
        // seleção de cansdidatos pelo salário base.
        System.out.println("Canditatos selecionadoa por se enquadrar na faixa salarial:");
        int selecionados = 0;
        for (String nomes : candidatos.keySet()) {
            double salarioPretendido = candidatos.get(nomes);
            if (salarioPretendido <= salarioBase) {
                System.out.println("- " + nomes + " (R$" + salarioPretendido + ")");
                selecionados++;
            }
        }
        if (selecionados == 0) {
            System.out.println("Nenhum candidato foi selecionado.");
        }
        scanner.close();

    }
}



