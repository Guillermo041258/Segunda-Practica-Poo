/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecucion;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Principal {
    
    public static void main(String[] args)
    {
    String movimiento;
   Scanner in = new Scanner(System.in);
  
  System.out.println("Para moverse escriba: A arriba, S abajo, I izquierda, D derecha o E salir");
  movimiento = in.nextLine();  
  
  Movimientos  mov = new Movimientos(0,0);
  do{    
    switch(movimiento)
    {
        case "A":
       mov.Arriba();
        break;      
          case "S":
       mov.Abajo();
        break;    
          case "D":
       mov.Derecha();
        break;    
          case "I":
       mov.Izquierda();
        break;
          case"E":
            break;
          default: 
          System.out.println("NO existe esa indicacion");
          break;
    }
 
        
  System.out.println("Para moverse escriba: A arriba, S abajo, I izquierda, D derecha o E salir");
  movimiento = in.nextLine();  
  if(movimiento == "E")
      break;
  }while(movimiento != "E");
  
   
        
        
        
        
        
        
        
        
        
    }
    
    
    
}
