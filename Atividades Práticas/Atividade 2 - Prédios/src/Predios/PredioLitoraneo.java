package Predios;

public class PredioLitoraneo extends Predio implements ImpostoMunicipal{

    protected double distanciaDoMar;

    public PredioLitoraneo(int numeroAlvara, int numeroAndares, double distanciaDoMar) {
        super(numeroAlvara, numeroAndares);
        this.distanciaDoMar = distanciaDoMar;
    }

    public double calculaAltura() {
        return this.numeroAndares * 2.9;
    }

    public double calculaIPTU() {
        return this.numeroAndares * 200;
    }
}
