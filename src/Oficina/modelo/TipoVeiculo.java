package Oficina.modelo;

public enum TipoVeiculo {
    MOTO(6.30),
    CARRO(10.34),
    CAMINHAO(22.30);

    private double taxaVeiculos;

    public double getTaxaVeiculos() {
        return taxaVeiculos;
    }


    TipoVeiculo(double taxaVeiculos) {
        this.taxaVeiculos = taxaVeiculos;
    }
}
