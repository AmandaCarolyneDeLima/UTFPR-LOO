//Amanda Carolyne de Lima - RA 2081245

public class Main {

    public static void main(String[] args) {
        
        // Criando um array de usuários
        Usuario[] usuarios = new Usuario[6];

        // Criando cada um dos objetos
        usuarios[0] = new Professor("Fulano", "P1001", "P1001");
        usuarios[1] = new Professor("Ciclano", "P1002", "P1002");
        usuarios[2] = new Professor("Beltrano", "P1003", "senhaIncorreta");

        usuarios[3] = new Aluno("Zé Roberto", "A1001", "A1001");
        usuarios[4] = new Aluno("Humberto", "A1002", "senhaIncorreta");
        usuarios[5] = new Aluno("Doisberto", "A1003", "A1003");

        // Realizar a apresentação de todos os usuários do sistema
        for(Usuario a : usuarios) {
            a.apresentacao("Título Exemplo");
        }

        //Aluno aErro = new Aluno("Fulano", "A1234", "aa");
        //Professor pErro = new Professor("Ciclano", "P1234", "12");

    }
}