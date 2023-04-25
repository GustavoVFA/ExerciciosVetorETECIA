
package Model;

import javax.swing.JOptionPane;


public class Exercicio3_DAO {
    public static void exercicio(){
        int []valor = new int[5];
        for(int i = 0; i<5; i++){
           String x = JOptionPane.showInputDialog(null, "Digite o valor desejado");
           valor[i] = Integer.parseInt(x); 
           if(valor[i] % 2 ==0 && valor[i] % 3 == 0 ){
               JOptionPane.showMessageDialog(null, "O número: "+valor[i]+" é divisisor de 2 e 3");
           }
           else if(valor[i] % 2 == 0){
               JOptionPane.showMessageDialog(null, "O número: "+valor[i]+" é divisisor de 2 ");
           }
           else if(valor[i] % 3 == 0){
               JOptionPane.showMessageDialog(null, "O número: "+valor[i]+" é divisisor de 3");
           }
         }
        
        
    }
}
