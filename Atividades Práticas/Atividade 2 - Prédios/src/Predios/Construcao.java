package Predios;

public abstract class Construcao implements ImpostoMunicipal{

    protected int numeroAlvara;

    public Construcao(int numeroAlvara) {
        this.numeroAlvara = numeroAlvara;
    }

    public abstract double calculaAltura();
    public abstract double calculaIPTU();

    public String toString() {
        return getClass().getSimpleName() + " (Alvará: "+numeroAlvara+")";
    }
}
