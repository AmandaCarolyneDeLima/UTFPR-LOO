package Predios;

public class Predio extends Construcao implements ImpostoMunicipal{

    protected int numeroAndares;

    public Predio(int numeroAlvara, int numeroAndares){
        super(numeroAlvara);
        this.numeroAndares = numeroAndares;
    }

    public double calculaAltura() {
        if(this.numeroAndares < 11) {
            return this.numeroAndares * 3;
        } else {
            return (this.numeroAndares * 3) + 7;
        }
    }

    public double calculaIPTU() {
        return this.numeroAndares * 100;
    }
}
