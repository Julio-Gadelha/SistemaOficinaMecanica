package Oficina.modelo;


import java.time.LocalDate;

public abstract class OrdemServico {
    private final String nomeCliente;
    private String telefoneCliente;
    private LocalDate entradaCliente;
    private LocalDate dataPrevistaEntrega;
    private TipoVeiculo tipoVeiculo;

    public OrdemServico(String nomeCliente, String telefoneCliente, LocalDate entradaCliente, LocalDate dataPrevistaEntrega, TipoVeiculo tipoVeiculo) {
        this.nomeCliente = nomeCliente;
        if (telefoneCliente == null || telefoneCliente.trim().isEmpty() || telefoneCliente.trim().length() < 11) {
            throw new TelefoneInvalidoException("CPF Telefone: não pode ser vazio e deve ter pelo menos 11 caracteres");
        }
        this.telefoneCliente = telefoneCliente;
        this.entradaCliente = entradaCliente;
        this.dataPrevistaEntrega = dataPrevistaEntrega;
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }


    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public LocalDate getEntradaCliente() {
        return entradaCliente;
    }

    public void setEntradaCliente(LocalDate entradaCliente) {
        this.entradaCliente = entradaCliente;
    }

    public LocalDate getDataPrevistaEntrega() {
        return dataPrevistaEntrega;
    }

    public void setDataPrevistaEntrega(LocalDate dataPrevistaEntrega) {
        this.dataPrevistaEntrega = dataPrevistaEntrega;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
}
