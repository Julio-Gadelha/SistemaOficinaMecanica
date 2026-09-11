package Oficina.modelo;

public class ServicoSimples  extends  OrdemServico{
    public ServicoSimples(String nomeCliente, String telefoneCliente, double valorPecas, TipoVeiculo tipoVeiculo) throws TelefoneInvalidoException {
        super(nomeCliente, telefoneCliente, valorPecas, tipoVeiculo);
    }

    @Override
    public int getDiasParaEntrega() {
        return 2;
    }

    @Override
    public double valorTotalObra() {
        double  valorPagar = getTipoVeiculo().getTaxaVeiculos() + getValorPecas();
        return valorPagar ;
    }
}
