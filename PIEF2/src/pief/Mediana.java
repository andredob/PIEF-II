
package pief;

import java.util.ArrayList;
import java.util.List;
import static pief.Moda.v;


public class Mediana {

    static Janela janela;
    static List<Double> v;
    
    
    public static double mediana() {
        
        //v = new ArrayList<>();
        v = Janela.DadosList;
        
        double aux;
        int indice_mediana;
        int indice_mediana2;
        double mediana = 0;
        //ordenar o vetor
        for (int i = 0; i < v.size(); i++) {
            for (int j = 0; j < v.size(); j++) {
                if (v.get(i) > v.get(j)) {
                    aux = v.get(j);
                    v.set(j, v.get(i));
                    v.set(i, aux);
                }
            }
        }
        
        if(v.size() % 2 != 0){
            indice_mediana = v.size() / 2;
            mediana = v.get(indice_mediana + 1);
        } else {
            indice_mediana = v.size() / 2;
            indice_mediana2 = indice_mediana + 1;
            mediana = (v.get(indice_mediana) + v.get(indice_mediana2)) / 2;
        }
        return mediana;
    }
}
