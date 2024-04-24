/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesos;

/**
 *
 * @author raufa
 */


public class Burbuja {
    int[] conjunto;
    int [] conjunt;
    
     
    public Burbuja(int [] conjunto1){
        this.conjunto=conjunto1;
        
        
    }
    public void Ordenar(){
        int aux=0;
       
      for(int i=0; i < this.conjunto.length;i++){
          for(int j=1; j<this.conjunto.length;j++){
              System.out.println(j);
              if(conjunto[j-1]<conjunto[j]){
                  
                  aux= conjunto[j];
                  conjunto[j]= conjunto[j-1];
                  conjunto[j-1]=aux;
              }
          }
          System.out.println(i);
          
      }
        
    }
    public int[] getConjunto(){
        return this.conjunto;
    }
}
