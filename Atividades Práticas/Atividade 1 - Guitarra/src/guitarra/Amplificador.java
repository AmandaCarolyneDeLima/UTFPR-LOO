package guitarra;

public class Amplificador {
    private Pedal p;
    private Guitarra g;

    public Amplificador(Pedal p, Guitarra g){
        this.p = p;
        this.g = g;
    }

    public void setPedal(Pedal p){
        this.p = p;
    }

    public void reproduzirSom(){
        g.tocar();
        p.aplicaEfeito();
    }
}
