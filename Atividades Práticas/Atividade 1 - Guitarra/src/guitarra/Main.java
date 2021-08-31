package guitarra;

public class Main {

    public static void main(String[] args) {
        exercicio8();
    }

    public static void exercicio4(){
        Amplificador amp = new Amplificador(new Pedal(), new Guitarra());
        amp.reproduzirSom();
    }

    public static void exercicio6(){
        Amplificador amp = new Amplificador(new Pedal(), new Guitarra());
        amp.reproduzirSom();

        amp.setPedal(new WahWah());
        amp.reproduzirSom();

        amp.setPedal(new Vibrato());
        amp.reproduzirSom();
    }
    public static void exercicio8(){
        Amplificador amp = new Amplificador(new Pedal(), new Guitarra());
        amp.setPedal(new PedalAnimal());
        amp.reproduzirSom();
    }
}