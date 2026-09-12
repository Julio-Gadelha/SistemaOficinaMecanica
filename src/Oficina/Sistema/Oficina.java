package Oficina.Sistema;

import Oficina.modelo.OrdemServico;

import java.util.ArrayList;

public class Oficina {

    private ArrayList<OrdemServico> ordens;

    public Oficina() {
        this.ordens = new ArrayList<>();
    }

    public void abrirOrdem(OrdemServico ordem) {
        ordens.add(ordem);
        System.out.println("Ordem de serviço aberta com sucesso!");
    }

    public void listarOrdens() {
        if (ordens.isEmpty()) {
            System.out.println("Nenhuma ordem de serviço cadastrada ainda.");
            return;
        }

        for (OrdemServico ordem : ordens) {
            System.out.println(ordem);
            System.out.println("==============");
        }
    }

    public OrdemServico buscarPorTelefone(String telefone) {
        for (OrdemServico ordem : ordens) {
            if (ordem.getTelefoneCliente().equalsIgnoreCase(telefone)) {
                return ordem;
            }
        }
        return null;
    }

    public int getTotalOrdens() {
        return ordens.size();
    }
}