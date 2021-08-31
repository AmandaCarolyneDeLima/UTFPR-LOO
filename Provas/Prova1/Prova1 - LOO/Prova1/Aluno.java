//Amanda Carolyne de Lima - RA 2081245

public class Aluno extends Usuario {

    private String ra;

    public Aluno (String nome, String ra, String senha) {
        super(nome, senha);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    @Override
    public String toString() {
        return "Aluno{" +
        "nome='" + nome + '\'' + 
        ", ra='" + ra + '\'' +
        ", senha='" + senha + '\'' +
        '}';
    }

    @Override
    public void apresentacao(String titulo) {
        System.out.println("============= Trabalho =============");
        super.apresentacao(titulo);
    }

}