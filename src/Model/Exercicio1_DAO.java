
package Model;

import javax.swing.JOptionPane;


public class Exercicio1_DAO {
     public static void exercicio(){
         double [] valor = new double[10];
         
         for(int i = 0; i<10; i++){
           String x = JOptionPane.showInputDialog(null, "Digite o valor desejado");
           valor[i] = Double.parseDouble(x);
           
         }
         int cont=0;
         double soma=0;
        for(int j = 0; j<10; j++){
            if(valor[j] < 0){
                cont++;
            }else{
                soma = soma + valor[j];
            }
        }
        JOptionPane.showMessageDialog(null, cont + "\n" + soma);
     }
}
