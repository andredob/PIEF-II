
package pief;


public class Mediana {

    static Janela janela;
    
    public static int linhas(){
       return janela.getjTable2().getRowCount();
    }
    
    
    public static double mediana() {
        
        
        int[] v = new int[linhas()];
        int aux;
        int indice_mediana;
        int indice_mediana2;
        double mediana = 0;
        //ordenar o vetor
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length; j++) {
                if (v[i] > v[j]) {
                    aux = v[j];
                    v[j] = v[i];
                    v[i] = aux;
                }
            }
        }
        
        if(v.length % 2 != 0){
            indice_mediana = v.length / 2;
            mediana = v[indice_mediana + 1];
        } else {
            indice_mediana = v.length / 2;
            indice_mediana2 = indice_mediana + 1;
            mediana = (v[indice_mediana] + v[indice_mediana2]) / 2;
        }
        return mediana;
    }
}
