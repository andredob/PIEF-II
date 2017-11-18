
package pief;

import java.util.ArrayList;
import static pief.Moda.v;


public class Media {
    
     //static Janela janela;
    
    
    public static double media(){
        v = new ArrayList<>();
        v = Janela.DadosList;
        
        
        double media, soma = 0;
        
        for (int i = 0; i < v.size(); i++) {
            soma = soma + v.get(i);
        }
        
        media = soma / v.size();
        
        return media;
    }
    
    
}
