package Oficina.modelo;

import java.time.LocalDate;

public abstract class OrdemServico {
    private final String nomeCliente;
    private String telefoneCliente;
    private LocalDate entradaCliente;
    private LocalDate dataPrevistaEntrega;
    private TipoVeiculo tipoVeiculo;
    private double valorPecas;
    private  static int ordemServico = 0;

    public OrdemServico(String nomeCliente, String telefoneCliente, double valorPecas,TipoVeiculo tipoVeiculo) throws TelefoneInvalidoException {
        if (telefoneCliente == null || telefoneCliente.trim().isEmpty() || telefoneCliente.trim().length() < 11) {
            throw new TelefoneInvalidoException("Telefone inválido: não pode ser vazio e deve ter pelo menos 11 dígitos");
        }
        this.nomeCliente = nomeCliente;
        this.telefoneCliente = telefoneCliente;
        this.tipoVeiculo = tipoVeiculo;
        this.valorPecas = valorPecas;
        this.entradaCliente = LocalDate.now();
        this.dataPrevistaEntrega = this.entradaCliente.plusDays(getDiasParaEntrega());
        ordemServico ++;
    }

    public abstract int getDiasParaEntrega();

    public abstract double valorTotalObra();

    public double getValorPecas() {
        return valorPecas;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public LocalDate getEntradaCliente() {
        return entradaCliente;
    }

    public LocalDate getDataPrevistaEntrega() {
        return dataPrevistaEntrega;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public static int getOrdemServico() {
        return ordemServico;
    }

    @Override
    public String toString() {
        return "\n===== Cliente =====\n" +
                "Nome: " + nomeCliente + "\n" +
                "Telefone : " + telefoneCliente + "\n" +
                "Autómovel: " + tipoVeiculo + "\n" +
                "Entrega Cliente: " + entradaCliente + "\n" +
                "Entrega Veiculo: " + dataPrevistaEntrega + "\n" +
                "Ordem veiculo: " + ordemServico + "\n" +
                "Total a pagar : " + valorTotalObra()+ "\n" +
                "Dias Entrega: " + getDiasParaEntrega() + "\n" ;

    }
}