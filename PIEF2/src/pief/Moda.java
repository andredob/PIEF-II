package pief;

import java.util.ArrayList;
import java.util.List;

public class Moda {

    static Janela janela;
    static List<Double> v;

    public static int count_row() {
        return janela.getTableModel().getRowCount();
    }

    public static List moda() {


        int contador = 1, contadorMax = 0;
        double aux;

        v = new ArrayList<>();
        v = Janela.DadosList;
        //ordenar o vetor
        for (int i = 0; i < v.size(); i++) {
            for (int j = 0; j < v.size(); j++) {
                if (v.get(i) > v.get(j)) {
                    aux = v.get(i);
                    v.set(i, v.get(j));
                    v.set(i, aux);
                }
            }
        }

        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) == v.get(i + 1)) {//se o atual for igual ao proximo, incrementa contador
                contador++;
            } else//se nao for faz o teste para ver o maximo
            if (contadorMax < contador) {  //se o contador atual for maior que o contadorMax
                contadorMax = contador;    //o valor de contador é atribuido à contadorMax
                contador = 1;
            } else if (contadorMax == contador) {
//                System.out.println("possui mais de uma moda"); (revisar)

            } else if (v.get(i) < v.get(i + 1)) {
                contador = 1;
            }
        }

        return v;

    }

    public Janela getJanela() {
        return janela;
    }

    public List<Double> getV() {
        return v;
    }

}
