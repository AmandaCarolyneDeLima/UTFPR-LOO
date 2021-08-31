//Amanda Carolyne de Lima - RA 2081245

public class Usuario {

    protected String nome;
    protected String senha;

    public Usuario (String nome, String senha) {
        this.nome = nome;
        setSenha(senha);
    }

    public void setSenha(String senha) {
        
        if (senha.length() >= 3){
            this.senha = senha;
        } else {
            String msgError = "Senha inválida: (" + senha + "). A senha deve conter 3 caracteres ou mais!";
            throw new SenhaInvalidaException(msgError);
        }
        
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    protected void apresentacao(String titulo){
        System.out.println("Autor: " + nome);
        System.out.println("Título:" + titulo);
        System.out.println("====================================");
    }

}