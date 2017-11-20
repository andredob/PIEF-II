package pief;

import java.util.ArrayList;
import java.util.List;

public class Moda {

    static Janela janela;
    static List<Double> v;

    public static double moda() {

        int contador = 1;
        int contadorMax = 0;
        double aux;

        //v = new ArrayList<>();
        v = Janela.DadosList;

        //ordenar o vetor
        for (int i = 0; i < v.size(); i++) {
            for (int j = 0; j < v.size(); j++) {
                if (v.get(i) > v.get(j)) {
                    aux = v.get(i);
                    v.set(i, v.get(j));
                    v.set(j, aux);
                }
            }
        }
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
        double valormoda = 0;
        for (int i = 0; i < v.size() - 1; i++) {

            if (v.get(i) == v.get(i + 1)) {//se o atual for igual ao proximo, incrementa contador
                contador++;
                if (contadorMax < contador) {  //se o contador atual for maior que o contadorMax
                    contadorMax = contador;           //o valor de contador é atribuido à contadorMax
                    contador = 1;
                    valormoda = v.get(i);

                } else if (contadorMax == contador) {
//                System.out.println("possui mais de uma moda"); (revisar)

                } else if (v.get(i) < v.get(i + 1)) {
                    contador = 1;
                }
            }
        }
        double valor = valormoda;
        return valor;

    }
}
