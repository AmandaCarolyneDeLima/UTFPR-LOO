// Amanda Carolyne de Lima - RA 2081245

import java.util.HashMap;
import java.util.Map;

/**
 * Classe Pedido. Implementar: fechaConta e toString.
 */

public class Pedido {

    private HashMap<String, Double> itens;

    public Pedido() {
        itens = new HashMap<>();
    }

    public void adicionarItem(String nome, Double valor){
        itens.put(nome, valor);
    }

    /**
     * Este metodo deve ser implementado pelo aluno.
     * @return retornar a soma dos valores de todos os itens do pedido.
     */
    public Double fechaConta(){
        
        double soma = 0;
        
        for(String item:itens.keySet()){
            soma +=  itens.get(item);
        }
        return soma;
    }

    /**
     * Este metodo deve ser implementado pelo aluno.
     * @return todos os itens e seus respectivos valores, ex:
     *      Pedido:
     *          item X R$--.--
     *          item Y R$--.--
     */
    @Override
    public String toString() {
        
        String str = "Pedido:\n";
        
        for(String item:itens.keySet()){
            str += "    " + item + " R$" + itens.get(item)  + "\n";
        }
        
        return str;
    }
}