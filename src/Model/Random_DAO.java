
package Model;

import java.util.Random;
import javax.swing.JOptionPane;


public class Random_DAO {
    
    public static void geraAle(){
        Random gerador = new Random();
        int [] valor = new int [3];
        
        for(int c = 0; c<3;c++){
            
            valor[c] = gerador.nextInt(6);
        }
        JOptionPane.showMessageDialog(null, valor[0]+" | "+ valor[1]+" | "+valor[2]);
    }
}
