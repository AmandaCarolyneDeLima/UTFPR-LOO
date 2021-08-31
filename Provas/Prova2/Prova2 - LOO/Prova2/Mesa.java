// Amanda Carolyne de Lima - RA 2081245

/**
 * Esta classe não deve ser alterada pelo aluno!
 */

public class Mesa {
    private Integer numero;
    private String localizacao;

    public Mesa(Integer numero, String localizacao) {
        this.numero = numero;
        this.localizacao = localizacao;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    @Override
    public String toString() {
        return "Mesa "+numero+" ("+localizacao+")";
    }
}