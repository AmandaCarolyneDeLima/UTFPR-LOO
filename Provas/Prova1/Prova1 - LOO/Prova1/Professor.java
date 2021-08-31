//Amanda Carolyne de Lima - RA 2081245

public class Professor extends Usuario {

    private String matricula;

    public Professor(String nome, String matricula, String senha) {
        super(nome, senha);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Professor{" +
        "nome='" + nome + '\'' + 
        ", matricula='" + matricula + '\'' +
        ", senha='" + senha + '\'' +
        '}';
    }

    @Override
    public void apresentacao(String titulo) {
        System.out.println("============= Palestra =============");
        super.apresentacao(titulo);
    }

}