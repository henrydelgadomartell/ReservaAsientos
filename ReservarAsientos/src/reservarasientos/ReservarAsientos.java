
package reservarasientos;

import java.util.Scanner;


public class ReservarAsientos {

    
    public static void main(String[] args) {
    
        //declaracion de variables
    char asientos [][] = new char [10][10];
    boolean bandera = false;
    Scanner teclado = new Scanner(System.in);
    int fila=0,asiento=0;
    String respuesta;
    String verMapa;
    
    
    //cargamos matriz de asientos
    for(int f=0 ; f<10;f++){
        for(int c=0;c<10;c++){
            asientos[f][c] = 'L';      
        }
    }        
        
        System.out.println("--------Bienvenido al sistema de reserva--------");
        
        
        //Reserva de asientos
        while(bandera!= true){

            //visualizacion de mapa
            System.out.println("Desea ver los asientos disponibles? S:Si,Cualquier otra letra:No.");
            //aqui llamamos a la funcion
            verMapa = teclado.next();
            
            if(verMapa.equalsIgnoreCase("S")){
                dibujarMapa(asientos);
            }
           
                   
            
        //reserva
        boolean estaOK = false;
        while( estaOK!=true){
        System.out.println("Ingrese Fila y Asiento a reservar"); 
        System.out.print("Fila(entre 0 y 9):");
        fila = teclado.nextInt();
        
        System.out.print("Asiento(entre 0 y 9)");
        asiento = teclado.nextInt();
        
        if(fila<=9 && fila>=0){
            if(asiento<=9 && asiento>=0){
                 estaOK=true;
        }
        else{
            System.out.println("El numero de fila no es valido");
            }
        }
        else{
             System.out.println("El numero de fila no es valido"); 
                }
        }

    
        
        
        
        
        
        if(asientos[fila][asiento]=='L'){
            asientos[fila][asiento] ='X';
            System.out.println("El asiento fue reservadi correctamente");
            
        }else{
            System.out.println("El asiento esta ocupado.Por favor elija otro");
        }
        
            System.out.println("¿Desea finalar la reserva? S:si. Cualquier otra letra:No");
            respuesta = teclado.next();
            
            if(respuesta.equalsIgnoreCase("S")){
                bandera = true;
        }
        
        }       
        
        
    }
    
        static void dibujarMapa(char asientos[][]){
         for(int f=0 ; f<10;f++){
             System.out.print(f+" ");
            for(int c=0;c<10;c++){
           
                System.out.print("["+asientos[f][c]+"]");       
            }
                System.out.println("");
            }
        }
}












