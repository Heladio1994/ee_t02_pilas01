package ee_t02_pilas01;

import javax.swing.JOptionPane;
public class Implementacion
{
    
   public static void main(String [] args){
    Pila2 sa=new Pila2();
    int opcion=0;
    boolean bandera=false;
    int x=0;
    String dato="";
    int longitud=0;
     do{
                        opcion=Integer.parseInt(JOptionPane.showInputDialog(" ingresa opcion \n1.- INGRESA \n2- PROCESO \n3.- CHEQUEO"+"\n4 SALIR "));    
                        switch(opcion){
                                case 1:
                                   dato=JOptionPane.showInputDialog(" INGRESA DATOS ");
                                   longitud=dato.length();
                                   JOptionPane.showMessageDialog(null,"LA LONGITUD ES "+longitud+"\n DATOS RECIBIDOS CORRECTOS ");
                                   break;
                                    
                                    case 2:
                                    for(int g=0;g<longitud;g++){
                                        //dato.charAt(g);
                                        if(dato.charAt(g)=='{'||dato.charAt(g)=='['||dato.charAt(g)=='('){
                                            sa.push(dato.charAt(g));
                                        }
                                        if(dato.charAt(g)=='}'||dato.charAt(g)==']'||dato.charAt(g)==')'){
                                        sa.pop(dato.charAt(g));
                                        }
                                    }
                                    
                                    case 3:
                                    sa.chequeo();
                                    
                                   
                                    break;
                                    
                                    
                                    case 4:
                                    bandera=true;
                                    
                                    break;
                                  }
                            }
          while(bandera==false);
}
 }

