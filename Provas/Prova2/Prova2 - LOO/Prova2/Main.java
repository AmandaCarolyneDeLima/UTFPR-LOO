// Amanda Carolyne de Lima - RA 2081245

import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    private LinkedHashMap<Mesa, Pedido> controleDeMesas;

    public Main(){
        Mesa mesa1 = new Mesa(1,"Salao Principal");
        Mesa mesa2 = new Mesa(2,"Salao Principal");
        Mesa mesa3 = new Mesa(3,"Area de Fumantes");
        Mesa mesa4 = new Mesa(4,"Area de Fumantes");

        Pedido p1 = new Pedido();
        p1.adicionarItem("Refrigerante", 2.99);
        p1.adicionarItem("X-Salada", 7.99);

        Pedido p2 = new Pedido();
        p2.adicionarItem("Suco Natural", 3.99);
        p2.adicionarItem("X-Bacon", 10.50);

        Pedido p3 = new Pedido();
        p3.adicionarItem("Salada de Frutas", 5.50);
        p3.adicionarItem("X-Salada", 7.99);
        p3.adicionarItem("X-Salada", 7.99);

        Pedido p4 = new Pedido();
        p4.adicionarItem("Sorvete de Morango", 8.00);

        controleDeMesas = new LinkedHashMap<>();

        controleDeMesas.put(mesa1, p1);
        controleDeMesas.put(mesa2, p2);
        controleDeMesas.put(mesa3, p3);
        controleDeMesas.put(mesa4, p4);

        imprimeResumo();
    }

    /**
     * Este metodo deve ser implementado pelo aluno, deve imprimir no console um resumo
     * de todas as mesas e suas respectivas despesas, qualquer padrao de impressao diferente
     * do apresentado a seguir será desconsiderado, siga o exemplo:

     Mesa 1 (Salao Principal)
       Pedido:
         Refrigerante R$2.99
         X-Salada R$7.99
       Despesa:10.98

     Mesa 2 (Salao Principal)
       Pedido:
         X-Bacon R$10.5
         Suco Natural R$3.99
       Despesa:14.49

     Mesa 3 (Area de Fumantes)
       Pedido:
         Salada de Frutas R$5.5
         X-Salada R$7.99
       Despesa:13.49

     Mesa 4 (Area de Fumantes)
       Pedido:
         Sorvete de Morango R$8.0
         Despesa:8.0

     Valor total: R$46.96
     */
    void imprimeResumo(){
        
        String str = "";
        double total = 0.0;
        
        for(Mesa mesa:controleDeMesas.keySet()){
            str += mesa.toString() + "\n  " + 
            controleDeMesas.get(mesa).toString() + "  " +
            "Despesa:" + controleDeMesas.get(mesa).fechaConta() + "\n\n";
            
            total += controleDeMesas.get(mesa).fechaConta();
        }
        
        str += "Valor total: R$" + total;
        
        System.out.println(str);
    }
}