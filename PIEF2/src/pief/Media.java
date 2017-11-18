/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pief;

import java.util.ArrayList;
import static pief.Moda.v;

/**
 *
 * @author Isabella
 */
public class Media {
    
     static Janela janela;
    
    
    public static double media(){
        v = new ArrayList<>();
        v = Janela.get_dados(get_col());
        
        
        double media, soma = 0;
        
        for (int i = 0; i < v.size(); i++) {
            soma = soma + v.get(i);
        }
        
        media = soma / v.size();
        return media;
    }
    
    
}
