
package pief;

import java.util.List;


public class Assimetria {
    
    
    //falta mandar para o metodo janela e dar sout em um campo de texto
    public static String assimetria(){
        
        double moda = Moda.moda();
        double media = Media.media();
        double mediana = Mediana.mediana();        
        String assimetria = null;
        if(moda == mediana && moda == media){
            assimetria.equals("Dispercao simetrica");
        } else if (media < mediana && mediana < moda){
            assimetria.equals("Dispercao negativa");
        } else if (media > mediana && mediana > moda){
            assimetria.equals("Dispercao positiva");
        } 
        
        
        
        return assimetria;
    }
}
