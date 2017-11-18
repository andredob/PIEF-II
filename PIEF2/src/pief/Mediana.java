/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pief;

/**
 *
 * @author Isabella
 */
public class Mediana {

    Janela janela;

    public int count_row() {
        return janela.getTableModel().getRowCount();
    }

    public Mediana(Janela janela) {
        this.janela = janela;
        int[] v = new int[count_row()];
        int aux;
        int indice_mediana;
        int indice_mediana2;
        double mediana;
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
        
        if(v.length % 2 == 0){
            indice_mediana = v.length / 2;
            mediana = v[indice_mediana];
        } else {
            indice_mediana = v.length / 2;
            indice_mediana2 = indice_mediana + 1;
            mediana = (v[indice_mediana] + v[indice_mediana2]) / 2;
        }
        
    }
}
