/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemanotasescolares;
import java.util.*;

/**
 *
 * @author alxdr
 */
public class SistemaNotasEscolares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        List<Double> medias = new ArrayList<>();
        List<String> situacoes = new ArrayList<>();
        
        while (true) {
            System.out.println("\n=== SISTEMA DE NOTAS ESCOLARES ===");
            System.out.println("[1] Cadastrar aluno");
            System.out.println("[2] Listar aluno");
            System.out.println("[3] Sair");
            System.out.println("Escolha uma opção: ");
            
            int opcao = teclado.nextInt();
            teclado.nextLine();
            
            switch (opcao) {
                case 1:
                    //logica
                    System.out.print("Nome do aluno: ");
                    String nome = teclado.nextLine();
                    //teclado.nextLine();
                    
                    System.out.print("Quantas notas deseja inserir: ");
                    int qtdNotas = teclado.nextInt();
                    teclado.nextLine();
                    
                    double soma = 0;
                    for (int i = 0; i < qtdNotas; i++) {
                        System.out.print("Digite a nota " + (i + 1) + ": ");
                        soma += teclado.nextDouble();
                    }
                    
                    double media = soma/qtdNotas;
                    
                    String situacao;
                    
                    if (media >= 7) {
                        situacao = "Aprovado";
                    } else if (media >= 5) {
                        situacao = "Recuperação";
                    } else {
                        situacao = "Reprovado";
                    }
                    
                    nomes.add(nome);
                    medias.add(media);
                    situacoes.add(situacao);
                    
                    System.out.println("Aluno cadastrado com sucesso!\n");                    
                    break;
                case 2:
                    //logica
                    if (nomes.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado ainda.\n");
                    } else {
                        System.out.println("\n=== LISTA DE ALUNOS ===");
                        for (int i = 0; i < nomes.size(); i++) {
                            System.out.println("Aluno: " + nomes.get(i));
                            System.out.println("Média: " + medias.get(i));
                            System.out.println("Situação: " + situacoes.get(i));
                            System.out.println("--------------------------");
                        }
                    }                    
                    break;
                case 3:
                    System.out.println("Encerrando o sistema...");
                    teclado.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
    
}
