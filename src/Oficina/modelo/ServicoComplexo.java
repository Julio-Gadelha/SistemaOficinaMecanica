package Oficina.modelo;

public class ServicoComplexo extends OrdemServico implements ProdutosImportado {

    private static final double TAXA_URGENCIA = 50.0;

    public ServicoComplexo(String nomeCliente, String telefoneCliente, double valorPecas, TipoVeiculo tipoVeiculo) throws TelefoneInvalidoException {
        super(nomeCliente, telefoneCliente, valorPecas, tipoVeiculo);
    }

    @Override
    public int getDiasParaEntrega() {
        return 7;
    }

    @Override
    public double valorTotalObra() {
        double valorPagar = getTipoVeiculo().getTaxaVeiculos() + getValorPecas();
        return valorPagar + TAXA_URGENCIA;
    }


    @Override
    public boolean solicitarPecasImportadas() {
        return false;
    }
}
