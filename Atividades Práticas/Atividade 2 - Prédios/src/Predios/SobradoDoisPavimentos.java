package Predios;

public class SobradoDoisPavimentos extends Construcao{

    private double alturaPeDireito;

    public SobradoDoisPavimentos(int numeroAlvara, double alturaPeDireito) {
        super(numeroAlvara);
        this.alturaPeDireito = alturaPeDireito;
    }

    public double calculaAltura() {
        return (this.alturaPeDireito * 2)+ 5;
    }

    public double calculaIPTU() {
        return 150;
    }
}
