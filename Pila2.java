package ee_t02_pilas01;

import javax.swing.JOptionPane;
public class Pila2
{
    int tope=-1;
    
   char arregloPila[]=new char[20];
    int contador=0;
    int opcion=0;
    
          public void push(char pushing){
        if(tope<19){
        tope++;
        arregloPila[tope]=pushing;
       }
       else{
        JOptionPane.showMessageDialog(null," estas superando limite desbordamiento ");
        }
    }
    
     public void pop(char pushing){
   //if(tope>-1){
        //System.out.println("se ha quitado el dato: "+arregloPila[tope]); 
        //if(arregloPila[tope]=='{'&&pushing=='}'){
        //System.out.println(" EL TAMAÑO DE LA PILA VA EN"+tope);
        //System.out.println("se ha quitado el dato: "+arregloPila[tope]); 
        //tope--;
         //}
          if(tope>=0&&arregloPila[tope]=='{'&&pushing=='}'){
                opcion=1;
            }
            
           if(tope>=0&&arregloPila[tope]=='['&&pushing==']'){
                opcion=2;
            }
            if(tope>=0&&arregloPila[tope]=='('&&pushing==')'){
                opcion=3;
            }
         
         switch(opcion){
            
            case 1:
            //System.out.println(" EL TAMAÑO DE LA PILA VA EN "+tope);
            //System.out.println("se ha quitado el dato: "+arregloPila[tope]); 
            tope--;
            break;
            
            case 2:
            //System.out.println(" EL TAMAÑO DE LA PILA VA EN"+tope);
            //System.out.println("se ha quitado el dato: "+arregloPila[tope]); 
            tope--;
            break;
            
            case 3:
            //System.out.println(" EL TAMAÑO DE LA PILA VA EN"+tope);
            //System.out.println("se ha quitado el dato: "+arregloPila[tope]); 
            tope--;
            break;
            
            }
         
        /* if(arregloPila[tope]=='['&&pushing==']'){
        System.out.println(" EL TAMAÑO DE LA PILA VA EN"+tope);
        System.out.println("se ha quitado el dato: "+arregloPila[tope]); 
        tope--;
       }
         
       if(arregloPila[tope]=='('&&pushing==')'){
         System.out.println(" EL TAMAÑO DE LA PILA VA EN"+tope);
         System.out.println("se ha quitado el dato: "+arregloPila[tope]); 
        tope--;
       }
       */
        
    //else{
    //System.out.println("  estas quitando sin tener subdesbordamiento");
    //}

}
   
    
       public void chequeo(){
           //if(arregloPila[0]=='{'&&arregloPila[0]=='['&&arregloPila[0]=='('&&arregloPila[0]==')'&&arregloPila[0]==']'&&arregloPila[0]=='}'){
               if(tope==-1){ 
               System.out.print(" ESTA BALANCEADO");
            }
            else{
                System.out.println(" NO ESTA EQUILIBRADO");
            
            }
           
        }
    
         }
     
   