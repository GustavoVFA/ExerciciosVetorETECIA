
package Model;

import javax.swing.JOptionPane;



public class Exercicio2_DAO {
    public static void exercicio(){
        int [] valor = new int[5];
        int []positivos = new int[5];
        for(int i = 0; i<5; i++){
           String x = JOptionPane.showInputDialog(null, "Digite o valor desejado");
           valor[i] = Integer.parseInt(x); 
         }
        
        for(int j =0; j<5; j++){
            if(valor[j]>0){
                positivos[j] = valor[j];
                JOptionPane.showMessageDialog(null, positivos[j]);
            }
        }
        
        
    }
}
