package carrera;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Carrera extends Thread{
     
    //creamos las variables
     private JLabel etiqueta;
     //objeto
     frmCarrera frmCarreraNum1=new frmCarrera();

     
    //constructor
    public Carrera(JLabel etiqueta, frmCarrera caballo) {
        this.etiqueta = etiqueta;
        this.frmCarreraNum1 = caballo;
    }
     
    
    @Override
    public void run(){
        
        int caballo1 = 0;
        int caballo2 = 0;
        int caballo3 = 0;
        int caballo4 = 0;
        int caballo5 = 0;
        
         while(true){
             try{
                 
                  sleep((int)(Math.random() * 1000));
                  caballo1 = frmCarreraNum1.getPrimerCaballo().getLocation().x;
                  caballo2 = frmCarreraNum1.getSegundoCaballo().getLocation().y;
                  caballo3 = frmCarreraNum1.getTercerCaballo().getLocation().x;
                  caballo4 = frmCarreraNum1.getCuartoCaballo().getLocation().x;
                  caballo5 = frmCarreraNum1.getQuintoCaballo().getLocation().x;
                  
                  if(caballo1 < frmCarreraNum1.getBarrera().getLocation().x - 125 && caballo2 < frmCarreraNum1.getBarrera().getLocation().x - 125
                    &&caballo3 < frmCarreraNum1.getBarrera().getLocation().x - 125 && caballo4 < frmCarreraNum1.getBarrera().getLocation().x - 125
                    &&caballo5 < frmCarreraNum1.getBarrera().getLocation().x - 125){
                      etiqueta.setLocation(etiqueta.getLocation().x + 30,etiqueta.getLocation().y);
                      frmCarreraNum1.repaint();
                  }else{
                      break;
                  }
                  
             }catch(InterruptedException e){
                 System.out.println(e);
             }
            
             if(etiqueta.getLocation().x >= frmCarreraNum1.getBarrera().getLocation().x - 125){
                  if(caballo1 > caballo2&&caballo1 > caballo3&&caballo1 > caballo4&&caballo1 > caballo5){
                      JOptionPane.showMessageDialog(null,"Gano el primer caballo");
                  }
                  else if(caballo2 > caballo1&&caballo2 > caballo3&&caballo2 > caballo4&&caballo2 > caballo5){
                      JOptionPane.showMessageDialog(null,"Gano el segundo caballo");
                  }
                  else if(caballo3 > caballo1&&caballo3 > caballo2&&caballo3 > caballo4&&caballo3 > caballo5){
                      JOptionPane.showMessageDialog(null,"Gano el tercer caballo");
                   }
                  else if(caballo4 > caballo1&&caballo4 > caballo2&&caballo4 > caballo3&&caballo4 > caballo5){
                      JOptionPane.showMessageDialog(null,"Gano el cuarto caballo");
                   }
                  else if(caballo5 > caballo1&&caballo5 > caballo2&&caballo5 > caballo3&&caballo5 > caballo4){
                      JOptionPane.showMessageDialog(null,"Gano el quinto caballo");
                   }
                  else{
                      JOptionPane.showMessageDialog(null,"Empate");
                  }
             }
                   
        } 
    }
}
