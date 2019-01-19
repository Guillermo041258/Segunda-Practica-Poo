/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecucion;

/**
 *
 * @author USER
 */
public class Movimientos {
    private int X=0, Y=0;
    
    public Movimientos(int x,int y)
    {
       X = x;
       Y=y;
        
    }
    public void Arriba()
    {
      X+=1;
      System.out.println("Coordenada: " + X  + ", " +Y);
         
        
        
    }
    public void Abajo()
    {
      X-=1;
      System.out.println("Coordenada: " + X  + ", " +Y);
         
        
        
    }
    public void Derecha()
    {
        Y+=1;
      System.out.println("Coordenada: " + X  + ", " +Y);
         
        
        
    }
    public void Izquierda()
    {
      Y-=1;
      System.out.println("Coordenada: " + X  + ", " +Y);
         
        
        
    }
    
    
    
    
    
    
    
}
