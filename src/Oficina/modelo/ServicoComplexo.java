package Oficina.modelo;

public  class ServicoComplexo extends OrdemServico implements ProdutosImportado {

    private static final double TAXA_SERVICO =  3.34;

    public ServicoComplexo(String nomeCliente, String telefoneCliente, double valorPecas, TipoVeiculo tipoVeiculo) throws TelefoneInvalidoException {
        super(nomeCliente, telefoneCliente, valorPecas, tipoVeiculo);
    }

    @Override
    public int getDiasParaEntrega() {
        return 3;
    }

    @Override
    public double valorTotalObra() {
        double  valorPagar = getTipoVeiculo().getTaxaVeiculos() + getValorPecas();
        return valorPagar *  TAXA_SERVICO;
    }

    @Override
    public boolean solicitarPecasImportadas() {
        return true;

    }

}
