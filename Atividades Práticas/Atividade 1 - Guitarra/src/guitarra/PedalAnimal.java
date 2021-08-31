package guitarra;

public class PedalAnimal extends Pedal {

    @java.lang.Override
    public void aplicaEfeito() {
        criaPedalAnimal();
    }

    private void criaPedalAnimal(){
        System.out.println("[Início do Efeito Animal");
        WahWah w = new WahWah();
        Vibrato v = new Vibrato();
        w.aplicaEfeito();
        v.aplicaEfeito();
        System.out.println("[Fim do Efeito Animal");

    }
}
