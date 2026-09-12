

import Oficina.Sistema.Oficina;
import Oficina.modelo.OrdemServico;
import Oficina.modelo.ServicoSimples;
import Oficina.modelo.ServicoComplexo;
import Oficina.modelo.TipoVeiculo;
import Oficina.modelo.TelefoneInvalidoException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Oficina oficina = new Oficina();

        int opcao = -1;

        while (opcao != 5) {
            System.out.println("\n===== OFICINA MECÂNICA =====\n" +
                    "1 - Abrir ordem de serviço simples\n" +
                    "2 - Abrir ordem de serviço complexo\n" +
                    "3 - Listar todas as ordens\n" +
                    "4 - Buscar ordem por telefone\n" +
                    "5 - Sair\n" +
                    "Escolha uma opção:");

            String entradaOpcao = sc.nextLine();
            opcao = Integer.parseInt(entradaOpcao);

            switch (opcao) {
                case 1:
                    try {
                        System.out.print("Nome do cliente: ");
                        String nome = sc.nextLine();

                        System.out.print("Telefone: ");
                        String telefone = sc.nextLine();

                        System.out.print("Valor das peças: ");
                        double valorPecas = Double.parseDouble(sc.nextLine());

                        System.out.print("Tipo de veículo (CARRO, MOTO, CAMINHAO): ");
                        TipoVeiculo tipoVeiculo = TipoVeiculo.valueOf(sc.nextLine().toUpperCase());

                        OrdemServico ordem = new ServicoSimples(nome, telefone, valorPecas, tipoVeiculo);
                        oficina.abrirOrdem(ordem);

                    } catch (TelefoneInvalidoException e) {
                        System.out.println("Erro: " + e.getMessage());
                    } finally {
                        System.out.println("Tentativa de abertura de ordem finalizada.");
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Nome do cliente: ");
                        String nome = sc.nextLine();

                        System.out.print("Telefone: ");
                        String telefone = sc.nextLine();

                        System.out.print("Valor das peças: ");
                        double valorPecas = Double.parseDouble(sc.nextLine());

                        System.out.print("Tipo de veículo (CARRO, MOTO, CAMINHAO): ");
                        TipoVeiculo tipoVeiculo = TipoVeiculo.valueOf(sc.nextLine().toUpperCase());

                        OrdemServico ordem = new ServicoComplexo(nome, telefone, valorPecas, tipoVeiculo);
                        oficina.abrirOrdem(ordem);

                    } catch (TelefoneInvalidoException e) {
                        System.out.println("Erro: " + e.getMessage());
                    } finally {
                        System.out.println("Tentativa de abertura de ordem finalizada.");
                    }
                    break;

                case 3:
                    oficina.listarOrdens();
                    break;

                case 4:
                    System.out.print("Digite o telefone do cliente: ");
                    String telefoneBusca = sc.nextLine();

                    OrdemServico ordemEncontrada = oficina.buscarPorTelefone(telefoneBusca);
                    if (ordemEncontrada == null) {
                        System.out.println("Ordem não encontrada.");
                    } else {
                        System.out.println(ordemEncontrada);
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o sistema da oficina... Total de ordens abertas: " + oficina.getTotalOrdens());
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}